package JuegoDeRol;

public class Picaro extends PersonajeBase{
    int pointsOfAttack;
    int pointsOfDefense;

    public Picaro(int level, String name, int hitPoints, int pointsOfAttack, int pointsOfDefense) {
        super(level, name, hitPoints);
        this.pointsOfAttack = pointsOfAttack;
        this.pointsOfDefense = pointsOfDefense;
    }
    @Override
    public int attackk(){
        return pointsOfAttack;
    }

}
