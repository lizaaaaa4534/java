import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double sumaTotal = 0;
        double nota = 0;

        int canNotas1 = 0;
        int canNotas5 = 0;
        int canNotas4 = 0;
        int totalDenotas=20;

        double sumNotas5 = 0;
        double sumNotas4 = 0;

        boolean error = false;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota (escala del 1-7) " + i + ": ");
            nota = s.nextDouble();

            if (nota < 1 || nota > 7) {
                System.out.println("Error, nota inválida");
                error = true;
                break;
            }


            sumaTotal += nota;

            
            if (nota == 1) {
                canNotas1++;
            }

            if (nota > 5) {
                canNotas5++;
                sumNotas5 += nota;
            }

            if (nota < 4) {
                canNotas4++;
                sumNotas4 += nota;
            }
        }

        if (!error) {
            System.out.println("\nCantidad de notas 1: " + canNotas1);
            System.out.println("El promedio Total es : " + (sumaTotal/totalDenotas));
            if (canNotas5 > 0)
                System.out.println("Promedio notas > 5: " + (sumNotas5 / canNotas5));

            if (canNotas4 > 0)
                System.out.println("Promedio notas < 4: " + (sumNotas4 / canNotas4));
        }
    }
}

