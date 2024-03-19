package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping","Components"})
public final class PhysicalButton extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.PhysicalButton component;
    @IgnoreAutoComplete
    public PhysicalButton(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.PhysicalButton component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public PhysicalButton() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.PhysicalButton());
        //>REMOVE-BRIDGE<
    }

    public boolean isLocked() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isLocked();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args={"isLocked"})
    public void setLocked(boolean isLocked) {
        //<REMOVE-BRIDGE>
        component.setLocked(isLocked);
        //>REMOVE-BRIDGE<
    }

    public boolean isPressed() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isPressed();
        //>REMOVE-BRIDGE<
    }
    public void press() {
        //<REMOVE-BRIDGE>
        component.press();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, PhysicalButton.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
