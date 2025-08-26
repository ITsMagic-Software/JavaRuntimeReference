package JAVARuntime;

public class Particle {

  public Particle() {}

  @HideGetSet
  public Color getColor() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setColor(Color value) {}

  @HideGetSet
  public float getLiteTime() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLiteTime(float value) {}

  @HideGetSet
  public Vector3 getMovement() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMovement(Vector3 value) {}

  @HideGetSet
  public Vector3 getPosition() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setPosition(Vector3 value) {}

  @HideGetSet
  public float getRotation() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRotation(float value) {}

  @HideGetSet
  public float getScale() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setScale(float value) {}
}
