package JAVARuntime;

//

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
        //
    }
    @MethodArgs(args ={"userData","asyncRunnable"})
    public AsyncTask(Object userData, AsyncRunnable asyncRunnable) {
        //
    }

    //
}
