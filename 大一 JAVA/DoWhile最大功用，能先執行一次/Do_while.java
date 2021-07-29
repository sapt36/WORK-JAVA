import java.util.Scanner;
class Do_while {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int choose;
do{
	System.out.println("CHOOSE(1)~(4)");
	choose = sc.nextInt();
	if(choose==1){
		System.out.println("CHOOSE1");
	}
	else if(choose==2){
		System.out.println("CHOOSE2");
	}
	else if(choose==3){
		System.out.println("CHOOSE3");
	}
	else if(choose==4){
		System.out.println("CHOOSE4");
	}

	}	while(choose>4||choose<1);
}
}