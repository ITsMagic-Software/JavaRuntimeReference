package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Debug"})
public class GizmoElement {
    public enum RenderMode{
        Triangles, WireFrame, Both, SimpleWireFrame
    }

    private Object userPointer = null;
    public Object getUserPointer() { return userPointer; }
    @MethodArgs(args={"userPointer"})
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
        //
        return 0;
        //

        //
    }
    public boolean isEnableTransparency() {
        return false;
    }
}
