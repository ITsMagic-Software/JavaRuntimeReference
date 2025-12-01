package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIButton extends Component {

    //

        public UIButton() {
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
    public String getFontFile(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getNormalColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Texture getNormalTexture(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Vector2 getPadding(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getPressedColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Texture getPressedTexture(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getResolution(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public String getText(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getTextNormalColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getTextPressedColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getTextSize(){
        //
        return 0;
        //

        //
    }

    public boolean isDown(){
        //
        return false;
        //

        //
    }

    public boolean isPressed(){
        //
        return false;
        //

        //
    }

    public boolean isUp(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"border"})
    public void setBorder(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"normalColor"})
    public void setNormalColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"texture"})
    public void setNormalTexture(Texture value){
        //
    }

    @HideGetSet
    @MethodArgs({"padding"})
    public void setPadding(Vector2 value){
        //
    }

    @HideGetSet
    @MethodArgs({"pressedColor"})
    public void setPressedColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"texture"})
    public void setPressedTexture(Texture value){
        //
    }

    @HideGetSet
    @MethodArgs({"resolution"})
    public void setResolution(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"text"})
    public void setText(String value){
        //
    }

    @HideGetSet
    @MethodArgs({"textNormalColor"})
    public void setTextNormalColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"textPressedColor"})
    public void setTextPressedColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"textSize"})
    public void setTextSize(float value){
        //
    }
}