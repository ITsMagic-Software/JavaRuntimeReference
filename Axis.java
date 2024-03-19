package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Native.OHString.OHString;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Input"})
public final class Axis {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient  com.itsmagic.engine.Engines.Input.VOS.Axis axis;
    @IgnoreAutoComplete
    @MethodArgs(args ={"axis"})
    public Axis(com.itsmagic.engine.Engines.Input.VOS.Axis axis) {
        this.axis = axis;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"name"})
    public Axis(String name){
        //<REMOVE-BRIDGE>
        this.axis = new com.itsmagic.engine.Engines.Input.VOS.Axis(name);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getValue(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return axis.getValue().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(Vector2 value){
        //<REMOVE-BRIDGE>
        if(value == null) throw new NullPointerException("value can't be null");
        axis.setValue(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return axis.getName();
        //>REMOVE-BRIDGE<
    }
}
