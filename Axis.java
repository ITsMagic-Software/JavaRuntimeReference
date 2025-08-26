package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) MethodArgs filled by Carlos at 22-04-2022 */
@ClassCategory(cat = {"Input"})
public final class Axis {

  @MethodArgs({"name"})
  public Axis(String name) {}

  @JRDoc_EN("Returns the value of the Axis.")
  @JRDoc_PT("Retorna o valor do Axis.")
  @HideGetSet
  public Vector2 getValue() {

    return null;
  }

  @JRDoc_EN("Sets the value of Axis in the specified Vector2.")
  @JRDoc_PT("Define o valor do Axis no Vector2 especificado.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setValue(Vector2 value) {}

  @JRDoc_EN("Returns the name of the Axis.")
  @JRDoc_PT("Retorna o nome do Axis.")
  @HideGetSet
  public String getName() {

    return "";
  }
}
