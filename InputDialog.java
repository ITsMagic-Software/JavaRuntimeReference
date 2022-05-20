package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Input"})
public class InputDialog {
    public enum Type{
        String, Float, Int
    }

    private boolean calledFromEngine = false;

    @MethodArgs(args={"tittle", "listener"})
    public InputDialog(String tittle, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "type","listener"})
    public InputDialog(String tittle, Type type, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "defaultText","listener"})
    public InputDialog(String tittle, String defaultText, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "defaultText","type","listener"})
    public InputDialog(String tittle, String defaultText, Type type, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "cancelButton","doneButton","listener"})
    public InputDialog(String tittle, String cancelButton, String doneButton, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "defaultText","cancelButton","doneButton","listener"})
    public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, InputDialogListener listener) {
        //
    }
    @MethodArgs(args={"tittle", "defaultText","cancelButton","doneButton","type","listener"})
    public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, Type type, InputDialogListener listener) {
        //
    }

    //

    //
}

