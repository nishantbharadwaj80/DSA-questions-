package Linkedlist;

public class DLL1{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        int val;
        Node prev;
    }
    public  Node head(Node head){
       if(head.prev==null){
        return head;
       }
       return null;
    }
    public Node tail(Node tail){
        if(tail.next==null){
            return tail;
        }
        return null;
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }
    public void insertAThead(Node head,int data){
        Node newnode=new Node(data);
        newnode.next=head;
        if (head!=null){
            head.prev=newnode;

        } 
        head=newnode;
        
    }

    public static void main(String[] args){
        DLL1 dll=new DLL1();
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        dll.display(head);
        dll.insertAThead(head, 99);
    }

}
