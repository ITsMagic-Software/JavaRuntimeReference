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
    @MethodArgs({"value"})
    public AtomicBoolean(boolean value) {
        //
    }

    public boolean get(){
        //
        return false;
        //

        //
    }
    @MethodArgs({"value"})
    public void set(boolean value){
        //
    }
    @MethodArgs({"value"})
    public void lazySet(boolean value){
        //
    }
    @MethodArgs({"value"})
    public boolean getAndSet(boolean value){
        //
        return false;
        //

        //
    }
    
    @MethodArgs({"expect","update"})
    public boolean compareAndSet(boolean expect, boolean update){
        //
        return false;
        //

        //
    }
    @MethodArgs({"expect","update"})
    public boolean weakCompareAndSet(boolean expect, boolean update){
        //
        return false;
        //

        //
    }
}
