package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIJoystick extends Component {

    //

    public UIJoystick() {
        //
        super();
        //

        //
    }

    public Vector2 getValue() {
        //
        return null;
        //

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
    public Texture getBackgroundTexture(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getHandleSizePercentage(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Color getHandlerColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Texture getHandlerTexture(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"backgroundColor"})
    public void setBackgroundColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"texture"})
    public void setBackgroundTexture(Texture value){
        //
    }

    @HideGetSet
    @MethodArgs({"handleSize"})
    public void setHandleSizePercentage(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"handlerColor"})
    public void setHandlerColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"texture"})
    public void setHandlerTexture(Texture value){
        //
    }
}