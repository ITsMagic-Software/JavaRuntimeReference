package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public class ContextMenu {
    public static final int TYPE_SUBMENU = 336;
    public static final int TYPE_OPENWITH = 336;

    private int type = TYPE_OPENWITH;
    private String fileFormat;
    private String menu = "Open with";
    private String buttonname = "";
    private ContextListener contextListener;
    private int itemID = 0;

    public ContextMenu(String fileFormat, String buttonname) {
        this.type = TYPE_OPENWITH;
        this.fileFormat = fileFormat;
        this.buttonname = buttonname;
        this.itemID = Random.range(0, 5464654);
    }

    /*
    public ContextMenu(String fileFormat, String menu, String buttonname, ContextListener contextListener) {
        this.fileFormat = fileFormat;
        this.menu = menu;
        this.buttonname = buttonname;
        this.contextListener = contextListener;
    }*/

    @HideGetSet
    public String getFileFormat() {
        return fileFormat;
    }
    @HideGetSet
    @MethodArgs(args={"fileFormat"})
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @HideGetSet
    public String getMenu() {
        return menu;
    }
    @HideGetSet
    @MethodArgs(args={"menu"})
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @HideGetSet
    public String getButtonname() {
        return buttonname;
    }
    @HideGetSet
    @MethodArgs(args={"buttonName"})
    public void setButtonname(String buttonname) {
        this.buttonname = buttonname;
    }

    @HideGetSet
    public ContextListener getContextListener() {
        return contextListener;
    }
    @HideGetSet
    public void setContextListener(ContextListener contextListener) {
        this.contextListener = contextListener;
    }

    @HideGetSet
    public int getType() {
        return type;
    }

    @HideGetSet
    public int getItemID() {
        return itemID;
    }
}

