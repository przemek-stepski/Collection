public class MyException extends RuntimeException {
    private static String message = "Index is big";

    public MyException() {
        super(message);
    }

}
