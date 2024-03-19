package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelChunk extends Component{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunk instance;
    @IgnoreAutoComplete
    public VoxelChunk(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunk instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public VoxelChunk() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.ChunkSystem.VoxelChunk());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getWidth();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWidth(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setWidth(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getHeight();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHeight(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setHeight(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isUsePositionAsCoordinatesOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isUsePositionAsCoordinatesOffset();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUsePositionAsCoordinatesOffset(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setUsePositionAsCoordinatesOffset(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getOffset().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOffset(Vector2 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null){
            throw new NullPointerException("value can't be null");
        }
        instance.setOffset(value.instance);
        //>REMOVE-BRIDGE<
    }

    public void apply(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.scheduleReconstruct();
        //>REMOVE-BRIDGE<
    }
    public void invalidateBlocks(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.scheduleReconstructMatrix();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ"})
    public int getBlock(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(!instance.containsBlock(x, y, z)){
            throw new IndexOutOfBoundsException("Block at world coordinates [" + x + ", " + y + ", " + z + "] is outside chunk bounds");
        }
        return instance.getBlock(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"localX", "localY", "localZ"})
    public int getBlockLocal(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(!instance.containsInternalBlock(x, y, z)){
            throw new IndexOutOfBoundsException("Block at local coordinates [" + x + ", " + y + ", " + z + "] is outside chunk bounds");
        }
        return instance.getBlockInternal(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ", "blockType"})
    public void setBlock(int x, int y, int z, int block){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(!instance.containsBlock(x, y, z)){
            throw new IndexOutOfBoundsException("Block at world coordinates [" + x + ", " + y + ", " + z + "] is outside chunk bounds");
        }
        instance.setBlock(x, y, z, block);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"localX", "localY", "localZ", "blockType"})
    public void setLocalBlock(int x, int y, int z, int block){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(!instance.containsInternalBlock(x, y, z)){
            throw new IndexOutOfBoundsException("Block at local coordinates [" + x + ", " + y + ", " + z + "] is outside chunk bounds");
        }
        instance.setInternalBlock(x, y, z, block);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ"})
    public boolean containsBlock(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.containsBlock(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"localX", "localY", "localZ"})
    public boolean containsLocalBlock(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.containsInternalBlock(x, y, z);
        //>REMOVE-BRIDGE<
    }

    public boolean isReady(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isReady();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public OH3LevelIntArray getBlocksMatrixCritical(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getBlocksCritical().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBlocksMatrix(OH3LevelIntArray value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setBlocksCritical(value.buffer);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, VoxelChunk.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return instance;
    }
    //>REMOVE-BRIDGE<
}
