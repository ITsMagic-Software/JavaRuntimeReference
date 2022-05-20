package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"CameraFilters"})
public class FilterCBS extends CameraFilter{
    //

    public FilterCBS() {
        //
        super(null);
        //

        //
    }

    @HideGetSet
    public float getSaturation(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSaturation(float value){
        //
    }

    @HideGetSet
    public float getBrightness(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setBrightness(float value){
        //
    }

    @HideGetSet
    public float getContrast(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setContrast(float value){
        //
    }
}
