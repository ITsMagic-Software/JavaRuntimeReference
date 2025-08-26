package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Debug"})
public final class GizmoObjectMatrix extends GizmoMatrix {

  private transient Vertex vertex;

  private transient Color color = new Color();
  private transient Texture texture;
  private transient boolean dualFaceRender = false;
  private transient RenderMode renderMode = RenderMode.Triangles;
  private transient Object userPointer = null;
  private transient boolean enableTransparency = false;
  private transient float outlineScale = 0.1f;

  private int wireFrameWidth = 0;

  public GizmoObjectMatrix() {}

  @MethodArgs({"vertex"})
  public GizmoObjectMatrix(Vertex vertex) {
    setVertex(vertex);
  }

  @HideGetSet
  public Vertex getVertex() {
    return vertex;
  }

  @HideGetSet
  @MethodArgs({"vertex"})
  public void setVertex(Vertex vertex) {}

  @HideGetSet
  public int getWireFrameWidth() {
    return wireFrameWidth;
  }

  @HideGetSet
  @MethodArgs({"wireFrameWidth"})
  public void setWireFrameWidth(int wireFrameWidth) {
    this.wireFrameWidth = wireFrameWidth;
  }

  @HideGetSet
  public float getOutlineScale() {
    return outlineScale;
  }

  @HideGetSet
  @MethodArgs({"outlineScale"})
  public void setOutlineScale(float outlineScale) {
    this.outlineScale = outlineScale;
  }

  @Deprecated
  @HideGetSet
  public boolean isWireFrame() {
    return this.renderMode == RenderMode.WireFrame;
  }

  @Deprecated
  @HideGetSet
  @MethodArgs({"wireFrame"})
  public void setWireFrame(boolean wireFrame) {
    if (wireFrame) {
      this.renderMode = RenderMode.WireFrame;
    } else {
      this.renderMode = RenderMode.Triangles;
    }
  }

  @HideGetSet
  public Color getColor() {
    return color;
  }

  @HideGetSet
  @MethodArgs({"color"})
  public void setColor(Color color) {
    this.color = color;
  }

  @HideGetSet
  public Texture getTexture() {
    return texture;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setTexture(Texture texture) {
    this.texture = texture;
  }

  @HideGetSet
  public boolean isDualFaceRender() {
    return dualFaceRender;
  }

  @HideGetSet
  @MethodArgs({"dualFaceRender"})
  public void setDualFaceRender(boolean dualFaceRender) {
    this.dualFaceRender = dualFaceRender;
  }

  @HideGetSet
  public RenderMode getRenderMode() {
    return renderMode;
  }

  @HideGetSet
  @MethodArgs({"renderMode"})
  public void setRenderMode(RenderMode renderMode) {
    this.renderMode = renderMode;
  }

  public Object getUserPointer() {
    return userPointer;
  }

  @MethodArgs({"userPointer"})
  public void setUserPointer(Object userPointer) {
    this.userPointer = userPointer;
  }

  /*public boolean isEnableTransparency() {
      return enableTransparency;
  }
  public void setEnableTransparency(boolean enableTransparency) {
      this.enableTransparency = enableTransparency;
  }*/
}
