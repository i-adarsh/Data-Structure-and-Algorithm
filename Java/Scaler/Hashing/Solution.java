import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class UsingMap {
    static class Node {
        public String data;
        public int nCount; 
        public Node[] children; 
        public Node parent;
        public boolean isLocked;
        public boolean isLockable;
        public int uid;
    
        public Node(String d, int n)
        {
            data = d;
            nCount = n;
            children = new Node[n];
            parent = null;
            isLocked = false;
            isLockable = true;
            uid = -1;
            
        }
        public Node(String d, int n, Node parent) {
            data = d;
            nCount = n;
            children = new Node[n];
            this.parent = parent;
            isLocked = false;
            isLockable = true;
            uid = -1;
            
        }
    }
	static boolean res;
	
	static HashMap<String, Node> map;
	public static boolean upgrade(Node node, int k, int uid) {
		if(node.isLocked == true) {
			return false;
		}
		
		Node T = node;
		//System.out.println(T.data);
		boolean upg = false;
		//pre(T, k, uid);
		//System.out.println("Inside upgrade : "+upg);
		
	    	Queue<Node> q = new LinkedList<>();
	    	q.offer(T);
	    	while(q.size() > 0) {
	    		Node temp = q.poll();
	    		for(Node nd : temp.children) {
	    			if(nd != null) {
	    				if(nd.isLocked && nd.uid != uid) return false;
		    			if(nd.isLocked) upg = true;
		    			q.offer(nd);
	    			}
	    			
	    			
	    		}
	    	}
	    	//System.out.println("Inside upg"+upg);
	    	if(!upg) return false;
	    	
//	    	node.isLocked = true;
//			node.uid = uid;
			q.offer(T);
	    	while(q.size() > 0) {
	    		Node temp = q.poll();
	    		for(Node nd : temp.children) {
	    			if(nd != null) {
	    				if(nd.isLocked)
		    				if(!unLock(nd, uid)) return false;
		    			
		    			q.offer(nd);
	    			}
	    			
	    		}
	    	}
	    	
		return Lock(node, uid);
		
	}

	public static boolean unLock(Node node, int uid)
	{
	    if (node.isLocked == false)
	        return false;
	    Node T = node;
	    
	    if(node.uid == uid) {
	    	node.isLocked = false;
	    	
		    
		    while (T != null) {
		        T.isLockable = true;
		        T = T.parent;
		    }
		    return true;
	    }
	    else {
	    	return false;
	    }
	    
	}

	public static boolean Lock(Node node, int uid)
	{
		
	    if (node.isLockable == false)
	        return false;
	 
	    Node T = node;
//	    System.out.println(T.data);
//	    System.out.println(T.parent);
	    if(T.parent == null) {
	    	Queue<Node> q = new LinkedList<>();
	    	q.offer(T);
	    	while(q.size() > 0) {
	    		Node temp = q.poll();
	    		for(Node nd : temp.children) {
	    			if(nd != null) {
	    				if(nd.isLocked) return false;
		    			q.offer(nd);
	    			}
	    			
	    		}
	    	}
	    }
	    boolean flag = false;
	    //System.out.println(node.data);
	    while (T != null) {
	        if (T.isLocked == true) {
	            flag = true;
	            break;
	        }
	        T = T.parent;
	    }
	    
	    if (flag)
	        return false;
	    else {
	        node.isLocked = true;
	        node.uid = uid;
	        T = node;
	        
	        while (T != null) {
	            T.isLockable = false;
	            T = T.parent;
	        }
	        
	        return true;
	    }
	}

	static int height(int n, int t){
		return (int) (Math.log(n * (t - 1) + 1) / Math.log(t));
	}
	
	
	static Node convertToN_aryTree(String [] data, int n)
	{
	    if(data.length == 0)
	    {
	        return null;
	    }
	    Node root = new Node(data[0], n);
	    Node currParent = root;
	    Node curr;
	    int currChildCount = 0;
	    Queue<Node> parents = new LinkedList<>();
	    for(int i = 1; i<data.length; i++)
	    {
	        curr = new Node(data[i], n, currParent);
	        currParent.children[currChildCount] = curr;
	        parents.offer(curr);

	        currChildCount++;
	        if(currChildCount >= n) 
	        {                
	            currParent = parents.poll();
	            currChildCount = 0;
	        }
	    }

	    return root;
	}
	
	static void print(Node root, int k, String name, int code, int uid)
	{
		
	    if (root == null)
	        return;
	    if(root.data.equals(name)) {
	    	if(code == 1) {
	    		boolean flag = Lock(root, uid);
	    		res = flag;
	    		
	    	}else if(code == 2) {
	    		boolean flag = unLock(root, uid);
	    		res = flag;
	    	}else if(code == 3) {
	    		boolean flag = upgrade(root, k, uid);
	    		res = flag;
	    	}
	    }
	    
	    
	}
	static void mapFill(Node root, int k) {
		if(root == null) return;
		
		map.put(root.data, root);
		
		for (int i = 0; i < k; i++) {
			mapFill(root.children[i], k);
	    }
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();
		
		String [] cnames = new String[t];
		
		for(int i = 0; i < t; i++) {
			cnames[i] = sc.nextLine();
		}
		
		String [] qu = new String[q];
		
		for(int i=0; i < q; i++) {
			qu[i] = sc.nextLine();
		}
		

		int h = height(t, n);
		System.out.println("height : "+h);
		map = new HashMap<>();
		
		Node root = convertToN_aryTree(cnames, n);
		mapFill(root, n);
		

		res = false;
		for(String s : qu) {
			String [] str = s.split(" ");
			String name = "";
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == ' ' || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
					name += ch+"";
				}
			}
			name = name.trim();
			//System.out.println(name);
			int code = Integer.parseInt(str[0]);
			int uid = Integer.parseInt(str[str.length-1]);
			Node temp = null;
			if(map.containsKey(name)) {
				temp = map.get(name);
			}
			if(temp != null)
				print(temp, n, name, code, uid);
			System.out.println(res);
			temp = root;
			res = false;
		}
		
		sc.close();
	}
}