package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Inspector"})
public final class FloatSlider {

  public transient float value;
  public transient float min;
  public transient float max;
  // public float step = 0f;

  @MethodArgs({"value", "min", "max"})
  public FloatSlider(float value, float min, float max) {
    this.value = value;
    this.min = min;
    this.max = max;
  }
  /*public FloatSlider(float value, float min, float max, float step) {
      this.value = value;
      this.min = min;
      this.max = max;
      this.step = step;
  }*/

  @JRDoc_EN("Returns the current value of the slider.")
  @JRDoc_PT("Retorna o valor atual do controle deslizante.")
  @HideGetSet
  public float getValue() {
    return value;
  }

  @JRDoc_EN("Sets the value of the slider.")
  @JRDoc_PT("Define o valor do controle deslizante.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setValue(float value) {
    this.value = value;
  }

  @JRDoc_EN("Returns the minimum allowed value of the slider.")
  @JRDoc_PT("Retorna o valor mínimo permitido do controle deslizante.")
  @HideGetSet
  public float getMin() {
    return min;
  }

  @JRDoc_EN("Sets the minimum allowed value of the slider.")
  @JRDoc_PT("Define o valor mínimo permitido do controle deslizante.")
  @HideGetSet
  @MethodArgs({"min"})
  public void setMin(float min) {
    this.min = min;
  }

  @JRDoc_EN("Returns the maximum allowed value of the slider.")
  @JRDoc_PT("Retorna o valor máximo permitido do controle deslizante.")
  @HideGetSet
  public float getMax() {
    return max;
  }

  @JRDoc_EN("Sets the maximum allowed value of the slider.")
  @JRDoc_PT("Define o valor máximo permitido do controle deslizante.")
  @HideGetSet
  @MethodArgs({"max"})
  public void setMax(float max) {
    this.max = max;
  }

  public FloatSlider copy() {
    return new FloatSlider(value, min, max);
  }

  /**
   * Step is crashing if the step is a number like 0.04864f Fix soon
   *
   * @return
   */
  /*public float getStep() {
      return step;
  }
  @MethodArgs(args={"step"})
  public void setStep(float step) {
      this.step = step;
  }*/

  @JRDoc_EN("Returns a string representation of the FloatSlider.")
  @JRDoc_PT("Retorna uma representação em string do FloatSlider.")
  public String toString() {
    return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
  }

  @JRDoc_EN("Serializes the FloatSlider into a string in the format '[value;min;max;step]'.")
  @JRDoc_PT("Serializa o FloatSlider em uma string no formato '[value;min;max;step]'.")
  public String serialize() {
    return value + ";" + min + ";" + max + ";" + 0;
  }

  /// Abstract
  @JRDoc_EN("Deserializes a string to create a FloatSlider instance.")
  @JRDoc_PT("Desserializa uma string para criar uma instância de FloatSlider.")
  @MethodArgs({"str"})
  public static FloatSlider deserialize(String str) {

    return null;
  }
}
