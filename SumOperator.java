package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface SumOperator {
    @MethodArgs(args ={"otherObject"})
    <T> T sum(Object otherObject);
}
