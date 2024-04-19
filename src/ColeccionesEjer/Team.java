package ColeccionesEjer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Team implements Iterable<Player>{
        private List<Player> players;

        public Team() {
            this.players = new ArrayList<>();
        }

        public void addPlayer(Player player) {
            players.add(player);
        }

        @Override
        public Iterator<Player> iterator() {
            return new TeamIterator();
        }

        private class TeamIterator implements Iterator<Player> {
            private int indiceActual;

            public TeamIterator() {
                this.indiceActual = 0;
            }


            @Override
            public boolean hasNext() {
                return indiceActual < players.size();
            }

            @Override
            public Player next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No hay más jugadores");
                }
                return players.get(indiceActual++);
            }
        }
    }
