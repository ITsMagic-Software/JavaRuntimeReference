package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterRadialFlare extends CameraFilter{
    //

    public FilterRadialFlare() {
        //
        super(null);
        //

        //
    }

    @HideGetSet
    public float getFlareBrightness(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFlareBrightness(float value){
        //
    }

    @HideGetSet
    public float getImageBrightness(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImageBrightness(float value){
        //
    }

    @HideGetSet
    public float getRadialLength(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRadialLength(float value){
        //
    }
}
