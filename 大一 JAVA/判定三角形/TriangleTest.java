import java.util.Scanner;
public class TriangleTest{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter edgeA");
		int edgeA = input.nextInt();
		System.out.println("Enter edgeB");
		int edgeB = input.nextInt();
		System.out.println("Enter edgeC");
		int edgeC = input.nextInt();
		int a = edgeA;
		int b = edgeB;
		int c = edgeC;
		if(a==b && b==c){
			System.out.println("Equilateral triangle");
			//正三角形
		}
		else if(a+b>=c){
			System.out.println("Isosceles triangle");
				if(c==a&&a>=b)
			System.out.println("Isosceles triangle");
				if(c==b&&b>=a)
			System.out.println("Isosceles triangle");
			//等腰三角形
		}
		else if(a+b<=c || a+c<=b || b+c<=a){
			System.out.println("Not triangle");

		}
		else{
			System.out.println("Just triangle");
		}
	}
}

			