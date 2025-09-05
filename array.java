package DSAQ;
import java.util.*;
public class array{
public static void main(String[] args) {
   Scanner Sc=new Scanner(System.in);
   String Str=Sc.nextLine();
   System.out.println("input word is"+Str);
   int n=Str.length();
   for(int j=n-1;j>=0;j--){

        System.out.println("reversed word is"+ Str.charAt(j));
    }
   

}


}