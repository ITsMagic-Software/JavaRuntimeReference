package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class DepthOfField extends Component {

    //

        public DepthOfField() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getMaxApertureDiameterCm(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getScale(){
        //
        return 0;
        //

        //
    }

    public boolean isAutoFocus(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"autoFocus"})
    public void setAutoFocus(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"maxApertureDiameterCm"})
    public void setMaxApertureDiameterCm(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"scale"})
    public void setScale(float value){
        //
    }


}