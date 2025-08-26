package JAVARuntime;

@ClassCategory(cat = {"EngineOverride"})
public interface GreaterThanComparator {
  @JRDoc_EN("Checks if the current object is greater than the given object.")
  @JRDoc_PT("Verifica se o objeto atual é maior que o objeto fornecido.")
  @MethodArgs({"otherObject"})
  boolean greaterThan(Object otherObject);

  @JRDoc_EN("Checks if the current object is greater than the given float value.")
  @JRDoc_PT("Verifica se o objeto atual é maior que o valor float fornecido.")
  @MethodArgs({"v"})
  boolean greaterThan(float v);

  @JRDoc_EN("Checks if the current object is greater than the given integer value.")
  @JRDoc_PT("Verifica se o objeto atual é maior que o valor inteiro fornecido.")
  @MethodArgs({"v"})
  boolean greaterThan(int v);

  @JRDoc_EN("Checks if the current object is greater than the given long value.")
  @JRDoc_PT("Verifica se o objeto atual é maior que o valor long fornecido.")
  @MethodArgs({"v"})
  boolean greaterThan(long v);

  @JRDoc_EN("Checks if the current object is greater than the given double value.")
  @JRDoc_PT("Verifica se o objeto atual é maior que o valor double fornecido.")
  @MethodArgs({"v"})
  boolean greaterThan(double v);

  @JRDoc_EN("Checks if the current object is greater than or equal to the given object.")
  @JRDoc_PT("Verifica se o objeto atual é maior ou igual ao objeto fornecido.")
  @MethodArgs({"otherObject"})
  boolean greaterOrEqualsThan(Object otherObject);

  @JRDoc_EN("Checks if the current object is greater than or equal to the given float value.")
  @JRDoc_PT("Verifica se o objeto atual é maior ou igual ao valor float fornecido.")
  @MethodArgs({"v"})
  boolean greaterOrEqualsThan(float v);

  @JRDoc_EN("Checks if the current object is greater than or equal to the given integer value.")
  @JRDoc_PT("Verifica se o objeto atual é maior ou igual ao valor inteiro fornecido.")
  @MethodArgs({"v"})
  boolean greaterOrEqualsThan(int v);

  @JRDoc_EN("Checks if the current object is greater than or equal to the given long value.")
  @JRDoc_PT("Verifica se o objeto atual é maior ou igual ao valor long fornecido.")
  @MethodArgs({"v"})
  boolean greaterOrEqualsThan(long v);

  @JRDoc_EN("Checks if the current object is greater than or equal to the given double value.")
  @JRDoc_PT("Verifica se o objeto atual é maior ou igual ao valor double fornecido.")
  @MethodArgs({"v"})
  boolean greaterOrEqualsThan(double v);
}
