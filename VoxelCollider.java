package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Voxels", "Components"})
public final class VoxelCollider extends Component {

  public VoxelCollider() {

    super();
  }

  @HideGetSet
  public float getHorizontalSize() {

    return 0;
  }

  @HideGetSet
  public Vector3 getPositionOffset() {

    return null;
  }

  @HideGetSet
  public float getVerticalSize() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setHorizontalSize(float value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setPositionOffset(Vector3 value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setVerticalSize(float value) {}
}
