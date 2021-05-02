import java.util.ArrayList;
import java.util.List;

public class Board {
    Integer boardSize;
    List<Box> boxes;
    Integer numberOfSnakesOrLadders;
    List<Integer> startPosition;
    List<Integer> endPosition;

    public Board(Integer boardSize, Integer numberOfSnakesOrLadders, List<Integer> startPosition, List<Integer> endPosition) {
        this.boardSize = boardSize;
        List<Box> boxes = new ArrayList<Box>();
        for(int i = 1; i<= boardSize; i++){
            Box box = new Box(i, i);
            boxes.add(box);
        }
        this.numberOfSnakesOrLadders = numberOfSnakesOrLadders;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        for(int i = 0; i<numberOfSnakesOrLadders; i++){
            boxes.get(startPosition.get(i) -1).setTargetPosition(endPosition.get(i));
        }
        setBoxes(boxes);
    }

    public Integer getLegalPosition(Integer currentPosition, Integer diceValue){
        if(currentPosition + diceValue > boardSize){
            return currentPosition;
        }
//        System.out.println(currentPosition + " is the current position with dice value " + diceValue);
        return getBoxes().get(currentPosition + diceValue - 1).getTargetPosition();
    }

    public Boolean checkWinner(Integer currentPosition){
        return currentPosition == boardSize;
    }

    public Integer getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public Integer getNumberOfSnakesOrLadders() {
        return numberOfSnakesOrLadders;
    }

    public void setNumberOfSnakesOrLadders(Integer numberOfSnakesOrLadders) {
        this.numberOfSnakesOrLadders = numberOfSnakesOrLadders;
    }

    public List<Integer> getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(List<Integer> startPosition) {
        this.startPosition = startPosition;
    }

    public List<Integer> getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(List<Integer> endPosition) {
        this.endPosition = endPosition;
    }
}
