package JAVARuntime;

import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnFocusChangeListener implements View.OnFocusChangeListener {
    public final void onFocusChange(View v, boolean hasFocus) {
        //
    }

    public abstract void onFocusChangeEvent(View v, boolean hasFocus);
}
