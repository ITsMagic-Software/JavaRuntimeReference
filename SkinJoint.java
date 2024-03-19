package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Skin","Components"})
public final class SkinJoint extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public com.itsmagic.engine.Engines.Engine.ComponentsV2.SkeletonBone.SkinJoint instance;
    @IgnoreAutoComplete
    public SkinJoint(com.itsmagic.engine.Engines.Engine.ComponentsV2.SkeletonBone.SkinJoint instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public SkinJoint(Engine engine){}
    //>REMOVE-BRIDGE<

        public SkinJoint() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.SkeletonBone.SkinJoint());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getIndex();
        //>REMOVE-BRIDGE<
    }


}