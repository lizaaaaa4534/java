import java.util.Scanner;

public class SentenciaIfElseNumDíaMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes 1 - 12 :");
        int mes = s.nextInt();
        System.out.println("Ingrese el año(YYYY)");
        int anio = s.nextInt();

     int numeroDeDías =0;
     if (mes == 1  || mes == 3  || mes == 5  || mes == 7  || mes == 8  || mes == 10  || mes == 12){
         numeroDeDías =31;
     }else if (mes == 4 || mes == 6  || mes == 9  || mes == 11){
         numeroDeDías = 30 ;
        } else if (mes == 2) {
          if (anio % 400 == 0 ||( (anio % 4 == 0) &&!(anio % 100 == 0))){
              numeroDeDías = 29 ;
          }else {
              numeroDeDías = 28;
          }
     }
        System.out.println("numeroDeDías = " + numeroDeDías);
    }
}
