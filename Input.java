package JAVARuntime;

//<REMOVE-BRIDGE>

import java.util.ArrayList;
//>REMOVE-BRIDGE<
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Input {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    public final static GamePad gamePad = new GamePad();
    public final static Keyboard keyboard = new Keyboard();

    private Input() { }

    /// Abstracts
    @MethodArgs(args ={"name"})
    public static boolean haveKey(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return false;
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name, false);
        if(key != null) {
            return true;
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static Key getKey(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return null;
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name, true);
        if(key != null) {
            return key.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static Key registerKey(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name, true);
        if(key != null) {
            return key.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void registerKey(Key key){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.Input.registerKey(key.key);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyDown(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return false;
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name);
        if(key == null){
            throw new NullPointerException("The key ("+name+") cannot be found");
        }
        return key.isDown();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyPressed(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return false;
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name);
        if(key == null){
            throw new NullPointerException("The key ("+name+") cannot be found");
        }
        return key.isPressed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyUp(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return false;
        com.itsmagic.engine.Engines.Input.VOS.Key key = com.itsmagic.engine.Engines.Input.Input.getKey(name);
        if(key == null){
            throw new NullPointerException("The key ("+name+") cannot be found");
        }
        return key.isUp();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"id"})
    public static Touch getTouch(int id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch != null) {
            return touch.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public static Vector2 getTouchPosition(int id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch == null) {
            throw new NullPointerException("The touch ("+id+") cannot be found");
        }
        return touch.getGameViewPosition().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id","out"})
    public static Vector2 getTouchPosition(int id, Vector2 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch == null) {
            throw new NullPointerException("The touch ("+id+") cannot be found");
        }
        if(out == null){
            throw new NullPointerException("out vector2 can't be null");
        }
        return touch.getGameViewPosition(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchDown(int id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch == null) {
            throw new NullPointerException("The touch ("+id+") cannot be found");
        }
        return touch.isDown();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchPressed(int id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch == null) {
            throw new NullPointerException("The touch ("+id+") cannot be found");
        }
        return touch.isPressed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchUp(int id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = com.itsmagic.engine.Engines.Input.Input.getTouch(id);
        if(touch == null) {
            throw new NullPointerException("The touch ("+id+") cannot be found");
        }
        return touch.isUp();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public static Axis getAxis(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(name == null || name.trim().isEmpty()) return null;
        com.itsmagic.engine.Engines.Input.VOS.Axis axis = com.itsmagic.engine.Engines.Input.Input.getAxis(name);
        if(axis != null) {
            return axis.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static Axis registerAxis(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Axis axis = com.itsmagic.engine.Engines.Input.Input.registerAxis(name);
        if(axis != null) {
            return axis.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public static Vector2 getAxisValue(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Axis axis = com.itsmagic.engine.Engines.Input.Input.getAxis(name);
        if(axis == null) {
            throw new NullPointerException("The axis ("+name+") cannot be found");
        }
        return axis.toJAVARuntime().getValue();
        //>REMOVE-BRIDGE<
    }

    public static Vector2 getMaxSlide(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Input.Input.getMaxSlide().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public static boolean isKeyboardOpen(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Input.Input.isKeyboardOpen();
        //>REMOVE-BRIDGE<
    }
    public static void addKeyboardRequest(Component component){
        //<REMOVE-BRIDGE>
        if(component == null){
            throw new NullPointerException("Component can't be null");
        }
        if(component.type == Component.Type.JavaComponent) {
            com.itsmagic.engine.Engines.Input.Input.addKeyboardRequest(component.javaComponent);
        } else {
            com.itsmagic.engine.Engines.Input.Input.addKeyboardRequest(component.component);
        }
        //>REMOVE-BRIDGE<
    }
    public static void removeKeyboardRequest(Component component){
        //<REMOVE-BRIDGE>
        if(component == null){
            throw new NullPointerException("Component can't be null");
        }
        if(component.type == Component.Type.JavaComponent) {
            com.itsmagic.engine.Engines.Input.Input.removeKeyboardRequest(component.javaComponent);
        } else {
            com.itsmagic.engine.Engines.Input.Input.removeKeyboardRequest(component.component);
        }
        //>REMOVE-BRIDGE<
    }

    public static class GamePad{
        public GamePadButton getButton(String name){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            com.itsmagic.engine.Engines.Input.VOS.GamePadButton button = com.itsmagic.engine.Engines.Input.Input.gamePad.getButton(name);
            if(button != null){
                return button.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }

        public float getAxis(String name) {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return 0;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return com.itsmagic.engine.Engines.Input.Input.gamePad.getAxis(name);
            //>REMOVE-BRIDGE<
        }

        public Vector2 getLeftJoystick() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            com.itsmagic.engine.Engines.Engine.Vector.Vector2 vector2 = com.itsmagic.engine.Engines.Input.Input.gamePad.getLeftJoystick();
            if(vector2 != null){
                return vector2.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }
        public Vector2 getRightJoystick() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            com.itsmagic.engine.Engines.Engine.Vector.Vector2 vector2 = com.itsmagic.engine.Engines.Input.Input.gamePad.getRightJoystick();
            if(vector2 != null){
                return vector2.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }
        public String[] getAvailableButtons() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return com.itsmagic.engine.Engines.Input.Input.gamePad.getAvailableButtons();
            //>REMOVE-BRIDGE<
        }
        public String[] getAvailableAxis() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return com.itsmagic.engine.Engines.Input.Input.gamePad.getAvailableAxis();
            //>REMOVE-BRIDGE<
        }
    }
    public static class Keyboard{

        public KeyboardButton getKey(String name){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            com.itsmagic.engine.Engines.Input.VOS.KeyboardButton button = com.itsmagic.engine.Engines.Input.Input.keyboard.getButton(name);
            if(button != null){
                return button.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }

        public List<KeyboardButton> getDownButtons(){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            List<KeyboardButton> out = new ArrayList<>();
            for (com.itsmagic.engine.Engines.Input.VOS.KeyboardButton value : com.itsmagic.engine.Engines.Input.Input.keyboard.getDownButtons()) {
                out.add(value.toJAVARuntime());
            }
            return out;
            //>REMOVE-BRIDGE<
        }
        public List<KeyboardButton> getPressedButtons(){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            List<KeyboardButton> out = new ArrayList<>();
            for (com.itsmagic.engine.Engines.Input.VOS.KeyboardButton value : com.itsmagic.engine.Engines.Input.Input.keyboard.getPressedButtons()) {
                out.add(value.toJAVARuntime());
            }
            return out;
            //>REMOVE-BRIDGE<
        }
        public List<KeyboardButton> getUpButtons(){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            List<KeyboardButton> out = new ArrayList<>();
            for (com.itsmagic.engine.Engines.Input.VOS.KeyboardButton value : com.itsmagic.engine.Engines.Input.Input.keyboard.getUpButtons()) {
                out.add(value.toJAVARuntime());
            }
            return out;
            //>REMOVE-BRIDGE<
        }

        public String[] getAvailableKeys() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return com.itsmagic.engine.Engines.Input.Input.keyboard.getAvailableButtons();
            //>REMOVE-BRIDGE<
        }
    }
}
