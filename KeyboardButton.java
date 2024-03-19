package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class KeyboardButton {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Input.VOS.KeyboardButton gamePadButton;
    @IgnoreAutoComplete
    public KeyboardButton(com.itsmagic.engine.Engines.Input.VOS.KeyboardButton gamePadButton) {
        this.gamePadButton = gamePadButton;
    }
    //>REMOVE-BRIDGE<

    public KeyboardButton() {
        //<REMOVE-BRIDGE>
        this.gamePadButton = new com.itsmagic.engine.Engines.Input.VOS.KeyboardButton();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return gamePadButton.name;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getPrintableName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return gamePadButton.printableName;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isUpperCase(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return gamePadButton.upperCase;
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
        return gamePadButton.pressed;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressed(boolean value){
        //<REMOVE-BRIDGE>
        gamePadButton.pressed = value;
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
        return gamePadButton.down;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDown(boolean value){
        //<REMOVE-BRIDGE>
        gamePadButton.pressed = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLongDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return gamePadButton.longDown;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLongDown(boolean value){
        //<REMOVE-BRIDGE>
        gamePadButton.longDown = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLongPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return gamePadButton.longPressed;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLongPressed(boolean value){
        //<REMOVE-BRIDGE>
        gamePadButton.longPressed = value;
        //>REMOVE-BRIDGE<
    }
}
