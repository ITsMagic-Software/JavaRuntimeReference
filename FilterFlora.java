package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterFlora extends CameraFilter {

  public FilterFlora() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the flora filter.")
  @JRDoc_PT("Retorna a intensidade do filtro Flora.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the flora filter.")
  @JRDoc_PT("Define a intensidade do filtro Flora.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
