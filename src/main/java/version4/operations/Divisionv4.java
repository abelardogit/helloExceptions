package version4.operations;

import version4.MyException;

public class Divisionv4 {

    public static int dividir(int dividendo, int divisor) throws MyException {
        try {
            return dividendo / divisor;
        } catch (ArithmeticException arithmeticException) {
            throw MyException.fromArithmeticException();
        }
    }
}
