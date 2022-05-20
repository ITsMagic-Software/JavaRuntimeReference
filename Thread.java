package JAVARuntime;

//

/**
 * ITsMagic Thread-safetying
 */
@ClassCategory(cat={"Thread"})
public class Thread extends java.lang.Thread {
    //

    /**
     * Syncs with the engine thread and execute interface
     */
    @MethodArgs(args={"runnable"})
    public static void runOnEngine(Runnable runnable){
        //
    }
    
    public Thread() {
        //
    }
    @MethodArgs(args={"target"})
    public Thread(Runnable target) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }
    @MethodArgs(args={"group","target"})
    public Thread(ThreadGroup group, Runnable target) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }

    @MethodArgs(args={"name"})
    public Thread(String name) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }

    @MethodArgs(args={"group","name"})
    public Thread(ThreadGroup group, String name) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }
    @MethodArgs(args={"target","name"})
    public Thread(Runnable target, String name) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }
    @MethodArgs(args={"group","target","name"})
    public Thread(ThreadGroup group, Runnable target, String name) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }
    @MethodArgs(args={"group","target","name","stackSize"})
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {
        //
        super((java.lang.Runnable) null);
        //

        //
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public boolean isInterrupted() {
        return super.isInterrupted();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public int countStackFrames() {
        return super.countStackFrames();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public ClassLoader getContextClassLoader() {
        return super.getContextClassLoader();
    }

    @Override
    @MethodArgs(args={"value"})
    public void setContextClassLoader(ClassLoader cl) {
        super.setContextClassLoader(cl);
    }
    
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public long getId() {
        return super.getId();
    }
    
    @Override
    public State getState() {
        return super.getState();
    }

    @Override
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return super.getUncaughtExceptionHandler();
    }

    @Override
    @MethodArgs(args={"value"})
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        super.setUncaughtExceptionHandler(eh);
    }
}
