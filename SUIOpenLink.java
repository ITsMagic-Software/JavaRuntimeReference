package JAVARuntime;

/** @Author Daniel Oschepkov (SpeakerFish) */
@ClassCategory(cat = {"SupremeUI", "Components"})
public final class SUIOpenLink extends Component {

  public SUIOpenLink() {

    super();
  }

  @HideGetSet
  public String getURL() {

    return "";
  }

  @MethodArgs({"URL"})
  public void setURL(String URL) {}

  public void openURL() {}
}
