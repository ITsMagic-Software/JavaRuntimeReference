package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterCBS extends CameraFilter {

  public FilterCBS() {

    super(null);
  }

  @JRDoc_EN("Returns the saturation level.")
  @JRDoc_PT("Retorna o nível de saturação.")
  @HideGetSet
  public float getSaturation() {

    return 0;
  }

  @JRDoc_EN("Sets the saturation level.")
  @JRDoc_PT("Define o nível de saturação.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setSaturation(float value) {}

  @JRDoc_EN("Returns the brightness level.")
  @JRDoc_PT("Retorna o nível de brilho.")
  @HideGetSet
  public float getBrightness() {

    return 0;
  }

  @JRDoc_EN("Sets the brightness level.")
  @JRDoc_PT("Define o nível de brilho.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setBrightness(float value) {}

  @JRDoc_EN("Returns the contrast level.")
  @JRDoc_PT("Retorna o nível de contraste.")
  @HideGetSet
  public float getContrast() {

    return 0;
  }

  @JRDoc_EN("Sets the contrast level.")
  @JRDoc_PT("Define o nível de contraste.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setContrast(float value) {}
}
