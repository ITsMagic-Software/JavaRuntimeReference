package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class LaserHit {
    //

    public LaserHit() {
        //
    }

    @HideGetSet
    public SpatialObject getObject() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setObject(SpatialObject object){
        //
    }

    @HideGetSet
    public Vector3 getPoint() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"point"})
    public void setPoint(Vector3 point){
        //
    }

    @HideGetSet
    public Vector3 getNormal() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setNormal(Vector3 normal){
        //
    }

    @HideGetSet
    public Vector3 getFaceNormal() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setFaceNormal(Vector3 normal){
        //
    }

    @HideGetSet
    public Vector3 getFaceNormalLocal() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    public void setFaceNormalLocal(Vector3 normal){
        //
    }

    @HideGetSet
    public float getDistance() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"distance"})
    public void setDistance(float distance){
        //
    }

    @HideGetSet
    @UnimplementedDoc
    public Vector2 getUVCoord() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"normal"})
    @UnimplementedDoc
    public void setUVCoord(Vector2 normal){
        //
    }

    @HideGetSet
    @UnimplementedDoc
    public SpatialObject getColliderObject() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"object"})
    public void setColliderObject(SpatialObject object){
        //
    }

    @HideGetSet
    @UnimplementedDoc
    public Collider getCollider() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"collider"})
    public void setCollider(Collider collider){
        //
    }
}
