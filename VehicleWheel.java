package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","Components"})
public final class VehicleWheel extends Component{
    public enum Type{
        ContactPoint, Model
    }

    //

    public VehicleWheel() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getRadius(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setRadius(float value){
        //
    }

    @HideGetSet
    public float getSkidding(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSuspensionRestLength(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setSuspensionRestLength(float value){
        //
    }

    @HideGetSet
    public float getFrictionSlip(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setFrictionSlip(float value){
        //
    }

    @Deprecated
    @HideGetSet
    public boolean getPosPhysicsFunctionEnabled(){
        //
        return false;
        //

        //
    }
    @Deprecated
    @HideGetSet
    @MethodArgs({"value"})
    public void setPosPhysicsFunctionEnabled(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"intensity"})
    public void setBlockRotation(float intensity){
        //
    }

    @Deprecated
    public boolean isGrounded(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public float getRotation(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"rotation"})
    public void setRotation(float r){
        //
    }
    @MethodArgs({"increment"})
    public void incrementRotation(float r){
        //
    }

    @HideGetSet
    public Vector3 getModelPosition() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Quaternion getModelRotation() {
        //
        return null;
        //

        //
    }

    @MethodArgs({"torque"})
    public void setTorque(float torque){
        //
    }
    @MethodArgs({"brake"})
    public void setBrake(float brake){
        //
    }
    @MethodArgs({"steer"})
    public void setSteer(float steer){
        //
    }
    @MethodArgs({"steer"})
    public void setSteerRelativeVelocity(float steer){
        //
    }

    @Deprecated
    @HideGetSet
    public boolean isShowGizmo(){
        //
        return false;
        //

        //
    }
    @Deprecated
    @HideGetSet
    @MethodArgs({"torque"})
    public void setShowGizmo(boolean value){
        //
    }

    //
}
