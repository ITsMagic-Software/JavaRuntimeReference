package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface ModEqualOperator {
    @JRDoc_EN("Applies the modulus and assigns the result to the current value.")
    @JRDoc_PT("Aplica o módulo e atribui o resultado ao valor atual.")
    @MethodArgs({"otherObject"})
    void modEqual(Object otherObject);
}
