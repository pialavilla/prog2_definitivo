package ColeccionesEjer;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Lionel messi","Delantero",10);
        Player player2 = new Player("Cristiano Ronaldo","Delantero",7);
        Player player3 = new Player("Neymar jr","Delantero",11);

        //crear equipo
        Team equipo = new Team();
        //agregar jugadores a equipo
        equipo.addPlayer(player1);
        equipo.addPlayer(player2);
        equipo.addPlayer(player3);
        //iterar sobre los jugadores del equipo utilizando el bucle
        System.out.println("Jugadores del equipo ");
        for (Player player :equipo) {
            System.out.println("Nombre: " + player.getName() + ", Posicion: " + player.getPosition() + ", Nro de camiseta: " + player.getTshirtNumber());

        }
    }
}
