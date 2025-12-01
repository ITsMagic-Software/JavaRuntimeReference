package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIHorizontalLayout extends Component {

    //

        public UIHorizontalLayout() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public int getSpacing(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"spacing"})
    public void setSpacing(int value){
        //
    }


}