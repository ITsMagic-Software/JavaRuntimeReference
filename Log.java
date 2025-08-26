package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Debug"})
public final class Log {

  public Log() {}

  @MethodArgs({"message"})
  public Log(String message) {}

  @MethodArgs({"tittle", "message"})
  public Log(String tittle, String message) {}

  @MethodArgs({"tag", "tittle", "message"})
  public Log(String tag, String tittle, String message) {}

  @MethodArgs({"tag", "tittle", "message", "color"})
  public Log(String tag, String tittle, String message, Color color) {}

  @HideGetSet
  public String getTittle() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTittle(String value) {}

  @HideGetSet
  public String getMessage() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMessage(String value) {}

  @HideGetSet
  public String getTag() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTag(String value) {}

  @HideGetSet
  public String getLink() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLink(String value) {}

  @HideGetSet
  public int getQuantity() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setQuantity(int value) {}

  @HideGetSet
  public Color getColor() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setColor(Color value) {}
}
