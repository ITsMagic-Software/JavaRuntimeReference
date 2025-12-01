package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class GamePadButton {
    //

    public GamePadButton() {
        //
    }

    @JRDoc_EN("Checks whether the button is currently being held down. This returns true on every frame while it remains pressed.")
    @JRDoc_PT("Verifica se o botão está sendo mantido pressionado. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado.")
    @HideGetSet
    public boolean isPressed(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the button is currently being held down.")
    @JRDoc_PT("Define se o botão está sendo mantido pressionado.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setPressed(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the button was just pressed. This returns true only on the first frame it was pressed.")
    @JRDoc_PT("Verifica se o botão acabou de ser pressionado. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado.")
    @HideGetSet
    public boolean isDown(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the button was just pressed.")
    @JRDoc_PT("Define se o botão acabou de ser pressionado.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setDown(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the button was just long-pressed. This returns true only on the first frame it was long-pressed.")
    @JRDoc_PT("Verifica se o botão acabou de ser pressionado por muito tempo. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado por muito tempo.")
    @HideGetSet
    public boolean isLongDown(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the button was just long-pressed.")
    @JRDoc_PT("Define se o botão acabou de ser pressionado por muito tempo.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setLongDown(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the button is being long-pressed. This returns true on every frame while it remains pressed for a long duration.")
    @JRDoc_PT("Verifica se o botão está sendo mantido pressionado por um longo período. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado por muito tempo.")
    @HideGetSet
    public boolean isLongPressed(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the button is being long-pressed.")
    @JRDoc_PT("Define se o botão está sendo mantido pressionado por um longo período.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setLongPressed(boolean value){
        //
    }
}