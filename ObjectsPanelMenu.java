package JAVARuntime;

public class ObjectsPanelMenu {
  private transient String menu;

  @MethodArgs({"menu"})
  public ObjectsPanelMenu(String menu) {
    this.menu = menu;
  }

  public String getMenu() {
    return menu;
  }

  @MethodArgs({"menu"})
  public void setMenu(String menu) {
    this.menu = menu;
  }

  @MethodArgs({"object"})
  public void onClick(SpatialObject object) {}
}
