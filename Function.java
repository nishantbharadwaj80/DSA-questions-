import java.util.*;
public class Function {
    public static int popu(int num1, int num2){
        int sum=num1+num2;
        System.out.println(sum);  
        return sum;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int sum= popu(a,b);
        System.out.println(+sum);
    }
}
