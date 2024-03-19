package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.ModelRenderer.Primitives.Model;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"HPOP","Components"})
public final class HPOP extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.HPOP component;
    @IgnoreAutoComplete
    public HPOP(com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.HPOP component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public HPOP() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.HPOP());
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use HPOP.setVertex(Vertex) instead"})
    @HideGetSet
    @MethodArgs(args ={"pFile"})
    public void setModelFile(VertexFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getMeshRenderer().meshFile = pFile.getFilePath();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"pFile"})
    public void setMaterialFile(MaterialFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getMeshRenderer().materialFile = pFile.getFilePath();
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
        return component.getMeshRenderer().material.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"material"})
    public void setMaterial(Material material){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getMeshRenderer().setMaterial(material.material);
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
        return component.getMeshRenderer().getVertex().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Model model = new Model();
        model.setVertex(vertex.vertex);
        component.getMeshRenderer().setModel(model);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isMaxRenderDistanceEnabled(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.enableMaxRenderDistance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxRenderDistanceEnabled(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.enableMaxRenderDistance = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxRenderDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.maxRenderDistance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxRenderDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.maxRenderDistance = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public HPOPData getHPOPData(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.hpopFile.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"hpopData"})
    public void setHPOPData(HPOPData hpopData){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.hpopFile = hpopData.hpopFile;
        //>REMOVE-BRIDGE<
    }

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
        return component.getIsLoaded().get();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, HPOP.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
