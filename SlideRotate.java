package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class SlideRotate extends Component {

    //

        public SlideRotate() {
        //
        super();
        //

        //
    }

    public enum Direction {
        Vertical, Horizontal
    }
    //

    @HideGetSet
    public String getAxisName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getCurrentAngle(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Direction getDirection(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getMaxAngle(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getMinAngle(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSensibility(){
        //
        return 0;
        //

        //
    }

    public boolean isLimited(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setAxisName(String value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setCurrentAngle(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setDirection(Direction value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setLimited(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setMaxAngle(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setMinAngle(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setSensibility(float value){
        //
    }


}