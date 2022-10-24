package JAVARuntime;

@ClassCategory(cat ={"Async"})
public interface AsyncRunnable {
    @MethodArgs(args ={"input"})
    Object onBackground(Object input);
    @MethodArgs(args ={"result"})
    void onEngine(Object result);
}
