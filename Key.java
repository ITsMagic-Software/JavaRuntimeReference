package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Native.OHString.OHString;
import com.itsmagic.engine.Engines.Utils.StringFunctions.StringUtils;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Key {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Input.VOS.Key key;
    @IgnoreAutoComplete
    public Key(com.itsmagic.engine.Engines.Input.VOS.Key key) {
        this.key = key;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"name"})
    public Key(String name){
        //<REMOVE-BRIDGE>
        this.key = new com.itsmagic.engine.Engines.Input.VOS.Key(name, false);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return key.pressed;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressed(boolean value){
        //<REMOVE-BRIDGE>
        key.pressed = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return key.down;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDown(boolean value){
        //<REMOVE-BRIDGE>
        key.pressed = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isUp(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return key.up;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUp(boolean value){
        //<REMOVE-BRIDGE>
        key.up = value;
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
        return key.getName();
        //>REMOVE-BRIDGE<
    }
}
