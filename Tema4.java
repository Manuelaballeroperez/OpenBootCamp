package tema1;

import java.util.ArrayList;
import java.util.List;

public class Tema4 {



    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();
        nombres.add("juan");
        nombres.add("kong");
        nombres.add("salah");

       for (int i = 0; i < nombres.size(); i++){
           System.out.println(nombres.get(i));
       }
    }
}
