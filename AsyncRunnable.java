package JAVARuntime;

@ClassCategory(cat ={"Async"})
public interface AsyncRunnable {
    @MethodArgs({"input"})
    Object onBackground(Object input);
    @MethodArgs({"result"})
    void onEngine(Object result);
}
