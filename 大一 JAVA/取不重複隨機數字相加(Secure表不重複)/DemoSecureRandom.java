import java.security.SecureRandom;
public class DemoSecureRandom{
	public static void main (String args[]){
		SecureRandom rr = new SecureRandom();
		int temp = rr.nextInt(100);
		//the content of nextInt() is the range of SecureRandom()
		//if it's 100,it will show one of 0~99	
		
		System.out.print("random number : " + temp);
	}
}
