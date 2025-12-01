package JAVARuntime;

import android.view.ContextMenu;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnCreateContextMenuListener implements View.OnCreateContextMenuListener {
    public final void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //
    }

    public abstract void onCreateContextMenuEvent(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo);
}
