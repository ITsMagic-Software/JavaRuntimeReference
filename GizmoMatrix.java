package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Debug"})
public class GizmoMatrix extends GizmoElement {

  private transient float[] matrix;

  public GizmoMatrix() {}

  @HideGetSet
  public float[] getMatrix() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"matrix"})
  public void setMatrix(float[] matrix) {
    this.matrix = matrix;
  }
}
