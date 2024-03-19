package JAVARuntime;

import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.Float.*;

/**
 * Found at https://stackoverflow.com/questions/5505460/java-is-there-no-atomicfloat-or-atomicdouble/34797921
 */
@ClassCategory(cat ={"Atomic"})
public final class AtomicFloat extends Number {

    private transient final AtomicInteger bits;

    public AtomicFloat() {
        this(0f);
    }
    @MethodArgs(args ={"initialValue"})
    public AtomicFloat(float initialValue) {
        bits = new AtomicInteger(floatToIntBits(initialValue));
    }
    
    @MethodArgs(args ={"expect","update"})
    public final boolean compareAndSet(float expect, float update) {
        return bits.compareAndSet(floatToIntBits(expect),
                floatToIntBits(update));
    }
    
    @MethodArgs(args ={"newValue"})
    public final void set(float newValue) {
        bits.set(floatToIntBits(newValue));
    }

    public final float get() {
        return intBitsToFloat(bits.get());
    }

    public float floatValue() {
        return get();
    }
    
    @MethodArgs(args ={"newValue"})
    public final float getAndSet(float newValue) {
        return intBitsToFloat(bits.getAndSet(floatToIntBits(newValue)));
    }
    
    @MethodArgs(args ={"expect","update"})
    public final boolean weakCompareAndSet(float expect, float update) {
        return bits.weakCompareAndSet(floatToIntBits(expect),
                floatToIntBits(update));
    }

    public double doubleValue() { return (double) floatValue(); }
    public int intValue()       { return (int) get();           }
    public long longValue()     { return (long) get();          }

    @Override
    public String toString() {
        return get() + "";
    }
}
