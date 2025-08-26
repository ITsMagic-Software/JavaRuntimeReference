package JAVARuntime;

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat = {"Shaders"})
public class VertexShader {
  public transient String code;

  public VertexShader(String code) {
    this.code = code;
  }

  /// Abstract
  @MethodArgs({"customShader", "shaderName"})
  public static VertexShader loadFile(CustomShader customShader, String shaderName) {

    return null;
  }

  @MethodArgs({"inputStream"})
  public static VertexShader loadInputStream(InputStream inputStream) throws IOException {

    return null;
  }
}
