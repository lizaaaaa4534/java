import java.util.Scanner;

public class OrdenDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1 ;
        int valor2 ;

        System.out.println("Ingrese el primer valor :");
        valor1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor :");
        valor2 = scanner.nextInt();

        if(valor1 > valor2){
            System.out.println("el orden es : " + valor1 + ";" + valor2);
        } else if (valor2 > valor1) {
            System.out.println("el orden es : " + valor2 + ";" + valor1);
        }else {
            System.out.println("los números son iguales : " + valor1 + ";" + valor2);
        }
        scanner.close();
    }
}
