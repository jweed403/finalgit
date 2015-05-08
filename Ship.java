public class Ship{
   public static final int DESTROYER = 3;
   public static final int CARRIER = 5;
   public static final int SUBMARINE = 3;
   public static final int BATTLESHIP = 4;
   public static final int CRUISER = 2;
   private GameLocation[] pos;
   private String name;
   private int length;
   public Ship(String theName, int theLength){
      name = theName;
      length = theLength;
   }
   public int getLength(){
      return length;
   }
   public String getName(){
      return name;
   }
   public void setPos(GameLocation[] thePos){
      pos = thePos;
   }
   public GameLocation[] getPos(){
      return pos;
   }
}