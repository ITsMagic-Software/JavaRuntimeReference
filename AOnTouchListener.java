package JAVARuntime;

import android.view.MotionEvent;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnTouchListener implements View.OnTouchListener{
    public final boolean onTouch(View v, MotionEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onTouchEvent(View v, MotionEvent event);
}
