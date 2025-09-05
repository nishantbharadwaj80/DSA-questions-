public class Stackreversal {
    private int[] stack;
    private int top;
    private int capacity;
    public void stack(int size){
        capacity=size;
        stack=new int[capacity];
        top=-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public boolean isfull(){
        return top==capacity-1;
    }
    public void push(int value){
        if(isfull()) System.out.println("stack is full");
        else{
            stack[++top]=value;
            System.out.println("pushes"+value+"to stack");
        }
    }
    public void pop(){
        if((isempty())) System.out.println("stack is empty");
        else{
            int value=stack[top--];
             System.out.println("poped"+value+"from stack");
        }
    }
    public void peek(){
        if(isempty()) System.out.println("stack is empty");
        else{
            System.out.println(stack[top]);
        }
    }
    public void display(){
        if(isempty()){
            System.out.println("stack is empty");

        }
        else{
            for(int i=0;i<stack.length;i++){
                System.out.print("stack elements are"+stack[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
      Stackreversal stack=new Stackreversal();
      //stack.display();
        stack.push(10);
        stack.push(100);
        stack.pop();
        stack.display();
    }




}
