import version1.operations.Division;
import version2.operations.Divisionv2;
import version3.operations.Divisionv3;
import version4.MyException;
import version4.operations.Divisionv4;

public class HelloExceptionsApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        // ❌ Versión 1. Dejar que rompa la app.
        int c = Division.dividir(a, b);

        // ❌ Versión 2. Que sea el método dividir el
        // que gestione la excepción.
        c = Divisionv2.dividir(a, b);

        // ✅ Versión 3. Que sea el método main
        // el que gestione la excepción.
        try {
            c = Divisionv3.dividir(a, b);
        } catch (ArithmeticException arithmeticException) {
            System.err.println("División entre cero");
        }

        // ✅✅ Versión 4. Programación defensiva.
        if (b == 0) {
            System.err.println("División por cero");
        } else {
            c = Divisionv3.dividir(a, b);
        }

        // ✅✅✅ Versión 4. Programación semántica.
        MyException exception = MyException.fromArithmeticException();
        exception = MyException.fromIOException("No se puede acceder a la base de datos.");

        // ✅✅✅ Versión 4. Programación defensiva.
        try {
            c = Divisionv4.dividir(a, b);
        } catch (MyException myException) {
            System.err.println(myException.getMessage());
        }

    }
}
