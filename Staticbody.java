package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<


@ClassCategory(cat ={"Physics"})
public final class Staticbody extends PhysicsEntity{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Staticbody instance;
    @IgnoreAutoComplete
    public Staticbody(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Staticbody physicsController) {
        super(physicsController);
        this.instance = physicsController;
        this.instance = physicsController;
    }
    @IgnoreAutoComplete
    private void getComponent(){
        if(instance == null){
            instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Staticbody) super.instance;
        }
    }
    //>REMOVE-BRIDGE<

    public Staticbody() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Staticbody());
        this.instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Staticbody) super.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.layerReference.getLayer() != null){
            return instance.layerReference.getLayer().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer != null) {
            instance.layerReference.layerGUID = layer.layer.guid;
        } else {
            instance.layerReference.layerGUID = null;
        }
        //>REMOVE-BRIDGE<
    }
}
