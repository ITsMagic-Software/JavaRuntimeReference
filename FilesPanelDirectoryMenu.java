package JAVARuntime;

import android.view.View;

@ClassCategory(cat = {"Files"})
public class FilesPanelDirectoryMenu {
  private transient String menu;

  @MethodArgs({"menu"})
  public FilesPanelDirectoryMenu(String menu) {
    this.menu = menu;
  }

  public String getMenu() {
    return menu;
  }

  @MethodArgs({"menu"})
  public void setMenu(String menu) {
    this.menu = menu;
  }

  @MethodArgs({"folder"})
  public void onClick(File folder) {}

  @MethodArgs({"folder"})
  public void onClick(File folder, View view) {}
}
