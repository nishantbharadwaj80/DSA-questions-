package Linkedlist;

public class ll2 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
        public static Node head;
        public static Node tail;
        public static int size;
        public void add(int idx,int data){
            if(idx==0){
                return;
            }
            Node newnode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<i-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                temp.data=this.data;
                System.out.println(this.data+"->");
            }
        }
    }

    public static void main(String[] args) {
       ll2 p=new ll2();
       p.add(0,2);
       p.add(1,3);
       p.print();
    }
}
