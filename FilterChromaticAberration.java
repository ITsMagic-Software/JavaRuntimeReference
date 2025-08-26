package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterChromaticAberration extends CameraFilter {

  public FilterChromaticAberration() {

    super(null);
  }

  @JRDoc_EN("Returns the intensity of the chromatic aberration effect.")
  @JRDoc_PT("Retorna a intensidade do efeito de aberração cromática.")
  @HideGetSet
  public float getIntensity() {

    return 0;
  }

  @JRDoc_EN("Sets the intensity of the chromatic aberration effect.")
  @JRDoc_PT("Define a intensidade do efeito de aberração cromática.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setIntensity(float value) {}
}
