package JAVARuntime;

@ClassCategory(cat ={"EngineOverride"})
public interface GreaterThanComparator {
    @MethodArgs(args ={"otherObject"})
    boolean greaterThan(Object otherObject);
    @MethodArgs(args ={"v"})
    boolean greaterThan(float v);
    @MethodArgs(args ={"v"})
    boolean greaterThan(int v);
    @MethodArgs(args ={"v"})
    boolean greaterThan(long v);
    @MethodArgs(args ={"v"})
    boolean greaterThan(double v);
    @MethodArgs(args ={"otherObject"})
    boolean greaterOrEqualsThan(Object otherObject);
    @MethodArgs(args ={"v"})
    boolean greaterOrEqualsThan(float v);
    @MethodArgs(args ={"v"})
    boolean greaterOrEqualsThan(int v);
    @MethodArgs(args ={"v"})
    boolean greaterOrEqualsThan(long v);
    @MethodArgs(args ={"v"})
    boolean greaterOrEqualsThan(double v);
}
