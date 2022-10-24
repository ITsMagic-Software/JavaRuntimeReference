package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public interface ConnectionListener {
    void onConnected();
    void onDisconnected();
    @MethodArgs(args ={"error","code"})
    void onError(String error, int code);
}
