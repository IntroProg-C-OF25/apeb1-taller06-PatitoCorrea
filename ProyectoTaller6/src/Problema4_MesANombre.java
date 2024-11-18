
import java.util.Scanner;

public class Problema4_MesANombre {

    public static void main(String[] args) {
        int numMes;
        Scanner tcl = new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO DEL 1 AL 12 SEGUN EL MES: ");
        numMes = tcl.nextInt();
        String NombreM;
        switch (numMes) {
            case 1:
                NombreM = "Enero";
                break;
            case 2:
                NombreM = "Febrero";
                break;
            case 3:
                NombreM = "Marzo";
                break;
            case 4:
                NombreM = "Abril";
                break;
            case 5:
                NombreM = "Mayo";
                break;
            case 6:
                NombreM = "Junio";
                break;
            case 7:
                NombreM = "Julio";
                break;
            case 8:
                NombreM = "Agosto";
                break;
            case 9:
                NombreM = "Septiembre";
                break;
            case 10:
                NombreM = "Octubre";
                break;
            case 11:
                NombreM = "Noviembre";
                break;
            case 12:
                NombreM = "Diciembre";
                break;
            default:
                NombreM = "Número de mes inválido";
                break;
        }
        System.out.println("El mes correspondiente es: " + NombreM);

    }

}
