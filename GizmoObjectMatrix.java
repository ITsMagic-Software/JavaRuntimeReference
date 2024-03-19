package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class GizmoObjectMatrix extends GizmoMatrix {

    private transient Vertex vertex;

    private transient Color color = new Color();
    private transient Texture texture;
    private transient boolean dualFaceRender = false;
    private transient RenderMode renderMode = RenderMode.Triangles;
    private transient Object userPointer = null;
    private transient boolean enableTransparency = false;
    //
    private int wireFrameWidth = 0;
    //
    //

    public GizmoObjectMatrix() {
    }
    @MethodArgs(args ={"vertex"})
    public GizmoObjectMatrix(Vertex vertex) {
        setVertex(vertex);
    }

    @Override
    @HideGetSet
    public Vertex getVertex() {
        return vertex;
    }
    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex) {
        //
    }

    @Override
    @HideGetSet
    public int getWireFrameWidth() {
        return wireFrameWidth;
    }
    @HideGetSet
    @MethodArgs(args ={"wireFrameWidth"})
    public void setWireFrameWidth(int wireFrameWidth) {
        this.wireFrameWidth = wireFrameWidth;
    }

    @Deprecated
    @HideGetSet
    public boolean isWireFrame() {
        return this.renderMode == RenderMode.WireFrame;
    }
    @Deprecated
    @HideGetSet
    @MethodArgs(args ={"wireFrame"})
    public void setWireFrame(boolean wireFrame) {
        if(wireFrame){
            this.renderMode = RenderMode.WireFrame;
        } else {
            this.renderMode = RenderMode.Triangles;
        }
    }

    @Override
    @HideGetSet
    public Color getColor() {
        return color;
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    @HideGetSet
    public Texture getTexture() {
        return texture;
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    @HideGetSet
    public boolean isDualFaceRender() {
        return dualFaceRender;
    }
    @HideGetSet
    @MethodArgs(args ={"dualFaceRender"})
    public void setDualFaceRender(boolean dualFaceRender) {
        this.dualFaceRender = dualFaceRender;
    }

    @Override
    @HideGetSet
    public RenderMode getRenderMode() {
        return renderMode;
    }
    @HideGetSet
    @MethodArgs(args ={"renderMode"})
    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public Object getUserPointer() {
        return userPointer;
    }
    @MethodArgs(args ={"userPointer"})
    public void setUserPointer(Object userPointer) {
        this.userPointer = userPointer;
    }

    /*public boolean isEnableTransparency() {
        return enableTransparency;
    }
    public void setEnableTransparency(boolean enableTransparency) {
        this.enableTransparency = enableTransparency;
    }*/
}
