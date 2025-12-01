package JAVARuntime;

import android.view.View;
@ClassCategory(cat ={"Android Views"})
public interface AViewInstance {
    String getViewID();
    <T extends View> T findByID(String id);
}
