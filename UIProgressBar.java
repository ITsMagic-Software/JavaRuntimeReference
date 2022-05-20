package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"UI (Deprecated)"})
public class UIProgressBar extends Component{
    //

    public UIProgressBar() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getMax(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public void setMax(float value){
        //
    }

    @HideGetSet
    public float getValue(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public void setValue(float value){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIProgressBar.getBackgroundImage(Texture) instead"})
    @HideGetSet
    public PFile getBackgroundImageFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIProgressBar.setBackgroundImage(Texture) instead"})
    @HideGetSet
    public void setBackgroundImageFile(PFile pFile){
        //
    }
    @HideGetSet
    public Texture getBackgroundImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public void setBackgroundImage(Texture texture){
        //
    }

    @HideGetSet
    public Color getBackgroundColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public void setBackgroundColor(Color color){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIProgressBar.getHandleImage(Texture) instead"})
    @HideGetSet
    public PFile getHandleImageFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use UIProgressBar.setHandleImage(Texture) instead"})
    @HideGetSet
    public void setHandleImageFile(PFile pFile){
        //
    }
    @HideGetSet
    public Texture getHandleImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public void setHandleImage(Texture texture){
        //
    }

    @HideGetSet
    public Color getHandleColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public void setHandleColor(Color color){
        //
    }

    //
}
