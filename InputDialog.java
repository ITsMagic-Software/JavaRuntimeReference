package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Input"})
public class InputDialog {
  public enum Type {
    String,
    Float,
    Int
  }

  private transient boolean calledFromEngine = false;

  @MethodArgs({"tittle", "listener"})
  public InputDialog(String tittle, InputDialogListener listener) {}

  @MethodArgs({"tittle", "type", "listener"})
  public InputDialog(String tittle, Type type, InputDialogListener listener) {}

  @MethodArgs({"tittle", "defaultText", "listener"})
  public InputDialog(String tittle, String defaultText, InputDialogListener listener) {}

  @MethodArgs({"tittle", "defaultText", "type", "listener"})
  public InputDialog(String tittle, String defaultText, Type type, InputDialogListener listener) {}

  @MethodArgs({"tittle", "cancelButton", "doneButton", "listener"})
  public InputDialog(String tittle, String cancelButton, String doneButton, InputDialogListener listener) {}

  @MethodArgs({"tittle", "defaultText", "cancelButton", "doneButton", "listener"})
  public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, InputDialogListener listener) {}

  @MethodArgs({"tittle", "defaultText", "cancelButton", "doneButton", "type", "listener"})
  public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, Type type, InputDialogListener listener) {}
}
