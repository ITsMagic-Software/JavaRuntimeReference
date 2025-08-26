package JAVARuntime;

// <inspector>
// >inspector<

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Vector"})
public final class Matrix4 {

  public Matrix4() {}

  @MethodArgs({"array"})
  public Matrix4(float[] array) {}

  @MethodArgs({"m00", "m01", "m02", "m03", "m10", "m11", "m12", "m13", "m20", "m21", "m22", "m23", "m30", "m31", "m32", "m33"})
  public Matrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {}

  @MethodArgs({"value"})
  public Matrix4 mul(Matrix4 value) {

    return null;
  }

  @MethodArgs({"value", "out"})
  public void mul(Matrix4 value, Matrix4 out) {}

  public Matrix4 inverse() {

    return null;
  }

  @MethodArgs({"out"})
  public void inverse(Matrix4 out) {}

  @MethodArgs({"value"})
  public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3) {

    return null;
  }

  @MethodArgs({"value", "out"})
  public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out) {

    return null;
  }

  @MethodArgs({"x", "y", "z"})
  public JAVARuntime.Vector3 mul(float x, float y, float z) {

    return null;
  }

  @MethodArgs({"x", "y", "z", "out"})
  public JAVARuntime.Vector3 mul(float x, float y, float z, JAVARuntime.Vector3 out) {

    return null;
  }

  @MethodArgs({"value"})
  public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3) {

    return null;
  }

  @MethodArgs({"value", "out"})
  public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out) {

    return null;
  }

  @MethodArgs({"value"})
  public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3) {

    return null;
  }

  @MethodArgs({"value", "out"})
  public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out) {

    return null;
  }

  @HideGetSet
  public JAVARuntime.Vector3 getTranslation() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Vector3 getTranslation(JAVARuntime.Vector3 out) {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTranslation(JAVARuntime.Vector3 vector3) {}

  @MethodArgs({"x", "y", "z"})
  public void setTranslation(float x, float y, float z) {}

  @HideGetSet
  public JAVARuntime.Vector3 getScale() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Vector3 getScale(JAVARuntime.Vector3 out) {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setScale(JAVARuntime.Vector3 vector3) {}

  @MethodArgs({"x", "y", "z"})
  public void setScale(float x, float y, float z) {}

  @HideGetSet
  public JAVARuntime.Quaternion getRotation() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Quaternion getRotation(Quaternion out) {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRotation(JAVARuntime.Quaternion quaternion) {}

  @MethodArgs({"x", "y", "z"})
  public void setRotation(float x, float y, float z, float w) {}

  @MethodArgs({"array"})
  public void set(float[] array) {}

  @MethodArgs({"position", "rotation", "scale"})
  public void setTransform(JAVARuntime.Vector3 position, Quaternion rotation, JAVARuntime.Vector3 scale) {}

  public JAVARuntime.Vector3 toTranslationVector() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Vector3 toTranslationVector(JAVARuntime.Vector3 out) {

    return null;
  }

  public JAVARuntime.Quaternion toRotationQuat() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Quaternion toRotationQuat(Quaternion out) {

    return null;
  }

  public JAVARuntime.Vector3 toScaleVector() {

    return null;
  }

  @MethodArgs({"out"})
  public JAVARuntime.Vector3 toScaleVector(JAVARuntime.Vector3 out) {

    return null;
  }

  @MethodArgs({"array"})
  public void fillFloatArray(float[] floatArray) {}

  @MethodArgs({"array", "columnMajor"})
  public void fillFloatArray(float[] floatArray, boolean columnMajor) {}
}
