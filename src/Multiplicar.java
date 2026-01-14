import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int resultado = 0 ;
        System.out.println("Ingrese un número :");
        int num1= s.nextInt();
        System.out.println("Ingrese un segundo número :");
        int num2 = s.nextInt();

        boolean negativo = false;
        if (num1 < 0) {
            num1 = -num1;
            negativo = !negativo;
        }
        if (num2 < 0) {
            num2 = -num2;
            negativo = !negativo;
        }

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        if (negativo) {
            resultado = -resultado;
        }

        System.out.println("El resultado es : " + resultado);


    }
}
