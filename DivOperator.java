package JAVARuntime;

@ClassCategory(cat={"EngineOverride"})
public interface DivOperator {
    @MethodArgs(args={"otherObject"})
    <T> T div(Object otherObject);
}
