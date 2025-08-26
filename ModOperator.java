package JAVARuntime;

@ClassCategory(cat = {"EngineOverride"})
public interface ModOperator {
  @JRDoc_EN("Applies the modulus operation with the given object.")
  @JRDoc_PT("Aplica a operação de módulo com o objeto fornecido.")
  @MethodArgs({"otherObject"})
  <T> T mod(Object otherObject);
}
