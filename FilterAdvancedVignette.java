package JAVARuntime;
//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public class FilterAdvancedVignette extends CameraFilter{
    //

    public FilterAdvancedVignette() {
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
    public float getStart(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStart(float value){
        //
    }

    @HideGetSet
    public float getFade(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFade(float value){
        //
    }
}
