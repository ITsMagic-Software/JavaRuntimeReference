package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Particles"})
public class ParticleConeShapeOptions {

  public ParticleConeShapeOptions() {

    super();
  }

  @HideGetSet
  public float getMaxAngle() {

    return 0;
  }

  @HideGetSet
  public float getMinAngle() {

    return 0;
  }

  @HideGetSet
  public float getRadius() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxAngle(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setMinAngle(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setRadius(float value) {}
}
