package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 * Extends java.util.concurrent.atomic.AtomicBoolean
 */
@ClassCategory(cat ={"Atomic"})
public final class AtomicBoolean {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient java.util.concurrent.atomic.AtomicBoolean instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"atomicBoolean"})
    public AtomicBoolean(java.util.concurrent.atomic.AtomicBoolean instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public AtomicBoolean() {
        //<REMOVE-BRIDGE>
        this.instance = new java.util.concurrent.atomic.AtomicBoolean();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public AtomicBoolean(boolean value) {
        //<REMOVE-BRIDGE>
        this.instance = new java.util.concurrent.atomic.AtomicBoolean(value);
        //>REMOVE-BRIDGE<
    }

    public boolean get(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.get();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void set(boolean value){
        //<REMOVE-BRIDGE>
        instance.set(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void lazySet(boolean value){
        //<REMOVE-BRIDGE>
        instance.lazySet(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean getAndSet(boolean value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getAndSet(value);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"expect","update"})
    public boolean compareAndSet(boolean expect, boolean update){
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
    public boolean weakCompareAndSet(boolean expect, boolean update){
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
