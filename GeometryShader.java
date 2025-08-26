package JAVARuntime;

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat = {"Shaders"})
public class GeometryShader {
  public transient String code;

  public GeometryShader(String code) {
    this.code = code;
  }

  /// Abstract
  @MethodArgs({"customShader", "shaderName"})
  public static GeometryShader loadFile(CustomShader customShader, String shaderName) {

    return null;
  }

  @MethodArgs({"inputStream"})
  public static GeometryShader loadInputStream(InputStream inputStream) throws IOException {

    return null;
  }
}
