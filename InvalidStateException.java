package JAVARuntime;

public class InvalidStateException extends RuntimeException{

    public InvalidStateException() {
    }

    @MethodArgs(args ={"message"})
    public InvalidStateException(String message) {
        super(message);
    }

    @MethodArgs(args ={"message","cause"})
    public InvalidStateException(String message, Throwable cause) {
        super(message, cause);
    }

    @MethodArgs(args ={"cause"})
    public InvalidStateException(Throwable cause) {
        super(cause);
    }
}
