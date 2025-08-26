package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Buffers"})
public class NativeFloatBuffer {

  /*
  Regardless of choose precision, values returned by _get_ methods of this buffer always return the nearest float value than the input value applied using _set_ method
  Precision determines how this buffer will store input values internally in native memory, this help to reduce memory use when high precision is not necessary
  */
  public enum Precision {
    /*
    Stored range -128 to 127 (integer) but send as -1.0 to 1.0 (float) to opengl
    User input values applied using _set_ methods of this buffer should be from 0.0 to 1.0 (float) and it will be converted to internal store range
    Recommended to normal, tangent and bitangent vectors
    8 bits
    */
    SIGNED_BYTE_NORMALIZED,
    NORMAL_VECTOR,

    /*
    Stored range 0 to 255 (integer) but send as 0.0 to 1.0 (float) to opengl
    User input values applied using _set_ methods of this buffer should be from 0.0 to 1.0 (float) and it will be converted to internal store range
    Recommended to colors
    8 bits
    */
    UNSIGNED_BYTE_NORMALIZED,
    COLOR,

    /*
    Range 0 to 255 (integer)
    User input values applied using _set_ methods of this buffer should be from 0 to 255 (integer), any decimal parts will be discarded
    Recommended to Joints buffer
    8 bits
     */
    UNSIGNED_BYTE,

    /*
    Half-precision float (IEEE 754-2008 binary16)
    User input values applied using _set_ methods can be any float, some precision lost is expected
    16 bits
     */
    FLOAT16,

    /*
    Universal float 32 bits (the default precision)
    User input values applied using _set_ methods can be any float
    32 bits
     */
    FLOAT32
  }

  @MethodArgs({"capacity"})
  public NativeFloatBuffer(int capacity) {}

  @MethodArgs({"capacity"})
  public NativeFloatBuffer(int capacity, Precision precision) {}

  @MethodArgs({"idx"})
  public float get(int index) {

    return 0;
  }

  @MethodArgs({"values"})
  public void get(float[] values) {}

  @MethodArgs({"values", "count"})
  public void get(float[] values, int count) {}

  @MethodArgs({"baseIndex", "values"})
  public void get(int baseIndex, float[] values) {}

  @MethodArgs({"baseIndex", "values", "start", "count"})
  public void get(int baseIndex, float[] values, int start, int count) {}

  @MethodArgs({"idx", "valuee"})
  public void set(int index, float value) {}

  @MethodArgs({"value"})
  public void put(float value) {}

  @MethodArgs({"values"})
  public void put(float[] values) {}

  @MethodArgs({"values"})
  public void put(short[] values) {}

  public int capacity() {

    return 0;
  }

  public int getPosition() {

    return 0;
  }

  @MethodArgs({"idx"})
  public int position(int idx) {

    return idx;
  }

  @MethodArgs({"idx"})
  public void setPosition(int idx) {}

  @MethodArgs({"values"})
  public void set(float[] values) {}

  @MethodArgs({"values", "count"})
  public void set(float[] values, int count) {}

  @MethodArgs({"baseIndex", "values"})
  public void set(int baseIndex, float[] values) {}

  @MethodArgs({"baseIndex", "values", "start", "count"})
  public void set(int baseIndex, float[] values, int start, int count) {}

  public Precision getPrecision() {

    return null;
  }

  @HideGetSet
  public boolean isVboEnabled() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setVboEnabled(boolean value) {}
}
