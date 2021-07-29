class Alien{
	public void walk(){
		System.out.println("Icanwalk");
	}
	public void use_tech(){
		System.out.println("Icaninvent");
	}
	public void show(){
		System.out.println("IamAllien");
	}
}
public class AlienTest{
	public static void main(String args[]){
		Alien a = new Alien();
		a.show();
		a.walk();
		a.use_tech();
		Human b = new Human();
		b.show();
		b.walk();
		b.use_tech();
		
	}
}
class Human extends Alien{
	@Override
	public void show(){
		System.out.println("IamHuman");
		

}
}
 