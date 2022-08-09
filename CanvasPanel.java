package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat={"Editor"})
public class CanvasPanel extends EditorPanel {
    public enum DrawMode{ CopyPixels, DirectDraw }
    public static class DrawParams{
        public Texture texture;
        public DrawMode drawMode;
    }

    //

    public CanvasPanel(String tittle) {
        //
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

    public void posUpdate() {

    }

    public void onResize(int width, int height) {

    }

    public void requestDraw(DrawParams draw) {

    }
}
