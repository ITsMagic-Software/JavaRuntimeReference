package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Roads","Components"})
public final class RoadPoint extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadPoint instance;
    @IgnoreAutoComplete
    public RoadPoint(com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadPoint instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public RoadPoint(Engine engine){}
    //>REMOVE-BRIDGE<

        public RoadPoint() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadPoint());
        //>REMOVE-BRIDGE<
    }

    public void scheduleSubdivideBackward(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.scheduleSubdivideBackward();
        //>REMOVE-BRIDGE<
    }

    public void scheduleSubdivideForward(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.scheduleSubdivideForward();
        //>REMOVE-BRIDGE<
    }


}