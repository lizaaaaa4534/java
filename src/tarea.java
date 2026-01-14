import java.util.Scanner;

public class tarea {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Ingresar la cantidad de números que desea:");
       int cantidad = s.nextInt();
       if (cantidad<10){
           System.out.println("Error , la cantidad es menor a 10 !");
           return;
       }
        System.out.println("Ingrese el primer número :");
       int num1 = s.nextInt();
       int menor = num1 ;
       for (int i = 2; i <= cantidad ; i++){
           System.out.println("Ingrese un número:");
            int num2 = s.nextInt();

            if (num2<menor){
                menor=num2;
            }
       }
        System.out.println("El menor número es : " + menor);
       if (menor < 10 ){
            System.out.println("El número es meor a 10 !");
        }else {
            System.out.println("El número es igual o mayor a 10!");
        }
    }
}
