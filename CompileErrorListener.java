package JAVARuntime;

@ClassCategory(cat ={"Shaders"})
public interface CompileErrorListener {
    @MethodArgs(args ={"message"})
    void onError(String message);
}
