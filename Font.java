package JAVARuntime;

@ClassCategory(cat = {"Fonts"})
public class Font {

  private Font() {}

  @JRDoc_EN("Returns the resolution of the font.")
  @JRDoc_PT("Retorna a resolução da fonte.")
  public int getResolution() {

    return 0;
  }

  @JRDoc_EN("Measures the width of a given text string when rendered with this font.")
  @JRDoc_PT("Mede a largura de um texto ao ser renderizado com esta fonte.")
  public float measureWidth(String text) {

    return 0;
  }

  @JRDoc_EN("Measures the width of multiple lines of text when rendered with this font.")
  @JRDoc_PT("Mede a largura de múltiplas linhas de texto ao serem renderizadas com esta fonte.")
  public float measureWidth(String[] lines) {

    return 0;
  }

  @JRDoc_EN("Measures the height of a given text string when rendered with this font.")
  @JRDoc_PT("Mede a altura de um texto ao ser renderizado com esta fonte.")
  public float measureHeight(String text) {

    return 0;
  }

  @JRDoc_EN("Measures the height of multiple lines of text when rendered with this font.")
  @JRDoc_PT("Mede a altura de múltiplas linhas de texto ao serem renderizadas com esta fonte.")
  public float measureHeight(String[] lines) {

    return 0;
  }
}
