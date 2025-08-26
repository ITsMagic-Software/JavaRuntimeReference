package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Vector"})
public final class Vector4 {

  public Vector4() {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(float x, float y, float z, float w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(float x, float y, float z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(float x, float y, int z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(float x, int y, int z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(int x, int y, int z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(int x, float y, int z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(int x, int y, float z, int w) {}

  @MethodArgs({"x", "y", "z", "w"})
  public Vector4(int x, int y, int z, float w) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(float x, float y, float z) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(int x, float y, float z) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(float x, int y, float z) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(float x, float y, int z) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(int x, int y, float z) {}

  @MethodArgs({"x", "y", "z"})
  public Vector4(float x, int y, int z) {}

  @MethodArgs({"x", "y"})
  public Vector4(float x, float y) {}

  @MethodArgs({"x", "y"})
  public Vector4(int x, float y) {}

  @MethodArgs({"x", "y"})
  public Vector4(float x, int y) {}

  @MethodArgs({"x", "y"})
  public Vector4(int x, int y) {}

  @MethodArgs({"a"})
  public Vector4(float a) {}

  @MethodArgs({"a"})
  public Vector4(int a) {}

  @HideGetSet
  public float getX() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setX(float value) {}

  @HideGetSet
  public float getY() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setY(float value) {}

  @HideGetSet
  public float getZ() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setZ(float value) {}

  @HideGetSet
  public float getW() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setW(float value) {}

  @MethodArgs({"value"})
  public void set(Vector4 vector) {}

  @MethodArgs({"x", "y", "z", "w"})
  public void set(float x, float y, float z, float w) {}

  @MethodArgs({"a"})
  public void set(float a) {}
}
