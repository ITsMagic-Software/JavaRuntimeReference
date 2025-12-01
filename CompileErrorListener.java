package JAVARuntime;

@ClassCategory(cat ={"Shaders"})
public interface CompileErrorListener {
    @MethodArgs({"message"})
    void onError(String message);
}
