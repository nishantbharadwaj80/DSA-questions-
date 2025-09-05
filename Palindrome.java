package DSAQ;
import java.util.*;

public class Palindrome {
    public static void Palindrome1(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                System.out.println("invalid");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        Palindrome1(str);
    }
}
