public class GameLocation{
   private char Letter;
   private int Number;
   private boolean isEmpty = true;
   public GameLocation(char a, int b){
      Letter = a;
      Number = b;
   }
   /**
   * An accessor method for Number
   * @return Number
   */
   public int getNum(){
      return Number;
   }
   /**
   * An accessor method for Letter
   * @return Letter
   */
   public char getLet(){
      return Letter;
   }
   public void incrementLet(){
      Letter++;
   }
   public void incrementNum(){
      Number++;
   }
   /**
   * An accessor method for isEmpty
   * @return isEmpty
   */
   public boolean isOccupied(){
      return isEmpty;
   }
}