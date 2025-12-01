package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface SubOperator {
    @JRDoc_EN("Subtracts the given object from the current value.")
    @JRDoc_PT("Subtrai o objeto fornecido do valor atual.")
    @MethodArgs({"otherObject"})
    <T> T sub(Object otherObject);
}
