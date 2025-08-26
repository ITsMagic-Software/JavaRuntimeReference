package JAVARuntime;

@ClassCategory(cat = {"EngineOverride"})
public interface SubEqualOperator {
  @JRDoc_EN("Subtracts the given object from the current value and assigns the result.")
  @JRDoc_PT("Subtrai o objeto fornecido do valor atual e atribui o resultado.")
  @MethodArgs({"otherObject"})
  void subEqual(Object otherObject);
}
