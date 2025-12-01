package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIAxisEventListener extends Component {

    //

        public UIAxisEventListener() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public String getAxisName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Vector2 getValue(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"axisName"})
    public void setAxisName(String value){
        //
    }

    @MethodArgs({"x","y"})
    public void setValue(float arg0, float arg1){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setValue(Vector2 value){
        //
    }


}