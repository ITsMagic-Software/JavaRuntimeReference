package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class SkinnedModelRenderer extends Component{
    public static final int CUBE = 456;
    public static final int SPHERE = 457;
    public static final int CONE = 458;
    public static final int CYLINDER = 459;
    public static final int CIRCLE = 460;
    public static final int TORUS = 461;
    public static final int SQUARE = 462;
    public static final int SQUARE90 = 463;


    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.SkinnedModelRenderer.SkinnedModelRenderer component;
    @IgnoreAutoComplete
    public SkinnedModelRenderer(com.itsmagic.engine.Engines.Engine.ComponentsV2.SkinnedModelRenderer.SkinnedModelRenderer component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SkinnedModelRenderer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.SkinnedModelRenderer.SkinnedModelRenderer("", "", 0));
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SkinnedModelRenderer.setVertex(Vertex) instead"})
    @MethodArgs(args ={"file"})
    public void setModelFile(VertexFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.meshFile = pFile.getFilePath();
        component.meshFileFromAssets = false;
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SkinnedModelRenderer.setMaterial(Material) instead"})
    @MethodArgs(args ={"file"})
    public void setMaterialFile(MaterialFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.materialFile = pFile.getFilePath();
        //>REMOVE-BRIDGE<
    }

    public Material getMaterial(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getMaterial().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"material"})
    public void setMaterial(Material material){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setMaterial(material.material);
        //>REMOVE-BRIDGE<
    }

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
        return component.getVertex().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
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

    @MethodArgs(args ={"primitive"})
    public void attachPrimitive(int primitive){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (primitive) {
            case CUBE:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/cube.obj";
                break;
            case SPHERE:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/sphere.obj";
                break;
            case CONE:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/cone.obj";
                break;
            case CYLINDER:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/cylinder.obj";
                break;
            case CIRCLE:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/circle.obj";
                break;
            case TORUS:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/torus.obj";
                break;
            case SQUARE:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/square.obj";
                break;
            case SQUARE90:
                component.meshFile = "@@ASSET@@Engine/Primitives/Models/square90.obj";
                break;
        }
        //component.scheduledMeshFFA = true;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SkinnedModelRenderer.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
