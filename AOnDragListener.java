package JAVARuntime;

import android.view.DragEvent;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnDragListener implements View.OnDragListener {
    public final boolean onDrag(View v, DragEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onDragEvent(View v, DragEvent event);
}
