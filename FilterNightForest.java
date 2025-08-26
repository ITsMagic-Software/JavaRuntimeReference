package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterNightForest extends CameraFilter {

  public FilterNightForest() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the Night Forest filter.")
  @JRDoc_PT("Retorna a intensidade do filtro Night Forest.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the Night Forest filter.")
  @JRDoc_PT("Define a intensidade do filtro Night Forest.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
