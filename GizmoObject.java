package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;

//>REMOVE-BRIDGE<


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
    private transient Object userPointer = null;
    private transient boolean enableTransparency = false;
    private transient boolean scaleBasedCamera;

    //<REMOVE-BRIDGE>
    /*
    //>REMOVE-BRIDGE<
    private int wireFrameWidth = 0;
    //<REMOVE-BRIDGE>
    */
    //>REMOVE-BRIDGE<
    //<REMOVE-BRIDGE>
    private transient int wireFrameWidth = GraphicsEngine.Utils.lineWidth;
    //>REMOVE-BRIDGE<

    public GizmoObject() {
    }
    @MethodArgs(args ={"vertex"})
    public GizmoObject(Vertex vertex) {
        setVertex(vertex);
    }
    @MethodArgs(args ={"vertex","position"})
    public GizmoObject(Vertex vertex, Vector3 position) {
        super(position);
        setVertex(vertex);
    }
    @MethodArgs(args ={"vertex","position","rotation"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation) {
        super(position, rotation);
        setVertex(vertex);
    }
    @MethodArgs(args ={"vertex","position","rotation","scale"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale) {
        super(position, rotation, scale);
        setVertex(vertex);
    }
    @Deprecated
    @MethodArgs(args ={"vertex","position","rotation","scale","wireframe"})
    public GizmoObject(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireFrame) {
        super(position, rotation, scale);
        setVertex(vertex);
        if(wireFrame) {
            this.renderMode = RenderMode.WireFrame;
        }
    }
    @Deprecated
    @MethodArgs(args ={"vertex","position","rotation","scale","wireframe","color","texture"})
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
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex) {
        //<REMOVE-BRIDGE>
        if(this.vertex != null && this.vertex == vertex){
            return;
        }
        if(this.vertex != null){
            this.vertex.vertex.removeLink(this);
        }
        this.vertex = vertex;
        if(this.vertex != null){
            this.vertex.vertex.addLink(this);
        }
        //>REMOVE-BRIDGE<
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

    @HideGetSet
    public Object getUserPointer() {
        return userPointer;
    }
    @HideGetSet
    @MethodArgs(args ={"userPointer"})
    public void setUserPointer(Object userPointer) {
        this.userPointer = userPointer;
    }

    @HideGetSet
    @Override
    public boolean isEnableTransparency() {
        return enableTransparency;
    }
    @HideGetSet
    @MethodArgs(args ={"enableTransparency"})
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
