package JAVARuntime;

import android.os.Build;
import android.view.*;
//
@ClassCategory(cat ={"Android Views"})
public class AImageView extends android.widget.ImageView implements AViewInstance {

    public static void setImageFile(android.widget.ImageView imageView, File file) {
        if(file == null) throw new NullPointerException("file can`t be null");
        if(imageView == null) throw new NullPointerException("imageView can`t be null");
        if(!file.exists()) throw new RuntimeException("FileNotFoundException");

        //
    }

    public AImageView() {
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

    public void setImageFile(File file) {
        if(file == null) throw new NullPointerException();
        if(!file.exists()) throw new RuntimeException("FileNotFoundException");

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
