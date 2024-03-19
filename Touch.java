package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Touch {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Input.VOS.Touch touch;
    @IgnoreAutoComplete
    public Touch(com.itsmagic.engine.Engines.Input.VOS.Touch touch) {
        this.touch = touch;
    }
    //>REMOVE-BRIDGE<

    public Touch() {
        //<REMOVE-BRIDGE>
        this.touch = new com.itsmagic.engine.Engines.Input.VOS.Touch();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.isPressed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressed(boolean value){
        //<REMOVE-BRIDGE>
        touch.setPressed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.isDown();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDown(boolean value){
        //<REMOVE-BRIDGE>
        touch.setPressed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isUp(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.isUp();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUp(boolean value){
        //<REMOVE-BRIDGE>
        touch.setUp(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLongDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.isLongDown();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLongDown(boolean value){
        //<REMOVE-BRIDGE>
        touch.setLongDown(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLongPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.isLongPressed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLongPressed(boolean value){
        //<REMOVE-BRIDGE>
        touch.setLongPressed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isSlided(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.slided;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSlided(boolean value){
        //<REMOVE-BRIDGE>
        touch.slided = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getPosition(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.getGameViewPosition().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPosition(Vector2 value){
        //<REMOVE-BRIDGE>
        touch.getPosition().set(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getSlide(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return touch.getSlide().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSlide(Vector2 value){
        //<REMOVE-BRIDGE>
        touch.setSlide(value.instance);
        //>REMOVE-BRIDGE<
    }
}
