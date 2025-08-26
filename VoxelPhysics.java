package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Voxels", "Components"})
public final class VoxelPhysics extends Component {

  public VoxelPhysics() {

    super();
  }

  @HideGetSet
  public float getClimbSpeed() {

    return 0;
  }

  @HideGetSet
  public float getGravity() {

    return 0;
  }

  @HideGetSet
  public float getMaxClimbHeight() {

    return 0;
  }

  @HideGetSet
  public float getMaxGravitySpeed() {

    return 0;
  }

  @HideGetSet
  public Vector3 getVelocity() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setClimbSpeed(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setGravity(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxClimbHeight(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxGravitySpeed(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setVelocity(Vector3 value) {}
}
