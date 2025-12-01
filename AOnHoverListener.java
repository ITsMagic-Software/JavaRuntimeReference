package JAVARuntime;

import android.view.MotionEvent;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnHoverListener implements View.OnHoverListener {
    public final boolean onHover(View v, MotionEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onHoverEvent(View v, MotionEvent event);
}
