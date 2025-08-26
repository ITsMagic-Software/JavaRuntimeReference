package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterGaussianBlur extends CameraFilter {

  public FilterGaussianBlur() {

    super(null);
  }

  @JRDoc_EN("Returns the intensity of the blur effect.")
  @JRDoc_PT("Retorna a intensidade do efeito de desfoque.")
  @HideGetSet
  public float getIntensity() {

    return 0;
  }

  @JRDoc_EN("Sets the intensity of the blur effect.")
  @JRDoc_PT("Define a intensidade do efeito de desfoque.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setIntensity(float value) {}

  @JRDoc_EN("Returns the size of the blur effect.")
  @JRDoc_PT("Retorna o tamanho do efeito de desfoque.")
  @HideGetSet
  public float getSize() {

    return 0;
  }

  @JRDoc_EN("Sets the size of the blur effect.")
  @JRDoc_PT("Define o tamanho do efeito de desfoque.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setSize(float value) {}
}
