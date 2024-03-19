package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelPlayerController extends Component {

    //

        public VoxelPlayerController() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public String getHorizontalSlideName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getHorizontalSlideSens(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public String getJoystickName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getRunSpeed(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getWalkSpeed(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHorizontalSlideName(String value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHorizontalSlideSens(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setJoystickName(String value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRunSpeed(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWalkSpeed(float value){
        //
    }


}