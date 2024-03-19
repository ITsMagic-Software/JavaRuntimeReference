package JAVARuntime;

//
import java.util.ArrayList;

@ClassCategory(cat ={"Physics"})
public final class VehiclePhysics{

    //

    public VehiclePhysics() {
        //
    }

    @MethodArgs(args ={"torque","wheelID"})
    public void setTorque(float torque, int wheelID){
        //
    }
    @MethodArgs(args ={"brake","wheelID"})
    public void setBrake(float brake, int wheelID){
        //
    }
    @MethodArgs(args ={"steer","wheelID"})
    public void setSteer(float steer, int wheelID){
        //
    }
    @MethodArgs(args ={"steer","wheelID"})
    public void setSteerRelativeVelocity(float steer, int wheelID){
        //
    }
    @MethodArgs(args ={"maxSteer"})
    public void setMaxSteerAngle(float maxSteer){
        //
    }
    @MethodArgs(args ={"steer"})
    public void setMinSteerAngle(float steer){
        //
    }
    @MethodArgs(args ={"speed"})
    public void setSteerMaxSpeed(float speed){
        //
    }

    @HideGetSet
    public float getSpeedKMH(){
        //
        return 0;
        //

        //
    }

    public float getSuspensionLength(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionLength(float value){
        //
    }

    public float getSuspensionCompression(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionCompression(float value){
        //
    }
    public float getSuspensionDamping(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionDamping(float value){
        //
    }
    public float getSuspensionStiffness(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionStiffness(float value){
        //
    }

    public boolean isStaticConfigs(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setStaticConfigs(boolean value){
        //
    }

    public ArrayList getWheels(){
        //
        return null;
        //

        //
    }
}
