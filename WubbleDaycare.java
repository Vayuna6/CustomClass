public class WubbleDaycare{
   //instance variables 
   private String name;
   private int numbOfWubbles;
   private String WubbleCloseTime;
   private boolean beenFed;
   private int amountOfFood;
   private double budget;
   private int numbToys;

   
   //constructor
   public WubbleDaycare (String name, int numbOfWubbles, String WubbleCloseTime, boolean beenFed) {
      this.name = name;
      this.numbOfWubbles = numbOfWubbles;
      this.WubbleCloseTime = WubbleCloseTime;
      this.beenFed = beenFed;
      this.amountOfFood = amountOfFood;
      this.budget = budget;
      this.numbToys = numbToys;
   } 
   public WubbleDaycare() {
      name = "Wibbly Wobbly";
      numbOfWubbles = 50;
      WubbleCloseTime = "4:30 pm";
      beenFed = true; 
      }
      
      public WubbleDaycare (String name, int numbOfWubbles){
      this.name = name;
      this.numbOfWubbles = numbOfWubbles;
      }
   
   //method
   public int WubbleDropOff(int amountDropOff) {
      numbOfWubbles++;
      System.out.println(name + "has recieved anouther Wubble! The daycare now has" + numbOfWubbles + "wubbles!");
     //PROTECT THE WUBBLES FROM EXTCINTION PLEASE!!!!
      return numbOfWubbles;
      }
      public void FeedWubbles() {
         if (beenFed == false){
          amountOfFood-= numbOfWubbles*2;
          System.out.println("Wubbles have all been fed");
          System.out.println("You have" + amountOfFood + " grams left");
      }
      }
      
      public void buyFood (double gramsOfFood) {
      amountOfFood += gramsOfFood;
      budget -= gramsOfFood;
      System.out.println("You have spent $ " + gramsOfFood* 0.5 + " you now have " + budget);
      
      }
      public void wubblePickedUp (int amountPickedUp){
      numbOfWubbles -= amountPickedUp;
      System.out.println("There are now " + numbOfWubbles + " in your daycare");
      
      }
      
      public void buyToysForWubble () {
      budget-= numbToys*5;
      System.out.println("You bought " + numbToys + " toys for the wubbles to play with");
      System.out.println("You now have $" + budget + " left in the budget");
      }
      
      
      
      
      
      
}
    
