package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"UI (Deprecated)"})
public class UIImage extends Component{
    //

    public UIImage() {
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
    @MethodArgs(args={"value"})
    public void setColor(Color color){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIImage.getImage() instead"})
    @HideGetSet
    public PFile getImageFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIImage.setImage(Texture) instead"})
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setImageFile(PFile pFile){
        //
    }

    @HideGetSet
    public Texture getImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setImage(Texture texture){
        //
    }

    //
}
