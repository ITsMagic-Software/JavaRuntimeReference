package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxel"})
public class VoxelChunk extends Component{

    //

    public VoxelChunk() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public int getWidth(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWidth(int value){
        //
    }

    @HideGetSet
    public int getHeight(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHeight(int value){
        //
    }

    @HideGetSet
    public boolean isUsePositionAsCoordinatesOffset(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUsePositionAsCoordinatesOffset(boolean value){
        //
    }

    @HideGetSet
    public Vector2 getOffset(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOffset(Vector2 value){
        //
    }

    public void apply(){
        //
    }
    public void invalidateBlocks(){
        //
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ"})
    public int getBlock(int x, int y, int z){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"localX", "localY", "localZ"})
    public int getBlockLocal(int x, int y, int z){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ", "blockType"})
    public void setBlock(int x, int y, int z, int block){
        //
    }
    @MethodArgs(args ={"localX", "localY", "localZ", "blockType"})
    public void setLocalBlock(int x, int y, int z, int block){
        //
    }

    @MethodArgs(args ={"worldX", "worldY", "worldZ"})
    public boolean containsBlock(int x, int y, int z){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"localX", "localY", "localZ"})
    public boolean containsLocalBlock(int x, int y, int z){
        //
        return false;
        //

        //
    }

    public boolean isReady(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public OH3LevelIntArray getBlocksMatrixCritical(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBlocksMatrix(OH3LevelIntArray value){
        //
    }

    //
}
