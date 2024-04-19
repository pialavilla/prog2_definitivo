package JuegoDeRol;

abstract class PersonajeBase implements Personaje{
    int level;
    String name;
    int HitPoints;

    public PersonajeBase(int level, String name, int hitPoints) {
        this.level = level;
        this.name = name;
        HitPoints = hitPoints;
    }

    @Override
    public void defend (int damage){
        HitPoints-=damage;
    }
}
