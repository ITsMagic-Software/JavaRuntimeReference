package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) MethodArgs filled by Carlos at 22-04-2022 */
@ClassCategory(cat = {"SoundEffects"})
public class BassBoostEffect extends AudioEffect {

  public BassBoostEffect() {

    super(null);
  }

  @HideGetSet
  public float getStrength() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStrength(float value) {}
}
