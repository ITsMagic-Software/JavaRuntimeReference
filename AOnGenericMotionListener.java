package JAVARuntime;

import android.view.MotionEvent;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnGenericMotionListener implements View.OnGenericMotionListener {
    public final boolean onGenericMotion(View v, MotionEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onGenericMotionEvent(View v, MotionEvent event);
}
