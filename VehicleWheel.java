package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Utils.NaNFixer;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","Components"})
public final class VehicleWheel extends Component{
    public enum Type{
        ContactPoint, Model
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Vehicle.VehicleWheel component;
    @IgnoreAutoComplete
    public VehicleWheel(com.itsmagic.engine.Engines.Engine.ComponentsV2.Vehicle.VehicleWheel component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public VehicleWheel() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Vehicle.VehicleWheel());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRadius(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.radius;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRadius(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.radius = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSkidding(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getSkidding();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSuspensionRestLength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.suspensionRestLength;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSuspensionRestLength(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.suspensionRestLength = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFrictionSlip(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.frictionSlip;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFrictionSlip(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.frictionSlip = NaNFixer.fix(value);
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @HideGetSet
    public boolean getPosPhysicsFunctionEnabled(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return true;
        //>REMOVE-BRIDGE<
    }
    @Deprecated
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPosPhysicsFunctionEnabled(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"intensity"})
    public void setBlockRotation(float intensity){
        //<REMOVE-BRIDGE>
        component.blockRotationIntensity = NaNFixer.fix(intensity);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getRotation();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"rotation"})
    public void setRotation(float r){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setRotation(r);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"increment"})
    public void incrementRotation(float r){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.incrementRotation(r);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getModelPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getModelPosition().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Quaternion getModelRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getModelRotation().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"torque"})
    public void setTorque(float torque){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setTorque(NaNFixer.fix(torque));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"brake"})
    public void setBrake(float brake){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setBrake(NaNFixer.fix(brake));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"steer"})
    public void setSteer(float steer){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setSteering(NaNFixer.fix(steer));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"steer"})
    public void setSteerRelativeVelocity(float steer){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setSteeringRV(NaNFixer.fix(steer));
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @HideGetSet
    public boolean isShowGizmo(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return false;
        //>REMOVE-BRIDGE<
    }
    @Deprecated
    @HideGetSet
    @MethodArgs(args ={"torque"})
    public void setShowGizmo(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, VehicleWheel.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
