package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Lists"})
public interface ListStreamListener {
    @MethodArgs(args={"object","idx","userData"})
    void execute(Object object, int idx, Object userData);
    @MethodArgs(args={"exception","error","idx","userData"})
    void onError(Exception ex, Error er, int idx, Object userData);
    @MethodArgs(args={"userData"})
    void onFinish(Object userData);
}
