package JAVARuntime;

public class IllegalPFileUseException extends RuntimeException{

    public IllegalPFileUseException() {
    }
    @MethodArgs({"message"})
    public IllegalPFileUseException(String message) {
        super(message);
    }
    @MethodArgs({"message","cause"})
    public IllegalPFileUseException(String message, Throwable cause) {
        super(message, cause);
    }
    @MethodArgs({"cause"})
    public IllegalPFileUseException(Throwable cause) {
        super(cause);
    }
}
