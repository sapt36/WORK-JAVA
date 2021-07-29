import java.util.Scanner;
class Fibonacci{
	public static int Fibonacci(int x){

		//F(x)=3f(x-1) ,x>1
	     	    // 4,x=1
		if(x==1){
			return 4;
		}
		else if(x>1){
			return 3*Fibonacci(x-1);
		}
		return 0;
	}
public static void main(String args[]){

	Scanner sc = new Scanner (System.in);

	int x = sc.nextInt();

	Fibonacci(x);

	System.out.println("Fibonacci(x)=" +Fibonacci(x));
}

}