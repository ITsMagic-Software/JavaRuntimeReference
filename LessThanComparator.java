package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface LessThanComparator {
    @JRDoc_EN("Checks if the current object is less than the given object.")
    @JRDoc_PT("Verifica se o objeto atual é menor que o objeto fornecido.")
    @MethodArgs({"otherObject"})
    boolean lessThan(Object otherObject);

    @JRDoc_EN("Checks if the current object is less than the given float value.")
    @JRDoc_PT("Verifica se o objeto atual é menor que o valor float fornecido.")
    @MethodArgs({"value"})
    boolean lessThan(float v);

    @JRDoc_EN("Checks if the current object is less than the given integer value.")
    @JRDoc_PT("Verifica se o objeto atual é menor que o valor inteiro fornecido.")
    @MethodArgs({"value"})
    boolean lessThan(int v);

    @JRDoc_EN("Checks if the current object is less than the given long value.")
    @JRDoc_PT("Verifica se o objeto atual é menor que o valor long fornecido.")
    @MethodArgs({"value"})
    boolean lessThan(long v);

    @JRDoc_EN("Checks if the current object is less than the given double value.")
    @JRDoc_PT("Verifica se o objeto atual é menor que o valor double fornecido.")
    @MethodArgs({"value"})
    boolean lessThan(double v);

    @JRDoc_EN("Checks if the current object is less than or equal to the given object.")
    @JRDoc_PT("Verifica se o objeto atual é menor ou igual ao objeto fornecido.")
    @MethodArgs({"otherObject"})
    boolean lessOrEqualsThan(Object otherObject);

    @JRDoc_EN("Checks if the current object is less than or equal to the given float value.")
    @JRDoc_PT("Verifica se o objeto atual é menor ou igual ao valor float fornecido.")
    @MethodArgs({"value"})
    boolean lessOrEqualsThan(float v);

    @JRDoc_EN("Checks if the current object is less than or equal to the given integer value.")
    @JRDoc_PT("Verifica se o objeto atual é menor ou igual ao valor inteiro fornecido.")
    @MethodArgs({"value"})
    boolean lessOrEqualsThan(int v);

    @JRDoc_EN("Checks if the current object is less than or equal to the given long value.")
    @JRDoc_PT("Verifica se o objeto atual é menor ou igual ao valor long fornecido.")
    @MethodArgs({"value"})
    boolean lessOrEqualsThan(long v);

    @JRDoc_EN("Checks if the current object is less than or equal to the given double value.")
    @JRDoc_PT("Verifica se o objeto atual é menor ou igual ao valor double fornecido.")
    @MethodArgs({"value"})
    boolean lessOrEqualsThan(double v);
}