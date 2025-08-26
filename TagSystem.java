package JAVARuntime;

public final class TagSystem {

  @MethodArgs({"name"})
  public static void addTag(String name) {}

  @MethodArgs({"oldName", "newName"})
  public static void renameTag(String oldName, String newName) {}

  @MethodArgs({"name"})
  public static void deleteTag(String name) {}
}
