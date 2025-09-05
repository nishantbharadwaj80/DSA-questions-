import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
         int Even_sum=0;
        int oddsum=0;
        int n=Sc.nextInt();
        for(int i=0;i>n;i++){
        if(n%2==0){
            Even_Sum +=n;
        }
        else{
            oddsum+=n;
        }
    }
    }
}
