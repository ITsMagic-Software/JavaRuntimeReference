package JAVARuntime;

public class IllegalBufferException extends RuntimeException{

    public IllegalBufferException() {
    }

    @MethodArgs(args ={"message"})
    public IllegalBufferException(String message) {
        super(message);
    }
    @MethodArgs(args ={"message","cause"})
    public IllegalBufferException(String message, Throwable cause) {
        super(message, cause);
    }
    @MethodArgs(args ={"cause"})
    public IllegalBufferException(Throwable cause) {
        super(cause);
    }
}
