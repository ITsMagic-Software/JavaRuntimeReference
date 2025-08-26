package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIRect extends Component {

  public SUIRect() {

    super();
  }

  @HideGetSet
  public Quaternion getRotation() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRotation(Quaternion value) {}

  @HideGetSet
  public int getScreenX() {

    return 0;
  }

  @HideGetSet
  public int getScreenY() {

    return 0;
  }

  @HideGetSet
  public int getScreenW() {

    return 0;
  }

  @HideGetSet
  public int getScreenH() {

    return 0;
  }

  @HideGetSet
  public int getLayer() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLayer(int value) {}

  @MethodArgs({"entry"})
  public int getInt(String entry) {

    return 0;
  }

  @MethodArgs({"entry", "value"})
  public void setInt(String entry, int value) {}

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setWidth(int value) {
    setInt("Width", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setHeight(int value) {
    setInt("Height", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftMargin(int value) {
    setInt("LeftMargin", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopMargin(int value) {
    setInt("TopMargin", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightMargin(int value) {
    setInt("RightMargin", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomMargin(int value) {
    setInt("BottomMargin", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftPadding(int value) {
    setInt("LeftPadding", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopPadding(int value) {
    setInt("TopPadding", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightPadding(int value) {
    setInt("RightPadding", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomPadding(int value) {
    setInt("BottomPadding", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setWidthPercentage(float value) {
    setFloat("WidthPercentage", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setHeightPercentage(float value) {
    setFloat("HeightPercentage", value);
  }

  @MethodArgs({"entry"})
  public float getFloat(String entry) {

    return 0;
  }

  @MethodArgs({"entry", "value"})
  public void setFloat(String entry, float value) {}

  @MethodArgs({"entry"})
  public SUnitType getUnit(String entry) {

    return null;
  }

  @MethodArgs({"entry", "value"})
  public void setUnit(String entry, SUnitType value) {}

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setWidthUnitType(SUnitType value) {
    setUnit("widthUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setHeightUnitType(SUnitType value) {
    setUnit("heightUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftMarginUnitType(SUnitType value) {
    setUnit("leftMarginUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopMarginUnitType(SUnitType value) {
    setUnit("topMarginUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightMarginUnitType(SUnitType value) {
    setUnit("rightMarginUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomMarginUnitType(SUnitType value) {
    setUnit("bottomMarginUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftPaddingUnitType(SUnitType value) {
    setUnit("leftPaddingUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopPaddingUnitType(SUnitType value) {
    setUnit("topPaddingUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightPaddingUnitType(SUnitType value) {
    setUnit("rightPaddingUnitType", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomPaddingUnitType(SUnitType value) {
    setUnit("bottomPaddingUnitType", value);
  }

  @MethodArgs({"entry"})
  public SpatialObject getAnchorObject(String entry) {

    return null;
  }

  @MethodArgs({"entry", "value"})
  public void setAnchorObject(String entry, SpatialObject value) {}

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftAnchorObject(SpatialObject value) {
    setAnchorObject("leftAnchor", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopAnchorObject(SpatialObject value) {
    setAnchorObject("topAnchor", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightAnchorObject(SpatialObject value) {
    setAnchorObject("rightAnchor", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomAnchorObject(SpatialObject value) {
    setAnchorObject("bottomAnchor", value);
  }

  @MethodArgs({"entry"})
  public SVerticalConstraintTarget getVerticalAnchorType(String entry) {

    return null;
  }

  @MethodArgs({"entry", "value"})
  public void setVerticalAnchorType(String entry, SVerticalConstraintTarget value) {}

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setTopAnchorTarget(SVerticalConstraintTarget value) {
    setVerticalAnchorType("topAnchor", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setBottomAnchorTarget(SVerticalConstraintTarget value) {
    setVerticalAnchorType("bottomAnchor", value);
  }

  @MethodArgs({"entry"})
  public SHorizontalConstraintTarget getHorizontalAnchorType(String entry) {

    return null;
  }

  @MethodArgs({"entry", "value"})
  public void setHorizontalAnchorType(String entry, SHorizontalConstraintTarget value) {}

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setLeftAnchorTarget(SHorizontalConstraintTarget value) {
    setHorizontalAnchorType("leftAnchor", value);
  }

  @UnimplementedDoc
  @MethodArgs({"value"})
  public void setRightAnchorTarget(SHorizontalConstraintTarget value) {
    setHorizontalAnchorType("rightAnchor", value);
  }
}
