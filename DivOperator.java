package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface DivOperator {
    @JRDoc_EN("Divides the current value by the given object.")
    @JRDoc_PT("Divide o valor atual pelo objeto fornecido.")
    @MethodArgs({"otherObject"})
    <T> T div(Object otherObject);
}
