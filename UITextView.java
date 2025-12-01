package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UITextView extends Component {

    //

        public UITextView() {
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
    @MethodArgs({"color"})
    public void setColor(Color value){
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
    @MethodArgs({"text"})
    public void setText(String value){
        //
    }

    @HideGetSet
    public float getTextSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"textSize"})
    public void setTextSize(float value){
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
    @MethodArgs({"value"})
    public void setFont(Font value){
        //
    }
}