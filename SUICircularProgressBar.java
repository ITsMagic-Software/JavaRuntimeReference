package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUICircularProgressBar extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICircularProgressBar component;
    @IgnoreAutoComplete
    public SUICircularProgressBar(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICircularProgressBar component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUICircularProgressBar() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICircularProgressBar());
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
    public float getMaskMaxLength() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getMaskMaxLength();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaskMaxLength(float value) {
        //<REMOVE-BRIDGE>
        this.component.setMaskMaxLength(value);
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
    public boolean isSetMask() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.isSetMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaskEnabled(boolean value) {
        //<REMOVE-BRIDGE>
        this.component.setSetMask(value);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUICircularProgressBar.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
