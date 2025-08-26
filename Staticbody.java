package JAVARuntime;

@ClassCategory(cat = {"Physics"})
public final class Staticbody extends PhysicsEntity {

  public Staticbody() {

    super();
  }

  @JRDoc_EN("Returns the PhysicsLayer of the Staticbody.")
  @JRDoc_PT("Retorna a PhysicsLayer do Staticbody.")
  @HideGetSet
  public JAVARuntime.PhysicsLayer getPhysicsLayer() {

    return null;
  }

  @JRDoc_EN("Sets the PhysicsLayer of the Staticbody to the specified layer.")
  @JRDoc_PT("Define a PhysicsLayer do Staticbody para o layer especificado.")
  @HideGetSet
  @MethodArgs({"layer"})
  public void setPhysicsLayer(PhysicsLayer layer) {}

  @JRDoc_EN("Returns the bounciness of the Staticbody.")
  @JRDoc_PT("Retorna a elasticidade do Staticbody.")
  @HideGetSet
  public float getBounciness() {

    return 0;
  }

  @JRDoc_EN("Sets the bounciness of the Staticbody.")
  @JRDoc_PT("Define a elasticidade do Staticbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setBounciness(float value) {}
}
