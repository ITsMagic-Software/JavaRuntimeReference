package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.Primitives.Model;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class ModelRenderer extends Component{
    public enum BatchingChannel{
        Automatic, Dynamic, Static, Disabled
    }

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
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer component;
    @IgnoreAutoComplete
    public ModelRenderer(com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public ModelRenderer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer());
        //>REMOVE-BRIDGE<
    }
    public ModelRenderer(Vertex vertex) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer(vertex.vertex));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"file"})
    public void setModelFile(VertexFile file){
        //<REMOVE-BRIDGE>
        setVertex(Vertex.loadFile(file));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"file"})
    public void setMaterialFile(MaterialFile file){
        //<REMOVE-BRIDGE>
        setMaterial(Material.loadFile(file));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
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
        if(component.material != null) {
            return component.material.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"material"})
    public void setMaterial(Material material){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(material != null) {
            component.setMaterial(material.material);
        } else {
            component.setMaterial(null);
        }
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
        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = component.getVertex();
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
        if (vertex != null) {
            component.setModel(new Model(vertex.vertex));
        } else {
            component.setModel((Model) null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isWireframe(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.wireFrame;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"wireframe"})
    public void setWireframe(boolean wireframe){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.wireFrame = wireframe;
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
        component.overrideReload = true;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float[] getRenderMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getRenderMatrix();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setRenderMatrix(float[] renderMatrix){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setRenderMatrix(renderMatrix);
        //>REMOVE-BRIDGE<
    }
    
    @HideGetSet
    public BatchingChannel getBatchingChannel(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer.convertBatchingChannel(component.getBatchingChannel());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBatchingChannel(BatchingChannel value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setBatchingChannel(com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.ModelRenderer.convertBatchingChannel(value));
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, ModelRenderer.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
