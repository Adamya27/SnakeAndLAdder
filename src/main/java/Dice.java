public class Dice {
    private int diceValue;
    private int maxNumber = 6;
    private int minNumber = 1;
    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        System.out.println("Dice throws " + diceValue);
        this.diceValue = diceValue;
    }

    public void roleDice(){
        int randomNumber = (int) (Math.random()*(maxNumber - minNumber + 1) + minNumber);
        setDiceValue(randomNumber);
    }

}
