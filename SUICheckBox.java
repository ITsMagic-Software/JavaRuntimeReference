package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUICheckBox extends Component {

  public SUICheckBox() {

    super();
  }

  @HideGetSet
  public boolean isChecked() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setPressed(boolean value) {}

  @HideGetSet
  public Color getUncheckedColor() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"color"})
  public void setUncheckedColor(Color color) {}

  @HideGetSet
  public Texture getUncheckedImage() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setUncheckedImage(Texture texture) {}

  @HideGetSet
  public boolean isUncheckedIgnoreMask() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setUncheckedIgnoreMask(boolean value) {}

  @HideGetSet
  public int getUncheckedBorder() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setUncheckedBorder(int value) {}

  @HideGetSet
  public SUnitType getUncheckedBorderUnitType() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setUncheckedBorderUnitType(SUnitType value) {}

  @MethodArgs({"value", "unitType"})
  public void setUncheckedBorder(int value, SUnitType unitType) {}

  @HideGetSet
  public SImageType getUncheckedImageType() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setUncheckedImageType(SImageType sImageType) {}

  @HideGetSet
  public Color getCheckedColor() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"color"})
  public void setCheckedColor(Color color) {}

  @HideGetSet
  public Texture getCheckedImage() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setCheckedImage(Texture texture) {}

  @HideGetSet
  public boolean isCheckedIgnoreMask() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setCheckedIgnoreMask(boolean value) {}

  @HideGetSet
  public int getCheckedBorder() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setCheckedBorder(int value) {}

  @HideGetSet
  public SUnitType getCheckedBorderUnitType() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setCheckedBorderUnitType(SUnitType value) {}

  @MethodArgs({"value", "unitType"})
  public void setCheckedBorder(int value, SUnitType unitType) {}

  @HideGetSet
  public SImageType getCheckedImageType() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setCheckedImageType(SImageType sImageType) {}

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
