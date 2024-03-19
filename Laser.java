package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Laser.Ray;
import com.itsmagic.engine.Engines.Engine.Laser.RayDirection;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class Laser {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Laser.Laser laser;
    @IgnoreAutoComplete
    public Laser(com.itsmagic.engine.Engines.Engine.Laser.Laser laser) {
        this.laser = laser;
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    private transient boolean showGizmo = true;
    //>REMOVE-BRIDGE<

    public Laser() {
        //<REMOVE-BRIDGE>
        this.laser = new com.itsmagic.engine.Engines.Engine.Laser.Laser();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Laser(Color color) {
        //<REMOVE-BRIDGE>
        this.laser = new com.itsmagic.engine.Engines.Engine.Laser.Laser();
        this.laser.gizmoColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return laser.gizmoColor.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        laser.gizmoColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isShowGizmo() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return isShowGizmo();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"showGizmo"})
    public void setShowGizmo(boolean showGizmo) {
        //<REMOVE-BRIDGE>
        this.showGizmo = showGizmo;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"ray"})
    public LaserHit trace(JAVARuntime.Ray ray){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = laser.traceColliders(ray.ray, !showGizmo);
        if(laserHit != null) {
            return new LaserHit(laserHit);
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","direction"})
    public LaserHit trace(Vector3 position, Vector3 direction){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = laser.traceColliders(new Ray(new RayDirection(position.instance, direction.instance), 0), !showGizmo);
        if(laserHit != null) {
            return new LaserHit(laserHit);
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","direction","distance"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = laser.traceColliders(new Ray(new RayDirection(position.instance, direction.instance), distance), !showGizmo);
        if(laserHit != null) {
            return new LaserHit(laserHit);
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","direction","distance","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Ray ray = new Ray(new RayDirection(position.instance, direction.instance), distance);
        if(layer != null){
            ray.layer = layer.layer;
        }
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = laser.traceColliders(ray, !showGizmo);
        if(laserHit != null) {
            return new LaserHit(laserHit);
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","direction","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Ray ray = new Ray(new RayDirection(position.instance, direction.instance), 0);
        if(layer != null){
            ray.layer = layer.layer;
        }
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = laser.traceColliders(ray, !showGizmo);
        if(laserHit != null) {
            return laserHit.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
