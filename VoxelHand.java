package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public class VoxelHand extends Component{

    //

    public VoxelHand() {
        //
        super();
        //

        //
    }


    @HideGetSet
    public float getDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //
    }

    @HideGetSet
    public int getCrossHairSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairSize(int value){
        //
    }

    @HideGetSet
    public Color getCrossHairColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairSize(Color value){
        //
    }

    @HideGetSet
    public Texture getCrossHairTexture(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairTexture(Texture value){
        //
    }

    @HideGetSet
    public boolean isShowCrosshair(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShowCrosshair(boolean value){
        //
    }

    @HideGetSet
    public int getSelectedBlockID(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSelectedBlockID(int value){
        //
    }

    @HideGetSet
    public int getLastHitBlockID(){
        //
        return 0;
        //

        //
    }

    public void requestPut(){
        //
    }
    public void requestBreak(){
        //
    }

    @HideGetSet
    public boolean isBlockBroken(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    public boolean isBlockPlaced(){
        //
        return false;
        //

        //
    }

    public interface Listener{
        void onBlockBroken(int blockType, int x, int y, int z);
        void onBlockPlaced(int blockType, int x, int y, int z);
        void onBlockSelected(int blockType, int x, int y, int z);
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setListener(Listener value){
        //
    }

    //
}
