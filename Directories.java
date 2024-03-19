package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Core.Core;

import java.io.File;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class Directories {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Directories() { }

    /// Abstracts
    public static String internal(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String internal = com.itsmagic.engine.Engines.Utils.Directories.internal(Main.getContext());
        File file = new File(internal);
        if(!file.exists()){
            file.mkdirs();
        }
        return internal;
        //>REMOVE-BRIDGE<
    }
    /// Abstracts
    public static String getProjectFolder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Core.projectController.getLoadedProjectLocation(Main.getContext()) + "/";
        //>REMOVE-BRIDGE<
    }
}
