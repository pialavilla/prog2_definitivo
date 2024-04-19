package JuegoDeRol;

public class Guerrero extends PersonajeBase{
    int pointsOfAttack;
    int pointsOfDefense;

    public Guerrero(int level, String name, int hitPoints, int pointsOfAttack, int pointsOfDefense) {
        super(level, name, hitPoints);
        this.pointsOfAttack = pointsOfAttack;
        this.pointsOfDefense = pointsOfDefense;
    }
    @Override
    public int attackk(){
        return pointsOfAttack;
    }
}
