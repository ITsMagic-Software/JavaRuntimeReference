package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Input"})
public class Touch {
    //

    public Touch() {
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
    @MethodArgs(args={"value"})
    public void setPressed(boolean value){
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
    @MethodArgs(args={"value"})
    public void setDown(boolean value){
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
    @MethodArgs(args={"value"})
    public void setUp(boolean value){
        //
    }

    @HideGetSet
    public boolean isLongDown(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setLongDown(boolean value){
        //
    }

    @HideGetSet
    public boolean isLongPressed(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setLongPressed(boolean value){
        //
    }

    @HideGetSet
    public boolean isSlided(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSlided(boolean value){
        //
    }

    @HideGetSet
    public Vector2 getPosition(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setPosition(Vector2 value){
        //
    }

    @HideGetSet
    public Vector2 getSlide(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSlide(Vector2 value){
        //
    }
}
