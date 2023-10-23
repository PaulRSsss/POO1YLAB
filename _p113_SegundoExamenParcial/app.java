package _p113_SegundoExamenParcial;
public class app {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Equipo miequipo = new Equipo("Libertadores", "Torneo la frutifantástica");
        miequipo.reporte();
        
        miequipo.agregarJugador(new jugadorentrenador("Joan Sebastian", 'H', "Entrenador Principal", 1200, 8,1));
        miequipo.agregarJugador(new jugadorentrenador("Gustavo Cerati", 'H', "Entrenador de Apoyo", 982, 10,2));
        miequipo.agregarJugador(new jugadoractivo("Enrique Bunbury",'H',"Principal No 10",100,2,2));
        miequipo.agregarJugador(new jugadoractivo("Junior Hugo",'H',"Principal No 9",99,3,1));
        miequipo.agregarJugador(new jugadoractivo("Natanael Cano",'H',"Principal No 21",98,3,3));
        miequipo.agregarJugador(new jugadoractivo("Peter Parker",'H',"Banca No 19",120,4,1));
        miequipo.agregarJugador(new jugadoractivo("Alexa Garcia",'M',"Banca No 12",155,4,4));
        miequipo.agregarJugador(new jugadoractivo("Gabito Ballesteros",'H',"Banca No 13",333,5,3));
        miequipo.agregarJugador(new jugadoractivo("Ovy Tambores",'H',"Principal No 6",550,5,5));
        miequipo.agregarJugador(new jugadoractivo("Oziel Nuñez",'H',"Principal No 7",634,4,2));
        miequipo.agregarJugador(new jugadoractivo("Paty Cantú",'M',"Principal No 8",700,5,3));
        miequipo.reporte();
    }
}