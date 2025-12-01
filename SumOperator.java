package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface SumOperator {
    @JRDoc_EN("Adds the given object to the current value.")
    @JRDoc_PT("Adiciona o objeto fornecido ao valor atual.")
    @MethodArgs({"otherObject"})
    <T> T sum(Object otherObject);
}
