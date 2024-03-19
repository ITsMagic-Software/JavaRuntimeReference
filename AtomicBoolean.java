package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 * Extends java.util.concurrent.atomic.AtomicBoolean
 */
@ClassCategory(cat ={"Atomic"})
public final class AtomicBoolean {
    //

    public AtomicBoolean() {
        //
    }
    @MethodArgs(args ={"value"})
    public AtomicBoolean(boolean value) {
        //
    }

    public boolean get(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void set(boolean value){
        //
    }
    @MethodArgs(args ={"value"})
    public void lazySet(boolean value){
        //
    }
    @MethodArgs(args ={"value"})
    public boolean getAndSet(boolean value){
        //
        return false;
        //

        //
    }
    
    @MethodArgs(args ={"expect","update"})
    public boolean compareAndSet(boolean expect, boolean update){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"expect","update"})
    public boolean weakCompareAndSet(boolean expect, boolean update){
        //
        return false;
        //

        //
    }
}
