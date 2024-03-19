package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class LaserHit {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit;
    @IgnoreAutoComplete
    public LaserHit(com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit) {
        this.laserHit = laserHit;
        this.laserHit.setRun(this);
    }
    //>REMOVE-BRIDGE<

    public LaserHit() {
        //<REMOVE-BRIDGE>
        this.laserHit = new com.itsmagic.engine.Engines.Engine.Laser.LaserHit();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getObject() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return laserHit.gameObject.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setObject(SpatialObject object){
        //<REMOVE-BRIDGE>
        if(object != null) {
            object.validateNTC();
            laserHit.gameObject = object.instance.get();
        } else {
            laserHit.gameObject = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPoint() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.point == null) return null;
        return laserHit.point.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"point"})
    public void setPoint(Vector3 point){
        //<REMOVE-BRIDGE>
        if(point != null) {
            laserHit.point = point.instance;
        } else {
            laserHit.point = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getNormal() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.laserNormal == null) return null;
        return laserHit.laserNormal.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setNormal(Vector3 normal){
        //<REMOVE-BRIDGE>
        if(normal != null) {
            laserHit.laserNormal = normal.instance;
        } else {
            laserHit.laserNormal = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getFaceNormal() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.faceNormal == null) return null;
        return laserHit.faceNormal.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setFaceNormal(Vector3 normal){
        //<REMOVE-BRIDGE>
        if(normal != null) {
            laserHit.faceNormal = normal.instance;
        } else {
            laserHit.faceNormal = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getFaceNormalLocal() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.faceNormalLocal == null) return null;
        return laserHit.faceNormalLocal.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setFaceNormalLocal(Vector3 normal){
        //<REMOVE-BRIDGE>
        if(normal != null) {
            laserHit.faceNormalLocal = normal.instance;
        } else {
            laserHit.faceNormalLocal = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDistance() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return laserHit.distance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"distance"})
    public void setDistance(float distance){
        //<REMOVE-BRIDGE>
        laserHit.distance = distance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @UnimplementedDoc
    public Vector2 getUVCoord() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.uvCoord == null) return null;
        return laserHit.uvCoord.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    @UnimplementedDoc
    public void setUVCoord(Vector2 normal){
        //<REMOVE-BRIDGE>
        if(normal != null) {
            laserHit.uvCoord = normal.instance;
        } else {
            laserHit.uvCoord = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @UnimplementedDoc
    public SpatialObject getColliderObject() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.colliderObject == null)
            return null;
        return laserHit.colliderObject.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"object"})
    public void setColliderObject(SpatialObject object){
        //<REMOVE-BRIDGE>
        if(object != null) {
            object.validateNTC();
            laserHit.colliderObject = object.instance.get();
        } else {
            laserHit.colliderObject = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @UnimplementedDoc
    public Collider getCollider() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(laserHit.collider == null)
            return null;
        return (Collider) laserHit.collider.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"collider"})
    public void setCollider(Collider collider){
        //<REMOVE-BRIDGE>
        if(collider != null) {
            laserHit.collider = collider.component;
        } else {
            laserHit.collider = null;
        }
        //>REMOVE-BRIDGE<
    }
}
