import java.awt.*;
import java.util.*;
public class GameGrid{
   public static final int PANEL_WIDTH = 1000;
   public static final int PANEL_LENGTH = 1000;
   public static final int BOARD_SIZE = 10;
   public DrawingPanel d;
   public Graphics g;
   public static GameLocation[][] myBoardState;
   public static GameLocation[][] AIBoardState;
   public GameGrid(){
      myBoardState = new GameLocation[BOARD_SIZE][BOARD_SIZE];
      for(int i = 0; i < myBoardState.length; i++){
         for(int j = 0; j < myBoardState[i].length; j++){
            myBoardState[i][j] = new GameLocation(ShipGame.letters.get(i), j);
         }
      }
      AIBoardState = new GameLocation[BOARD_SIZE][BOARD_SIZE];
      for(int i = 0; i < AIBoardState.length; i++){
         for(int j = 0; j < AIBoardState[i].length; j++){
            AIBoardState[i][j] = new GameLocation(ShipGame.letters.get(i), j);
         }
      }
      d = new DrawingPanel(PANEL_WIDTH, PANEL_LENGTH);
      g = d.getGraphics();
   }
   public void drawBoard(){
      int squaresize = (int)(PANEL_LENGTH/BOARD_SIZE);
      for(int i = 0; i < BOARD_SIZE; i++){
         for(int j = 0; j < BOARD_SIZE; j++){
            GameLocation temp = myBoardState[i][j];
            if(temp.isOccupied())
               g.setColor(Color.BLACK);
            else g.setColor(Color.WHITE);
            g.drawRect(i*squaresize, j*squaresize, squaresize, squaresize);
         }
      }
   }
}