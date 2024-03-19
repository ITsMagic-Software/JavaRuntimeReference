package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class Text3D extends Component{
    //

    public Text3D() {
        //
        super();
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFont(Font font){
        //
    }
    @HideGetSet
    public Font getFont(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public String getText() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(String text) {
        //
    }

    @HideGetSet
    public Color getColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        //
    }

    public float measureWidth(String text){
        //
        return 0;
        //

        //
    }
    public float measureWidth(String[] lines){
        //
        return 0;
        //

        //
    }
    public float measureHeight(String text){
        //
        return 0;
        //

        //
    }
    public float measureHeight(String[] lines){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getScale() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(float scale) {
        //
    }

    @HideGetSet
    public int getResolution() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"resolution"})
    public void setResolution(int resolution) {
        //
    }

    //
}
