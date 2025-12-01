package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface MulEqualOperator {
    @JRDoc_EN("Multiplies the current value by the given object and assigns the result.")
    @JRDoc_PT("Multiplica o valor atual pelo objeto fornecido e atribui o resultado.")
    @MethodArgs({"otherObject"})
    void mulEqual(Object otherObject);
}
