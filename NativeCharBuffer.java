package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Buffers"})
public class NativeCharBuffer {

  @MethodArgs({"capacity"})
  public NativeCharBuffer(int capacity) {}

  @MethodArgs({"idx"})
  public char get(int index) {

    return 0;
  }

  @MethodArgs({"idx", "value"})
  public void set(int index, char value) {}

  @MethodArgs({"value"})
  public void put(char value) {}

  public int capacity() {

    return 0;
  }

  public int getPosition() {

    return 0;
  }

  @MethodArgs({"idx"})
  public void Position(int idx) {}

  @MethodArgs({"idx"})
  public void setPosition(int idx) {}
}
