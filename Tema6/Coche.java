package Tema6;

public class Coche {

    String marca;
    String puerta;
    double precio;


    public Coche() {
    }

    public Coche(String marca, String puerta, double precio) {
        this.marca = marca;
        this.puerta = puerta;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", puerta='" + puerta + '\'' +
                ", precio=" + precio +
                '}';
    }
}
