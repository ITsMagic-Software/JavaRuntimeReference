package JAVARuntime;

public interface ContextListener{
    @MethodArgs(args={"pfile"})
    void openFile(PFile pFile);
}
