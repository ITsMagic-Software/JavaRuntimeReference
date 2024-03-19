package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Vehicle.VehicleWheel;
import com.itsmagic.engine.Engines.Utils.NaNFixer;
//>REMOVE-BRIDGE<
import java.util.ArrayList;

@ClassCategory(cat ={"Physics"})
public final class VehiclePhysics{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.VehiclePhysics component;
    @IgnoreAutoComplete
    public VehiclePhysics(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.VehiclePhysics component) {
        this.component = component;
    }
    //>REMOVE-BRIDGE<

    public VehiclePhysics() {
        //<REMOVE-BRIDGE>
        this.component = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.VehiclePhysics();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"torque","wheelID"})
    public void setTorque(float torque, int wheelID){
        //<REMOVE-BRIDGE>
        component.setTorque(NaNFixer.fix(torque), wheelID);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"brake","wheelID"})
    public void setBrake(float brake, int wheelID){
        //<REMOVE-BRIDGE>
        component.setBrake(NaNFixer.fix(brake), wheelID);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"steer","wheelID"})
    public void setSteer(float steer, int wheelID){
        //<REMOVE-BRIDGE>
        component.setSteering(NaNFixer.fix(steer), wheelID);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"steer","wheelID"})
    public void setSteerRelativeVelocity(float steer, int wheelID){
        //<REMOVE-BRIDGE>
        component.setSteeringRV(NaNFixer.fix(steer), wheelID);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"maxSteer"})
    public void setMaxSteerAngle(float maxSteer){
        //<REMOVE-BRIDGE>
        component.setMaxSteerAngle(NaNFixer.fix(maxSteer));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"steer"})
    public void setMinSteerAngle(float steer){
        //<REMOVE-BRIDGE>
        component.setMinSteerAngle(NaNFixer.fix(steer));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"speed"})
    public void setSteerMaxSpeed(float speed){
        //<REMOVE-BRIDGE>
        component.setMaxSpeed(NaNFixer.fix(speed));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSpeedKMH(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getSpeedInKMH();
        //>REMOVE-BRIDGE<
    }

    public float getSuspensionLength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.maxSuspensionTravelCm;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionLength(float value){
        //<REMOVE-BRIDGE>
        component.maxSuspensionTravelCm = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }

    public float getSuspensionCompression(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.suspensionCompression;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionCompression(float value){
        //<REMOVE-BRIDGE>
        component.suspensionCompression = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }
    public float getSuspensionDamping(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.suspensionDamping;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionDamping(float value){
        //<REMOVE-BRIDGE>
        component.suspensionDamping = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }
    public float getSuspensionStiffness(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.suspensionStiffness;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setSuspensionStiffness(float value){
        //<REMOVE-BRIDGE>
        component.suspensionStiffness = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }

    public boolean isStaticConfigs(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.staticConfigs;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setStaticConfigs(boolean value){
        //<REMOVE-BRIDGE>
        component.staticConfigs = value;
        //>REMOVE-BRIDGE<
    }

    public ArrayList getWheels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        ArrayList wheels = new ArrayList();
        for (VehicleWheel wheel : component.getWheels()) {
            wheels.add(wheel.toJAVARuntime());
        }
        return wheels;
        //>REMOVE-BRIDGE<
    }
}
