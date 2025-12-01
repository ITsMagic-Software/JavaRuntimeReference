package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface MulOperator {
    @JRDoc_EN("Multiplies the current value by the given object.")
    @JRDoc_PT("Multiplica o valor atual pelo objeto fornecido.")
    @MethodArgs({"otherObject"})
    <T> T mul(Object otherObject);
}
