package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUISlideArea extends Component {

  public SUISlideArea() {

    super();
  }

  @HideGetSet
  public Axis getAxis() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"key"})
  public void setAxis(Axis axis) {}

  @HideGetSet
  public String getAxisName() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"name"})
  public void setAxisName(String name) {}

  @HideGetSet
  public boolean isPressed() {

    return false;
  }

  @HideGetSet
  public boolean isDown() {

    return false;
  }

  @HideGetSet
  public boolean isUp() {

    return false;
  }

  @HideGetSet
  public boolean isClickable() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setClickable(boolean value) {}

  @HideGetSet
  public STargetRect getTargetRectType() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTargetRectType(STargetRect value) {}

  @HideGetSet
  public SpatialObject getTargetRectObject() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setTargetRectObject(SpatialObject object) {}
}
