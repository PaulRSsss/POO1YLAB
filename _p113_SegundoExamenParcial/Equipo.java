package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    // Constructor vacío
    public Equipo() {
        jugadores = new ArrayList<Jugador>();
    }

    // Constructor con los datos de la clase
    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        jugadores = new ArrayList<Jugador>();
    }

    // Método que regresa el arreglo de jugadores
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    // Método que agrega un jugador al arreglo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método que calcula el total del bono de los jugadores
    public double getTotalbono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            Totalbono += jugador.getBono();
        }
        return Totalbono;
    }

    // Método que calcula el total de los totales de los jugadores
    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    // Método que calcula el total de hombres
    public int getTotalH() {
        int Totalhombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                Totalhombres++;
            }
        }
        return Totalhombres;
    }

    // Método que calcula el total de mujeres
    public int getTotalM() {
        int Totalmujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                Totalmujeres++;
            }
        }
        return Totalmujeres;
    }

    // Método que imprime el reporte del equipo
    public void reporte() {
        System.out.println("reporte del equipo: " + nombre);
        System.out.println("liga: " + liga);
        System.out.println("total de jugadores: " + jugadores.size());
        System.out.println("total de bono: " + getTotalbono());
        System.out.println("total de totales: " + getTotal());
        System.out.println("total de hombres: " + getTotalH());
        System.out.println("total de mujeres: " + getTotalM());
    }

    // Método sobrecargado que muestra datos del equipo y totales
    @Override
    public String toString() {
        return "equipo: " + nombre + "\nliga: " + liga + "\ntotal de Jugadores: " + jugadores.size() + "\nTotal de Bono: " + getTotalBono() + "\nTotal de Totales: " + getTotal() + "\nTotal de Hombres: " + getTotalH() + "\nTotal de Mujeres: " + getTotalM();
    }
}