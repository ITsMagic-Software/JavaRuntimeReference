package JAVARuntime;

//
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Input {
    //

    public final static GamePad gamePad = new GamePad();
    public final static Keyboard keyboard = new Keyboard();
    public final static Mouse mouse = new Mouse();

    private Input() { }

    /// Abstracts
    @JRDoc_EN("Checks if the specified key exists.")
    @JRDoc_PT("Verifica se a key especificada existe.")
    @MethodArgs({"name"})
    public static boolean haveKey(String name){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns the specified key.")
    @JRDoc_PT("Retorna a key especificada.")
    @MethodArgs({"name"})
    public static Key getKey(String name){
        if(name == null || name.isEmpty()) return null;
        return registerKey(name);
    }
    @JRDoc_EN("Registers and returns the specified key.")
    @JRDoc_PT("Registra e retorna a key especificada.")
    @MethodArgs({"name"})
    public static Key registerKey(String name){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Registers the specified key.")
    @JRDoc_PT("Registra a key especificada.")
    @MethodArgs({"key"})
    public static void registerKey(Key key){
        //
    }
    @JRDoc_EN("Checks whether the specified Key was just pressed. This returns true only on the first frame it was pressed.")
    @JRDoc_PT("Verifica se a Key especificada acabou de ser pressionada. Retorna verdadeiro apenas no primeiro quadro em que ela foi pressionada.")
    @MethodArgs({"name"})
    public static boolean isKeyDown(String name){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks whether the specified Key is currently being held down. This returns true on every frame while it remains pressed.")
    @JRDoc_PT("Verifica se a Key especificada está sendo mantida pressionada. Retorna verdadeiro em todos os quadros enquanto ela permanecer pressionada.")
    @MethodArgs({"name"})
    public static boolean isKeyPressed(String name){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks whether the specified Key was just released. This returns true only on the first frame after it was released.")
    @JRDoc_PT("Verifica se a Key especificada acabou de ser liberada. Retorna verdadeiro apenas no primeiro quadro após ela ser liberada.")
    @MethodArgs({"name"})
    public static boolean isKeyUp(String name){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns the touch of the specified ID.")
    @JRDoc_PT("Retorna o toque do ID especificado.")
    @MethodArgs({"id"})
    public static Touch getTouch(int id){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the position of the touch of the specified ID.")
    @JRDoc_PT("Retorna a posição do toque do ID especificado.")
    @MethodArgs({"id"})
    public static Vector2 getTouchPosition(int id){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the position of the touch of the specified ID and stores it in the provided Vector2.")
    @JRDoc_PT("Retorna a posição do toque do ID especificado e a armazena no Vector2 fornecido.")
    @MethodArgs({"id","out"})
    public static Vector2 getTouchPosition(int id, Vector2 out){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Checks whether the touch of the specified ID was just pressed. This returns true only on the first frame it was pressed.")
    @JRDoc_PT("Verifica se o toque do ID especificado acabou de ser pressionado. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado.")
    @MethodArgs({"id"})
    public static boolean isTouchDown(int id){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks whether the touch of the specified ID is currently being held down. This returns true on every frame while it remains pressed.")
    @JRDoc_PT("Verifica se o toque do ID especificado está sendo mantido pressionado. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado.")
    @MethodArgs({"id"})
    public static boolean isTouchPressed(int id){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks whether the touch of the specified ID was just released. This returns true only on the first frame after it was released.")
    @JRDoc_PT("Verifica se o toque do ID especificado acabou de ser liberado. Retorna verdadeiro apenas no primeiro quadro após ele ser liberado.")
    @MethodArgs({"id"})
    public static boolean isTouchUp(int id){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns the Axis associated with the specified name.")
    @JRDoc_PT("Retorna o Axis associado ao nome especificado.")
    @MethodArgs({"name"})
    public static Axis getAxis(String name){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Registers and returns the Axis associated with the specified name. If the Axis does not exist, it will be created.")
    @JRDoc_PT("Registra e retorna o Axis associado ao nome especificado. Se o Axis não existir, ele será criado.")
    @MethodArgs({"name"})
    public static Axis registerAxis(String name){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the value of the specified Axis.")
    @JRDoc_PT("Retorna o valor do Axis especificado.")
    @MethodArgs({"name"})
    public static Vector2 getAxisValue(String name){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the slide vector of the touch that moved the farthest.")
    @JRDoc_PT("Retorna o vetor de deslize do toque que mais se deslocou.")
    public static Vector2 getMaxSlide(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Checks if the virtual keyboard is currently open.")
    @JRDoc_PT("Verifica se o teclado virtual está atualmente aberto.")
    public static boolean isKeyboardOpen(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Requests the opening of the virtual keyboard for the specified component.")
    @JRDoc_PT("Solicita a abertura do teclado virtual para o componente especificado.")
    @MethodArgs({"component"})
    public static void addKeyboardRequest(Component component){
        //
    }
    @JRDoc_EN("Removes the keyboard request from the specified component.")
    @JRDoc_PT("Remove a solicitação de teclado do componente especificado.")
    @MethodArgs({"component"})
    public static void removeKeyboardRequest(Component component){
        //
    }

    public static class GamePad{
        @JRDoc_EN("Returns the gamepad button associated with the specified name.")
        @JRDoc_PT("Retorna o botão do gamepad associado ao nome especificado.")
        @MethodArgs({"name"})
        public GamePadButton getButton(String name){
            //
            return null;
            //

            //
        }

        @JRDoc_EN("Returns the value of the gamepad axis associated with the specified name.")
        @JRDoc_PT("Retorna o valor do axis do gamepad associado ao nome especificado.")
        @MethodArgs({"name"})
        public float getAxis(String name) {
            //
            return 0;
            //

            //
        }

        @JRDoc_EN("Returns the position of the left joystick.")
        @JRDoc_PT("Retorna a posição do joystick esquerdo.")
        public Vector2 getLeftJoystick() {
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns the position of the right joystick.")
        @JRDoc_PT("Retorna a posição do joystick direito.")
        public Vector2 getRightJoystick() {
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns the available buttons on the gamepad.")
        @JRDoc_PT("Retorna os botões disponíveis no gamepad.")
        public String[] getAvailableButtons() {
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns the available axis on the gamepad.")
        @JRDoc_PT("Retorna os axis disponíveis no gamepad.")
        public String[] getAvailableAxis() {
            //
            return null;
            //

            //
        }
    }
    public static class Keyboard{
        @JRDoc_EN("Returns the keyboard button associated with the specified name.")
        @JRDoc_PT("Retorna o botão do teclado associado ao nome especificado.")
        @MethodArgs({"name"})
        public KeyboardButton getKey(String name){
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Checks whether the specified key is currently being held down. This returns true on every frame while it remains pressed.")
        @JRDoc_PT("Verifica se a tecla especificada está sendo mantida pressionada. Retorna verdadeiro em todos os quadros enquanto ela permanecer pressionada.")
        @MethodArgs({"name"})
        public boolean isKeyPressed(String name){
            KeyboardButton k = getKey(name);
            if(k == null) return false;
            return k.isPressed();
        }
        @JRDoc_EN("Checks whether the specified key was just pressed. This returns true only on the first frame it was pressed.")
        @JRDoc_PT("Verifica se a tecla especificada acabou de ser pressionada. Retorna verdadeiro apenas no primeiro quadro em que ela foi pressionada.")
        @MethodArgs({"name"})
        public boolean isKeyDown(String name){
            KeyboardButton k = getKey(name);
            if(k == null) return false;
            return k.isDown();
        }
        @JRDoc_EN("Checks whether the specified key was just released. This returns true only on the first frame after it was released.")
        @JRDoc_PT("Verifica se a tecla especificada acabou de ser liberada. Retorna verdadeiro apenas no primeiro quadro após ela ser liberada.")
        @MethodArgs({"name"})
        public boolean isKeyUp(String name){
            KeyboardButton k = getKey(name);
            if(k == null) return false;
            return k.isUp();
        }

        @JRDoc_EN("Returns a list of buttons that were just pressed. This includes all buttons pressed in the current frame.")
        @JRDoc_PT("Retorna uma lista de botões que acabaram de ser pressionados. Inclui todos os botões pressionados no quadro atual.")
        public List<KeyboardButton> getDownButtons(){
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns a list of buttons that are currently being held down. This includes all buttons pressed across frames.")
        @JRDoc_PT("Retorna uma lista de botões que estão sendo mantidos pressionados. Inclui todos os botões pressionados ao longo dos quadros.")
        public List<KeyboardButton> getPressedButtons(){
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns a list of buttons that were just released. This includes all buttons released in the current frame.")
        @JRDoc_PT("Retorna uma lista de botões que acabaram de ser liberados. Inclui todos os botões liberados no quadro atual.")
        public List<KeyboardButton> getUpButtons(){
            //
            return null;
            //

            //
        }

        @JRDoc_EN("Returns the available buttons on the keyboard.")
        @JRDoc_PT("Retorna os botões disponíveis no teclado.")
        public String[] getAvailableKeys() {
            //
            return null;
            //

            //
        }

        @JRDoc_EN("Checks if Caps Lock is on.")
        @JRDoc_PT("Verifica se o Caps Lock está ativado.")
        public boolean isCapslockOn() {
            //
            return false;
            //

            //
        }
    }
    public static class Mouse{
        @JRDoc_EN("Returns the X position of the mouse.")
        @JRDoc_PT("Retorna a posição X do mouse.")
        public int getX() {
            //
            return 0;
            //

            //
        }
        @JRDoc_EN("Returns the Y position of the mouse.")
        @JRDoc_PT("Retorna a posição Y do mouse.")
        public int getY() {
            //
            return 0;
            //

            //
        }

        @JRDoc_EN("Returns the horizontal slide of the mouse.")
        @JRDoc_PT("Retorna o deslocamento horizontal do mouse.")
        public float getSlideX() {
            //
            return 0;
            //

            //
        }
        @JRDoc_EN("Returns the vertical slide of the mouse.")
        @JRDoc_PT("Retorna o deslocamento vertical do mouse.")
        public float getSlideY() {
            //
            return 0;
            //

            //
        }

        @JRDoc_EN("Returns the vertical scroll of the mouse.")
        @JRDoc_PT("Retorna a rolagem vertical do mouse.")
        public float getVerticalScroll() {
            //
            return 0;
            //

            //
        }

        @JRDoc_EN("Checks whether the left button is currently being held down. This returns true on every frame while it remains pressed.")
        @JRDoc_PT("Verifica se o botão esquerdo está sendo mantido pressionado. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado.")
        public boolean isLeftClickPressed() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the left button was just pressed. This returns true only on the first frame it was pressed.")
        @JRDoc_PT("Verifica se o botão esquerdo acabou de ser pressionado. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado.")
        public boolean isLeftClickDown() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the left button is being long-pressed. This returns true on every frame while it remains pressed for a long duration.")
        @JRDoc_PT("Verifica se o botão esquerdo está sendo mantido pressionado por um longo período. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado por muito tempo.")
        public boolean isLeftClickLongPressed() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the left button was just long-pressed. This returns true only on the first frame it was long-pressed.")
        @JRDoc_PT("Verifica se o botão esquerdo acabou de ser pressionado por muito tempo. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado por muito tempo.")
        public boolean isLeftClickLongDown() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the left button was just released. This returns true only on the first frame after it was released.")
        @JRDoc_PT("Verifica se o botão esquerdo acabou de ser liberado. Retorna verdadeiro apenas no primeiro quadro após ele ser liberado.")
        public boolean isLeftClickUp() {
            //
            return false;
            //

            //
        }

        @JRDoc_EN("Checks whether the right button is currently being held down. This returns true on every frame while it remains pressed.")
        @JRDoc_PT("Verifica se o botão direito está sendo mantido pressionado. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado.")
        public boolean isRightClickPressed() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the right button was just pressed. This returns true only on the first frame it was pressed.")
        @JRDoc_PT("Verifica se o botão direito acabou de ser pressionado. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado.")
        public boolean isRightClickDown() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the right button is being long-pressed. This returns true on every frame while it remains pressed for a long duration.")
        @JRDoc_PT("Verifica se o botão direito está sendo mantido pressionado por um longo período. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado por muito tempo.")
        public boolean isRightClickLongPressed() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the right button was just long-pressed. This returns true only on the first frame it was long-pressed.")
        @JRDoc_PT("Verifica se o botão direito acabou de ser pressionado por muito tempo. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado por muito tempo.")
        public boolean isRightClickLongDown() {
            //
            return false;
            //

            //
        }
        @JRDoc_EN("Checks whether the right button was just released. This returns true only on the first frame after it was released.")
        @JRDoc_PT("Verifica se o botão direito acabou de ser liberado. Retorna verdadeiro apenas no primeiro quadro após ele ser liberado.")
        public boolean isRightClickUp() {
            //
            return false;
            //

            //
        }

        @JRDoc_EN("Checks if the mouse is connected.")
        @JRDoc_PT("Verifica se o mouse está conectado.")
        public boolean isConnected() {
            //
            return false;
            //

            //
        }
    }
}
