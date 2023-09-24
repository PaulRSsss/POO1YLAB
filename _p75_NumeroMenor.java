//Diseña un programa con una función que pida 4 números enteros y devuelva el menor de ellos.

import java.util.Scanner;

public class _p75_NumeroMenor {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingresa el primer número entero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo número entero:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingresa el tercer número entero:");
        int num3 = scanner.nextInt();
        
        System.out.println("Ingresa el cuarto número entero:");
        int num4 = scanner.nextInt();
        
        int menorNumero = encontrarMenorNumero(num1, num2, num3, num4);
        
        System.out.println("El número menor es: " + menorNumero);
        
        scanner.close();
    }
    
    public static int encontrarMenorNumero(int a, int b, int c, int d) {
        int menor = a;
        
        if (b < menor) {
            menor = b;
        }
        
        if (c < menor) {
            menor = c;
        }
        
        if (d < menor) {
            menor = d;
        }
        
        return menor;
    }
}