package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface EqualsComparator {
    @MethodArgs(args ={"otherObject"})
    boolean equals(Object otherObject);
    @MethodArgs(args ={"otherObject"})
    boolean pointerEquals(Object otherObject);
    @MethodArgs(args ={"otherObject"})
    boolean notEquals(Object otherObject);
}
