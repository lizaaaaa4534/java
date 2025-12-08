public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '@';
        char decimal = 64 ;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + true);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + true);

        char espacio = '\u0020';
        char retroceso ='\b';
        char tabulador = '\t';
        char nuevaLinea ='\n';
        char retornoCarro ='\r';


        System.out.println("char corresponde en\r byte :" + tabulador + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
