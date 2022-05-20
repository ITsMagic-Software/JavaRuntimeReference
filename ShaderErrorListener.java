package JAVARuntime;

@ClassCategory(cat={"Shaders"})
public interface ShaderErrorListener {
    @MethodArgs(args={"programError","shaderError"})
    void onError(String programError, String shaderError);
}
