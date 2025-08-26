package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"GUI"})
public final class GUIImage extends GUIElement {

  private transient Color color;
  private transient Texture texture;
  private transient boolean flipX = false;
  private transient boolean flipY = false;
  private transient boolean overrideAlpha = false;
  private transient float alpha = 1;

  public GUIImage() {
    this.color = new Color();
  }

  @MethodArgs({"texture", "x", "y", "width", "height"})
  public GUIImage(Texture texture, int x, int y, int width, int height) {
    super(0, x, y, width, height);
    this.color = new Color();
    this.texture = texture;
  }

  @MethodArgs({"color", "x", "y", "width", "height"})
  public GUIImage(Color color, int x, int y, int width, int height) {
    super(0, x, y, width, height);
    this.color = color;
  }

  @MethodArgs({"color", "texture", "x", "y", "width", "height"})
  public GUIImage(Color color, Texture texture, int x, int y, int width, int height) {
    super(0, x, y, width, height);
    this.color = color;
    this.texture = texture;
  }

  @MethodArgs({"color", "texture", "guiRect"})
  public GUIImage(Color color, Texture texture, GUIRect guiRect) {
    super(0, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
    this.color = color;
    this.texture = texture;
  }

  @MethodArgs({"color", "texture", "x", "y", "width", "height", "layer"})
  public GUIImage(Color color, Texture texture, int x, int y, int width, int height, int layer) {
    super(layer, x, y, width, height);
    this.color = color;
    this.texture = texture;
  }

  @MethodArgs({"color", "texture", "guiRect", "layer"})
  public GUIImage(Color color, Texture texture, GUIRect guiRect, int layer) {
    super(layer, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
    this.color = color;
    this.texture = texture;
  }

  @HideGetSet
  public boolean isFlipX() {
    return flipX;
  }

  @HideGetSet
  @MethodArgs({"flipX"})
  public void setFlipX(boolean flipX) {
    this.flipX = flipX;
  }

  @HideGetSet
  public boolean isFlipY() {
    return flipY;
  }

  @HideGetSet
  @MethodArgs({"flipY"})
  public void setFlipY(boolean flipY) {
    this.flipY = flipY;
  }

  @HideGetSet
  public Color getColor() {
    return color;
  }

  @HideGetSet
  @MethodArgs({"color"})
  public void setColor(Color color) {
    if (color == null) {
      throw new NullPointerException("color can't be null");
    }
    this.color = color;
  }

  @HideGetSet
  public Texture getTexture() {
    return texture;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setTexture(Texture texture) {
    this.texture = texture;
  }

  @HideGetSet
  public boolean isOverrideAlpha() {
    return overrideAlpha;
  }

  @HideGetSet
  @MethodArgs({"overrideAlpha"})
  public void setOverrideAlpha(boolean overrideAlpha) {
    this.overrideAlpha = overrideAlpha;
  }

  @HideGetSet
  public float getAlpha() {
    return alpha;
  }

  @HideGetSet
  @MethodArgs({"alpha"})
  public void setAlpha(float alpha) {
    this.alpha = alpha;
  }
}
