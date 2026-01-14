import java.util.Scanner;

    public class EstanqueGasolina {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int capacidadActual ; // Capacidad Ingresada

            System.out.println("Ingrese la cantidad del estanque (máx. cantidad 70 litros):");
             capacidadActual = scanner.nextInt();

             if (capacidadActual < 0 || capacidadActual > 70 ){
                 System.out.println("cantidad inválida");
             }
            else if( capacidadActual > 0 && capacidadActual < 20 ){
                System.out.println(" cantidad insuficiente");
            } else if (capacidadActual >= 20 && capacidadActual < 35) {
                System.out.println("cantidad suficiente");
            } else if (capacidadActual >= 35 && capacidadActual <40) {
                System.out.println("cantidad de medio estanque");
            } else if (capacidadActual >= 40 && capacidadActual < 60) {
                System.out.println("cantidad del estanque 3/4");
            } else if (capacidadActual >=60 && capacidadActual <70) {
                System.out.println("Estanque casi lleno");
            } else  {
                System.out.println(" Estanque lleno");
            }
            scanner.close();
        }
    }
