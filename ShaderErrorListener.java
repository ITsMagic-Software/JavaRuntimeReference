package JAVARuntime;

@ClassCategory(cat = {"Shaders"})
public interface ShaderErrorListener {
  @MethodArgs({"programError", "shaderError"})
  void onError(String programError, String shaderError);
}
