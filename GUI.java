package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"GUI"})
public final class GUI {

  private GUI() {}

  /// Abstracts
  @MethodArgs({"guiElement"})
  public static void draw(GUIElement guiElement) {}

  @MethodArgs({"color", "text", "x", "y", "width", "height"})
  public static void drawText(Color color, String text, int x, int y, int width, int height) {}

  @MethodArgs({"color", "text", "x", "y", "width", "height", "font"})
  public static void drawText(Color color, String text, int x, int y, int width, int height, Font font) {}

  @MethodArgs({"text", "x", "y", "width", "height", "font"})
  public static void drawText(String text, int x, int y, int width, int height, Font font) {}

  @MethodArgs({"color", "text", "x", "y", "width", "height", "font", "alignment"})
  public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment) {}

  @MethodArgs({"color", "text", "x", "y", "width", "height", "font", "alignment", "scale"})
  public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment, float scale) {}

  @MethodArgs({"text", "x", "y", "width", "height", "font", "alignment"})
  public static void drawText(String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment) {}

  @MethodArgs({"text", "x", "y", "width", "height"})
  public static void drawText(String text, int x, int y, int width, int height) {}

  @MethodArgs({"text", "x", "y", "width", "height", "scale"})
  public static void drawText(String text, int x, int y, int width, int height, float scale) {}

  @MethodArgs({"color", "text", "x", "y", "width", "height", "alignment"})
  public static void drawText(Color color, String text, int x, int y, int width, int height, GUIText.Alignment alignment) {}

  @MethodArgs({"text", "x", "y", "width", "height", "alignment"})
  public static void drawText(String text, int x, int y, int width, int height, GUIText.Alignment alignment) {}

  @MethodArgs({"texture", "x", "y", "width", "height"})
  public static void drawImage(Texture texture, int x, int y, int width, int height) {}

  @MethodArgs({"texture", "x", "y", "width", "height", "flipX", "flipY"})
  public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY) {}

  @MethodArgs({"texture", "x", "y", "width", "height", "flipX", "flipY", "overrideAlpha", "alpha"})
  public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha) {}

  @MethodArgs({"color", "texture", "x", "y", "width", "height"})
  public static void drawImage(Color color, Texture texture, int x, int y, int width, int height) {}

  @MethodArgs({"color", "texture", "x", "y", "width", "height", "flipX", "flipY"})
  public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY) {}

  @MethodArgs({"color", "texture", "x", "y", "width", "height", "flipX", "flipY", "overrideAlpha", "alpha"})
  public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha) {}

  @MethodArgs({"guiImage"})
  public static void drawImage(GUIImage guiImage) {}

  @MethodArgs({"texture", "guiRect"})
  public static void drawImage(Texture texture, GUIRect guiRect) {}

  @MethodArgs({"color", "texture", "guiRect"})
  public static void drawImage(Color color, Texture texture, GUIRect guiRect) {}
}
