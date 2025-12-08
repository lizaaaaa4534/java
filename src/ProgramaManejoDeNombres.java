import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre : ");
        String nombeA = scanner.nextLine();
        String nombreA2 = nombeA.toUpperCase().charAt(1)+"."+nombeA.substring(nombeA.length()-2);
        System.out.println("nombreA2 = " + nombreA2);

        System.out.println("Ingrese un nombre : ");
        String nombeB = scanner.nextLine();
        String nombreB2 = nombeB.toUpperCase().charAt(1)+"."+nombeB.substring(nombeB.length()-2);
        System.out.println("nombreB2 = " + nombreB2);

        System.out.println("Ingrese un nombre : ");
        String nombeC = scanner.nextLine();
        String nombreC2 = nombeC.toUpperCase().charAt(1)+"."+nombeC.substring(nombeC.length()-2);
        System.out.println("nombreC2 = " + nombreC2);

        String resultado = nombreA2 +"_"+ nombreB2 +"_"+ nombreC2;
        System.out.println("resultado = " + resultado);
    }
}
