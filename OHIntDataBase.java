package JAVARuntime;

@ClassCategory(cat = {"Buffers"})
public class OHIntDataBase {

  @MethodArgs({"capacity"})
  public OHIntDataBase(int capacity) {}

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

  @MethodArgs({"value"})
  public void put(int[] value) {}

  @MethodArgs({"value"})
  public void put(int value) {}

  @MethodArgs({"position", "value"})
  public void set(int position, int value) {}

  @MethodArgs({"idx"})
  public int get(int idx) {

    return 0;
  }

  public int[] getBytes() {

    return null;
  }

  public int size() {

    return 0;
  }

  public int capacity() {

    return 0;
  }
}
