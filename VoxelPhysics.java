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
public final class VoxelPhysics extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelPhysics instance;
    @IgnoreAutoComplete
    public VoxelPhysics(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelPhysics instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public VoxelPhysics(Engine engine){}
    //>REMOVE-BRIDGE<

        public VoxelPhysics() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PhysicsSystem.VoxelPhysics());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getClimbSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getClimbSpeed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getGravity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getGravity();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxClimbHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxClimbHeight();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxGravitySpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxGravitySpeed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getVelocity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getVelocity();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setClimbSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setClimbSpeed( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGravity(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setGravity( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxClimbHeight(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMaxClimbHeight( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxGravitySpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMaxGravitySpeed( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVelocity(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setVelocity( value.instance);
        //>REMOVE-BRIDGE<
    }


}