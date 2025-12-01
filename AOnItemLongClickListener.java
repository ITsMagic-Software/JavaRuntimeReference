package JAVARuntime;

import android.view.View;
import android.widget.AdapterView;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnItemLongClickListener implements AdapterView.OnItemLongClickListener {
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        final boolean[] r = {false};
        //
        return r[0];
    }

    public abstract boolean onItemLongClickEvent(AdapterView<?> parent, View view, int position, long id);
}
