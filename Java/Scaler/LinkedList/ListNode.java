public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        int carry=0,sum=0;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carry;
            ListNode node=new ListNode(sum%10);
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
            temp.next=node;
            temp=temp.next;
        }
        while(l1!=null){
            sum=l1.val+carry;
            ListNode node=new ListNode(sum%10);
            carry=sum/10;
            temp.next=node;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val+carry;
            ListNode node=new ListNode(sum%10);
            carry=sum/10;
            temp.next=node;
            temp=temp.next;
            l2=l2.next;
        }
        if(carry==1){
            ListNode node1=new ListNode(carry);
            temp.next=node1;
            temp=temp.next;
        }
        return res.next;
    }
}

