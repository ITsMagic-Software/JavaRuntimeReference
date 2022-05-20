package JAVARuntime;

@ClassCategory(cat={"EngineOverride"})
public interface SubOperator {
    @MethodArgs(args={"otherObject"})
    <T> T sub(Object otherObject);
}
