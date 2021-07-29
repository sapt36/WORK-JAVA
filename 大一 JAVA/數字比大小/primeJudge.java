import java.util.Scanner;
public class primeJudge{
	public static void main (String args[]){
	int primeNumber = 0;
	int n = primeNumber;
	System.out.println("Enter the number");
	Scanner input = new Scanner(System.in);
	n = input.nextInt();
	if(n % 2 == 0 && n==2 ){
		System.out.print("2 is primenumber");
	}
	else if (n > 2) {
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                System.out.print( n + "is primenumber");
            }
       
	else{
		System.out.print("isn't primenumber");
	}
	}

	}	
}}