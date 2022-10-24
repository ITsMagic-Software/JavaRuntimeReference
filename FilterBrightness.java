package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public class FilterBrightness extends CameraFilter{
    //

    public FilterBrightness() {
        //
        super(null);
        //

        //
    }

    @HideGetSet
    public float getStrength(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStrength(float value){
        //
    }
}
