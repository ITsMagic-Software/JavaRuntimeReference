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
public final class VoxelChunkSpawner extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunkSpawner instance;
    @IgnoreAutoComplete
    public VoxelChunkSpawner(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunkSpawner instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public VoxelChunkSpawner(Engine engine){}
    //>REMOVE-BRIDGE<

    public VoxelChunkSpawner() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunkSpawner());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getCamera(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject returnValue = instance.getCamera();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public VoxelChunk getChunkBlueprint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunk returnValue = instance.getChunkBlueprint();
        if(returnValue != null) return (VoxelChunk) returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getRenderChunks(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRenderChunks();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getUpdateDelay(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getUpdateDelay();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getVisibleDot(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getVisibleDot();
        //>REMOVE-BRIDGE<
    }

    public boolean isDisableRenderBatching(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isDisableRenderBatching();
        //>REMOVE-BRIDGE<
    }

    public boolean isOnlyVisibleChunks(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isOnlyVisibleChunks();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCamera(SpatialObject value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.setCamera(value.instance.get());
        } else {
            instance.setCamera(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setChunkBlueprint(VoxelChunk value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");
        instance.setChunkBlueprint( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDisableRenderBatching(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setDisableRenderBatching( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOnlyVisibleChunks(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setOnlyVisibleChunks( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderChunks(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRenderChunks( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUpdateDelay(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setUpdateDelay( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVisibleDot(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setVisibleDot( value);
        //>REMOVE-BRIDGE<
    }


}