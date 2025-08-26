package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterForest extends CameraFilter {

  public FilterForest() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the filter.")
  @JRDoc_PT("Retorna a intensidade do filtro.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the filter.")
  @JRDoc_PT("Define a intensidade do filtro.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
