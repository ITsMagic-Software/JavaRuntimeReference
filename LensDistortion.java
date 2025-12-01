package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class LensDistortion extends Component {

    //

        public LensDistortion() {
        //
        super();
        //

        //
    }

    public enum Mode {
        Barrel, Pincushion
    }
    //

    @HideGetSet
    public float getBorder(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Vector2 getCenter(){
        //
        return null;
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
    public Mode getMode(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"border"})
    public void setBorder(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setCenter(Vector2 value){
        //
    }

    @HideGetSet
    @MethodArgs({"intensity"})
    public void setIntensity(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"mode"})
    public void setMode(Mode value){
        //
    }


}