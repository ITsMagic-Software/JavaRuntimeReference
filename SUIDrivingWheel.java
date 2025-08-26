package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIDrivingWheel extends Component {

  public SUIDrivingWheel() {

    super();
  }

  @HideGetSet
  public float getLerp() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLerp(float value) {}

  @HideGetSet
  public float getMaxAngle() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxAngle(float value) {}

  @HideGetSet
  public float getAngle() {

    return 0;
  }

  @HideGetSet
  public float getValue() {

    return 0;
  }

  @HideGetSet
  public String getAxisName() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setAxisName(String name) {}

  @HideGetSet
  public Axis getAxis() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setAxis(Axis axis) {}

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
