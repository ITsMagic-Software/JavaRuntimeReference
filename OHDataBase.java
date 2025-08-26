package JAVARuntime;

@ClassCategory(cat = {"Buffers"})
public class OHDataBase {

  @MethodArgs({"capacity"})
  public OHDataBase(int capacity) {}

  @MethodArgs({"size"})
  public void incrementSize(int size) {}

  @MethodArgs({"size"})
  public void decrementSize(int size) {}

  @MethodArgs({"capacity"})
  public void resize(int newCapacity) {}

  @MethodArgs({"capacity", "copyData"})
  public void resize(int newCapacity, boolean copyData) {}

  @MethodArgs({"position"})
  public void position(int position) {}

  @MethodArgs({"bytes"})
  public void put(byte[] bytes) {}

  @MethodArgs({"position", "value"})
  public void set(int position, byte value) {}

  @MethodArgs({"idx"})
  public byte get(int idx) {

    return 0;
  }

  public byte[] getBytes() {

    return null;
  }

  public int size() {

    return 0;
  }

  public int capacity() {

    return 0;
  }
}
