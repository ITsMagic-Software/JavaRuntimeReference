package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class RayDirection {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Laser.RayDirection rayDirection;
    @IgnoreAutoComplete
    public RayDirection(com.itsmagic.engine.Engines.Engine.Laser.RayDirection rayDirection) {
        this.rayDirection = rayDirection;
    }
    //>REMOVE-BRIDGE<

    public RayDirection() {
        //<REMOVE-BRIDGE>
        this.rayDirection = new com.itsmagic.engine.Engines.Engine.Laser.RayDirection();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"origin","direction"})
    public RayDirection(Vector3 origin, Vector3 direction) {
        //<REMOVE-BRIDGE>
        this.rayDirection = new com.itsmagic.engine.Engines.Engine.Laser.RayDirection(origin.instance, direction.instance);
        //>REMOVE-BRIDGE<
    }

    public Vector3 getOrigin() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return rayDirection.origin.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector"})
    public void setOrigin(Vector3 vector){
        //<REMOVE-BRIDGE>
        rayDirection.origin = vector.instance;
        //>REMOVE-BRIDGE<
    }

    public Vector3 getDirection() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return rayDirection.dir.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector"})
    public void setDirection(Vector3 vector){
        //<REMOVE-BRIDGE>
        rayDirection.dir = vector.instance;
        //>REMOVE-BRIDGE<
    }
}
