public class Main {
Equipo[] equipos;



    public static void main(String[] args) {
        new Main();
    }
        public Main() {
            Equipo equipo1 = new Equipo("New Team",  //la calse equipo tiene dos constructores en la cual reciben el nmbre y el array jugador y asi le psas de primer parametro el equipo y de segudo los jugadores
                    new Jugador[]{
                            new Jugador("Ronaldo", "DEL", 9, 35),
                            new Jugador("Batistuta", "DEL", 9, 30),
                            new Jugador("Sharer", "DEL", 9, 36)});
            Equipo equipo2 = new Equipo("Mambo",
                    new Jugador[]{
                            new Jugador("Batistuta", "DEL", 9, 30),
                            new Jugador("Sharer", "DEL", 9, 36),
                            new Jugador("Villa", "DEL", 9, 25),
                            new Jugador("Shevchenko", "DEL", 9, 31),
                            new Jugador("Zamorano", "DEL", 9, 28)});


            this.equipos = new Equipo[]{equipo1,equipo2};

//                       equipo1.setJugadores(this.jugadores);
//                        equipo2.setJugadores(this.jugadores);
                        incrimentarGoles("Ronaldo", 10);
//
            System.out.println("Media de goles = " + this.clacularMediaGoles());

            System.out.println("Maximo goleador " + this.getMaximoGoleador());


//            borrarJugadorDesplazando("Ronaldo");
//            borrarJugadorDesplazando("Sharer");
//            borrarJugadorDesplazando("Zamorano");
//            borrarJugadorDesplazando("Batistuta");
           cambiarDorsal("Mambo","Villa", 7);
            System.out.println(arrayAString(this.equipos));
            //System.out.println(obtenerLitado());
            //System.out.println(getMaximoGoleadorPorEquipo());
            System.out.println(arrayAString(getMaximoGoleadorPorEquipo())); //recibe un array del padre y lo imprime el hijo y deberia de llamar al to String de cada jugador


    }

//            public void borrarJugadorDesplazado (String nombreJugador){
//                for (int i = 0; i < this.jugadores.length; i++) {
//                    if (this.jugadores[i] != null &&
//                            this.jugadores[i].getNombre().equals(nombreJugador)) {
//                        this.jugadores[i] = null;
//                    }
//
//                }
//                desplazamientoNulos(this.jugadores);
//            }
//            private void desplazamientoNulos (Jugador[]jugadores){
//                if (jugadores == null) {
//                    for (int i = 0; i < this.jugadores.length; i++) {
//                        this.jugadores[i] = this.jugadores[i + 1];
//                    }
//                    System.out.println(this.jugadores);
//                }
//            }

           private double clacularMediaGoles () {
                double sumaGoles = 0;
                int numJugadores = 0;
                for (Equipo equipo : this.equipos ) {
                    for (Jugador jugador : equipo.getJugadores()) {
                        if (jugador != null) {
                            numJugadores++;
                            sumaGoles += jugador.getNumeroGoles();
                        }
                    }
                }
                return sumaGoles / numJugadores;
            }

            private void incrimentarGoles (String nombrejugador,int goles){
                for (Equipo equipo : this.equipos) {
                    for (Jugador jugador : equipo.getJugadores()) { // al igual que con equipo palabra calabe para que acceder a la clase jugador y en equipo para acceder a la clase equipo
                        if (equipo.getJugadores() != null) {
                            if (jugador.getNombre().equals(nombrejugador)) {
                                jugador.setNumeroGoles(jugador.getNumeroGoles() + goles);
                            }
                        }
                    }
                }

              }

             private String getMaximoGoleador () {
                Jugador maximogoleador = this.equipos[0].getJugadores()[0];
               int maximogoles = 0;
               for (Equipo equipo1 : this.equipos) {
                   for (Jugador jugador : equipo1.getJugadores())
                       if (jugador != null) {
                           if (jugador.getNumeroGoles() > maximogoles) {
                               maximogoleador = jugador;
                               maximogoles = jugador.getNumeroGoles();
                           }
                       }
                }
                 for (Equipo equipo2 : this.equipos) {
                     for (Jugador jugador : equipo2.getJugadores())
                         if (jugador != null) {
                             if (jugador.getNumeroGoles() > maximogoles) {
                                 maximogoleador = jugador;
                                 maximogoles = jugador.getNumeroGoles();
                             }
                         }
                 }

               return maximogoleador.getNombre().toString();
            }
            private Jugador[] getMaximoGoleadorPorEquipo(){
        Jugador[] maximosGoleadores = new Jugador[this.equipos.length]; // para que pase por todos los huecos de Jugadores en tosd las opciones de qeupos con el .length

        for (int i = 0; i< this.equipos.length; i++){
           Jugador[] jugadores = this.equipos[i].getJugadores();
            Jugador maximoGoleador = jugadores[0];
            for (int j = 0; j < jugadores.length; j++){
                if (jugadores[j].getNumeroGoles() > maximoGoleador.getNumeroGoles()){
                    maximoGoleador = jugadores[j];

                }
            }
            maximosGoleadores[i] = maximoGoleador;

        }
        return maximosGoleadores;

    }


          private void cambiarDorsal (String nombreEquipo,String nombrejugador,int dorsal) {
              for (Equipo equipo : this.equipos) {
                  if(equipo.getNombre().equals(nombreEquipo))
                  for (Jugador jugador : equipo.getJugadores()) {
                      //for (Jugador jugador : this.jugadores) { //en cada pasada la casilla la llama jugador y el cuando llegue a la ultima vera que vale null y saldra y mientras alla jugador al haber hecho: this.jugador saldrna ahi los datos que haya en jugador
                          if (jugador != null) { // si ve en las casillas de ejemplos un hueco libre  == null no entre y de error solo entre en los que no sea nul
                              if (jugador.getNombre().equals(nombrejugador)) { //para ver si el nombre que quiero manipular es igual al que me an pasado
                                  jugador.setDorsal(dorsal); //pa cambairlo
                              }
                          }
                      }
                  }
              }
            private String obtenerLitado () {
                StringBuilder sb = new StringBuilder();
                for (Equipo equipo : this.equipos) {
                       sb.append(equipo);
               }
                return sb.toString();
            }
            private String arrayAString(Object[] array){ // object[] es la superclase es el padre de todas las clses
        StringBuilder sb = new StringBuilder();
        for (Object equipo: array){
            sb.append(equipo);
        }
        return sb.toString();
        }
//            private String obtenerLitadocONfORnORMAL () {
//                StringBuilder sb = new StringBuilder();
//
//                for (int i = 0; i < this.jugadores.length; i++) {
//
//                    sb.append(this.jugadores[i]);
//                    sb.append("\n");
//                }


//                return sb.toString();
//            }
//            public void borrarJugadorDesplazando (String nombreJugador){
//                for (int i = 0; i < this.jugadores.length; i++) {
//                    if (this.jugadores[i] != null &&
//                            this.jugadores[i].getNombre().equals(nombreJugador)) {
//                        this.jugadores[i] = null;
//                        desplazarNulos2(this.jugadores);
//                    }
//                }
//            }
            private void desplazarNulos2 (Jugador[]jugadores){
                for (int i = 0; i < jugadores.length; i++) {
                    if (jugadores[i] == null && i < this.equipos.length - 1) {
                        int j = i;
                        do {
                            jugadores[j] = jugadores[j + 1];
                            jugadores[j + 1] = null;
                            j++;
                        } while (jugadores[j] != null && j < jugadores.length - 1);
                    }
                }
            }
        }