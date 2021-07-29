import java.security.SecureRandom;
public class rollDice{
	public static int rollDice(){
	    SecureRandom randomNumbers = new SecureRandom();
      	int die1 = 1 + randomNumbers.nextInt(6);
      	int die2 = 1 + randomNumbers.nextInt(6);

      	int sum = die1 + die2;

	System.out.println(sum);

      	return 0;
	}
}