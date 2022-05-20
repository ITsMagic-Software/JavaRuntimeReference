package JAVARuntime;

@ClassCategory(cat={"EngineOverride"})
public interface ModOperator {
    @MethodArgs(args={"otherObject"})
    <T> T mod(Object otherObject);
}
