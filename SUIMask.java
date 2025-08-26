package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIMask extends Component {

  public SUIMask() {

    super();
  }

  @HideGetSet
  public Texture getImage() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setImage(Texture texture) {}
}
