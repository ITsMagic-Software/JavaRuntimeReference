package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Constraint", "Components"})
public final class PointConstraint extends Component {

  public PointConstraint() {

    super();
  }

  public SpatialObject getObjectA() {

    return null;
  }

  @MethodArgs({"object"})
  public void setObjectA(SpatialObject object) {}

  public SpatialObject getObjectB() {

    return null;
  }

  @MethodArgs({"object"})
  public void setObjectB(SpatialObject object) {}

  public SpatialObject getPointA() {

    return null;
  }

  @MethodArgs({"object"})
  public void setPointA(SpatialObject object) {}

  public SpatialObject getPointB() {

    return null;
  }

  @MethodArgs({"object"})
  public void setPointB(SpatialObject object) {}
}
