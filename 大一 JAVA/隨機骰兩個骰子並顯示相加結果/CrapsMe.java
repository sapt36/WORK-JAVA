//Roll two dice. 
//Each die has six faces representing values 1, 2, . . ., and 6, respec- tively. 
//Check the sum of the two dice. 
//If the sum is 2, 3, or 12 (called craps), you lose; 
//if the sum is 7 or 11 (called natural), you win; 
//if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
//Continue to roll the dice until either a 7 or the same point value is rolled. 
//If 7 is rolled, you lose. Otherwise, you win.
//Your program acts as a single player.
public class CrapsMe {
	static rollDice myrollDice = new rollDice();

	private enum Status {CONTINUE,WON,LOST};
	//set 3 situation
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		LuckyDice.aaa();
	}
}