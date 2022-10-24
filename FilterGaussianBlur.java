package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public class FilterGaussianBlur extends CameraFilter{
    //

    public FilterGaussianBlur() {
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

    @HideGetSet
    public float getSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSize(float value){
        //
    }
}
