package JAVARuntime;

@ClassCategory(cat ={"Files"})
public class FilesPanelDirectoryMenu {
    private transient String menu;

    @MethodArgs(args ={"menu"})
    public FilesPanelDirectoryMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    @MethodArgs(args ={"menu"})
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @MethodArgs(args ={"folder"})
    public void onClick(File folder){

    }
}

