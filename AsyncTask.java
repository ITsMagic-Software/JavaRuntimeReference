package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Async"})
public class AsyncTask{
    /**
     * Execute hard tasks in a separated thread, then sync with engine thread
     * @param asyncRunnable
     */
    @MethodArgs(args ={"asyncRunnable"})
    public AsyncTask(AsyncRunnable asyncRunnable) {
        //<REMOVE-BRIDGE>
        execute(asyncRunnable, null);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"userData","asyncRunnable"})
    public AsyncTask(Object userData, AsyncRunnable asyncRunnable) {
        //<REMOVE-BRIDGE>
        execute(asyncRunnable, userData);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @MethodArgs(args ={"asyncRunnable","userData"})
    private void execute(AsyncRunnable asyncRunnable, Object userData){
        new Thread(new Runnable() {
            @Override
            public void run() {
                JavaJar.execute(new Interface() {
                    @Override
                    public void run() {
                        Object result = asyncRunnable.onBackground(userData);
                        Thread.runOnEngine(new Runnable() {
                            @Override
                            public void run() {
                                JavaJar.execute(new Interface() {
                                    @Override
                                    public void run() {
                                        asyncRunnable.onEngine(result);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }).start();
    }
    //>REMOVE-BRIDGE<
}
