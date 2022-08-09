package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"CameraFilters"})
public class FilterBloom extends CameraFilter{
    //

    public FilterBloom() {
        //
        super(null);
        //

        //
    }

    @HideGetSet
    public float getResolution(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setResolution(float value){
        //
    }


    @HideGetSet
    public float getIntensity(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setIntensity(float value){
        //
    }

    @HideGetSet
    public float getSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSize(float value){
        //
    }
}
