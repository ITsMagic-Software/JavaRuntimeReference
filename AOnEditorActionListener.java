package JAVARuntime;

import android.view.KeyEvent;
import android.widget.TextView;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnEditorActionListener implements TextView.OnEditorActionListener {
    public final boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onEditorActionEvent(TextView v, int actionId, KeyEvent event);
}
