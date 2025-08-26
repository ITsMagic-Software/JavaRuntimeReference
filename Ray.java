package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Laser"})
public final class Ray {

  public Ray() {}

  @MethodArgs({"rayDirection", "distance"})
  public Ray(JAVARuntime.RayDirection rayDirection, float distance) {}

  @MethodArgs({"position", "direction", "distance"})
  public Ray(Vector3 position, Vector3 direction, float distance) {}

  @JRDoc_EN("Returns the RayDirection of this Ray.")
  @JRDoc_PT("Retorna a RayDirection deste Ray.")
  public JAVARuntime.RayDirection getRayDirection() {

    return null;
  }

  @JRDoc_EN("Sets the RayDirection of this Ray.")
  @JRDoc_PT("Define a RayDirection deste Ray.")
  @MethodArgs({"rayDirection"})
  public void setRayDirection(JAVARuntime.RayDirection rayDirection) {}

  @JRDoc_EN("Returns the PhysicsLayer of this Ray.")
  @JRDoc_PT("Retorna o PhysicsLayer deste Ray.")
  @HideGetSet
  public JAVARuntime.PhysicsLayer getPhysicsLayer() {

    return null;
  }

  @JRDoc_EN("Sets the PhysicsLayer of this Ray.")
  @JRDoc_PT("Define o PhysicsLayer deste Ray.")
  @HideGetSet
  @MethodArgs({"layer"})
  public void setPhysicsLayer(PhysicsLayer layer) {}

  @JRDoc_EN("Returns the distance of this Ray.")
  @JRDoc_PT("Retorna a distância deste Ray.")
  public float getDistance() {

    return 0;
  }

  @JRDoc_EN("Sets the distance of this Ray.")
  @JRDoc_PT("Define a distância deste Ray.")
  @MethodArgs({"distance"})
  public void setDistance(float distance) {}
}
