import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class decoder {
	
	public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s;
        int a, L;
        while(cin.hasNext()) {
            s = cin.nextLine();
            L = s.length();
            for(a = 0; a < L; a++)
                System.out.print((char)(s.charAt(a)-7));
//String s="abc"---->printf(charAt(2))='c'
            System.out.println();
        }
    }
}