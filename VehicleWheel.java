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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setPosPhysicsFunctionEnabled(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"intensity"})
    public void setBlockRotation(float intensity){
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
    @MethodArgs(args ={"rotation"})
    public void setRotation(float r){
        //
    }
    @MethodArgs(args ={"increment"})
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

    @MethodArgs(args ={"torque"})
    public void setTorque(float torque){
        //
    }
    @MethodArgs(args ={"brake"})
    public void setBrake(float brake){
        //
    }
    @MethodArgs(args ={"steer"})
    public void setSteer(float steer){
        //
    }
    @MethodArgs(args ={"steer"})
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
    @MethodArgs(args ={"torque"})
    public void setShowGizmo(boolean value){
        //
    }

    //
}
