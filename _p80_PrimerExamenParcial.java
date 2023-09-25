import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int totalEdad = 0;

        while (totalParticipantes < 15) {
            System.out.println("Ingrese el nombre del participante #" + (totalParticipantes + 1) + " (o 'fin' para salir):");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Ingrese la edad:");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el sexo (Hombre/Mujer):");
            String sexo = scanner.nextLine();

            System.out.println("Ingrese el tipo de participante (Alumno/Docente/Trabajador):");
            String tipoParticipante = scanner.nextLine();

            if (edad >= 18) {
                if (verificarEdadYRegistrar(nombre, edad)) {
                    totalParticipantes++;
                    totalEdad += edad;

                    if (tipoParticipante.equalsIgnoreCase("Alumno")) {
                        totalAlumnos++;
                        totalDineroAlumnos += 50;
                    } else if (tipoParticipante.equalsIgnoreCase("Docente")) {
                        totalDocentes++;
                        totalDineroDocentes += 80;
                    } else if (tipoParticipante.equalsIgnoreCase("Trabajador")) {
                        totalTrabajadores++;
                        totalDineroTrabajadores += 60;
                    }

                    if (sexo.equalsIgnoreCase("Hombre")) {
                        totalHombres++;
                    } else if (sexo.equalsIgnoreCase("Mujer")) {
                        totalMujeres++;
                    }
                }
            } else {
                System.out.println("Lo siento, " + nombre + ", eres menor de 18 años y no puedes registrarte.");
            }
        }

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = (double) totalEdad / totalParticipantes;

        System.out.println("\nResumen del Concurso:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en General: " + totalHombres);
        System.out.println("Total de Mujeres en General: " + totalMujeres);
        System.out.println("Total de Todos los Participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad de Todos los Participantes: " + promedioEdad);

        System.out.println("\nDinero Recaudado:");
        System.out.println("Total Dinero Recaudado de Alumnos: " + totalDineroAlumnos + " pesos");
        System.out.println("Total Dinero Recaudado de Docentes: " + totalDineroDocentes + " pesos");
        System.out.println("Total Dinero Recaudado de Trabajadores: " + totalDineroTrabajadores + " pesos");
        System.out.println("Total Dinero en General: " + totalDineroGeneral + " pesos");

        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral >= 100 && totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }

    public static boolean verificarEdadYRegistrar(String nombre, int edad) {
        return true;
    }
}
