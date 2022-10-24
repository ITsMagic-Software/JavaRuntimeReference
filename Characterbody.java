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

    public boolean isGlobalDirections(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"enabled"})
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

    public float getForwardSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setForwardSpeed(float value){
        //
    }
    public float getSideSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
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

    public float getHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setHeight(float value){
        //
    }
    
    public float getWidth(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setWidth(float value){
        //
    }

    public float getJumpSpeed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setJumpSpeed(float value){
        //
    }

    public float getStepHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setStepHeight(float value){
        //
    }

    public Vector3 getPhysicsVelocity(){
        //
        return null;
        //

        //
    }
    public Vector2 getHorizontalPhysicsVelocity(){
        //
        return null;
        //

        //
    }
}
