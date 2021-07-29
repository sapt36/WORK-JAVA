import java.util.Scanner;

class bmi{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
                System.out.println("enter height(cm):");
		double h=sc.nextDouble();
		System.out.println("enter weight(kg):");
		double w=sc.nextDouble();

		System.out.printf("BMI:%.2f",w/((h/100)*(h/100)));
                
            
	}
}