package JAVARuntime;

public class IllegalPFileUseException extends RuntimeException{

    public IllegalPFileUseException() {
    }
    @MethodArgs(args={"message"})
    public IllegalPFileUseException(String message) {
        super(message);
    }
    @MethodArgs(args={"message","cause"})
    public IllegalPFileUseException(String message, Throwable cause) {
        super(message, cause);
    }
    @MethodArgs(args={"cause"})
    public IllegalPFileUseException(Throwable cause) {
        super(cause);
    }
}
