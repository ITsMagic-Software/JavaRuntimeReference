package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Constraint", "Components"})
public final class HingeConstraint extends Component {

  public HingeConstraint() {

    super();
  }

  @HideGetSet
  public SpatialObject getObjectA() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setObjectA(SpatialObject object) {}

  @HideGetSet
  public SpatialObject getObjectB() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setObjectB(SpatialObject object) {}

  @HideGetSet
  public SpatialObject getPointA() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setPointA(SpatialObject object) {}

  @HideGetSet
  public SpatialObject getPointB() {

    return null;
  }

  @MethodArgs({"object"})
  public void setPointB(SpatialObject object) {}
}
