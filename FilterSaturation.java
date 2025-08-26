package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterSaturation extends CameraFilter {

  public FilterSaturation() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the Saturation filter.")
  @JRDoc_PT("Retorna a intensidade do filtro de Saturação.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the Saturation filter.")
  @JRDoc_PT("Define a intensidade do filtro de Saturação.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
