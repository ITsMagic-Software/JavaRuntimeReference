package JAVARuntime;

@ClassCategory(cat={"Java"})
public class JClass {
    public Class classAddress;
    public String name;
    public boolean isEngineNative;

    @MethodArgs(args={"classAddress","name","isEngineNative"})
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
