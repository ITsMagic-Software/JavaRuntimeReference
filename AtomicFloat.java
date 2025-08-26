package JAVARuntime;

import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.Float.*;

/** Found at https://stackoverflow.com/questions/5505460/java-is-there-no-atomicfloat-or-atomicdouble/34797921 */
@ClassCategory(cat = {"Atomic"})
public final class AtomicFloat extends Number {

  private final transient AtomicInteger bits;

  public AtomicFloat() {
    this(0f);
  }

  @MethodArgs({"initialValue"})
  public AtomicFloat(float initialValue) {
    bits = new AtomicInteger(floatToIntBits(initialValue));
  }

  @MethodArgs({"expect", "update"})
  public final boolean compareAndSet(float expect, float update) {
    return bits.compareAndSet(floatToIntBits(expect), floatToIntBits(update));
  }

  @MethodArgs({"newValue"})
  public final void set(float newValue) {
    bits.set(floatToIntBits(newValue));
  }

  public final float get() {
    return intBitsToFloat(bits.get());
  }

  public float floatValue() {
    return get();
  }

  @MethodArgs({"newValue"})
  public final float getAndSet(float newValue) {
    return intBitsToFloat(bits.getAndSet(floatToIntBits(newValue)));
  }

  @MethodArgs({"expect", "update"})
  public final boolean weakCompareAndSet(float expect, float update) {
    return bits.weakCompareAndSet(floatToIntBits(expect), floatToIntBits(update));
  }

  public double doubleValue() {
    return (double) floatValue();
  }

  public int intValue() {
    return (int) get();
  }

  public long longValue() {
    return (long) get();
  }

  public String toString() {
    return get() + "";
  }
}
