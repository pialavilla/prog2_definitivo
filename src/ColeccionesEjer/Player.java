package ColeccionesEjer;

public class Player {
    private String name;
    private String position;
    private int TshirtNumber;

    public Player(String name, String position, int tshirtNumber) {
        this.name = name;
        this.position = position;
        TshirtNumber = tshirtNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getTshirtNumber() {
        return TshirtNumber;
    }
}
