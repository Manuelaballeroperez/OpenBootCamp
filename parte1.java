public class parte1 {
    public static void main(String[] args) {
        int resultado = suma(5, 6,7);
        System.out.println(resultado);

    coche miCoche = new coche();
    miCoche.aumentarpuerta();

    System.out.println("Mi coche ANTES de aumentar puertas:");
    System.out.println(miCoche.puertas);
    System.out.println("Mi coche DESPUES de aumentar puertas:");
    miCoche.aumentarpuerta();
    System.out.println(miCoche.puertas);


    }

    public static int suma(int a, int b, int c) {
        return a + b +c;
    }


      static class coche {
       public int puertas = 5;


    public void aumentarpuerta() {
       this.puertas++;
     }
    }
}


