package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUICircularMask extends Component {

  public SUICircularMask() {

    super();
  }

  @HideGetSet
  public float getRotation() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRotation(float value) {}

  @HideGetSet
  public float getLength() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLength(float value) {}

  @HideGetSet
  public float getSmooth() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSmooth(float value) {}

  @HideGetSet
  public Texture getImage() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setImage(Texture texture) {}
}
