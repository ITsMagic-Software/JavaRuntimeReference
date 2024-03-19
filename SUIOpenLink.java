package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/**
 * @Author Daniel Oschepkov (SpeakerFish)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIOpenLink extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIOpenLink component;
    @IgnoreAutoComplete
    public SUIOpenLink(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIOpenLink component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    @BuildClassConstructor
    public SUIOpenLink(Engine engine) {}
    //>REMOVE-BRIDGE<

    public SUIOpenLink() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIOpenLink());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getURL() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getURLString();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args={"URL"})
    public void setURL(String URL) {
        //<REMOVE-BRIDGE>
        component.setURL(URL);
        //>REMOVE-BRIDGE<
    }

    public void openURL() {
        //<REMOVE-BRIDGE>
        component.openURL();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIOpenLink.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
