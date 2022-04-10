import java.util.Scanner;

public class LinkedList{
    static int length;
    static Node head = null;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String [] s = sc.nextLine().split(" ");
            if (s[0].equals("i")){
                insert_node(Integer.parseInt(s[1]+""), Integer.parseInt(s[2]+""));
            }
            else if (s[0].equals("d")){
                delete_node(Integer.parseInt(s[1]+""));
            }
            else if (s[0].equals("l")){
                length();
            }
            else{
                print_ll();
            }
        }
        sc.close();
    }

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position > (length+1)){
            return;
        }
        if (head == null || position == 1){
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
        else{
            
            Node node = new Node(value);
            // System.out.println("hii");
            Node temp = head;
            while ((position - 1) > 0 && temp.next != null){
                temp = temp.next;
                position--;
            }
            // System.out.println(temp.next);
            node.next = temp.next;
            temp.next = node;
        }
        length++;
    }

    public static void delete_node(int position) {
        if (position > (length+1)){
            return;
        }
        // @params position, integer
        if (position == 1){
            head = head.next;
        }
        else{
            Node temp = head;
            while((position - 1) > 1 && temp.next != null){
                temp = temp.next;
                position--;
            }
            if (temp.next.next != null ){
                temp.next = temp.next.next;
            }
            else{
                temp.next = null;
            }
        }
        length--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


/*
62
i 1 226
i 2 875
i 3 604
i 4 550
i 5 498
i 6 875
i 7 847
i 8 633
i 9 793
i 10 872
i 11 313
i 12 440
i 13 331
i 14 582
i 15 188
i 16 476
i 17 722
i 18 402
i 19 890
i 20 713
i 21 421
i 22 930
i 23 579
i 24 459
i 25 278
i 26 818
i 27 320
i 28 549
i 29 240
i 30 528
i 31 367
i 32 835
i 33 20
i 34 170
i 35 903
i 36 242
i 37 943
i 38 802
i 39 145
i 40 291
i 41 224
i 42 400
i 43 43
i 44 355
i 45 83
i 46 26
i 47 816
i 48 477
i 49 425
i 50 543
i 51 211
i 52 799
i 53 185
i 54 5
i 55 184
i 56 150
i 57 572
i 58 626
i 59 109
i 60 807
d 25
p
*/