package JAVARuntime;

//
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoPath extends GizmoElement{

    private final Object block = new Object();
    private transient Vertex vertex;
    private transient Vector3 position = new Vector3();
    private transient Quaternion rotation = new Quaternion();
    private transient Vector3 scale = new Vector3(1);
    private transient float[] matrix;
    private transient Color color;
    private transient Object userPointer = null;
    //
    private int wireFrameWidth = 0;
    //
    //

    //

    public GizmoPath() {
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

    @HideGetSet
    public Vector3 getPosition() {
        return position;
    }
    @HideGetSet
    @MethodArgs({"position"})
    public void setPosition(Vector3 position) {
        //
        this.position = position;
    }
    @MethodArgs({"x","y","z"})
    public void setPosition(float x, float y, float z) {
        this.position.set(x, y, z);
    }

    @HideGetSet
    public Quaternion getRotation() {
        return rotation;
    }
    @HideGetSet
    @MethodArgs({"rotation"})
    public void setRotation(Quaternion rotation) {
        //
        this.rotation = rotation;
    }
    @MethodArgs({"x","y","z"})
    public void setRotation(float x, float y, float z){
        //
    }
    @MethodArgs({"x","y","z","w"})
    public void setRotation(float x, float y, float z, float w){
        //
    }

    @HideGetSet
    public Vector3 getScale() {
        return scale;
    }
    @HideGetSet
    @MethodArgs({"scale"})
    public void setScale(Vector3 scale) {
        //
        this.scale = scale;
    }
    @MethodArgs({"x","y","z"})
    public void setScale(float x, float y, float z) {
        this.scale.set(x, y, z);
    }

    @Override
    @HideGetSet
    public float[] getMatrix(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"matrix"})
    public void setMatrix(float[] matrix) {
        this.matrix = matrix;
    }

    @HideGetSet
    public Object getUserPointer() {
        return userPointer;
    }
    @HideGetSet
    @MethodArgs({"userPointer"})
    public void setUserPointer(Object userPointer) {
        this.userPointer = userPointer;
    }

    public void clear() {
        //
    }
    @MethodArgs({"from","to"})
    public GizmoPath addLine(Vector3 from, Vector3 to){
        //
        return this;
    }

    //

    @MethodArgs({"path"})
    public GizmoPath addPath(List<Vector2> path){
        //
        return this;
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

    public void apply(){
        //
    }
    public void destroy() {
        //
    }

    //

    @Override
    public Vertex getVertex(){
        //
        return null;
        //

        //
    }

    @Override
    public RenderMode getRenderMode() {
        return RenderMode.WireFrame;
    }

    /*public boolean isEnableTransparency() {
        return enableTransparency;
    }
    public void setEnableTransparency(boolean enableTransparency) {
        this.enableTransparency = enableTransparency;
    }*/
}
