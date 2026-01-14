import java.util.Scanner;

public class SentenciaSwitchCaseNumDíaMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes 1 - 12 :");
        int mes = s.nextInt();
        System.out.println("Ingrese el año(YYYY)");
        int anio = s.nextInt();
        int numeroDeDías =0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDeDías = 31 ;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDeDías = 30;
                break;
            case 2:
                if (anio % 400 == 0 ||( (anio % 4 == 0) &&!(anio % 100 == 0))){
                    numeroDeDías = 29 ;
                }else {
                    numeroDeDías = 28;
                }
                break;
            default:
                numeroDeDías = 0;
        }

        System.out.println("numeroDeDías = " + numeroDeDías);
    }
}
