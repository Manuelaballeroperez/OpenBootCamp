import java.util.Locale;

public class EjercicioTema4 {

    public static void main(String[] args) {
        int numeroIf = 4;
        boolean condicionIf;
        if (numeroIf >= 0 ){
            condicionIf = true;
        } else {
            condicionIf = false;
        }
        System.out.println("numero if: " + condicionIf);
        System.out.println();
    int numeroWhile = 0;
    while (numeroWhile < 3){
        System.out.println("Numero While: " + numeroWhile);
    numeroWhile++;

        }
        System.out.println();
    boolean condicionDoWhile = false;
    int numeroDoWhile = 0;
    do {

        System.out.println("Numero do while: " +numeroDoWhile);
        numeroDoWhile++;

        if (numeroDoWhile == 1) {
            condicionDoWhile = true;
        }

    } while (condicionDoWhile = false);
        System.out.println();
             int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("numeroFor: " + i);
            numeroFor++;
        }
        System.out.println();
        String estacion = "INVIERNO".toUpperCase(Locale.ROOT);
switch (estacion){
    case "INVIERNO":
        System.out.println("Es invierno");
        break;
    case "PRIMAVERA":
    System.out.println("Es Primavera");
    break;
    case "VERANO":
        System.out.println("Es Verano");
        break;
    case "OTOÑO":
        System.out.println("Es Otoño");
        break;
    default:
System.out.println("No es una estación");
}
    }
}
