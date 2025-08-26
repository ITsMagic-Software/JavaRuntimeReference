package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterVignette extends CameraFilter {

  public FilterVignette() {

    super(null);
  }

  @JRDoc_EN("Returns the intensity of the vignette effect.")
  @JRDoc_PT("Retorna a intensidade do efeito de vinheta.")
  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @JRDoc_EN("Sets the intensity of the vignette effect.")
  @JRDoc_PT("Define a intensidade do efeito de vinheta.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
