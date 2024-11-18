
import java.util.Scanner;

public class Problema5_TipoOperacion {
    public static void main(String[] args) {
        int numOperacion;
        String tipoOperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 4 que represente una operación matemática:");
        System.out.print("1: Suma");
        System.out.print("2: Resta");
        System.out.print("3: Multiplicación");
        System.out.print("4: División");
        numOperacion = tcl.nextInt();
        switch (numOperacion) {
            case 1:
                tipoOperacion = "Suma";
                break;
            case 2:
                tipoOperacion = "Resta";
                break;
            case 3:
                tipoOperacion = "Multiplicación";
                break;
            case 4:
                tipoOperacion = "División";
                break;
            default:
                tipoOperacion = "Operación no válida";
                break;
        }
        System.out.println("La operación seleccionada es: " + tipoOperacion);
    }
    
}
