package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SaveGame"})
public final class SaveGame {

  private SaveGame() {}

  /// Abstracts
  @MethodArgs({"key", "value"})
  public static void saveString(String key, String str) {}

  @MethodArgs({"key"})
  public static String loadString(String key) {

    return "";
  }

  @MethodArgs({"key"})
  public static void deleteString(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveFloat(String key, float value) {}

  @MethodArgs({"key"})
  public static float loadFloat(String key) {

    return 0;
  }

  @MethodArgs({"key"})
  public static void deleteFloat(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveInt(String key, int value) {}

  @MethodArgs({"key"})
  public static int loadInt(String key) {

    return 0;
  }

  @MethodArgs({"key"})
  public static void deleteInt(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveVector3(String key, Vector3 value) {}

  @MethodArgs({"key"})
  public static Vector3 loadVector3(String key) {

    return null;
  }

  @MethodArgs({"key"})
  public static void deleteVector3(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveVector2(String key, Vector2 value) {}

  @MethodArgs({"key"})
  public static Vector2 loadVector2(String key) {

    return null;
  }

  @MethodArgs({"key"})
  public static void deleteVector2(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveQuaternion(String key, Quaternion value) {}

  @MethodArgs({"key"})
  public static Quaternion loadQuaternion(String key) {

    return null;
  }

  @MethodArgs({"key"})
  public static void deleteQuaternion(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveColor(String key, Color value) {}

  @MethodArgs({"key"})
  public static Color loadColor(String key) {

    return null;
  }

  @MethodArgs({"key"})
  public static void deleteColor(String key) {}

  @MethodArgs({"key", "value"})
  public static void saveBoolean(String key, boolean value) {}

  @MethodArgs({"key"})
  public static boolean loadBoolean(String key) {

    return false;
  }

  @MethodArgs({"key"})
  public static void deleteBoolean(String key) {}

  public static void deleteAll() {}
}
