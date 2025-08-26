package JAVARuntime;

/** ITsMagic Thread-safetying */
@ClassCategory(cat = {"Thread"})
public class Thread {

  /** Syncs with the engine thread and execute interface */
  @MethodArgs({"runnable"})
  public static void runOnEngine(Runnable runnable) {}

  /** Syncs with the engine thread and execute interface */
  @MethodArgs({"delaySeconds", "runnable"})
  public static void runOnEngine(float delaySeconds, Runnable runnable) {}

  @MethodArgs({"runnable"})
  public static void runOnUIThread(Runnable runnable) {}

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

  public Thread() {}

  @MethodArgs({"target"})
  public Thread(Runnable target) {}

  @MethodArgs({"group", "target"})
  public Thread(ThreadGroup group, Runnable target) {}

  @MethodArgs({"name"})
  public Thread(String name) {}

  @MethodArgs({"group", "name"})
  public Thread(ThreadGroup group, String name) {}

  @MethodArgs({"target", "name"})
  public Thread(Runnable target, String name) {}

  @MethodArgs({"group", "target", "name"})
  public Thread(ThreadGroup group, Runnable target, String name) {}

  @MethodArgs({"group", "target", "name", "stackSize"})
  public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {}

  public void start() {}

  public void run() {}

  public void interrupt() {}

  public boolean isInterrupted() {

    return false;
  }

  public String toString() {

    return null;
  }

  public ClassLoader getContextClassLoader() {

    return null;
  }

  @MethodArgs({"value"})
  public void setContextClassLoader(ClassLoader cl) {}

  public StackTraceElement[] getStackTrace() {

    return null;
  }

  public long getId() {

    return 0;
  }

  public State getState() {

    return null;
  }

  public UncaughtExceptionHandler getUncaughtExceptionHandler() {

    return null;
  }

  @MethodArgs({"value"})
  public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {}

  public void join() throws InterruptedException {}

  public void join(long millis) throws InterruptedException {}

  public void join(long millis, int nanos) throws InterruptedException {}

  public boolean isAlive() {

    return false;
  }

  @MethodArgs({"newPriority"})
  public void setPriority(int newPriority) {}

  public int getPriority() {

    return 0;
  }

  @MethodArgs({"name"})
  public void setName(String name) {}

  public String getName() {

    return null;
  }

  public ThreadGroup getThreadGroup() {

    return null;
  }

  public static void sleep(long milis) {}

  public static void sleep(long milis, int nanos) {}

  public static void dumpStack() {}
}
