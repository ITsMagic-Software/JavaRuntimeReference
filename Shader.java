package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Material"})
public class Shader {

  private Shader() {}

  public static class Builder {

    public Builder() {}

    @MethodArgs({"vertexCode", "fragmentCode"})
    public Builder(String vertexCode, String fragmentCode) {}

    public String getVertexCode() {

      return null;
    }

    @MethodArgs({"vertexCode", "vertexCode"})
    public Builder setVertexCode(String vertexCode) {

      return this;
    }

    @MethodArgs({"file"})
    public Builder setVertexCode(VertexGLSLFile pFile) {

      return this;
    }

    @MethodArgs({"vertexShader"})
    public Builder setVertexCode(VertexShader vertexShader) {

      return this;
    }

    public String getGeometryCode() {

      return null;
    }

    @MethodArgs({"geometryCode"})
    public Builder setGeometryCode(String geometryCode) {

      return this;
    }

    @MethodArgs({"file"})
    public Builder setGeometryCode(GeometryGLSLFile pFile) {

      return this;
    }

    @MethodArgs({"fragmentShader"})
    public Builder setGeometryCode(GeometryShader geometryShader) {

      return this;
    }

    public String getFragmentCode() {

      return null;
    }

    @MethodArgs({"fragmentCode"})
    public Builder setFragmentCode(String fragmentCode) {

      return this;
    }

    @MethodArgs({"file"})
    public Builder setFragmentCode(FragmentGLSLFile pFile) {

      return this;
    }

    @MethodArgs({"fragmentShader"})
    public Builder setFragmentCode(FragmentShader fragmentShader) {

      return this;
    }

    public Builder createProgram() {

      return this;
    }

    public boolean isGeometryShaderActive() {

      return false;
    }

    public Builder activateGeometryShader(boolean value) {

      return this;
    }

    public Builder compileVertex() {

      return this;
    }

    @MethodArgs({"compileErrorListener"})
    public Builder tryCompileVertex(CompileErrorListener compileErrorListener) {

      return this;
    }

    public Builder compileGeometry() {

      return this;
    }

    @MethodArgs({"compileErrorListener"})
    public Builder tryCompileGeometry(CompileErrorListener compileErrorListener) {

      return this;
    }

    public Builder compileFragment() {

      return this;
    }

    @MethodArgs({"compileErrorListener"})
    public Builder tryCompileFragment(CompileErrorListener compileErrorListener) {

      return this;
    }

    public Shader create() {

      return null;
    }

    @MethodArgs({"shaderErrorListener"})
    public Shader tryCreate(ShaderErrorListener shaderErrorListener) {

      return null;
    }
  }
}
