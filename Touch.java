package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Touch {
    //

    public Touch() {
        //
    }

    @JRDoc_EN("Checks whether the touch is currently being held down. This returns true on every frame while it remains pressed.")
    @JRDoc_PT("Verifica se o toque está sendo mantido pressionado. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado.")
    @HideGetSet
    public boolean isPressed(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the touch is currently being held down.")
    @JRDoc_PT("Define se o toque está sendo mantido pressionado.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setPressed(boolean value){
        //
    }
    
    @JRDoc_EN("Checks whether the touch was just pressed. This returns true only on the first frame it was pressed.")
    @JRDoc_PT("Verifica se o toque acabou de ser pressionado. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado.")
    @HideGetSet
    public boolean isDown(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the touch was just pressed.")
    @JRDoc_PT("Define se o toque acabou de ser pressionado.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setDown(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the touch was just released. This returns true only on the first frame after it was released.")
    @JRDoc_PT("Verifica se o toque acabou de ser liberado. Retorna verdadeiro apenas no primeiro quadro após ele ser liberado.")
    @HideGetSet
    public boolean isUp(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the touch was just released.")
    @JRDoc_PT("Define se o toque acabou de ser liberado.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setUp(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the touch was just long-pressed. This returns true only on the first frame it was long-pressed.")
    @JRDoc_PT("Verifica se o toque acabou de ser pressionado por muito tempo. Retorna verdadeiro apenas no primeiro quadro em que ele foi pressionado por muito tempo.")
    @HideGetSet
    public boolean isLongDown(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the touch was just long-pressed.")
    @JRDoc_PT("Define se o toque acabou de ser pressionado por muito tempo.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setLongDown(boolean value){
        //
    }

    @JRDoc_EN("Checks whether the touch is being long-pressed. This returns true on every frame while it remains pressed for a long duration.")
    @JRDoc_PT("Verifica se o toque está sendo mantido pressionado por um longo período. Retorna verdadeiro em todos os quadros enquanto ele permanecer pressionado por muito tempo.")
    @HideGetSet
    public boolean isLongPressed(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the touch is being long-pressed.")
    @JRDoc_PT("Define se o toque está sendo mantido pressionado por um longo período.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setLongPressed(boolean value){
        //
    }

    @JRDoc_EN("Returns whether this touch came from a mouse click.")
    @JRDoc_PT("Retorna se o toque veio de um clique de um mouse.")
    @HideGetSet
    public boolean isFromMouse(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether this touch came from a mouse click.")
    @JRDoc_PT("Define se esse toque veio de um mouse.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setIsFromMouse(boolean value){
        //
    }

    @JRDoc_EN("Checks if the touch is slided.")
    @JRDoc_PT("Verifica se o toque deslizou.")
    @HideGetSet
    public boolean isSlided(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets if the touch is slided.")
    @JRDoc_PT("Define se o toque deslizou.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setSlided(boolean value){
        //
    }

    @JRDoc_EN("Returns the position of the touch.")
    @JRDoc_PT("Retorna a posição do toque.")
    @HideGetSet
    public Vector2 getPosition(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the position of the touch.")
    @JRDoc_PT("Define a posição do toque.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setPosition(Vector2 value){
        //
    }

    @JRDoc_EN("Returns the slide vector of the touch.")
    @JRDoc_PT("Retorna o vetor de deslize do toque.")
    @HideGetSet
    public Vector2 getSlide(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the slide vector of the touch.")
    @JRDoc_PT("Define o vetor de deslize do toque.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setSlide(Vector2 value){
        //
    }
}
