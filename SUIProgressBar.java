package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIProgressBar extends Component{
    public enum Mode{
        Horizontal, Vertical
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIProgressBar component;
    @IgnoreAutoComplete
    public SUIProgressBar(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIProgressBar component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIProgressBar() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIProgressBar());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getValue() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getValue();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(float value) {
        //<REMOVE-BRIDGE>
        this.component.setValue(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxValue() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getMaxValue();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxValue(float value) {
        //<REMOVE-BRIDGE>
        this.component.setMaxValue(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isTextEnabled() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isSetText();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTextEnabled(boolean value) {
        //<REMOVE-BRIDGE>
        this.component.setSetText(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isInvert() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isInvert();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setInvert(boolean value) {
        //<REMOVE-BRIDGE>
        this.component.setInvert(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Mode getMode(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIProgressBar.convert(component.getMode());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"mode"})
    public void setMode(Mode mode){
        //<REMOVE-BRIDGE>
        this.component.setMode(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIProgressBar.convert(mode));
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIProgressBar.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
