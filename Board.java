import java.util.*;
import javax.swing.*;
public class Board{  
   /**
   * ships keeps track of the position of the ships on a board
   */   
   private Ship[] ships;
      
   public Board(){
      Ship cruiser = new Ship("Cruiser", Ship.CRUISER);
      Ship sub = new Ship("Submarine", Ship.SUBMARINE);
      Ship destroyer = new Ship("Destroyer", Ship.DESTROYER);
      Ship battleship = new Ship("Battleship", Ship.BATTLESHIP);
      Ship carrier = new Ship("Carrier", Ship.CARRIER);     
      ships = new Ship[]{cruiser, sub, destroyer, battleship, carrier};
   }
   /**
   * This method finds an empty spot on a grid that a ship can be placed in
   * @param size The size of the ship
   * @return the GameLocation Array where the ship can be placed
   */
   public GameLocation[] getRandomEmptySpot(int size){
      GameLocation[] ret = new GameLocation[size];
      while(true){
         GameLocation testLoc = GameGrid.AIBoardState[ShipGame.letters.get((int)(Math.random()*(GameGrid.BOARD_SIZE-size)))][(int)(Math.random()*(GameGrid.BOARD_SIZE-size))];
         boolean vertical = RandBoolean();
         for(int i = 0; i < size; i++){
            if(testLoc.isOccupied())
               i = size;
            else{
               ret[i] = testLoc;
               if(vertical)
                  testLoc.incrementNum();
               else testLoc.incrementLet();
            }
         }
         if(ret[size-1] != null)
            return ret;
      }
   }
   public void fillBoard(){
      
      for(int i = 0; i < ships.length; i++){
         GameLocation[] spots = new GameLocation[ships[i].getLength()];
         GameLocation theSpot = cast(JOptionPane.showInputDialog(null, "What square should your ship start on? (This ship is the " + ships[i].getName() + ")"));
         int isHorizontal = JOptionPane.showConfirmDialog(null, "Should your ship be horizontal? (Default is vertical)");
         for(int j = 0; j < ships[i].getLength(); j++){
            spots[j] = theSpot;
            if(isHorizontal == JOptionPane.YES_OPTION)
               theSpot.incrementLet();
            else theSpot.incrementNum();     
         }
      }
      
   }
   //Precondition: a is a letter, then a number
   public GameLocation cast(String a){
      return GameGrid.myBoardState[ShipGame.letters.indexOf(a.charAt(0))][Integer.parseInt(a.subString(1))];
   }
   /**
   * This method returns a random boolean
   * @return A random boolean
   */
   public boolean RandBoolean(){
      return Math.random() < 0.5;
   }
}