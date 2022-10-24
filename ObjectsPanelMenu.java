package JAVARuntime;

public class ObjectsPanelMenu {
    private String menu;

    @MethodArgs(args ={"menu"})
    public ObjectsPanelMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    @MethodArgs(args ={"menu"})
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @MethodArgs(args ={"object"})
    public void onClick(SpatialObject object){

    }
}

