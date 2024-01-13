import java.util.Arrays;

public class Equipo {

    private String nombre;
    private Jugador [] jugadores;

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");

        for (Jugador jugador : this.jugadores){
            if (jugador != null){
                sb.append("\t").append(jugador).append("\n");
            }
        }
        return sb.toString();
    }
}
