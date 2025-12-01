package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class Skybox extends Component {

    //

        public Skybox() {
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
    public int getMaxResolutionID(){
        //
        return 0;
        //

        //
    }

    public boolean isShowSun(){
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
    @MethodArgs({"maxReso"})
    public void setMaxResolutionID(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"showSun"})
    public void setShowSun(boolean value){
        //
    }


}