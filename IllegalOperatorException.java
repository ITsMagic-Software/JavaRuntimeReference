package JAVARuntime;

public class IllegalOperatorException extends RuntimeException{

    public IllegalOperatorException() {
    }

    @MethodArgs(args ={"cause"})
    public IllegalOperatorException(String message) {
        super(message);
    }
    @MethodArgs(args ={"message","cause"})
    public IllegalOperatorException(String message, Throwable cause) {
        super(message, cause);
    }
    @MethodArgs(args ={"cause"})
    public IllegalOperatorException(Throwable cause) {
        super(cause);
    }
}
