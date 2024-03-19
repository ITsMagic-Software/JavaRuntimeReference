package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.World.Settings.NavMeshSettings;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public class WorldPathFinder {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient NavMeshSettings settings;
    @IgnoreAutoComplete
    public WorldPathFinder(NavMeshSettings settings) {
        this.settings = settings;
    }
    //>REMOVE-BRIDGE<

    public WorldPathFinder() {
        //<REMOVE-BRIDGE>
        this.settings = new NavMeshSettings();
        //>REMOVE-BRIDGE<
    }

}