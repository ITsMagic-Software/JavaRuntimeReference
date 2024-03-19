package JAVARuntime;

@ClassCategory(cat ={"Java"})
public class JClass {
    public transient Class classAddress;
    public transient String name;
    public transient boolean isEngineNative;

    @MethodArgs(args ={"classAddress","name","isEngineNative"})
    public JClass(Class classAddress, String name, boolean isEngineNative) {
        this.classAddress = classAddress;
        this.name = name;
        this.isEngineNative = isEngineNative;
    }

    public Class getClassAddress() {
        return classAddress;
    }
    public String getName() {
        return name;
    }
    public boolean isEngineNative() {
        return isEngineNative;
    }
}
