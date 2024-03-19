package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Laser.RayDirection;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class Ray {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Laser.Ray ray;
    @IgnoreAutoComplete
    public Ray(com.itsmagic.engine.Engines.Engine.Laser.Ray ray) {
        this.ray = ray;
    }
    //>REMOVE-BRIDGE<

    public Ray() {
        //<REMOVE-BRIDGE>
        this.ray = new com.itsmagic.engine.Engines.Engine.Laser.Ray(new RayDirection());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"rayDirection","distance"})
    public Ray(JAVARuntime.RayDirection rayDirection, float distance) {
        //<REMOVE-BRIDGE>
        this.ray = new com.itsmagic.engine.Engines.Engine.Laser.Ray(rayDirection.rayDirection, distance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","direction","distance"})
    public Ray(Vector3 position, Vector3 direction, float distance) {
        //<REMOVE-BRIDGE>
        this.ray = new com.itsmagic.engine.Engines.Engine.Laser.Ray(new RayDirection(position.instance, direction.instance), distance);
        //>REMOVE-BRIDGE<
    }

    public JAVARuntime.RayDirection getRayDirection() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return ray.rayDirection.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"rayDirection"})
    public void setRayDirection(JAVARuntime.RayDirection rayDirection){
        //<REMOVE-BRIDGE>
        ray.rayDirection = rayDirection.rayDirection;
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
        if(ray.layer != null){
            return ray.layer.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer != null) {
            ray.layer = layer.layer;
        } else {
            ray.layer = null;
        }
        //>REMOVE-BRIDGE<
    }

    public float getDistance() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return ray.distance;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"distance"})
    public void setDistance(float distance){
        //<REMOVE-BRIDGE>
        ray.distance = distance;
        //>REMOVE-BRIDGE<
    }
}
