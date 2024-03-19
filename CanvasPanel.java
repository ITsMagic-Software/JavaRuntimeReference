package JAVARuntime;

//<REMOVE-BRIDGE>
//
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Editor"})
public class CanvasPanel extends EditorPanel {
    public enum DrawMode{ CopyPixels, DirectDraw }
    public static class DrawParams{
        public transient Texture texture;
        public transient DrawMode drawMode;
    }

    //<REMOVE-BRIDGE>
    //
    //>REMOVE-BRIDGE<

    public CanvasPanel(String tittle) {
        //<REMOVE-BRIDGE>
        //
        //>REMOVE-BRIDGE<
    }

    public void start() {

    }

    public void preUpdate() {

    }

    public void parallelStart() {

    }

    public void parallelUpdate() {

    }

    public void update() {

    }

    public void onResize(int width, int height) {

    }

    public void requestDraw(DrawParams draw) {

    }
}
