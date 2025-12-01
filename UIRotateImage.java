package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIRotateImage extends Component {

    //

    public UIRotateImage() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getAngle(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"angle"})
    public void setAngle(float value){
        //
    }

    @HideGetSet
    public Texture getTexture(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"texture"})
    public void setTexture(Texture value){
        //
    }
}