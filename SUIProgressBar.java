package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIProgressBar extends Component {
  public enum Mode {
    Horizontal,
    Vertical
  }

  public SUIProgressBar() {

    super();
  }

  @HideGetSet
  public float getValue() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setValue(float value) {}

  @HideGetSet
  public float getMaxValue() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxValue(float value) {}

  @HideGetSet
  public boolean isTextEnabled() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTextEnabled(boolean value) {}

  @HideGetSet
  public boolean isDetectUserTap() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setDetectUserTap(boolean value) {}

  @HideGetSet
  public boolean isResetValueWhenReleaseTouch() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setResetValueWhenReleaseTouch(boolean value) {}

  @HideGetSet
  public boolean isInvert() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setInvert(boolean value) {}

  @HideGetSet
  public Mode getMode() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"mode"})
  public void setMode(Mode mode) {}
}
