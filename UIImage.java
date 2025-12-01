package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIImage extends Component {

    //

        public UIImage() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getBorder(){
        //
        return 0;
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
    public Texture getTexture(){
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
    @MethodArgs({"color"})
    public void setColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"texture"})
    public void setTexture(Texture value){
        //
    }
}