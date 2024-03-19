package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping","Components"})
public class VehicleAIWheel extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAIWheel component;
    @IgnoreAutoComplete
    public VehicleAIWheel(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAIWheel component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    @BuildClassConstructor
    public VehicleAIWheel(Engine engine) {}
    //>REMOVE-BRIDGE<

    public VehicleAIWheel() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.VehicleAIWheel());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isSteerWheel() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isSteerWheel();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"steerWheel"})
    public void setSteerWheel(boolean steerWheel) {
        //<REMOVE-BRIDGE>
        component.setSteerWheel(steerWheel);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isTorqueWheel() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isTorqueWheel();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"steerWheel"})
    public void setTorqueWheel(boolean steerWheel) {
        //<REMOVE-BRIDGE>
        component.setTorqueWheel(steerWheel);
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