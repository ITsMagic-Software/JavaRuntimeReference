package JAVARuntime;

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat = {"Prototyping", "Components"})
public final class BlinkLight extends Component {

  public BlinkLight() {}

  @HideGetSet
  public String getPattern() {

    return "";
  }

  @HideGetSet
  @MethodArgs({"pattern"})
  public void setPattern(String pattern) {}

  @HideGetSet
  @MethodArgs({"pattern"})
  public void setPattern(OHString pattern) {}

  @HideGetSet
  public float getFrequency() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"frequency"})
  public void setFrequency(float frequency) {}

  @HideGetSet
  public float getOffIntensity() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setOffIntensity(float value) {}

  @HideGetSet
  public float getOnIntensity() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setOnIntensity(float value) {}

  @HideGetSet
  public float getLerpSpeed() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLerpSpeed(float value) {}

  @HideGetSet
  public boolean isReverse() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setReverse(boolean value) {}
}
