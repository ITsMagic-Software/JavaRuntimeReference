package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"SUI"})
public class SUIScrollView extends Component {

    //

        public SUIScrollView() {
        //
        super();
        //

        //
    }

    public enum LayoutObject {
        Child0, Other
    }
    //

    public enum Orientation {
        Horizontal, Vertical, Both
    }
    //

    @HideGetSet
    public LayoutObject getLayoutObject(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Orientation getOrientation(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getScrollX(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getScrollY(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayoutObject(LayoutObject value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOrientation(Orientation value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScrollX(int value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScrollY(int value){
        //
    }


}