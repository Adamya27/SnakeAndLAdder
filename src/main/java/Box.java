public class Box {

    private Integer position;
    private Integer targetPosition;

    public Box(Integer position, Integer targetPosition) {
        this.position = position;
        this.targetPosition = targetPosition;
    }


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(Integer targetPosition) {
        this.targetPosition = targetPosition;
    }
}
