import java.util.*;
public class leapyear {
    public static void main(String[] args) {
       Scanner Sc =new Scanner(System.in);
       int year=Sc.nextInt();
       if(year%4==0){
        System.out.println("leap year");
       } 
       else{
        System.out.println("not leap year");
       }
    }
}
