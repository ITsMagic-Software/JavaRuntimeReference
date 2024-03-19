package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Settings.Physics.Layer;
import com.itsmagic.engine.Engines.Native.OHString.OHString;
//>REMOVE-BRIDGE<

public class PhysicsLayer {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient Layer layer;

    @IgnoreAutoComplete
    public PhysicsLayer(Layer layer) {
        this.layer = layer;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"name"})
    public PhysicsLayer(String name) {
        //<REMOVE-BRIDGE>
        this.layer = new Layer(new OHString(name), false);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"layer"})
    public void addIgnoreLayer(PhysicsLayer layer) {
        //<REMOVE-BRIDGE>
        this.layer.addIgnoreLayer(layer.layer);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"layer"})
    public void removeIgnoreLayer(PhysicsLayer layer) {
        //<REMOVE-BRIDGE>
        this.layer.removeIgnoreLayer(layer.layer);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"index"})
    public PhysicsLayer getIgnoreAt(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Layer l = Engine.getGameSettings(Main.getContext()).getPhysicsSettings().findGUID(this.layer.getIgnoreAt(idx));
        return l.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public int ignoreCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.layer.ignoreCount();
        //>REMOVE-BRIDGE<
    }
}
