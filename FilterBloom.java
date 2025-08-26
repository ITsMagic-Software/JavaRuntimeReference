package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterBloom extends CameraFilter {

  public FilterBloom() {

    super(null);
  }

  @JRDoc_EN("Returns the quality of the bloom effect.")
  @JRDoc_PT("Retorna a qualidade do efeito de brilho.")
  @HideGetSet
  public float getQuality() {

    return 0;
  }

  @JRDoc_EN("Sets the quality of the bloom effect.")
  @JRDoc_PT("Define a qualidade do efeito de brilho.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setQuality(float value) {}

  @JRDoc_EN("Returns the intensity of the bloom effect.")
  @JRDoc_PT("Retorna a intensidade do efeito de brilho.")
  @HideGetSet
  public float getIntensity() {

    return 0;
  }

  @JRDoc_EN("Sets the intensity of the bloom effect.")
  @JRDoc_PT("Define a intensidade do efeito de brilho.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setIntensity(float value) {}
}
