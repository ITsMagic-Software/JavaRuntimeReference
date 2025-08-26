package JAVARuntime;

public class InvalidStateException extends RuntimeException {

  public InvalidStateException() {}

  @MethodArgs({"message"})
  public InvalidStateException(String message) {
    super(message);
  }

  @MethodArgs({"message", "cause"})
  public InvalidStateException(String message, Throwable cause) {
    super(message, cause);
  }

  @MethodArgs({"cause"})
  public InvalidStateException(Throwable cause) {
    super(cause);
  }
}
