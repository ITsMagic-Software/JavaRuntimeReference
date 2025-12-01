package JAVARuntime;

public class IllegalBufferException extends RuntimeException{

    public IllegalBufferException() {
    }

    @MethodArgs({"message"})
    public IllegalBufferException(String message) {
        super(message);
    }
    @MethodArgs({"message","cause"})
    public IllegalBufferException(String message, Throwable cause) {
        super(message, cause);
    }
    @MethodArgs({"cause"})
    public IllegalBufferException(Throwable cause) {
        super(cause);
    }
}
