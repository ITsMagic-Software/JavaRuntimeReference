package JAVARuntime;

//<REMOVE-BRIDGE>
import androidx.annotation.NonNull;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Utils.ListUtils.ListTryGet;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;
//>REMOVE-BRIDGE<

/**
 * ITsMagic Thread-safetying
 */
@ClassCategory(cat ={"Thread"})
public class Thread {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private static final List<Thread> runtimeThreads = new ArrayList<>();

    @IgnoreAutoComplete
    private static void addThread(Thread thread){
        synchronized (runtimeThreads){
            runtimeThreads.add(thread);
        }
    }

    @IgnoreAutoComplete
    public static void interruptAll(){
        synchronized (runtimeThreads) {
            while (!runtimeThreads.isEmpty()) {
                for (int i = 0; i < runtimeThreads.size(); i++) {
                    Thread thread = runtimeThreads.get(i);
                    try {
                        if (!thread.isInterrupted() && thread.isAlive()) {
                            thread.interrupt();
                        }
                    } catch (Exception | Error e) {
                        e.printStackTrace();
                    }
                }
                runtimeThreads.clear();
            }
        }
    }

    @IgnoreAutoComplete
    private static void runOnEngine(Runnable runnable, int tries){
        Engine.runOnEngine(runnable);
    }

    @IgnoreAutoComplete
    public static void requestEngineThread(){
        if(!isEngineThread()){
            throw new IllegalThreadStateException("Can't execute game operations from a different thread, use Thread.runOnEngine(Runnable) to sync with the game before applying operations!");
        }
    }
    @IgnoreAutoComplete
    public static void requestOpenglEngineThread(){
        if(!isOpenglEngineThread()){
            throw new IllegalThreadStateException("Can't execute opengl operations from a different thread, use Thread.runOnEngine(Runnable) to sync with the game before applying operations!");
        }
    }

    @IgnoreAutoComplete
    public static boolean isEngineThread(){
        return Engine.isJavaRuntimeEngineThread();
    }
    @IgnoreAutoComplete
    public static boolean isOpenglEngineThread(){
        return Engine.isOpenglEngineThread();
    }
    //>REMOVE-BRIDGE<

    /**
     * Syncs with the engine thread and execute interface
     */
    @MethodArgs(args ={"runnable"})
    public static void runOnEngine(Runnable runnable){
        //<REMOVE-BRIDGE>
        runOnEngine(new Runnable() {
            @Override
            public void run() {
                JavaJar.execute(new Interface() {
                    @Override
                    public void run() {
                        runnable.run();
                    }
                });
            }
        }, 0);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    private transient final java.lang.Thread thread;
    private transient Runnable target;
    private transient UncaughtExceptionHandler uncaughtExceptionHandler;
    //>REMOVE-BRIDGE<

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
        //<REMOVE-BRIDGE>
        thread = new java.lang.Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"target"})
    public Thread(Runnable target) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.target = target;
        thread = new java.lang.Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"group","target"})
    public Thread(ThreadGroup group, Runnable target) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.target = target;
        thread = new java.lang.Thread(group, new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public Thread(String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        thread = new java.lang.Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        thread.setName(name);
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"group","name"})
    public Thread(ThreadGroup group, String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        thread = new java.lang.Thread(group, new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        thread.setName(name);
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"target","name"})
    public Thread(Runnable target, String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.target = target;
        thread = new java.lang.Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        thread.setName(name);
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"group","target","name"})
    public Thread(ThreadGroup group, Runnable target, String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.target = target;
        thread = new java.lang.Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        });
        thread.setName(name);
        addThread(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"group","target","name","stackSize"})
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.target = target;
        thread = new java.lang.Thread(group, new java.lang.Runnable() {
            @Override
            public void run() {
                JavaJar.execute(Thread.this::run);
            }
        }, name, stackSize);
        addThread(this);
        //>REMOVE-BRIDGE<
    }

    public void start() {
        //<REMOVE-BRIDGE>
        thread.start();
        //>REMOVE-BRIDGE<
    }

    public void run() {
        //<REMOVE-BRIDGE>
        if(target != null){
            target.run();
        }
        //>REMOVE-BRIDGE<
    }

    public void interrupt() {
        //<REMOVE-BRIDGE>
        thread.interrupt();
        //>REMOVE-BRIDGE<
    }

    public boolean isInterrupted() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.isInterrupted();
        //>REMOVE-BRIDGE<
    }

    @Override
    public String toString() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.toString();
        //>REMOVE-BRIDGE<
    }

    public ClassLoader getContextClassLoader() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.getContextClassLoader();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void setContextClassLoader(ClassLoader cl) {
        //<REMOVE-BRIDGE>
        thread.setContextClassLoader(cl);
        //>REMOVE-BRIDGE<
    }

    public StackTraceElement[] getStackTrace() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.getStackTrace();
        //>REMOVE-BRIDGE<
    }

    public long getId() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.getId();
        //>REMOVE-BRIDGE<
    }

    public State getState() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        java.lang.Thread.State state = thread.getState();
        return State.valueOf(state.toString());
        //>REMOVE-BRIDGE<
    }

    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return uncaughtExceptionHandler;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        //<REMOVE-BRIDGE>
        this.uncaughtExceptionHandler = eh;
        if(eh != null) {
            thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(@NonNull java.lang.Thread t, @NonNull Throwable e) {
                    eh.uncaughtException(t, e);
                }
            });
        } else {
            thread.setUncaughtExceptionHandler(null);
        }
        //>REMOVE-BRIDGE<
    }

    public boolean isAlive() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.isAlive();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"newPriority"})
    public void setPriority(int newPriority) {
        //<REMOVE-BRIDGE>
        thread.setPriority(newPriority);
        //>REMOVE-BRIDGE<
    }

    public int getPriority() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.getPriority();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public void setName(String name) {
        //<REMOVE-BRIDGE>
       thread.setName(name);
        //>REMOVE-BRIDGE<
    }

    public String getName() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return thread.getName();
        //>REMOVE-BRIDGE<
    }

    public ThreadGroup getThreadGroup() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
       return thread.getThreadGroup();
        //>REMOVE-BRIDGE<
    }

    public static void sleep(long milis){
        //<REMOVE-BRIDGE>
        try {
            java.lang.Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //>REMOVE-BRIDGE<
    }
    public static void sleep(long milis, int nanos){
        //<REMOVE-BRIDGE>
        try {
            java.lang.Thread.sleep(milis, nanos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //>REMOVE-BRIDGE<
    }
}
