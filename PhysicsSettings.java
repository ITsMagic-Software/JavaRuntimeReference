package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","World"})
public final class PhysicsSettings {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.World.Settings.PhysicsSettings physicsSettings;
    @IgnoreAutoComplete
    public PhysicsSettings(com.itsmagic.engine.Engines.Engine.World.Settings.PhysicsSettings physicsSettings) {
        this.physicsSettings = physicsSettings;
    }
    //>REMOVE-BRIDGE<

    public PhysicsSettings() {
        //<REMOVE-BRIDGE>
        this.physicsSettings = new com.itsmagic.engine.Engines.Engine.World.Settings.PhysicsSettings();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getGravity() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return physicsSettings.getGravity().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"gravity"})
    public void setGravity(Vector3 gravity) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        physicsSettings.setGravity(gravity.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setGravity(float x, float y, float z) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        physicsSettings.setGravity(new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z));
        //>REMOVE-BRIDGE<
    }
}