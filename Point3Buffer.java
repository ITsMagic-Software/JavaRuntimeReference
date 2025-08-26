package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Vector", "Buffers"})
public class Point3Buffer {

  public Point3Buffer(int vectorCount) {}

  public Point3Buffer(NativeIntBuffer nativeIntBuffer) {}

  @MethodArgs({"idx"})
  public Point3 get(int idx) {

    return null;
  }

  @MethodArgs({"idx"})
  public float getX(int idx) {

    return 0;
  }

  @MethodArgs({"idx"})
  public float getY(int idx) {

    return 0;
  }

  @MethodArgs({"idx"})
  public float getZ(int idx) {

    return 0;
  }

  @MethodArgs({"value"})
  public void put(Point3 point3) {}

  @MethodArgs({"x", "y", "z"})
  public void put(int x, int y, int z) {}

  @MethodArgs({"idx", "value"})
  public void set(int idx, Point3 point3) {}

  @MethodArgs({"idx", "x", "y", "z"})
  public void set(int idx, int x, int y, int z) {}

  public int capacity() {

    return 0;
  }

  public Point3[] array() {

    return null;
  }

  @MethodArgs({"idx"})
  public void position(int idx) {}

  @HideGetSet
  public boolean isVboEnabled() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setVboEnabled(boolean value) {}

  public JAVARuntime.NativeIntBuffer getFloatBuffer() {

    return null;
  }
}
