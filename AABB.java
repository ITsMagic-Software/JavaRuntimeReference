package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Vector"})
public class AABB {

    //

    public AABB() {
        //
    }
    @MethodArgs(args ={"x","y","z", "xn", "yn","zn"})
    public AABB(float x, float y, float z, float xn, float yn, float zn) {
        //
    }
    @MethodArgs(args ={"x","y","z", "xn", "yn","zn","cx","cy","cz"})
    public AABB(float x, float y, float z, float xn, float yn, float zn, float cx, float cy, float cz) {
        //
    }

    @HideGetSet
    public Vector3 getMin(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Vector3 getMax(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //
    }
    @HideGetSet
    public float getY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //
    }
    @HideGetSet
    public float getZ(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //
    }

    @HideGetSet
    public float getXN(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setXN(float value){
        //
    }
    @HideGetSet
    public float getYN(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setYN(float value){
        //
    }
    @HideGetSet
    public float getZN(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZN(float value){
        //
    }

    public float lengthMax(){
        //
       return 0;
        //

        //
    }
    public float lengthMin(){
        //
       return 0;
        //

        //
    }

    @HideGetSet
    public float getLengthMax(){
        //
       return 0;
        //

        //
    }
    @HideGetSet
    public float getLengthMin(){
        //
       return 0;
        //

        //
    }

    public float maxDistanceFromCenter(){
        //
       return 0;
        //

        //
    }

    public Vector3 getCenter(){
        //
       return null;
        //

        //
    }

    public AABB copy(){
        //
        return null;
        //

        //
    }
}
