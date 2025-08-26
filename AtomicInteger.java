package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) MethodArgs filled by Carlos at 22-04-2022 Extends java.util.concurrent.atomic.AtomicInteger */
@ClassCategory(cat = {"Atomic"})
public final class AtomicInteger {

  public AtomicInteger() {}

  @MethodArgs({"value"})
  public AtomicInteger(int value) {}

  public int get() {

    return 0;
  }

  @MethodArgs({"value"})
  public void set(int value) {}

  @MethodArgs({"value"})
  public void lazySet(int value) {}

  @MethodArgs({"value"})
  public int getAndSet(int value) {

    return 0;
  }

  public int getAndIncrement() {

    return 0;
  }

  public int getAndDecrement() {

    return 0;
  }

  public int incrementAndGet() {

    return 0;
  }

  public int decrementAndGet() {

    return 0;
  }

  @MethodArgs({"value"})
  public int getAndAdd(int value) {

    return 0;
  }

  @MethodArgs({"value"})
  public int addAndGet(int value) {

    return 0;
  }

  @MethodArgs({"expect", "update"})
  public boolean compareAndSet(int expect, int update) {

    return false;
  }

  @MethodArgs({"expect", "update"})
  public boolean weakCompareAndSet(int expect, int update) {

    return false;
  }
}
