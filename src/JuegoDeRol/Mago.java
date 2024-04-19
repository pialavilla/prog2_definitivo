package JuegoDeRol;

public class Mago extends PersonajeBase{
    int pointsOfAttack;
    int pointsOfDefense;

    public Mago(int level, String name, int hitPoints, int pointsOfAttack, int pointsOfDefense) {
        super(level, name, hitPoints);
        this.pointsOfAttack = pointsOfAttack;
        this.pointsOfDefense = pointsOfDefense;
    }
    @Override
    public int attackk(){
        return pointsOfAttack;
    }

}
