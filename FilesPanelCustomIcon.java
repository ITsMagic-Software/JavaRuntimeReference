package JAVARuntime;

@ClassCategory(cat ={"Files"})
public class FilesPanelCustomIcon {

    public FilesPanelCustomIcon() { }

    @MethodArgs(args ={"file"})
    public File getIconForFile(File file){
        return null;
    }
    @MethodArgs(args ={"file"})
    public boolean supportFile(File file) {
        return false;
    }
}