package JAVARuntime;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

//
@ClassCategory(cat ={"Android Views"})
public class AConstraintLayout extends ConstraintLayout implements AViewInstance {

    public AConstraintLayout() {
        //
        super(null);
        //
    }

    @Override
    public String getViewID() {
        return Editor.getIdOf(this);
    }

    @Override
    public <T extends View> T findByID(String id) {
        return Editor.findViewByID(this, id);
    }

    @Override
    public void setOnGenericMotionListener(final OnGenericMotionListener l) {
        //
    }

    @Override
    public void setOnLongClickListener(final OnLongClickListener l) {
        //
    }

    @Override
    public void setOnClickListener(final OnClickListener l) {
        //
    }

    @Override
    public void setOnTouchListener(final OnTouchListener l) {
        //
    }

    @Override
    public void setOnHoverListener(final OnHoverListener l) {
        //
    }

    @Override
    public void setOnDragListener(final OnDragListener l) {
        //
    }

    @Override
    public void setOnKeyListener(final OnKeyListener l) {
        //
    }

    @Override
    public void setOnScrollChangeListener(final OnScrollChangeListener l) {
        //
    }

    @Override
    public void setOnFocusChangeListener(final OnFocusChangeListener l) {
        //
    }

    @Override
    public void setOnCreateContextMenuListener(final OnCreateContextMenuListener l) {
        //
    }
}
