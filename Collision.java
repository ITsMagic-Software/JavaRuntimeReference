package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public class Collision {
    //

    public Collision() {
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
    @MethodArgs(args ={"vector"})
    public void setNormal(Vector3 vector){
        //
    }

    @HideGetSet
    public Vector3 getContactPoint() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setContactPoint(Vector3 vector){
        //
    }

    @HideGetSet
    public SpatialObject getOtherObject() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setOtherObject(SpatialObject otherObject){
        //
    }

    @HideGetSet
    public float getImpulse() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImpulse(float value){
        //
    }

}
