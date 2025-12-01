package JAVARuntime;

import android.widget.ImageView;

@ClassCategory(cat ={"Files"})
public class FilesPanelCustomIcon {

    public FilesPanelCustomIcon() { }

    @MethodArgs({"file"})
    public File getIconForFile(File file){
        return null;
    }

    @MethodArgs({"file", "imageViw"})
    public boolean applyIcon(File file, ImageView imageView){
        return false;
    }

    @MethodArgs({"file"})
    public boolean supportFile(File file) {
        return false;
    }
}