package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoTransform extends GizmoElement{

    private Vector3 position = new Vector3();
    private Quaternion rotation = new Quaternion();
    private Vector3 scale = new Vector3(1);
    private float[] matrix;

    //

    public GizmoTransform() { }
    @MethodArgs(args ={"vertex"})
    public GizmoTransform(Vector3 position) {
        this.position = position;
    }
    @MethodArgs(args ={"vertex","rotation"})
    public GizmoTransform(Vector3 position, Quaternion rotation) {
        this.position = position;
        this.rotation = rotation;
    }
    @MethodArgs(args ={"vertex","rotation","scale"})
    public GizmoTransform(Vector3 position, Quaternion rotation, Vector3 scale) {
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    @HideGetSet
    public Vector3 getPosition() {
        return position;
    }
    @HideGetSet
    @MethodArgs(args ={"position"})
    public void setPosition(Vector3 position) {
        //
        this.position = position;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z) {
        this.position.set(x, y, z);
    }
    @MethodArgs(args ={"a"})
    public void setPosition(float a){
        this.position.set(a);
    }

    @HideGetSet
    public Quaternion getRotation() {
        return rotation;
    }
    @HideGetSet
    @MethodArgs(args ={"rotation"})
    public void setRotation(Quaternion rotation) {
        //
        this.rotation = rotation;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z","w"})
    public void setRotation(float x, float y, float z, float w){
        //
    }

    @HideGetSet
    public Vector3 getScale() {
        return scale;
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(Vector3 scale) {
        //
        this.scale = scale;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z) {
        this.scale.set(x, y, z);
    }
    @MethodArgs(args ={"a"})
    public void setScale(float a){
        this.scale.set(a);
    }


    @Override
    @HideGetSet
    public float[] getMatrix(){
        //
        return null;
        //

        //
    }

    //

    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setMatrix(float[] matrix) {
        this.matrix = matrix;
    }
}
