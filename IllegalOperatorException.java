package JAVARuntime;

public class IllegalOperatorException extends RuntimeException {

  public IllegalOperatorException() {}

  @JRDoc_EN("Creates an exception with a specified message.")
  @JRDoc_PT("Cria uma exceção com uma mensagem especificada.")
  @MethodArgs({"cause"})
  public IllegalOperatorException(String message) {
    super(message);
  }

  @JRDoc_EN("Creates an exception with a specified message and cause.")
  @JRDoc_PT("Cria uma exceção com uma mensagem e uma causa especificadas.")
  @MethodArgs({"message", "cause"})
  public IllegalOperatorException(String message, Throwable cause) {
    super(message, cause);
  }

  @JRDoc_EN("Creates an exception with a specified cause.")
  @JRDoc_PT("Cria uma exceção com uma causa especificada.")
  @MethodArgs({"cause"})
  public IllegalOperatorException(Throwable cause) {
    super(cause);
  }
}
