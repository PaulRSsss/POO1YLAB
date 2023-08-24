//Envía un saludo a la pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Juan";
        String hermano = "Pablo";
        String mensaje = String.format("Tanto %s como %S desean aprender a programar en Java", amigo, hermano);

        System.out.println("Hola Mundo en el Lenguaje Java");
        System.out.println("\nHola amigo ");
        System.out.println("\nMi amigo es " + amigo + " y mi hermaon es " + hermano + "\n");
        System.out.println(mensaje);
    }   
}
