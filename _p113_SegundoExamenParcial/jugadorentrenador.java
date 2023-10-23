package _p113_SegundoExamenParcial;

public class jugadorentrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;
    
    public jugadorentrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    // getters y setters
    public int getSubordinados() {
        return Subordinados;
    }
    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }
    public int getProyectos() {
        return Proyectos;
    }
    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }
    
    // método sobrecargardo para calcular el bono
    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10);
        return bono;
    }

    // métpdo para calcular el total
    public double total() {
        double Total = Salario + getBono();
        return Total;
    }
    
    // método toString
    @Override
    public String toString() {
        return "Jugadorentrenador [Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + "]";
    }
    
    
}