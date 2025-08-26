package JAVARuntime;

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */
@ClassCategory(cat = {"Prototyping", "Components"})
public class VehicleAI extends Component {

  public VehicleAI() {}

  @HideGetSet
  public float getMaxSteerAngle() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"maxSteerAngle"})
  public void setMaxSteerAngle(float maxSteerAngle) {}

  @HideGetSet
  public float getMaxTorque() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"maxTorque"})
  public void setMaxTorque(float maxTorque) {}

  @HideGetSet
  public SpatialObject getTarget() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"object"})
  public void setTarget(SpatialObject object) {}
}
