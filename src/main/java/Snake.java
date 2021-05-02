public class Snake {
    private int position;
    private int targetPosition;

    public Snake(int position, int targetPosition) {
        this.position = position;
        this.targetPosition = targetPosition;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(int targetPosition) {
        this.targetPosition = targetPosition;
    }
}
