package Temas789;

import java.util.Vector;

public class Ejercicio3y4 {

    public static void main(String[] args) {

        Vector numeros  = new Vector(5,10);
        numeros.addElement(1);
        numeros.addElement(2);
        numeros.addElement(3);
        numeros.addElement(4);
        numeros.addElement(5);

        System.out.println(numeros);
        numeros.remove(2);
        numeros.remove(3);
        System.out.println(numeros);
// tendriamos que replicar el vector tantas veces como hiciesen necesaria, con el gasto de memoria que conlleva eso.

    }
}
