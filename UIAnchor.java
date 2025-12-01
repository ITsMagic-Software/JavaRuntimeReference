package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"UI","Components"})
public class UIAnchor extends Component {

    //

        public UIAnchor() {
        //
        super();
        //

        //
    }

    public enum VerticalConstraintTarget {
        Unfixed, ToTopOf, ToBottomOf
    }
    //

    public enum HorizontalConstraintTarget {
        Unfixed, ToLeftOf, ToRightOf
    }
    //

    @HideGetSet
    public VerticalConstraintTarget getBottomAnchor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getBottomOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SpatialObject getBottomTarget(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public HorizontalConstraintTarget getLeftAnchor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getLeftOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SpatialObject getLeftTarget(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public HorizontalConstraintTarget getRightAnchor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getRightOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SpatialObject getRightTarget(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public VerticalConstraintTarget getTopAnchor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getTopOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SpatialObject getTopTarget(){
        //
        return null;
        //

        //
    }

    public boolean isExpandH(){
        //
        return false;
        //

        //
    }

    public boolean isExpandW(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"bottomAnchor"})
    public void setBottomAnchor(VerticalConstraintTarget value){
        //
    }

    @HideGetSet
    @MethodArgs({"offset"})
    public void setBottomOffset(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"gameObject"})
    public void setBottomTarget(SpatialObject value){
        //
    }

    @HideGetSet
    @MethodArgs({"expandH"})
    public void setExpandH(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"expandW"})
    public void setExpandW(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"leftAnchor"})
    public void setLeftAnchor(HorizontalConstraintTarget value){
        //
    }

    @HideGetSet
    @MethodArgs({"offset"})
    public void setLeftOffset(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"gameObject"})
    public void setLeftTarget(SpatialObject value){
        //
    }

    @HideGetSet
    @MethodArgs({"rightAnchor"})
    public void setRightAnchor(HorizontalConstraintTarget value){
        //
    }

    @HideGetSet
    @MethodArgs({"offset"})
    public void setRightOffset(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"gameObject"})
    public void setRightTarget(SpatialObject value){
        //
    }

    @HideGetSet
    @MethodArgs({"topAnchor"})
    public void setTopAnchor(VerticalConstraintTarget value){
        //
    }

    @HideGetSet
    @MethodArgs({"offset"})
    public void setTopOffset(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"gameObject"})
    public void setTopTarget(SpatialObject value){
        //
    }


}