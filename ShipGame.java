import java.util.*;
public class ShipGame{
   public static List<Character> letters;
   private Board myBoard;
   private Board otherBoard;
   public ShipGame(){
      letters = new ArrayList();
      for(int i = 0; i < GameGrid.BOARD_SIZE; i++){
         letters.add((char)(61+i));
      }
      myBoard = new Board();
      otherBoard = new Board();
      myBoard.fillBoard();
   }   
}