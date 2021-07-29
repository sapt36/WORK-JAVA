import java.util.*;
import java.util.Scanner;
public class test {

    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the score\n");
        int score = sc.nextInt(); 

        String s1 = "Pass";
        String s2 = "Fail";
        String r = score >= 85 ? s1 : s2;
        System.out.println(r);
    }
}