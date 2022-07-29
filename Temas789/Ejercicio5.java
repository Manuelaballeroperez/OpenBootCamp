package Temas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");



        LinkedList<String> copia = new LinkedList<String>();
        for (int i = 0; i < list.size(); i++) {
            copia.add(list.get(i));

        }

        System.out.println(copia);
        System.out.println("--------------------------------");
        System.out.println(list);
    }
}
