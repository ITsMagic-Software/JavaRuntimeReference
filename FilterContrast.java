package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterContrast extends CameraFilter {

  public FilterContrast() {

    super(null);
  }

  @JRDoc_EN("Returns the strength of the contrast filter.")
  @JRDoc_PT("Retorna a intensidade do filtro de contraste.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the strength of the contrast filter.")
  @JRDoc_PT("Define a intensidade do filtro de contraste.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
