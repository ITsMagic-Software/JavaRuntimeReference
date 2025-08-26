package JAVARuntime;

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat = {"Shaders"})
public class FragmentShader {
  public transient String code;

  public FragmentShader(String code) {
    this.code = code;
  }

  /// Abstract
  @MethodArgs({"customShader", "shaderName"})
  public static FragmentShader loadFile(CustomShader customShader, String shaderName) {

    return null;
  }

  @MethodArgs({"inputStream"})
  public static FragmentShader loadInputStream(InputStream inputStream) throws IOException {

    return null;
  }
}
