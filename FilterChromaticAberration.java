package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public class FilterChromaticAberration extends CameraFilter{
    //

    public FilterChromaticAberration() {
        //
        super(null);
        //

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
    @MethodArgs(args ={"value"})
    public void setIntensity(float value){
        //
    }
}
