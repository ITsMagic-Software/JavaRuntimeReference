package JAVARuntime;

//


@ClassCategory(cat ={"Physics"})
public class Rigidbody extends PhysicsEntity {

    //

    public Rigidbody() {
        //
        super();
        //

        //
    }

    public boolean isGravityEnabled(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"enabled"})
    public void setGravityEnabled(boolean enabled){
        //
    }

    public float getMass(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setMass(float value){
        //
    }

    public float getFriction(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setFriction(float value){
        //
    }

    public float getLinearDamping(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setLinearDamping(float value){
        //
    }

    public float getAngularDamping(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setAngularDamping(float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void addForce(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void addForce(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"value"})
    public void addForceBySecond(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void addForceBySecond(float x, float y, float z){
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
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }

    @MethodArgs(args ={"value"})
    public void addVelocity(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void addVelocity(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"value"})
    public void addVelocityBySecond(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void addVelocityBySecond(float x, float y, float z){
        //
    }

    @HideGetSet
    public Vector3 getGravityMultiplier() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setGravityMultiplier(Vector3 vector){
        //
    }

    public Vector3 getVelocity() {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setVelocity(Vector3 vector){
        //
    }
}
