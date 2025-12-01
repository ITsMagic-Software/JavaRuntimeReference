package JAVARuntime;

import android.view.View;
import android.view.ViewGroup;
//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Editor"})
public class ViewPanel extends EditorPanel {

    //

    public ViewPanel() {

    }

    // Run every frame in UI thread doesn't matter if panel is visible or not
    public void updateUI() {

    }
    // Run every frame in UI thread if panel is visible
    public void updateUIVisible() {

    }
    // Run every frame in UI thread if panel is not visible
    public void minimizedUpdate() {

    }

    // Runs whenever the user taps to select the panel from the HUB panel list
    public void onBindView() {

    }
    // Runs whenever the user switches to another panel in the HUB
    public void onUnbindView() {

    }

    // Runs whenever the panel is attached to a HUB
    // You should inflate all the views you would like to attach to the panel within this method.
    public View onAttach() {
        return null;
    }

    // Runs whenever the panel is removed from the HUB
    // The views will be discarded, you will inflate it again when it is attached to another HUB
    public void onDetach() {

    }

    @MethodArgs({"view","id"})
    public static <T extends View> T findViewByID(View view, String id) {
        return Editor.findViewByID(view, id);
    }
    public static View toView(Object o){
        return (View) o;
    }
    @MethodArgs({"view"})
    public static String getIdOf(View v){
        return Editor.getIdOf(v);
    }
}
