package JAVARuntime;

@ClassCategory(cat = {"Shaders"})
public class MSRenderData {

  private MSRenderData() {}

  public int vertexCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public RenderableVertex renderableVertexAt(int idx) {

    return null;
  }

  public int lightCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public Light lightAt(int idx) {

    return null;
  }

  public boolean isRenderingShadowDepth() {

    return false;
  }
}
