package JAVARuntime;

import android.view.View;

@ClassCategory(cat ={"Files"})
public class FilesPanelFileMenu {
    private transient String menu;

    @MethodArgs({"menu"})
    public FilesPanelFileMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    @MethodArgs({"menu"})
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @MethodArgs({"file"})
    public void onClick(File file){

    }

    @MethodArgs({"file"})
    public void onClick(File file, View view){

    }

    public boolean filterFormat(String format){
        return true;
    }
}