package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;

//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoElement {
    public enum RenderMode{
        Triangles, WireFrame, Both, SimpleWireFrame
    }

    private transient Object userPointer = null;
    public Object getUserPointer() { return userPointer; }
    @MethodArgs(args ={"userPointer"})
    public void setUserPointer(Object userPointer) { this.userPointer = userPointer; }

    public Vertex getVertex(){
        return null;
    }
    public Color getColor(){
        return null;
    }
    public Texture getTexture(){
        return null;
    }
    public RenderMode getRenderMode(){
        return RenderMode.Triangles;
    }
    public float[] getMatrix(){
        return null;
    }
    public int getWireFrameWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return GraphicsEngine.Utils.lineWidth;
        //>REMOVE-BRIDGE<
    }
    public boolean isEnableTransparency() {
        return false;
    }
    public boolean isScaleBasedCamera(){ return false; }
}
