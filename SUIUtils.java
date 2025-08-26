package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI"})
public final class SUIUtils {

  private SUIUtils() {}

  @MethodArgs({"position"})
  public static Vector2 convertTouchPosition(Point2 position) {
    return convertTouchPosition(position.getX(), position.getY(), new Vector2());
  }

  @MethodArgs({"position"})
  public static Vector2 convertTouchPosition(Vector2 position) {
    return convertTouchPosition((int) position.getX(), (int) position.getY(), new Vector2());
  }

  @MethodArgs({"x", "y"})
  public static Vector2 convertTouchPosition(int x, int y) {
    return convertTouchPosition(x, y, new Vector2());
  }

  @MethodArgs({"x", "y", "out"})
  public static Vector2 convertTouchPosition(int x, int y, Vector2 out) {

    return null;
  }

  @MethodArgs({"y"})
  public static int convertTouchPositionY(int y) {

    return 0;
  }
}
