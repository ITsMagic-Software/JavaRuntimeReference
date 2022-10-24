package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Components","Physics"})
public class Collider extends Component{
    public static final int SHAPE_BOX = 0;
    public static final int SHAPE_SPHERE = 1;
    public static final int SHAPE_CONVEX = 2;
    public static final int SHAPE_MODEL = 3;

    //

    public Collider() {
        //
        super();
        //

        //
    }
    @MethodArgs(args ={"shape"})
    public Collider(int shape) {
        //
        super();
        //

        //
    }

    public int getShape(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setShape(int value){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use Collider.setVertex(Vertex) instead"})
    @HideGetSet
    @MethodArgs(args ={"pFile"})
    public void setVertexFile(VertexFile pFile){
        //
    }

    @HideGetSet
    public Vector3 getPosition() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setPosition(Vector3 vector3){
        //
    }

    @HideGetSet
    public Quaternion getRotation() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotation(Quaternion value){
        //
    }

    @HideGetSet
    public Vector3 getScale() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setScale(Vector3 vector3){
        //
    }

    @HideGetSet
    public Vertex getVertex(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setConvexVertex(Vertex vertex){
        //
    }
    @HideGetSet
    public boolean isWaitingQueue(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public boolean isLoaded(){
        //
        return false;
        //

        //
    }

    //
}
