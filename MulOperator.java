package JAVARuntime;

@ClassCategory(cat={"EngineOverride"})
public interface MulOperator {
    @MethodArgs(args={"otherObject"})
    <T> T mul(Object otherObject);
}
