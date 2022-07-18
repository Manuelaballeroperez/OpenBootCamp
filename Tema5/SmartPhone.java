package Tema5;

public class SmartPhone extends SmartDevice{

    int ram;
    double pantalla;
    String sistema;

    public SmartPhone(){
    super();
    }

    public SmartPhone(String marca, String color, double precio, String modelo, int age, int ram, double pantalla, String sistema) {
        super(marca, color, precio, modelo, age);
        this.ram = ram;
        this.pantalla = pantalla;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", age=" + age +
                ", ram=" + ram +
                ", pantalla=" + pantalla +
                ", sistema='" + sistema + '\'' +
                "} ";
    }
}
