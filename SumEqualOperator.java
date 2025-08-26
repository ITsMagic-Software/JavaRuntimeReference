package JAVARuntime;

@ClassCategory(cat = {"EngineOverride"})
public interface SumEqualOperator {
  @JRDoc_EN("Adds the given object to the current value and assigns the result.")
  @JRDoc_PT("Adiciona o objeto fornecido ao valor atual e atribui o resultado.")
  @MethodArgs({"otherObject"})
  void sumEqual(Object otherObject);
}
