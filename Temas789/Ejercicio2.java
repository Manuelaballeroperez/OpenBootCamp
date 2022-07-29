package Temas789;

public class Ejercicio2 {

    public static void main(String[] args) {


        int[] nombres = {1,2,3};
        int[] edades = {10, 20, 30};


        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < edades.length; j++){
                System.out.println( "nombres: " + nombres[i] + "edades: " +edades[j]);
            }
        }


    }
}