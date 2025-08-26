package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterPikmin extends CameraFilter {

  public FilterPikmin() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the Pikmin filter.")
  @JRDoc_PT("Retorna a intensidade do filtro Pikmin.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the Pikmin filter.")
  @JRDoc_PT("Define a intensidade do filtro Pikmin.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
