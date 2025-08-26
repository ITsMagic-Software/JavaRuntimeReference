package JAVARuntime;

import java.util.LinkedList;
import java.util.List;
/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"AI", "Components"})
public final class PathFinder extends Component {
  public enum LookTo {
    Disabled,
    Path,
    Target
  }

  public PathFinder() {

    super();
  }

  @HideGetSet
  public SpatialObject getTarget() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setTarget(SpatialObject object) {}

  @HideGetSet
  public float getSearchDelay() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSearchDelay(float value) {}

  public float getTargetDistance() {

    return 0;
  }

  public float getTargetDistanceInPath() {

    return 0;
  }

  public boolean hasPath() {

    return false;
  }

  public boolean hasTarget() {

    return false;
  }
}
