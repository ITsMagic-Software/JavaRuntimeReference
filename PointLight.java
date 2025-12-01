package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class PointLight extends Component {

    //

        public PointLight() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public Color getColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getFalloffRadius(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getLumens(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"color"})
    public void setColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"falloffRadius"})
    public void setFalloffRadius(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"lumens"})
    public void setLumens(float value){
        //
    }


}