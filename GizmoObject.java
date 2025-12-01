package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoObject extends GizmoTransform {

    private transient Vertex vertex;
    private transient Color color = new Color();
    private transient Texture texture;
    private transient boolean dualFaceRender = false;
    private transient RenderMode renderMode = RenderMode.Triangles;
    private transient boolean enableTransparency = false;
    private transient boolean scaleBasedCamera;

    //
    private int wireFrameWidth = 0;
    //
    //

    public GizmoObject() {
    }
    @MethodArgs({"vertex"})
    public GizmoObject(Vertex vertex) {
        setVertex(vertex);
    }
    @MethodArgs({"vertex","position"})
    public GizmoObject(Vertex vertex, Vector3 position) {
        super(position);
        setVertex(vertex);
    }
    @MethodArgs({"vertex","position","rotation"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation) {
        super(position, rotation);
        setVertex(vertex);
    }
    @MethodArgs({"vertex","position","rotation","scale"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale) {
        super(position, rotation, scale);
        setVertex(vertex);
    }
    @Deprecated
    @MethodArgs({"vertex","position","rotation","scale","wireframe"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireFrame) {
        super(position, rotation, scale);
        setVertex(vertex);
        if(wireFrame) {
            this.renderMode = RenderMode.WireFrame;
        }
    }
    @Deprecated
    @MethodArgs({"vertex","position","rotation","scale","wireframe","color","texture"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireFrame, Color color, Texture texture) {
        super(position, rotation, scale);
        setVertex(vertex);
        this.color = color;
        this.texture = texture;
        if(wireFrame) {
            this.renderMode = RenderMode.WireFrame;
        }
    }

    @Override
    @HideGetSet
    public Vertex getVertex() {
        return vertex;
    }
    @HideGetSet
    @MethodArgs({"vertex"})
    public void setVertex(Vertex vertex) {
        //
    }

    @Override
    @HideGetSet
    public int getWireFrameWidth() {
        return wireFrameWidth;
    }
    @HideGetSet
    @MethodArgs({"wireFrameWidth"})
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
    @MethodArgs({"wireFrame"})
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
    @MethodArgs({"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    @HideGetSet
    public Texture getTexture() {
        return texture;
    }
    @HideGetSet
    @MethodArgs({"texture"})
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    @HideGetSet
    @Override
    public boolean isDualFaceRender() {
        return dualFaceRender;
    }
    @HideGetSet
    @MethodArgs({"dualFaceRender"})
    public void setDualFaceRender(boolean dualFaceRender) {
        this.dualFaceRender = dualFaceRender;
    }

    @Override
    @HideGetSet
    public RenderMode getRenderMode() {
        return renderMode;
    }
    @HideGetSet
    @MethodArgs({"renderMode"})
    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    @HideGetSet
    @Override
    public boolean isEnableTransparency() {
        return enableTransparency;
    }
    @HideGetSet
    @MethodArgs({"enableTransparency"})
    public void setEnableTransparency(boolean enableTransparency) {
        this.enableTransparency = enableTransparency;
    }

    @HideGetSet
    @Override
    public boolean isScaleBasedCamera() {
        return scaleBasedCamera;
    }
    @HideGetSet
    public void setScaleBasedCamera(boolean scaleBasedCamera) {
        this.scaleBasedCamera = scaleBasedCamera;
    }

    public void randomizeColor() {
        this.color = new Color(Random.range(0f, 1f), Random.range(0f, 1f), Random.range(0f, 1f));
    }
}
