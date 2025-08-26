package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"CameraFilters"})
public final class FilterRadialFlare extends CameraFilter {

  public FilterRadialFlare() {

    super(null);
  }

  @JRDoc_EN("Returns the flare brightness of the filter.")
  @JRDoc_PT("Retorna o brilho do flare do filtro.")
  @HideGetSet
  public float getFlareBrightness() {

    return 0;
  }

  @JRDoc_EN("Sets the flare brightness of the filter.")
  @JRDoc_PT("Define o brilho do flare do filtro.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFlareBrightness(float value) {}

  @JRDoc_EN("Returns the image brightness affected by the flare.")
  @JRDoc_PT("Retorna o brilho da imagem afetado pelo flare.")
  @HideGetSet
  public float getImageBrightness() {

    return 0;
  }

  @JRDoc_EN("Sets the image brightness affected by the flare.")
  @JRDoc_PT("Define o brilho da imagem afetado pelo flare.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setImageBrightness(float value) {}

  @JRDoc_EN("Returns the radial length of the flare.")
  @JRDoc_PT("Retorna o comprimento radial do flare.")
  @HideGetSet
  public float getRadialLength() {

    return 0;
  }

  @JRDoc_EN("Sets the radial length of the flare.")
  @JRDoc_PT("Define o comprimento radial do flare.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRadialLength(float value) {}
}
