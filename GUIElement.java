package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public class GUIElement {

    private transient int layer, x, y, width, height;
    private transient Quaternion rotation = null;

    public GUIElement() {
    }
    @MethodArgs(args ={"layer"})
    public GUIElement(int layer) {
        this.layer = layer;
    }
    @MethodArgs(args ={"layer","x","y","width","height"})
    public GUIElement(int layer, int x, int y, int width, int height) {
        this.layer = layer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @HideGetSet
    public int getLayer(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public GUIElement setLayer(int value){
        //
        return this;
    }

    @HideGetSet
    public int getX() {
        return x;
    }
    @HideGetSet
    @MethodArgs(args ={"x"})
    public GUIElement setX(int x) {
        this.x = x;
        return this;
    }

    @HideGetSet
    public int getY() {
        return y;
    }
    @HideGetSet
    @MethodArgs(args ={"y"})
    public GUIElement setY(int y) {
        this.y = y;
        return this;
    }

    @HideGetSet
    public int getWidth() {
        return width;
    }
    @HideGetSet
    @MethodArgs(args ={"width"})
    public GUIElement setWidth(int width) {
        this.width = width;
        return this;
    }

    @HideGetSet
    public int getHeight() {
        return height;
    }
    @HideGetSet
    @MethodArgs(args ={"height"})
    public GUIElement setHeight(int height) {
        this.height = height;
        return this;
    }

    @MethodArgs(args ={"x","y","w","h"})
    public GUIElement set(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        return this;
    }

    @HideGetSet
    public Quaternion getRotation() {
        return rotation;
    }
    @HideGetSet
    @MethodArgs(args ={"rotation"})
    public GUIElement setRotation(Quaternion rotation) {
        this.rotation = rotation;
        return this;
    }

    @MethodArgs(args ={"v"})
    public void setRotationX(float v){
        //
    }
    @MethodArgs(args ={"v"})
    public void setRotationY(float v){
        //
    }
    @MethodArgs(args ={"v"})
    public void setRotationZ(float v){
        //
    }

    //

}
