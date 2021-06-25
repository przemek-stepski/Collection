public class MyException extends RuntimeException {
    private static String message = "Index out of bond, try lower number ;-)";

    public MyException() {
        super(message);
    }

}
