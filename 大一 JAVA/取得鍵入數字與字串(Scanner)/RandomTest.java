import java.util.Scanner;

public class  RandomTest{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		
		input.nextLine();
		//IMPORTANT!!! In case of show nothing
		
		System.out.println("Enter a string:");
		String b=input.nextLine();
		System.out.println("The number is  "+a+"\n"+"The string is  "+b);
	}
}