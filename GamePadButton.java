package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class GamePadButton {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Input.VOS.GamePadButton gamePadButton;
    @IgnoreAutoComplete
    public GamePadButton(com.itsmagic.engine.Engines.Input.VOS.GamePadButton gamePadButton) {
        this.gamePadButton = gamePadButton;
    }
    //>REMOVE-BRIDGE<

    public GamePadButton() {
        //<REMOVE-BRIDGE>
        this.gamePadButton = new com.itsmagic.engine.Engines.Input.VOS.GamePadButton();
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
