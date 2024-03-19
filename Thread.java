package JAVARuntime;

//

/**
 * ITsMagic Thread-safetying
 */
@ClassCategory(cat ={"Thread"})
public class Thread {
    //

    /**
     * Syncs with the engine thread and execute interface
     */
    @MethodArgs(args ={"runnable"})
    public static void runOnEngine(Runnable runnable){
        //
    }

    //

    public enum State {
        NEW,
        RUNNABLE,
        BLOCKED,
        WAITING,
        TIMED_WAITING,
        TERMINATED;
    }

    public interface UncaughtExceptionHandler {
        void uncaughtException(java.lang.Thread t, Throwable e);
    }
    
    public Thread() {
        //
    }
    @MethodArgs(args ={"target"})
    public Thread(Runnable target) {
        //

        //

        //
    }
    @MethodArgs(args ={"group","target"})
    public Thread(ThreadGroup group, Runnable target) {
        //

        //

        //
    }
    @MethodArgs(args ={"name"})
    public Thread(String name) {
        //

        //

        //
    }
    @MethodArgs(args ={"group","name"})
    public Thread(ThreadGroup group, String name) {
        //

        //

        //
    }
    @MethodArgs(args ={"target","name"})
    public Thread(Runnable target, String name) {
        //

        //

        //
    }
    @MethodArgs(args ={"group","target","name"})
    public Thread(ThreadGroup group, Runnable target, String name) {
        //

        //

        //
    }
    @MethodArgs(args ={"group","target","name","stackSize"})
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {
        //

        //

        //
    }

    public void start() {
        //
    }

    public void run() {
        //
    }

    public void interrupt() {
        //
    }

    public boolean isInterrupted() {
        //
        return false;
        //

        //
    }

    @Override
    public String toString() {
        //
        return null;
        //

        //
    }

    public ClassLoader getContextClassLoader() {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public void setContextClassLoader(ClassLoader cl) {
        //
    }

    public StackTraceElement[] getStackTrace() {
        //
        return null;
        //

        //
    }

    public long getId() {
        //
        return 0;
        //

        //
    }

    public State getState() {
        //
        return null;
        //

        //
    }

    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        //
    }

    public boolean isAlive() {
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"newPriority"})
    public void setPriority(int newPriority) {
        //
    }

    public int getPriority() {
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"name"})
    public void setName(String name) {
        //
    }

    public String getName() {
        //
        return null;
        //

        //
    }

    public ThreadGroup getThreadGroup() {
        //
        return null;
        //

        //
    }

    public static void sleep(long milis){
        //
    }
    public static void sleep(long milis, int nanos){
        //
    }
}
