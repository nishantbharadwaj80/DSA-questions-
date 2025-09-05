public class NoofNodes {
   static class Node{
    int val;
    Node left;
    Node right;
    Node (int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }}
    
    public static int NUMBERON(Node root){
        if(root==null){
            return-1;}
          int lh=NUMBERON(root.left);
          int rh=NUMBERON(root.right);
         return lh+rh+1;
        } 
       
    

   
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("No of Nodes"+NUMBERON(root));
    }
}
