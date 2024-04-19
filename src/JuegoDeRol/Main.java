package JuegoDeRol;

public class Main {
    public static void main(String[] args) {
    Guerrero guerrero1 = new Guerrero(10,"Guerrero",100,20,10);
    Mago mago1 = new Mago(20,"Mago",100,30,100);
    Picaro picaro1 = new Picaro(15,"Picaro",30,200,46);

        // Simulación del ataque del guerrero al mago
        int danioGuerreroAMago = guerrero1.attackk();
        mago1.defend(danioGuerreroAMago);
        System.out.println("El guerrero ataca al mago y le inflige " + danioGuerreroAMago + " puntos de daño.");
        System.out.println("El mago tiene " + mago1.HitPoints + " puntos de vida restantes.");

        // Simulación del ataque del mago al pícaro
        int danioMagoAPicaro = mago1.attackk();
        picaro1.defend(danioMagoAPicaro);
        System.out.println("El mago ataca al pícaro y le inflige " + danioMagoAPicaro + " puntos de daño.");
        System.out.println("El pícaro tiene " + picaro1.HitPoints + " puntos de vida restantes.");
    }
}
