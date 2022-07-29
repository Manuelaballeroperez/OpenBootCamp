package Temas789;

import java.util.Scanner;

public class Ejercicio7 {
    public static class dividePorCero {

        private static int dividir(int a, int b) throws ArithmeticException {


            return a / b;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducieros dos numeros para dividir: ");

        System.out.println("Primer numero: ");
        int n = scanner.nextInt();
        System.out.println("Segundo numero: ");
        int m = scanner.nextInt();

        int resultado = dividePorCero.dividir(n,m);
        System.out.println("Resultado: " + resultado);
    }


}
