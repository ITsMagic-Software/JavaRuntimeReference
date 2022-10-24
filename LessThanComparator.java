package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface LessThanComparator {
    @MethodArgs(args ={"otherObject"})
    boolean lessThan(Object otherObject);
    @MethodArgs(args ={"value"})
    boolean lessThan(float v);
    @MethodArgs(args ={"value"})
    boolean lessThan(int v);
    @MethodArgs(args ={"value"})
    boolean lessThan(long v);
    @MethodArgs(args ={"value"})
    boolean lessThan(double v);
    @MethodArgs(args ={"otherObject"})
    boolean lessOrEqualsThan(Object otherObject);
    @MethodArgs(args ={"value"})
    boolean lessOrEqualsThan(float v);
    @MethodArgs(args ={"value"})
    boolean lessOrEqualsThan(int v);
    @MethodArgs(args ={"value"})
    boolean lessOrEqualsThan(long v);
    @MethodArgs(args ={"value"})
    boolean lessOrEqualsThan(double v);
}
