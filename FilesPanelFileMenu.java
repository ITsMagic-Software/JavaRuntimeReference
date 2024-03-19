package JAVARuntime;

@ClassCategory(cat ={"Files"})
public class FilesPanelFileMenu {
    private transient String menu;

    @MethodArgs(args ={"menu"})
    public FilesPanelFileMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    @MethodArgs(args ={"menu"})
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @MethodArgs(args ={"file"})
    public void onClick(File file){

    }
}

