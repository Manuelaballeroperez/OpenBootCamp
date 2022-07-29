package Temas789;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            list.add(i);


        }
        System.out.println(list);
    }

}

