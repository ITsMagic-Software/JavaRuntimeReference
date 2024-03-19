package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUILinearLayout extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUILinearLayout component;
    @IgnoreAutoComplete
    public SUILinearLayout(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUILinearLayout component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUILinearLayout() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUILinearLayout());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SLinearOrientation getOrientation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUILinearLayout.convertToJavaRuntime(component.getOrientation());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOrientation(SLinearOrientation value){
        //<REMOVE-BRIDGE>
        this.component.setOrientation(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUILinearLayout.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUILinearLayout.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
