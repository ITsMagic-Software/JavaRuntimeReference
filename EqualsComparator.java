package JAVARuntime;

@ClassCategory(cat = {"EngineOverride"})
public interface EqualsComparator {
  @JRDoc_EN("Checks if the current object is equal to the given object.")
  @JRDoc_PT("Verifica se o objeto atual é igual ao objeto fornecido.")
  @MethodArgs({"otherObject"})
  boolean equals(Object otherObject);

  @JRDoc_EN("Checks if the current object is the same instance as the given object.")
  @JRDoc_PT("Verifica se o objeto atual é a mesma instância do objeto fornecido.")
  @MethodArgs({"otherObject"})
  boolean pointerEquals(Object otherObject);

  @JRDoc_EN("Checks if the current object is not equal to the given object.")
  @JRDoc_PT("Verifica se o objeto atual não é igual ao objeto fornecido.")
  @MethodArgs({"otherObject"})
  boolean notEquals(Object otherObject);
}
