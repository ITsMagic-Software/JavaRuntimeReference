package JAVARuntime;
//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * A bridge that calls between java runtime and Java Collections.synchronizedList
 * Collections.synchronizedList was not made by ITsMagic
 */
@ClassCategory(cat ={"Lists"})
public final class ListStream {
    public static final int HALF_THREADS = 411;
    public static final int MAX_THREADS = 412;
    public static final int FIXED_THREADS = 413;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient List list;

    @IgnoreAutoComplete
    private transient int threadsCount = 2;

    @IgnoreAutoComplete
    private transient int threadsSequence = 0;

    @IgnoreAutoComplete
    private transient int threadsPriority = java.lang.Thread.NORM_PRIORITY;

    @IgnoreAutoComplete
    private transient ListStreamListener listStreamListener;

    @IgnoreAutoComplete
    private transient Object userData = null;
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"list"})
    public ListStream(List list) {
        //<REMOVE-BRIDGE>
        if(list == null){
            throw new NullPointerException("List can't be null");
        }
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        this.list = list;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"list","threadsSequence","listStreamListener"})
    public ListStream(List list, int threadsSequence, ListStreamListener listStreamListener) {
        //<REMOVE-BRIDGE>
        if(list == null){
            throw new NullPointerException("List can't be null");
        }
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        this.list = list;
        this.threadsSequence = threadsSequence;
        this.listStreamListener = listStreamListener;

        start();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"userData","list","threadsSequence","listStreamListener"})
    public ListStream(Object userData, List list, int threadsSequence, ListStreamListener listStreamListener) {
        //<REMOVE-BRIDGE>
        if(list == null){
            throw new NullPointerException("List can't be null");
        }
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        this.userData = userData;
        this.list = list;
        this.threadsSequence = threadsSequence;
        this.listStreamListener = listStreamListener;

        start();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"list","threadsSequence","threadsCount","listStreamListener"})
    public ListStream(List list, int threadsSequence, int threadsCount, ListStreamListener listStreamListener) {
        //<REMOVE-BRIDGE>
        if(list == null){
            throw new NullPointerException("List can't be null");
        }
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        this.list = list;
        this.threadsSequence = threadsSequence;
        this.threadsCount = threadsCount;
        this.listStreamListener = listStreamListener;

        if(threadsCount <= 0){
            throw new IllegalArgumentException("threadsCount can't be <= 0");
        }

        start();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"userData","list","threadsSequence","threadsCount","listStreamListener"})
    public ListStream(Object userData,List list, int threadsSequence, int threadsCount, ListStreamListener listStreamListener) {
        //<REMOVE-BRIDGE>
        if(list == null){
            throw new NullPointerException("List can't be null");
        }
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        this.userData = userData;
        this.list = list;
        this.threadsSequence = threadsSequence;
        this.threadsCount = threadsCount;
        this.listStreamListener = listStreamListener;

        if(threadsCount <= 0){
            throw new IllegalArgumentException("threadsCount can't be <= 0");
        }

        start();
        //>REMOVE-BRIDGE<
    }


    @MethodArgs(args ={"threadsSequence"})
    public void setThreadsSequence(int threadsSequence) {
        //<REMOVE-BRIDGE>
        this.threadsSequence = threadsSequence;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"threadsCount"})
    public void setThreadsCount(int threadsCount) {
        //<REMOVE-BRIDGE>
        this.threadsCount = threadsCount;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"listStreamListener"})
    public void setListStreamListener(ListStreamListener listStreamListener) {
        //<REMOVE-BRIDGE>
        this.listStreamListener = listStreamListener;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    private void start(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int spawnCount;
                switch (threadsSequence) {
                    case HALF_THREADS:
                        spawnCount = (int) Mathf.clampMin(1,Device.availableProcessors() / 2);
                        break;
                    case MAX_THREADS:
                        spawnCount = Device.availableProcessors();
                        break;
                    case FIXED_THREADS:
                        spawnCount = threadsCount;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid threadsSequence, use ListStream.HALF_THREADS, ListStream.MAX_THREADS or ListStream.FIXED_THREADS");
                }
                int itensPerThread = (int)Math.ceil((float)list.size() / (float)spawnCount);

                AtomicInteger finishCount = new AtomicInteger();
                for (int i = 0; i < spawnCount; i++) {
                    int increment = itensPerThread * i;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                for (int i1 = 0; i1 < itensPerThread; i1++) {
                                    int idx = i1 + increment;
                                    if (list.size() > idx) {
                                        try {
                                            Object object = list.get(idx);
                                            JavaJar.execute(new Interface() {
                                                @Override
                                                public void run() {
                                                    listStreamListener.execute(object, idx, userData);
                                                }
                                            });

                                        } catch (Exception e) {
                                            JavaJar.execute(new Interface() {
                                                @Override
                                                public void run() {
                                                    listStreamListener.onError(e, null, idx, userData);
                                                }
                                            });

                                        } catch (Error e) {
                                            JavaJar.execute(new Interface() {
                                                @Override
                                                public void run() {
                                                    listStreamListener.onError(null, e, idx, userData);
                                                }
                                            });
                                        }
                                    } else {
                                        finishCount.incrementAndGet();
                                        return;
                                    }
                                }
                                finishCount.incrementAndGet();
                            } catch (Exception|Error e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                }
                while (true){
                    if(finishCount.get() >= spawnCount){
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                listStreamListener.onFinish(userData);
                            }
                        });
                        return;
                    }
                }
            }
        }).start();
    }
    //>REMOVE-BRIDGE<
}

