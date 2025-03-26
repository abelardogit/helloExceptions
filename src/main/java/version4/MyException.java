package version4;

public class MyException extends Exception {

    private MyException(String message) {
        super(message);
    }

    public static MyException fromArithmeticException() {
        return new MyException("División entre cero");
    }

    public static MyException fromIOException(String msg) {
        return new MyException(msg);
    }

}
