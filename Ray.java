package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Laser"})
public class Ray {
    //

    public Ray() {
        //
    }
    @MethodArgs(args={"rayDirection","distance"})
    public Ray(JAVARuntime.RayDirection rayDirection, float distance) {
        //
    }
    @MethodArgs(args={"position","direction","distance"})
    public Ray(Vector3 position, Vector3 direction, float distance) {
        //
    }

    public JAVARuntime.RayDirection getRayDirection() {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"rayDirection"})
    public void setRayDirection(JAVARuntime.RayDirection rayDirection){
        //
    }

    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }

    public float getDistance() {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"distance"})
    public void setDistance(float distance){
        //
    }
}
