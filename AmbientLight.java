package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class AmbientLight extends Component {

    //

        public AmbientLight() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public Color getIndirectLight(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getLux(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getMaxResolutionID(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"indirectLight"})
    public void setIndirectLight(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"lux"})
    public void setLux(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"maxReso"})
    public void setMaxResolutionID(int value){
        //
    }


}