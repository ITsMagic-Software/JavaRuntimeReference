package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI"})
public class SUIJoystick extends Component{
    //

    public SUIJoystick() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getLerp(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLerp(float value){
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
    @MethodArgs(args ={"value"})
    public void setValue(Vector2 value){
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
    @MethodArgs(args ={"value"})
    public void setAxisName(String name){
        //
    }

    @HideGetSet
    public Axis getAxis(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAxis(Axis axis){
        //
    }

    @HideGetSet
    public boolean isSpherical(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpherical(boolean value){
        //
    }

    @HideGetSet
    public boolean isPressed(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public boolean isDown(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    public boolean isUp(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public boolean isClickable(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setClickable(boolean value){
        //
    }

    @HideGetSet
    public STargetRect getTargetRectType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTargetRectType(STargetRect value){
        //
    }

    @HideGetSet
    public SpatialObject getTargetRectObject(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTargetRectObject(SpatialObject object){
        //
    }

    //
}
