package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"AI", "Components"})
public final class EnemyAITypeA extends Component {

  public EnemyAITypeA() {

    super();
  }

  public enum MovementMode {
    Transform,
    RigidBody,
    CharacterBody
  }

  public enum State {
    Idle,
    Walking,
    Attacking
  }

  @HideGetSet
  public TagEnemyFieldOfView getFieldOfView() {

    return null;
  }

  @HideGetSet
  public SpatialObject getPoints() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setPoints(SpatialObject value) {}

  @HideGetSet
  public float getRayDistance() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRayDistance(float value) {}

  @HideGetSet
  public float getRayOffset() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRayOffset(float value) {}

  @HideGetSet
  public float getRunSpeed() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRunSpeed(float value) {}

  @HideGetSet
  public float getStickBottomOffset() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStickBottomOffset(float value) {}

  @HideGetSet
  public float getSwapTargetDistance() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSwapTargetDistance(float value) {}

  @HideGetSet
  public float getWalkSpeed() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setWalkSpeed(float value) {}

  public boolean isStickBottom() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStickBottom(boolean value) {}

  @HideGetSet
  public float getStartAttackDistance() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStartAttackDistance(float value) {}

  @HideGetSet
  public float getAttackDelay() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setAttackDelay(float value) {}

  @HideGetSet
  public float getSwapTargetDelay() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSwapTargetDelay(float value) {}

  @HideGetSet
  public State getState() {

    return null;
  }
}
