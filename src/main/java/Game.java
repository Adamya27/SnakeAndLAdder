import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws FileNotFoundException {

        SnakeAndLadderGame game = takeInputAndInititalize();

        /* Game begins */
        System.out.println("Game begins");

        Scanner userInput = new Scanner(System.in);
        while(!game.getGameEnded()){
            game.printPlayMoveMessage();
           while(!userInput.hasNext());
           String input = userInput.nextLine();
            game.playMove();
        }

        System.out.println(game.getWinner() + " has won the game!");


    }

    public static SnakeAndLadderGame takeInputAndInititalize() throws FileNotFoundException {
        File file = new File("/Users/b0212222/Downloads/SnakeAndLAdder/Input/Input");
        Scanner sc = new Scanner(file);
        int boardSize;
        int numberOfSnakes;
        int numberOfLadders;
        int numberOfPlayer;


        /*   Input segment begins  */
        boardSize = sc.nextInt();
        numberOfSnakes = sc.nextInt();
        List<Integer> startPosition = new ArrayList<>();
        List<Integer> endPosition = new ArrayList<>();
        List<String> names = new ArrayList<>();
        for(int i=0; i<numberOfSnakes; i++){
            startPosition.add(sc.nextInt());
            endPosition.add(sc.nextInt());
        }
        numberOfLadders = sc.nextInt();
        for(int i=0; i<numberOfLadders; i++){
            startPosition.add(sc.nextInt());
            endPosition.add(sc.nextInt());
        }
        numberOfPlayer = sc.nextInt();
        for (int i=0; i<numberOfPlayer; i++){
            names.add(sc.next());
        }
        /* End of Input Segment */

        /* Game Initialization */
        SnakeAndLadderGame game = new SnakeAndLadderGame();
        game.initBoard(boardSize, numberOfLadders + numberOfSnakes, startPosition, endPosition);
        game.initPlayers(numberOfPlayer, names);
        game.initGame();

        return game;
    }


}
