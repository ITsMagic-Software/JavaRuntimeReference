package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Constraint","Components"})
public final class HingeConstraint extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.PhysicsConstraint.HingeConstraint component;
    @IgnoreAutoComplete
    public HingeConstraint(com.itsmagic.engine.Engines.Engine.ComponentsV2.PhysicsConstraint.HingeConstraint component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public HingeConstraint() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.PhysicsConstraint.HingeConstraint());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getObjectA(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getObjectA() != null) {
            return component.getObjectA().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setObjectA(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setObjectA(object.instance.get());
        } else {
            component.setObjectA(null);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SpatialObject getObjectB(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getObjectB() != null) {
            return component.getObjectB().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setObjectB(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setObjectB(object.instance.get());
        } else {
            component.setObjectB(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getPointA(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getPointA() != null) {
            return component.getPointA().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setPointA(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setPointA(object.instance.get());
        } else {
            component.setPointA(null);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SpatialObject getPointB(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getPointB() != null) {
            return component.getPointB().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public void setPointB(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setPointB(object.instance.get());
        } else {
            component.setPointB(null);
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, HingeConstraint.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
