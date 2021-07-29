public class Cards{// Card class represents a playing card. 
   private final String face;
   private final String suit;
   private int faIval;
   private int suIval;//no-arg constructor
   public Cards(){
		this.face = "";
		this.suit = ""; 
		this.faIval = 0;
		this.suIval = 0;
   }// four-argument constructor initializes card's face and suit
   public Cards(String face, String suit, int faIval,int suIval){
      this.face = face;
      this.suit = suit; 
      this.faIval = faIval;
      this.suIval = suIval;
   } 
   public int getfaIval(){
	   return faIval;
   }
   public int getsuIval(){
	   return suIval;
   }// return String representation of Card
   public String toString(){ 
      return face + " of " + suit;
   } 
} // end class Card
