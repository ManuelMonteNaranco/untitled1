public class Jugador {


    private String nombre;

    private String posicion;

    private int dorsal;

    private int numeroGoles;


    public Jugador(String nombre, String posicion, int dorsal, int numeroGoles){
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.numeroGoles = numeroGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }
    public void calcularMediaGoles(){
        int conatdorNombres = 0;
        for (int i = 0; i <=10; i++) {
            conatdorNombres++;
        }


    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" nombre:'").append(nombre).append('\'');
        sb.append(", posicion:'").append(posicion).append('\'');
        sb.append(", dorsal:").append(dorsal);
        sb.append(", numeroGoles:").append(numeroGoles);
        return sb.toString();
    }
}
