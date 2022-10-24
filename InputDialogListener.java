package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public interface InputDialogListener {
    @MethodArgs(args ={"text"})
    void onFinish(String text);
    void onCancel();
}
