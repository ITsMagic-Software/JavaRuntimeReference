package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Laser"})
public final class RayDirection {

  public RayDirection() {}

  @MethodArgs({"origin", "direction"})
  public RayDirection(Vector3 origin, Vector3 direction) {}

  @JRDoc_EN("Returns the origin position of this RayDirection.")
  @JRDoc_PT("Retorna a posição de origem deste RayDirection.")
  public Vector3 getOrigin() {

    return null;
  }

  @JRDoc_EN("Sets the origin position of this RayDirection.")
  @JRDoc_PT("Define a posição de origem deste RayDirection.")
  @MethodArgs({"vector"})
  public void setOrigin(Vector3 vector) {}

  @JRDoc_EN("Returns the direction of this RayDirection.")
  @JRDoc_PT("Retorna a direção deste RayDirection.")
  public Vector3 getDirection() {

    return null;
  }

  @JRDoc_EN("Sets the direction of this RayDirection.")
  @JRDoc_PT("Define a direção deste RayDirection.")
  @MethodArgs({"vector"})
  public void setDirection(Vector3 vector) {}
}
