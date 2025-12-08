import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente :");
       String cliente =  scanner.nextLine();
        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();
        System.out.println("Ingrese el precio:");
        double precio = scanner.nextInt();
        System.out.println("Ingrese la cantidad comprada");
        int cantidad = scanner.nextInt();
        double total = precio * cantidad ;
        System.out.println("\n-----FACTURA-----");
        System.out.println("Cliente = " + cliente);
        System.out.println("Producto = " + producto);
        System.out.println("Cantidad = " + cantidad);
        System.out.println("Precio unitario : s/. " + precio);
        System.out.println("Total a pagar : s/. " + total);
        scanner.close();

    }
}
