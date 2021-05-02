import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadderGame {

    Board board;

    Integer turn;

    Integer numberOfPlayers;
    Dice dice;
    List<Player> players;
    Boolean gameEnded;
    String winner;

    public SnakeAndLadderGame() {
    }

    public void initBoard(Integer boardSize, Integer numberOfSnakesOrLadders, List<Integer> startPosition, List<Integer> endPositions){
        Board board = new Board(boardSize, numberOfSnakesOrLadders, startPosition, endPositions);
        setBoard(board);

    }

    public void initPlayers(Integer numberOfPlayers, List<String> playerNames){
        setNumberOfPlayers(numberOfPlayers);
        List<Player> players = new ArrayList<>();
        for(int i =0; i<playerNames.size(); i++){
            Player player = new Player(playerNames.get(i), i,0);
            players.add(player);
        }
        setPlayers(players);
    }

    public void initGame(){
        Integer turn = 0;
        setTurn(turn);
        Dice dice = new Dice();
        setDice(dice);
        setGameEnded(false);
        setWinner("");
    }

    public void printPlayMoveMessage(){
        Integer turn = getTurn();
        Player player = getPlayers().get(turn);
        System.out.println(player.getName() + "'s turn to Play: Please enter something to continue");
    }

    public void playMove(){
        Integer turn = getTurn();
        Player player = getPlayers().get(turn);
        getDice().roleDice();
        Integer diceOutput = getDice().getDiceValue();
        Integer currentPlayerPosition = player.getPosition();
        Integer currentPlayerTargetPosition = getBoard().getLegalPosition(currentPlayerPosition, diceOutput);
        player.setPosition(currentPlayerTargetPosition);
        System.out.println(player.getName() + " has moved to position " + player.getPosition());

        if(getBoard().checkWinner(currentPlayerTargetPosition)){
            setGameEnded(true);
            setWinner(getPlayers().get(turn).getName());
            player.setHasWon(true);
        }
        setTurn((turn + 1)%getNumberOfPlayers());
    }


    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Boolean getGameEnded() {
        return gameEnded;
    }

    public void setGameEnded(Boolean gameEnded) {
        this.gameEnded = gameEnded;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
