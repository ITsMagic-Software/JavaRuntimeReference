package JAVARuntime;

import android.content.Context;
import android.os.Build;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

//
@ClassCategory(cat ={"Android Views"})
public class AListView extends ListView implements AViewInstance {

    public AListView(Context context) {
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
    public void setOnItemClickListener(final OnItemClickListener listener) {
        //
    }

    @Override
    public void setOnItemLongClickListener(final OnItemLongClickListener listener) {
        //
    }

    @Override
    public void setOnItemSelectedListener(final OnItemSelectedListener listener) {
        //
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