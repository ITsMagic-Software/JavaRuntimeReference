package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class SmoothCameraFollow extends Component {

    //

    public SmoothCameraFollow() {
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
    @MethodArgs({"value"})
    public void setDistance(float value){
        //
    }

    @HideGetSet
    public float getHeight(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setHeight(float value){
        //
    }

    @HideGetSet
    public float getHeightDamping(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setHeightDamping(float value){
        //
    }

    @HideGetSet
    public float getMaxHeightDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setMaxHeightDistance(float value){
        //
    }

    @HideGetSet
    public float getRotationDamping(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setRotationDamping(float value){
        //
    }

    @HideGetSet
    public SpatialObject getTarget(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setTarget(SpatialObject value){
        //
    }

}