package JAVARuntime;

public class ExecutionAllow{
    private boolean onGameStopped;
    private boolean onGameRunning;

    @MethodArgs(args ={"onGameStopped", "onGameRunning"})
    public ExecutionAllow(boolean onGameStopped, boolean onGameRunning) {
        this.onGameStopped = onGameStopped;
        this.onGameRunning = onGameRunning;
    }

    public boolean onGameStopped() {
        return onGameStopped;
    }
    @MethodArgs(args ={"onGameStopped"})
    public void setOnGameStopped(boolean onGameStopped) {
        this.onGameStopped = onGameStopped;
    }

    public boolean onGameRunning() {
        return onGameRunning;
    }
    @MethodArgs(args ={"onGameRunning"})
    public void setOnGameRunning(boolean onGameRunning) {
        this.onGameRunning = onGameRunning;
    }
}
