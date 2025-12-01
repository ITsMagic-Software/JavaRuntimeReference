package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class UIInputText extends Component {

    //

        public UIInputText() {
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
    public String getText(){
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

    public boolean isEditing(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"color"})
    public void setColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"editing"})
    public void setEditing(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"text"})
    public void setText(String value){
        //
    }

    @HideGetSet
    @MethodArgs({"textSize"})
    public void setTextSize(float value){
        //
    }


}