package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 * Extends java.util.concurrent.atomic.AtomicInteger
 */
@ClassCategory(cat ={"Atomic"})
public final class AtomicInteger {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient java.util.concurrent.atomic.AtomicInteger instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"atomicInteger"})
    public AtomicInteger(java.util.concurrent.atomic.AtomicInteger instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public AtomicInteger() {
        //<REMOVE-BRIDGE>
        this.instance = new java.util.concurrent.atomic.AtomicInteger();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public AtomicInteger(int value) {
        //<REMOVE-BRIDGE>
        this.instance = new java.util.concurrent.atomic.AtomicInteger(value);
        //>REMOVE-BRIDGE<
    }

    public int get(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.get();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void set(int value){
        //<REMOVE-BRIDGE>
        instance.set(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void lazySet(int value){
        //<REMOVE-BRIDGE>
        instance.lazySet(value);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"value"})
    public int getAndSet(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getAndSet(value);
        //>REMOVE-BRIDGE<
    }
    public int getAndIncrement(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getAndIncrement();
        //>REMOVE-BRIDGE<
    }
    public int getAndDecrement(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getAndDecrement();
        //>REMOVE-BRIDGE<
    }
    public int incrementAndGet(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.incrementAndGet();
        //>REMOVE-BRIDGE<
    }
    public int decrementAndGet(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.decrementAndGet();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public int getAndAdd(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getAndAdd(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public int addAndGet(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.addAndGet(value);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"expect","update"})
    public boolean compareAndSet(int expect, int update){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.compareAndSet(expect, update);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"expect","update"})
    public boolean weakCompareAndSet(int expect, int update){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.weakCompareAndSet(expect, update);
        //>REMOVE-BRIDGE<
    }
}
