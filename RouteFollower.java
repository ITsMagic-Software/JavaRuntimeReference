package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"AI","Components"})
public final class RouteFollower extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Route.RouteFollower component;
    @IgnoreAutoComplete
    public RouteFollower(com.itsmagic.engine.Engines.Engine.ComponentsV2.Route.RouteFollower component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public RouteFollower() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Route.RouteFollower());
        //>REMOVE-BRIDGE<
    }

    public Vector3 findNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public Vector3 getNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public int findNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }
    public int getNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getFindNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getFindNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Route getRoute(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getRoute() != null) {
            return (Route) component.getRoute().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"route"})
    public void setRoute(Route object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setTarget(object.instance);
        } else {
            component.setTarget((GameObject) null);
        }
        //>REMOVE-BRIDGE<
    }

    public boolean hasPath(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isShouldWalk();
        //>REMOVE-BRIDGE<
    }
    public boolean isPathFinished(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isPathFinished();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, RouteFollower.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
