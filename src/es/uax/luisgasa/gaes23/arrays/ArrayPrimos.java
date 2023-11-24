package es.uax.gaes23.arrays;
import java.util.Scanner;

public class ArrayPrimos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[20];
        int[] primo = new int[20];
        int contador;
        boolean esPrimo;

        generarNumerosAleatorios(numero);
        contador = contarPrimos(numero, primo);

        imprimirNumeros(numero);
        imprimirPrimos(primo, contador);
    }

    private static void generarNumerosAleatorios(int[] numero) {
        System.out.println("Generación de 20 números de forma aleatoria");
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 100);
        }
    }

    private static int contarPrimos(int[] numero, int[] primo) {
        int contador = 0;
        for (int n : numero) {
            boolean esPrimo = esPrimo(n);
            if (esPrimo) {
                primo[contador] = n;
                contador++;
            }
        }
        return contador;
    }

    private static boolean esPrimo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(n) && esPrimo; i++) {
            if ((n % i) == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    private static void imprimirNumeros(int[] numero) {
        System.out.println();
        System.out.println("Números generados:");
        for (int n : numero) {
            System.out.print(n + " ");
        }
    }

    private static void imprimirPrimos(int[] primo, int contador) {
        System.out.println();
        System.out.println("Números primos:");
        for (int i = 0; i < contador; i++) {
            System.out.print(primo[i] + " ");
        }
    }
}