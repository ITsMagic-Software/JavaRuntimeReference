package JAVARuntime;

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat = {"Prototyping", "Components"})
public final class PhysicalButton extends Component {

  public PhysicalButton() {}

  public boolean isLocked() {

    return false;
  }

  @MethodArgs({"isLocked"})
  public void setLocked(boolean isLocked) {}

  public boolean isPressed() {

    return false;
  }

  public void press() {}
}
