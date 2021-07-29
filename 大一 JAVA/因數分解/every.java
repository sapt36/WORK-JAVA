import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class every{
    public static  void main(String [] args){
       Scanner in=new Scanner(System.in);
       int h=in.nextInt();
       decompose(h);
    }

    private static void decompose(int n)
    {
        for(int i=2;i<=n;i++)
        {
        	int k=0;
            while (n%i==0){
                n/=i;
                k++;
            }
            if(k>=2) {
            	System.out.print(i+"^"+k);
                if(n!=1) {
                	System.out.print(" * ");
                }
                else {
                	break;
                }
            }
            else if(k==1){
                 System.out.print(i);
                 if(n!=1) {
                 	System.out.print(" * ");
                 }
                 else {
                	 break;
                 }
            }
        }    
    }
}