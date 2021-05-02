public class Player {
    String name;
    int id;
    Boolean hasWon;
    Integer position;

    public Player(String name, int id, Integer position) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.hasWon = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
