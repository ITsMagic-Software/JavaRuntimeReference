package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Components.EventListeners.EventListeners;
import com.itsmagic.engine.Core.Core;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Editor"})
public final class Editor {

    private Editor() {}

    public static boolean isEditor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return EventListeners.isEditor();
        //>REMOVE-BRIDGE<
    }

    public static SpatialObject getSelectedObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        //
        return null;
        //
        //>REMOVE-BRIDGE<
    }

    public static void setSelectedObject(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        //
        //>REMOVE-BRIDGE<
    }
}
