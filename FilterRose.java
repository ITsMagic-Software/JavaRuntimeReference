package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterRose extends CameraFilter {

  public FilterRose() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the Rose filter.")
  @JRDoc_PT("Retorna a intensidade do filtro Rose.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the Rose filter.")
  @JRDoc_PT("Define a intensidade do filtro Rose.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
