package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/*
* @Author Daniel Oschepkov (SpeakerFish)
*/

@ClassCategory(cat={"Prototyping","Components"})
public class VehicleAI extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAI component;
    @IgnoreAutoComplete
    public VehicleAI(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAI component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public VehicleAI() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAI());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxSteerAngle() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getMaxSteerAngle();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"maxSteerAngle"})
    public void setMaxSteerAngle(float maxSteerAngle) {
        //<REMOVE-BRIDGE>
        component.setMaxSteerAngle(maxSteerAngle);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxTorque() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getMaxTorque();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"maxTorque"})
    public void setMaxTorque(float maxTorque) {
        //<REMOVE-BRIDGE>
        component.setMaxTorque(maxTorque);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, VehicleAI.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
