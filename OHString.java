package JAVARuntime;

@ClassCategory(cat = {"Buffers"})
public class OHString implements SumOperator, SubOperator, DivOperator, SumEqualOperator, SubEqualOperator, DivEqualOperator, EqualsComparator, GreaterThanComparator, LessThanComparator, RemoveRemoveOperator {

  public OHString() {}

  @MethodArgs({"str"})
  public OHString(String str) {}

  @MethodArgs({"str"})
  public OHString(char[] str) {}

  @MethodArgs({"str"})
  public OHString(OHString str) {}

  @MethodArgs({"str"})
  public void set(String str) {}

  @MethodArgs({"str"})
  public void set(OHString str) {}

  @MethodArgs({"str"})
  public void set(float str) {}

  @MethodArgs({"str"})
  public void set(int str) {}

  @MethodArgs({"str"})
  public void set(boolean str) {}

  @MethodArgs({"str"})
  public void set(double str) {}

  @MethodArgs({"str"})
  public void set(long str) {}

  @MethodArgs({"str"})
  public void set(short str) {}

  @MethodArgs({"str"})
  public void set(char str) {}

  @MethodArgs({"chars", "offset", "length"})
  public void set(char[] chars, int offset, int length) {}

  @MethodArgs({"str"})
  public void concatLocal(String str) {}

  @MethodArgs({"str"})
  public void concatLocal(OHString str) {}

  @MethodArgs({"str"})
  public void concatLocalAtStart(String str) {}

  @MethodArgs({"str"})
  public void concatLocalAtStart(OHString str) {}

  @MethodArgs({"str"})
  public OHString concat(String str) {

    return null;
  }

  @MethodArgs({"str"})
  public OHString concat(OHString str) {

    return null;
  }

  @MethodArgs({"str"})
  public OHString concatAtStart(String str) {

    return null;
  }

  @MethodArgs({"str"})
  public OHString concatAtStart(OHString str) {

    return null;
  }

  @MethodArgs({"startIdx"})
  public OHString subString(int startIdx) {

    return null;
  }

  @MethodArgs({"startIdx", "endIdx"})
  public OHString subString(int startIdx, int endIndex) {

    return null;
  }

  @MethodArgs({"startIdx"})
  public void subStringLocal(int startIdx) {}

  @MethodArgs({"startIdx", "endIdx"})
  public void subStringLocal(int startIdx, int endIndex) {}

  public OHString trim() {

    return null;
  }

  @MethodArgs({"str"})
  public boolean equals(String str) {

    return false;
  }

  @MethodArgs({"str"})
  public boolean equals(OHString str) {

    return false;
  }

  @MethodArgs({"str"})
  public boolean equalsIgnoreCase(String str) {

    return false;
  }

  @MethodArgs({"str"})
  public boolean equalsIgnoreCase(OHString str) {

    return false;
  }

  @MethodArgs({"str"})
  public boolean contains(String str) {

    return false;
  }

  @MethodArgs({"str"})
  public boolean contains(OHString str) {

    return false;
  }

  @MethodArgs({"str"})
  public OHString[] split(String str) {

    return null;
  }

  @MethodArgs({"str"})
  public OHString[] split(OHString str) {

    return null;
  }

  @MethodArgs({"str", "replacement"})
  public OHString replace(String str, String replacement) {

    return null;
  }

  @MethodArgs({"str", "replacement"})
  public OHString replace(OHString str, OHString replacement) {

    return null;
  }

  @MethodArgs({"str", "replacement"})
  public void replaceLocal(String str, String replacement) {}

  @MethodArgs({"str", "replacement"})
  public void replaceLocal(OHString str, OHString replacement) {}

  @MethodArgs({"str"})
  public boolean isEmpty() {

    return false;
  }

  public int length() {

    return 0;
  }

  public String toString() {

    return null;
  }

  public OHString copy() {

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
  public <T> T sub(Object otherObject) {

    return null;
  }

  @MethodArgs({"value"})
  public void subEqual(Object otherObject) {}

  public void removeRemove() {}
}
