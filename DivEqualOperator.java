package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface DivEqualOperator {
    @JRDoc_EN("Divides the current value by the given object and assigns the result.")
    @JRDoc_PT("Divide o valor atual pelo objeto fornecido e atribui o resultado.")
    @MethodArgs({"otherObject"})
    void divEqual(Object otherObject);
}
