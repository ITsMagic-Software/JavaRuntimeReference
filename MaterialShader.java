package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) Extensible Shader from Java classes compiled in realtime (ITsMagic) */
@ClassCategory(cat = {"Shaders"})
public class MaterialShader extends CustomShader {
  public static final float OGL2 = 2;
  public static final float OGL3 = 3;
  public static final float OGL31 = 3.1f;

  /** Zero-Argument constructor required Class instanced by java loader by calling this constructor */
  public MaterialShader() {}

  /** Bridged by worker class in engine runtime */
  public void start() {}

  @MethodArgs({"ogles", "renderData"})
  public void preRender(OGLES ogles) {}

  @MethodArgs({"ogles", "camera", "renderData"})
  public void render(OGLES ogles, Camera camera, MSRenderData renderData) {}

  @MethodArgs({"ogles", "renderData"})
  public void posRender(OGLES ogles) {}
}
