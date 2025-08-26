package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Vector"})
public final class Vector2 implements SumOperator, SubOperator, MulOperator, DivOperator, SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator, EqualsComparator, GreaterThanComparator, LessThanComparator, AddAddOperator, RemoveRemoveOperator, JsonSerializer {

  public Vector2() {}

  @MethodArgs({"x", "y"})
  public Vector2(float x, float y) {}

  @MethodArgs({"x", "y"})
  public Vector2(int x, float y) {}

  @MethodArgs({"x", "y"})
  public Vector2(float x, int y) {}

  @MethodArgs({"x", "y"})
  public Vector2(int x, int y) {}

  @MethodArgs({"a"})
  public Vector2(float a) {}

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

  /// Calcs
  @MethodArgs({"value"})
  public Vector2 mul(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 mul(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 mul(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public void mulLocal(Vector3 value) {}

  @MethodArgs({"value"})
  public void mulLocal(Vector2 value) {}

  @MethodArgs({"x", "y"})
  public void mulLocal(float x, float y) {}

  @MethodArgs({"a"})
  public void mulLocal(float a) {}

  @MethodArgs({"value"})
  public Vector2 multiply(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 multiply(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 multiply(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public Vector2 div(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 div(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 div(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public void divLocal(Vector3 value) {}

  @MethodArgs({"value"})
  public void divLocal(Vector2 value) {}

  @MethodArgs({"x", "y"})
  public void divLocal(float x, float y) {}

  @MethodArgs({"a"})
  public void divLocal(float a) {}

  @MethodArgs({"value"})
  public Vector2 divide(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 divide(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 divide(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public Vector2 sum(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 sum(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 sum(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public void sumLocal(Vector3 value) {}

  @MethodArgs({"value"})
  public void sumLocal(Vector2 value) {}

  @MethodArgs({"x", "y"})
  public void sumLocal(float x, float y) {}

  @MethodArgs({"a"})
  public void sumLocal(float a) {}

  @MethodArgs({"value"})
  public Vector2 add(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 add(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 add(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public Vector2 sub(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 sub(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 sub(float a) {

    return null;
  }

  @MethodArgs({"value"})
  public void subLocal(Vector3 value) {}

  @MethodArgs({"value"})
  public void subLocal(Vector2 value) {}

  @MethodArgs({"x", "y"})
  public void subLocal(float x, float y) {}

  @MethodArgs({"a"})
  public void subLocal(float a) {}

  @MethodArgs({"value"})
  public Vector2 subtract(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector2 subtract(float x, float y) {

    return null;
  }

  @MethodArgs({"a"})
  public Vector2 subtract(float a) {

    return null;
  }

  /// Utils
  @MethodArgs({"value"})
  public boolean equals(Vector2 vector) {

    return false;
  }

  @MethodArgs({"x", "y"})
  public boolean equals(float x, float y) {

    return false;
  }

  @MethodArgs({"a"})
  public boolean equals(float a) {

    return false;
  }

  @MethodArgs({"value"})
  public void set(Vector2 vector2) {}

  @MethodArgs({"x", "y"})
  public void set(float x, float y) {}

  @MethodArgs({"a"})
  public void set(float a) {}

  @MethodArgs({"value", "speed"})
  public void lerp(Vector2 vector2, float speed) {}

  @MethodArgs({"x", "y", "speed"})
  public void lerp(float x, float y, float speed) {}

  @MethodArgs({"a", "speed"})
  public void lerp(float a, float speed) {}

  @MethodArgs({"value", "speed"})
  public void lerpInSeconds(Vector2 vector2, float speed) {}

  @MethodArgs({"x", "y", "speed"})
  public void lerpInSeconds(float x, float y, float speed) {}

  @MethodArgs({"a", "speed"})
  public void lerpInSeconds(float a, float speed) {}

  @MethodArgs({"value", "blend"})
  public void blend(Vector2 vector2, float blend) {}

  @MethodArgs({"x", "y", "blend"})
  public void blend(float x, float y, float blend) {}

  @MethodArgs({"a", "blend"})
  public void blend(float a, float blend) {}

  public Vector2 normalize() {

    return null;
  }

  public void normalizeLocal() {}

  @MethodArgs({"angle"})
  public void rotateLocal(float angle) {}

  public float length() {

    return 0;
  }

  public float sqrLength() {

    return 0;
  }

  @MethodArgs({"value"})
  public float distance(Vector2 vector2) {

    return 0;
  }

  @MethodArgs({"value"})
  public float sqrDistance(Vector2 vector2) {

    return 0;
  }

  @MethodArgs({"value"})
  public float dot(Vector2 vector2) {

    return 0;
  }

  @MethodArgs({"x", "y"})
  public float dot(float x, float y) {

    return 0;
  }

  @MethodArgs({"a"})
  public float dot(float a) {

    return 0;
  }

  @MethodArgs({"value"})
  public Vector3 cross(Vector2 value) {

    return null;
  }

  @MethodArgs({"x", "y"})
  public Vector3 cross(float x, float y) {

    return null;
  }

  public Vector2 copy() {

    return null;
  }

  public String toString() {

    return null;
  }

  @MethodArgs({"decimals"})
  public String toString(int decimals) {

    return null;
  }

  /// Abstracts
  public static Vector2 zero() {

    return null;
  }

  @MethodArgs({"vector", "angle"})
  public static Vector2 rotateAroundPivot(Vector2 vector, float angle) {

    return null;
  }

  @MethodArgs({"vector", "pivot", "angle"})
  public static Vector2 rotateAroundPivot(Vector2 vector, Vector2 pivot, float angle) {

    return null;
  }

  /// Comparators
  @MethodArgs({"value"})
  public boolean equals(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean pointerEquals(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean notEquals(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public static boolean isNull(Object value) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterThan(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterThan(float v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterThan(int v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterThan(long v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterThan(double v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterOrEqualsThan(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterOrEqualsThan(float v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterOrEqualsThan(int v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterOrEqualsThan(long v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean greaterOrEqualsThan(double v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessThan(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessThan(float v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessThan(int v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessThan(long v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessThan(double v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessOrEqualsThan(Object otherObject) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessOrEqualsThan(float v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessOrEqualsThan(int v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessOrEqualsThan(long v) {

    return false;
  }

  @MethodArgs({"value"})
  public boolean lessOrEqualsThan(double v) {

    return false;
  }

  /// Operators
  @MethodArgs({"value"})
  public <T> T sum(Object otherObject) {

    return null;
  }

  @MethodArgs({"value"})
  public void sumEqual(Object otherObject) {}

  @MethodArgs({"value"})
  public <T> T div(Object otherObject) {

    return null;
  }

  @MethodArgs({"value"})
  public void divEqual(Object otherObject) {}

  @MethodArgs({"value"})
  public <T> T mul(Object otherObject) {

    return null;
  }

  @MethodArgs({"value"})
  public void mulEqual(Object otherObject) {}

  @MethodArgs({"value"})
  public <T> T sub(Object otherObject) {

    return null;
  }

  @MethodArgs({"value"})
  public void subEqual(Object otherObject) {}

  public void addAdd() {}

  public void removeRemove() {}

  public String serializeToString() {

    return null;
  }

  public void deserializeLocal(String str) {}
}
