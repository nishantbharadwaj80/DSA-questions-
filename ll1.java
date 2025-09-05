package Linkedlist;

import java.util.LinkedList;

public class ll1 {
  public class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
}
  public static Node head;
public static Node tail;
public static int size;
public void addFirst(int data){
  Node NewNode=new Node(data);//new node created
  size++;
  if(head==null){//if llist is empty
    head=tail=NewNode;
    return;
  }
  NewNode.next=head;//new node->head
  head=NewNode;//head->newnode
} 
public int removefirst(){
  if(size==0){
    System.out.println("Linked list is empty");
    return Integer.MIN_VALUE;}
    else if(size==1){
      int val=head.data;
      head =tail=null;
      size=0;
      return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
  }
public void addLast(int data){
  Node NewNode=new Node(data);//new node
  size++;
  if(head==null){
    head=tail=NewNode;
    return;
  }

  tail.next=NewNode;//point tail ->next
  tail=NewNode;
}
public int removeLast(){
  if(size==0){

    System.out.println("Linked list is empty");
  return Integer.MIN_VALUE;}
  else if(size==1){ 
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
  }
  Node prev=head;//prev node
  for(int i=0;i<size-2;i++){
    prev=prev.next;
  }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
  }
  

public void print(){
  Node temp=head;
  while(temp!=null){
    System.out.println(temp.data+"-> ");
    temp=temp.next;
  }}

  public int itr_search(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){ 
      if(temp.data==key){
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
    }

  
public void Add(int idx,int data){
if(idx==0){
  addFirst(data);
  return;
}
Node NewNode=new Node (data);
size++;
Node temp=head;
int i=0;
 while(i<idx-1){
  temp=temp.next;
  i++;
 }
 
 NewNode.next=temp.next;
 temp.next=NewNode;
}


    public static void main(String[] args) {
     ll1 list=new ll1();
     list.addFirst(10);
     list.addFirst(20);
     list.addLast(30);
     list.addLast(40);
    
   list.Add(3, 90);
 
int idx= list.itr_search(9);
System.out.println("Key  found at index: " + idx);
}}