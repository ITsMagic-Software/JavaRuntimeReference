package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterVioleta extends CameraFilter {

  public FilterVioleta() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the Violeta filter.")
  @JRDoc_PT("Retorna a intensidade do filtro Violeta.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the Violeta filter.")
  @JRDoc_PT("Define a intensidade do filtro Violeta.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
