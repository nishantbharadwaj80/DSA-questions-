import java.util.*;
public class F{
    public class Palind{
        public static boolean ispalindrome(int number){
            int palindrome=number;
            int reverse=0;
            while(palindrome!=0){
                int remainder=palindrome%10;
                reverse=reverse*10+remainder;
            }
         }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
            int a=Sc.nextInt;
              
             
    }
}