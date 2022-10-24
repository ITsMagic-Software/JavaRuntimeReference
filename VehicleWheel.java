package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","Components"})
public class VehicleWheel extends Component{
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
    @MethodArgs(args ={"type"})
    public VehicleWheel(Type type) {
        this();
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

    @HideGetSet
    public boolean getPosPhysicsFunctionEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPosPhysicsFunctionEnabled(boolean value){
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

    @HideGetSet
    public boolean isShowGizmo(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"torque"})
    public void setShowGizmo(boolean value){
        //
    }

    @MethodArgs(args ={"type"})
    public void setType(Type type){
        //
    }

    //
}
