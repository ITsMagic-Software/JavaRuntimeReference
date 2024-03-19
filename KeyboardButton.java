package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class KeyboardButton {
    //

    public KeyboardButton() {
        //
    }

    @HideGetSet
    public String getName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public String getPrintableName(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public boolean isUpperCase(){
        //
        return false;
        //

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
    public boolean isLongDown(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setLongPressed(boolean value){
        //
    }
}
