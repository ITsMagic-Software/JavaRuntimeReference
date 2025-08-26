package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterAdvancedVignette extends CameraFilter {

  public FilterAdvancedVignette() {

    super(null);
  }

  @JRDoc_EN("Returns the intensity of the vignette effect.")
  @JRDoc_PT("Retorna a intensidade do efeito de vinheta.")
  @HideGetSet
  public float getIntensity() {

    return 0;
  }

  @JRDoc_EN("Sets the intensity of the vignette effect.")
  @JRDoc_PT("Define a intensidade do efeito de vinheta.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setIntensity(float value) {}

  @JRDoc_EN("Returns the start point of the vignette effect.")
  @JRDoc_PT("Retorna o ponto inicial do efeito de vinheta.")
  @HideGetSet
  public float getStart() {

    return 0;
  }

  @JRDoc_EN("Sets the start point of the vignette effect.")
  @JRDoc_PT("Define o ponto inicial do efeito de vinheta.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStart(float value) {}

  @JRDoc_EN("Returns the fade value of the vignette effect.")
  @JRDoc_PT("Retorna o valor de desvanecimento/fade do efeito de vinheta.")
  @HideGetSet
  public float getFade() {

    return 0;
  }

  @JRDoc_EN("Sets the fade value of the vignette effect.")
  @JRDoc_PT("Define o valor de desvanecimento/fade do efeito de vinheta.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFade(float value) {}
}
