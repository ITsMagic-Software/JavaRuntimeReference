package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Roads", "Components"})
public final class Road extends Component {

  public Road() {

    super();
  }

  public enum TextureMode {
    Vertical,
    Horizontal
  }

  @HideGetSet
  public float getResolution() {

    return 0;
  }

  @HideGetSet
  public float getRoadBorder() {

    return 0;
  }

  @HideGetSet
  public float getRoadBorderUV() {

    return 0;
  }

  @HideGetSet
  public float getRoadBorderVerticalOffset() {

    return 0;
  }

  @HideGetSet
  public float getTerrainBorder() {

    return 0;
  }

  @HideGetSet
  public TextureMode getTextureMode() {

    return null;
  }

  @HideGetSet
  public float getTextureWidth() {

    return 0;
  }

  @HideGetSet
  public float getVerticalOffset() {

    return 0;
  }

  @HideGetSet
  public float getWidth() {

    return 0;
  }

  public boolean isGenerateCollision() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setGenerateCollision(boolean value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setResolution(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setRoadBorder(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setRoadBorderUV(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setRoadBorderVerticalOffset(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setTerrainBorder(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setTextureMode(TextureMode value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setTextureWidth(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setVerticalOffset(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setWidth(float value) {}
}
