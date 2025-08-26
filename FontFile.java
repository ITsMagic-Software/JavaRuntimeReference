package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Fonts"})
public class FontFile {

  public FontFile() {}

  @JRDoc_EN("Returns the class name.")
  @JRDoc_PT("Retorna o nome da classe.")
  public String toString() {
    return getClass().getName();
  }
}
