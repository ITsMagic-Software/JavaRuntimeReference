package JAVARuntime;

import android.view.KeyEvent;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnKeyListener implements View.OnKeyListener {
    public final boolean onKey(View v, int keyCode, KeyEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onKeyEvent(View v, int keyCode, KeyEvent event);
}
