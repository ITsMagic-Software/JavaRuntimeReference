package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Interface.Objects.PercentageRect;
import com.itsmagic.engine.Activities.Editor.Panels.GameView.GameView;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class Screen {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Screen() { }

    /// Abstracts
    public static int getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return width();
        //>REMOVE-BRIDGE<
    }
    public static int getHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return height();
        //>REMOVE-BRIDGE<
    }

    public static int width(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(GameView.staticCalls != null) {
            PercentageRect gameViewPercentageRect = GameView.staticCalls.getRect();
            return (int) (gameViewPercentageRect.getW() * com.itsmagic.engine.Engines.Engine.Screen.getWidth());
        }
        return com.itsmagic.engine.Engines.Engine.Screen.getWidth();
        //>REMOVE-BRIDGE<
    }
    public static int height(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(GameView.staticCalls != null) {
            PercentageRect gameViewPercentageRect = GameView.staticCalls.getRect();
            return (int) (gameViewPercentageRect.getH() * com.itsmagic.engine.Engines.Engine.Screen.getHeight());
        }
        return com.itsmagic.engine.Engines.Engine.Screen.getHeight();
        //>REMOVE-BRIDGE<
    }

    public static float ratio(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float)width() / (float)height();
        //>REMOVE-BRIDGE<
    }
}
