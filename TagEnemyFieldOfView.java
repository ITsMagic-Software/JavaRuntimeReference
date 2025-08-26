package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Prototyping"})
public final class TagEnemyFieldOfView {

  public TagEnemyFieldOfView() {

    super();
  }

  @HideGetSet
  public float getFov() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setFov(float value) {}

  @HideGetSet
  public float getMaxDistance() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxDistance(float value) {}

  @HideGetSet
  public float getMinDistance() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMinDistance(float value) {}

  @HideGetSet
  public String getTargetTag() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTargetsTag(String value) {}

  @HideGetSet
  public boolean isActive() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setActive(boolean value) {}
}
