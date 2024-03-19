package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","Components"})
public final class Collider extends Component{
    public static final int SHAPE_BOX = 0;
    public static final int SHAPE_SPHERE = 1;
    public static final int SHAPE_CONVEX = 2;
    public static final int SHAPE_MODEL = 3;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider component;
    @IgnoreAutoComplete
    @MethodArgs(args ={"component"})
    public Collider(com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Collider() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider(SHAPE_BOX));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"shape"})
    public Collider(int shape) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider(shape));
        this.component = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider) super.component;
        //>REMOVE-BRIDGE<
    }

    public int getShape(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.shape == com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.BoxCollider){
            return SHAPE_BOX;
        }
        else if(component.shape == com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.SphereCollider){
            return SHAPE_SPHERE;
        }
        else if(component.shape == com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.ConvexModel){
            return SHAPE_CONVEX;
        }
        else if(component.shape == com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.Model){
            return SHAPE_MODEL;
        }
        return -1;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setShape(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == SHAPE_BOX) {
            component.shape = com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.BoxCollider;
        } else if(value == SHAPE_SPHERE) {
            component.shape = com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.SphereCollider;
        } else if(value == SHAPE_CONVEX) {
            component.shape = com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.ConvexModel;
        } else if(value == SHAPE_MODEL) {
            component.shape = com.itsmagic.engine.Engines.Engine.ComponentsV2.Collider.Collider.Type.Model;
        }
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use Collider.setVertex(Vertex) instead"})
    @HideGetSet
    @MethodArgs(args ={"pFile"})
    public void setVertexFile(VertexFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.modelFile = pFile.getFilePath();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.offsetPosition.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setPosition(Vector3 vector3){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.offsetPosition = vector3.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Quaternion getRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.offsetRotation.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotation(Quaternion value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.offsetRotation = value.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.scale.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setScale(Vector3 vector3){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.scale = vector3.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vertex getVertex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = component.getCollisionVertex();
        if(vertex != null) {
            return vertex.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vertex != null) {
            component.setVertex(vertex.vertex);
        } else {
            component.setVertex(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setConvexVertex(Vertex vertex){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vertex != null) {
            component.setConvexVertex(vertex.vertex);
        } else {
            component.setConvexVertex(null);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isWaitingQueue(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getColliderWaitingInQueue().get();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLoaded(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getCollidersLoaded().get();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    @MethodArgs(args ={"componentA","componentB"})
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, Collider.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
