package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class VoxelChunkSpawner extends Component {

    //

    public VoxelChunkSpawner() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public SpatialObject getCamera(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public VoxelChunk getChunkBlueprint(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getRenderChunks(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getUpdateDelay(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getVisibleDot(){
        //
        return 0;
        //

        //
    }

    public boolean isDisableRenderBatching(){
        //
        return false;
        //

        //
    }

    public boolean isOnlyVisibleChunks(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCamera(SpatialObject value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setChunkBlueprint(VoxelChunk value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDisableRenderBatching(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOnlyVisibleChunks(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderChunks(int value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUpdateDelay(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVisibleDot(float value){
        //
    }


}