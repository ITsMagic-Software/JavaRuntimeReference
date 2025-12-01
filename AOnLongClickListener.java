package JAVARuntime;

import android.view.View;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnLongClickListener implements View.OnLongClickListener{
    public final boolean onLongClick(View v) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onLongClickEvent(View v);
}
