package JAVARuntime;

import android.view.View;
//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Editor"})
public class ComponentInspector<T extends Component> {

    //
    public transient T myComponent;

    public ComponentInspector() {

    }

    // Run every frame in UI thread if panel is visible
    public void updateUIVisible() {

    }

    // Runs whenever the panel is attached to a HUB
    // You should inflate all the views you would like to attach to the panel within this method.
    public View onAttach() {
        return null;
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
