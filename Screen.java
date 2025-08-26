package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Platform"})
public final class Screen {

  private Screen() {}

  /// Abstracts
  @JRDoc_EN("Returns the screen width in pixels.")
  @JRDoc_PT("Retorna a largura da tela em pixels.")
  public static int getWidth() {

    return 0;
  }

  @JRDoc_EN("Returns the screen height in pixels.")
  @JRDoc_PT("Retorna a altura da tela em pixels.")
  public static int getHeight() {

    return 0;
  }

  @JRDoc_EN("Returns the screen width in pixels.")
  @JRDoc_PT("Retorna a largura da tela em pixels.")
  public static int width() {

    return 0;
  }

  @JRDoc_EN("Returns the screen height in pixels.")
  @JRDoc_PT("Retorna a altura da tela em pixels.")
  public static int height() {

    return 0;
  }

  @JRDoc_EN("Returns the aspect ratio of the screen (width divided by height).")
  @JRDoc_PT("Retorna o aspecto da tela (largura dividida pela altura).")
  public static float ratio() {

    return 0;
  }
}
