package version2.operations;

public class Divisionv2 {

    public static int dividir(int dividendo, int divisor) {
        try {
            return dividendo / divisor;
        } catch(ArithmeticException arithmeticException) {
            System.err.println("El divisor es cero.");
            return -Integer.MAX_VALUE;
        }

    }
}
