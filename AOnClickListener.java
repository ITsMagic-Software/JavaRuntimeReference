package JAVARuntime;

import android.view.View;
//
@ClassCategory(cat ={"Android Views"})
public abstract class AOnClickListener implements View.OnClickListener{
    public final void onClick(View v) {
        //
    }

    public abstract void onClickEvent(View v);
}
