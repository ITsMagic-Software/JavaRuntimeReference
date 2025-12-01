package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIVerticalScrollView extends Component {

    //

        public UIVerticalScrollView() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public int getScroll(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"scroll"})
    public void setScroll(int value){
        //
    }


}