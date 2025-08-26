package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Debug"})
public class GizmoElement {

  public enum RenderMode {
    Triangles,
    WireFrame,
    Both,
    SimpleWireFrame,
    Outline
  }

  private boolean drawInFront;
  private boolean additiveMode;
  private float maxScaleBasedCameraSize = -1;

  private transient Object userPointer = null;

  public Object getUserPointer() {
    return userPointer;
  }

  @MethodArgs({"userPointer"})
  public void setUserPointer(Object userPointer) {
    this.userPointer = userPointer;
  }

  public Vertex getVertex() {
    return null;
  }

  public Color getColor() {
    return null;
  }

  public Texture getTexture() {
    return null;
  }

  public RenderMode getRenderMode() {
    return RenderMode.Triangles;
  }

  public float[] getMatrix() {
    return null;
  }

  public int getWireFrameWidth() {

    return 0;
  }

  public float getOutlineScale() {
    return 0.1f;
  }

  public boolean isEnableTransparency() {

    return false;
  }

  public void setEnableTransparency(boolean enableTransparency) {}

  public boolean isDrawInFront() {
    return drawInFront;
  }

  public void setDrawInFront(boolean drawInFront) {
    this.drawInFront = drawInFront;
  }

  public boolean isAdditiveMode() {
    return additiveMode;
  }

  public void setAdditiveMode(boolean additiveMode) {
    this.additiveMode = additiveMode;
  }

  public float getMaxScaleBasedCameraSize() {
    return maxScaleBasedCameraSize;
  }

  public void setMaxScaleBasedCameraSize(float maxScaleBasedCameraSize) {
    this.maxScaleBasedCameraSize = maxScaleBasedCameraSize;
  }

  public boolean isScaleBasedCamera() {
    return false;
  }
}
