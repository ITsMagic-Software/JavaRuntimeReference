package JAVARuntime;

import android.view.View;
import android.widget.AdapterView;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //
    }

    public void onNothingSelected(AdapterView<?> parent) {
        //
    }

    public abstract boolean onItemSelectedEvent(AdapterView<?> parent, View view, int position, long id);
    public abstract boolean onNothingSelectedEvent(AdapterView<?> parent);
}
