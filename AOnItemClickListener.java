package JAVARuntime;

import android.view.View;
import android.widget.AdapterView;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnItemClickListener implements AdapterView.OnItemClickListener {
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //
    }

    public abstract void onItemClickEvent(AdapterView<?> parent, View view, int position, long id);
}
