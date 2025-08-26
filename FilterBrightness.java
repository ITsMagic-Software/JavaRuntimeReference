package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterBrightness extends CameraFilter {

  public FilterBrightness() {

    super(null);
  }

  @JRDoc_EN("Returns the brightness strength.")
  @JRDoc_PT("Retorna a intensidade do brilho.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the brightness strength.")
  @JRDoc_PT("Define a intensidade do brilho.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
