package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"GUI"})
public final class GUIRect {

  private transient int x, y, width, height;

  public GUIRect() {}

  @MethodArgs({"x", "y", "width", "height"})
  public GUIRect(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @HideGetSet
  public int getX() {
    return x;
  }

  @HideGetSet
  @MethodArgs({"x"})
  public GUIRect setX(int x) {
    this.x = x;
    return this;
  }

  @HideGetSet
  public int getY() {
    return y;
  }

  @HideGetSet
  @MethodArgs({"y"})
  public GUIRect setY(int y) {
    this.y = y;
    return this;
  }

  @HideGetSet
  public int getWidth() {
    return width;
  }

  @HideGetSet
  @MethodArgs({"width"})
  public GUIRect setWidth(int width) {
    this.width = width;
    return this;
  }

  @HideGetSet
  public int getHeight() {
    return height;
  }

  @HideGetSet
  @MethodArgs({"height"})
  public GUIRect setHeight(int height) {
    this.height = height;
    return this;
  }
}
