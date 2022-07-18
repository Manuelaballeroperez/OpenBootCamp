package Tema5;

public class SmartWatch extends SmartDevice {

    double pulgadas;
    String conectividad;
    boolean gps;


    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String color, double precio, String modelo, int age, double pulgadas, String conectividad, boolean gps) {
        super(marca, color, precio, modelo, age);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", age=" + age +
                ", pulgadas=" + pulgadas +
                ", conectividad='" + conectividad + '\'' +
                ", gps=" + gps +
                "} ";
    }
}
