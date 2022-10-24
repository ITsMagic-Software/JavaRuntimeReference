package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public class Input {
    //

    public final static GamePad gamePad = new GamePad();
    public final static Keyboard keyboard = new Keyboard();

    private Input() { }

    /// Abstracts
    @MethodArgs(args ={"name"})
    public static Key getKey(String name){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public static Key registerKey(String name){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"key"})
    public static void registerKey(Key key){
        //
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyDown(String name){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyPressed(String name){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public static boolean isKeyUp(String name){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"id"})
    public static Touch getTouch(int id){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"id"})
    public static Vector2 getTouchPosition(int id){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"id","out"})
    public static Vector2 getTouchPosition(int id, Vector2 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchDown(int id){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchPressed(int id){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"id"})
    public static boolean isTouchUp(int id){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"name"})
    public static Axis getAxis(String name){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public static Axis registerAxis(String name){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public static Vector2 getAxisValue(String name){
        //
        return null;
        //

        //
    }

    public static Vector2 getMaxSlide(){
        //
        return null;
        //

        //
    }

    public static boolean isKeyboardOpen(){
        //
        return false;
        //

        //
    }
    public static void addKeyboardRequest(Component component){
        //
    }
    public static void removeKeyboardRequest(Component component){
        //
    }

    public static class GamePad{
        public GamePadButton getButton(String name){
            //
            return null;
            //

            //
        }

        public float getAxis(String name) {
            //
            return 0;
            //

            //
        }

        public Vector2 getLeftJoystick() {
            //
            return null;
            //

            //
        }
        public Vector2 getRightJoystick() {
            //
            return null;
            //

            //
        }
        public String[] getAvailableButtons() {
            //
            return null;
            //

            //
        }
        public String[] getAvailableAxis() {
            //
            return null;
            //

            //
        }
    }
    public static class Keyboard{

        public KeyboardButton getKey(String name){
            //
            return null;
            //

            //
        }

        public List<KeyboardButton> getDownButtons(){
            //
            return null;
            //

            //
        }
        public List<KeyboardButton> getPressedButtons(){
            //
            return null;
            //

            //
        }
        public List<KeyboardButton> getUpButtons(){
            //
            return null;
            //

            //
        }

        public String[] getAvailableKeys() {
            //
            return null;
            //

            //
        }
    }
}
