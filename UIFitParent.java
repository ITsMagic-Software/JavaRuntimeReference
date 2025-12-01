package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIFitParent extends Component {

    //

        public UIFitParent() {
        //
        super();
        //

        //
    }

    public boolean isFitHeight(){
        //
        return false;
        //

        //
    }

    public boolean isFitWidth(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"h"})
    public void setFitHeight(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"w"})
    public void setFitWidth(boolean value){
        //
    }


}