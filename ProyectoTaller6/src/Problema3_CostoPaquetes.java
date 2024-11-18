
import java.util.Scanner;

public class Problema3_CostoPaquetes {

    public static void main(String[] args) {
        double peso, costoEnvio;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PESO DEL PAQUETE (KG): ");
        peso = tcl.nextDouble();
        System.out.println("INGRESE LA REGION (local/nacional/internacional): ");
        region = tcl.next();
        if (peso < 5 && region.equals("local")) {
            costoEnvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }
        System.out.printf("El costo de envío es: " + costoEnvio +"$");
        
    }

}
