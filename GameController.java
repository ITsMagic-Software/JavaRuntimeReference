package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Core;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class GameController {
    public enum State{
        Stopped, Paused, Running
    }

    private GameController() { }

    /// Abstracts
    public static void quit(){
        //<REMOVE-BRIDGE>
        Core.gameController.quit();
        //>REMOVE-BRIDGE<
    }

    public State getState(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        //

        //
        return State.Running;
        //
        //>REMOVE-BRIDGE<
    }
}
