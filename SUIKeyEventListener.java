package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIKeyEventListener extends Component {

  public SUIKeyEventListener() {

    super();
  }

  @HideGetSet
  public Key getKey() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"key"})
  public void setKey(Key key) {}

  @HideGetSet
  public String getKeyName() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"name"})
  public void setKeyName(String name) {}

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
