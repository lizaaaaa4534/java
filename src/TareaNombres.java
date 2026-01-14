import javax.swing.*;

public class TareaNombres {
    public static void main(String[] args) {
        String max = JOptionPane.showInputDialog("Ingrese el nombre y apellido de una persona");

        for (int i = 1; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre y apellido de una persona");
            if (nombre.length() > max.length()) {
                max = nombre;
            }
        }

        System.out.println("El nombre más largo es: " + max);
    }
}
