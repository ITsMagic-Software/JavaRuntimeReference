package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
public class ShaderAlreadyAttachedException extends RuntimeException {

  public ShaderAlreadyAttachedException() {}

  public ShaderAlreadyAttachedException(String message) {
    super(message);
  }

  public ShaderAlreadyAttachedException(String message, Throwable cause) {
    super(message, cause);
  }

  public ShaderAlreadyAttachedException(Throwable cause) {
    super(cause);
  }
}
