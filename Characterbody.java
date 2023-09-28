package JAVARuntime;

//

@ClassCategory(cat ={"Physics"})
public class Characterbody extends PhysicsEntity{

    //

    public Characterbody() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public boolean isGravityEnabled(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"enabled"})
    @HideGetSet
    public void setGravityEnabled(boolean enabled){
        //
    }

    @HideGetSet
    public boolean isGlobalDirections(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"enabled"})
    @HideGetSet
    public void setGlobalDirections(boolean enabled){
        //
    }

    public boolean isGrounded(){
        //
        return false;
        //

        //
    }
    public boolean onGround(){
        //
        return false;
        //

        //
    }
    public boolean canJump(){
        //
        return false;
        //

        //
    }
    public void jump(){
        //
    }
    
    @MethodArgs(args ={"x","z"})
    public void setSpeed(float x, float z){
        //
    }

    @HideGetSet
    public float getForwardSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setForwardSpeed(float value){
        //
    }
    @HideGetSet
    public float getSideSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setSideSpeed(float value){
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

    public void zeroSpeed(){
        //
    }

    @HideGetSet
    public float getHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setHeight(float value){
        //
    }

    @HideGetSet
    public float getWidth(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setWidth(float value){
        //
    }

    @HideGetSet
    public float getJumpSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setJumpSpeed(float value){
        //
    }

    @HideGetSet
    public float getStepHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setStepHeight(float value){
        //
    }

    @HideGetSet
    public Vector3 getPhysicsVelocity(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Vector2 getHorizontalPhysicsVelocity(){
        //
        return null;
        //

        //
    }
}
