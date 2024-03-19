package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelCollider extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelCollider instance;
    @IgnoreAutoComplete
    public VoxelCollider(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelCollider instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public VoxelCollider(Engine engine){}
    //>REMOVE-BRIDGE<

        public VoxelCollider() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelCollider());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getHorizontalSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getHorizontalSize();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPositionOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getPositionOffset();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getVerticalSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getVerticalSize();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHorizontalSize(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setHorizontalSize( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPositionOffset(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setPositionOffset( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVerticalSize(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setVerticalSize( value);
        //>REMOVE-BRIDGE<
    }


}