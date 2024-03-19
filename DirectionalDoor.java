package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping","Components"})
public final class DirectionalDoor extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.DirectionalDoor component;
    @IgnoreAutoComplete
    public DirectionalDoor(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.DirectionalDoor component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public DirectionalDoor() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.DirectionalDoor());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args={""})
    public void lock() {
        //<REMOVE-BRIDGE>
        component.lock();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args={""})
    public void unlock() {
        //<REMOVE-BRIDGE>
        component.unlock();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args={""})
    public void open() {
        //<REMOVE-BRIDGE>
        component.open();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args={""})
    public void close() {
        //<REMOVE-BRIDGE>
        component.close();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, DirectionalDoor.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
