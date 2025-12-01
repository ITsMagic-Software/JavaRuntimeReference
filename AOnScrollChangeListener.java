package JAVARuntime;

import android.os.Build;
import android.view.View;

//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnScrollChangeListener implements View.OnScrollChangeListener {
    public final void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        //
    }

    public abstract void onScrollChangeEvent(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY);
}
