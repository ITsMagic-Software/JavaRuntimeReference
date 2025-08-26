package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Inspector"})
public final class IntSlider {

  public transient int value;
  public transient int min;
  public transient int max;

  @MethodArgs({"value", "min", "max"})
  public IntSlider(int value, int min, int max) {
    this.value = value;
    this.min = min;
    this.max = max;
  }

  @JRDoc_EN("Returns the current value of the slider.")
  @JRDoc_PT("Retorna o valor atual do controle deslizante.")
  @HideGetSet
  public int getValue() {
    return value;
  }

  @JRDoc_EN("Sets the value of the slider.")
  @JRDoc_PT("Define o valor do controle deslizante.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setValue(int value) {
    this.value = value;
  }

  @JRDoc_EN("Returns the minimum allowed value of the slider.")
  @JRDoc_PT("Retorna o valor mínimo permitido do controle deslizante.")
  @HideGetSet
  public int getMin() {
    return min;
  }

  @JRDoc_EN("Sets the minimum allowed value of the slider.")
  @JRDoc_PT("Define o valor mínimo permitido do controle deslizante.")
  @HideGetSet
  @MethodArgs({"min"})
  public void setMin(int min) {
    this.min = min;
  }

  @JRDoc_EN("Returns the maximum allowed value of the slider.")
  @JRDoc_PT("Retorna o valor máximo permitido do controle deslizante.")
  @HideGetSet
  public int getMax() {
    return max;
  }

  @JRDoc_EN("Sets the maximum allowed value of the slider.")
  @JRDoc_PT("Define o valor máximo permitido do controle deslizante.")
  @HideGetSet
  @MethodArgs({"max"})
  public void setMax(int max) {
    this.max = max;
  }

  /*public int getStep() {
      return step;
  }
  public void setStep(int step) {
      this.step = step;
  }*/

  @JRDoc_EN("Returns a string representation of the IntSlider.")
  @JRDoc_PT("Retorna uma representação em string do IntSlider.")
  public String toString() {
    return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
  }

  @JRDoc_EN("Serializes the IntSlider into a string in the format '[value;min;max;step]'.")
  @JRDoc_PT("Serializa o InttSlider em uma string no formato '[value;min;max;step]'.")
  public String serialize() {
    return value + ";" + min + ";" + max + ";" + 0;
  }

  /// Abstract
  @JRDoc_EN("Deserializes a string to create a IntSlider instance.")
  @JRDoc_PT("Desserializa uma string para criar uma instância de IntSlider.")
  public static IntSlider deserialize(String str) {

    return null;
  }
}
