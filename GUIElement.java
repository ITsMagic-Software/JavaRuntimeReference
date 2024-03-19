package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Interface.Objects.PercentageRect;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Screen;
//>REMOVE-BRIDGE<

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
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return layer;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public GUIElement setLayer(int value){
        //<REMOVE-BRIDGE>
        layer = value;
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if(this.rotation == null){
            this.rotation = new Quaternion();
        }
        this.rotation.setX(v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"v"})
    public void setRotationY(float v){
        //<REMOVE-BRIDGE>
        if(this.rotation == null){
            this.rotation = new Quaternion();
        }
        this.rotation.setY(v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"v"})
    public void setRotationZ(float v){
        //<REMOVE-BRIDGE>
        if(this.rotation == null){
            this.rotation = new Quaternion();
        }
        this.rotation.setZ(v);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @MethodArgs(args ={"rect"})
    public float getGameViewX(PercentageRect rect){
        if(rect == null){
            return (float) x / (float) Screen.getWidth();
        }
        //
        return (float) x / (float) Screen.getWidth();
    }
    @IgnoreAutoComplete
    @MethodArgs(args ={"rect"})
    public float getGameViewY(PercentageRect rect){
        if(rect == null){
            return (float) y / (float) Screen.getHeight();
        }
        //
        return (float) y / (float) Screen.getHeight();
    }
    @IgnoreAutoComplete
    @MethodArgs(args ={"rect"})
    public float getGameViewW(PercentageRect rect){
        return (float) width / (float) Screen.getWidth();
    }
    @IgnoreAutoComplete
    @MethodArgs(args ={"rect"})
    public float getGameViewH(PercentageRect rect){
        return (float) height / (float) Screen.getHeight();
    }

    @IgnoreAutoComplete
    @MethodArgs(args ={"graphicsEngine","rect"})
    public void drawRender(PercentageRect rect){

    }
    //>REMOVE-BRIDGE<

}
