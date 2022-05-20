package JAVARuntime;
//
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * A bridge that calls between java runtime and Java Collections.synchronizedList
 * Collections.synchronizedList was not made by ITsMagic
 */
@ClassCategory(cat={"Lists"})
public class ListStream {
    public static final int HALF_THREADS = 411;
    public static final int MAX_THREADS = 412;
    public static final int FIXED_THREADS = 413;

    //

    @MethodArgs(args={"list"})
    public ListStream(List list) {
        //
    }
    @MethodArgs(args={"list","threadsSequence","listStreamListener"})
    public ListStream(List list, int threadsSequence, ListStreamListener listStreamListener) {
        //
    }
    @MethodArgs(args={"userData","list","threadsSequence","listStreamListener"})
    public ListStream(Object userData, List list, int threadsSequence, ListStreamListener listStreamListener) {
        //
    }
    @MethodArgs(args={"list","threadsSequence","threadsCount","listStreamListener"})
    public ListStream(List list, int threadsSequence, int threadsCount, ListStreamListener listStreamListener) {
        //
    }
    @MethodArgs(args={"userData","list","threadsSequence","threadsCount","listStreamListener"})
    public ListStream(Object userData,List list, int threadsSequence, int threadsCount, ListStreamListener listStreamListener) {
        //
    }


    @MethodArgs(args={"threadsSequence"})
    public void setThreadsSequence(int threadsSequence) {
        //
    }
    @MethodArgs(args={"threadsCount"})
    public void setThreadsCount(int threadsCount) {
        //
    }
    @MethodArgs(args={"listStreamListener"})
    public void setListStreamListener(ListStreamListener listStreamListener) {
        //
    }

    //
}

