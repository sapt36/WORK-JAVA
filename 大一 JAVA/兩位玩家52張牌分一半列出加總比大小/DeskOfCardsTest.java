public class DeskOfCardsTest{
   
   public static void main(String[] args){
      
      DeskOfCards myDeskOfCards = new DeskOfCards();
      myDeskOfCards.shuffle(); // place Cards in random order,print all 52 Cards in the order in which they are dealt
      
      for (int i = 1; i <= 52; i++){// deal and display a Card
    	 
       if(i == 1)
    		 System.out.println("Cards of player one:");
       System.out.printf("%-19s", myDeskOfCards.dealCard());
		 
       if (i % 4 == 0) // output a newline after every fourth card
		    System.out.println();//0.0
		 
       if(i == 26){
			 System.out.println("");//A new line for next player
			 System.out.println("Cards of player two:");
		}
   }
      
      if(myDeskOfCards.whoWinsTheGame)
    	  System.out.println("Winner : player one");
      else
    	  System.out.println("Winner : player two");
   } 
}
