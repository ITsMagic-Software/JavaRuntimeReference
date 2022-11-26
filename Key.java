package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public class Key {
    //

    @MethodArgs(args ={"name"})
    public Key(String name){
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setUp(boolean value){
        //
    }

    @HideGetSet
    public String getName(){
        //
        return "";
        //

        //
    }
}
