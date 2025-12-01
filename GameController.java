package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class GameController {
    public enum State{
        Stopped, Paused, Running
    }

    private GameController() { }

    /// Abstracts
    @JRDoc_EN("Quits the game and closes the application (Only in APK).")
    @JRDoc_PT("Encerra o jogo e fecha a aplicação (Somente no APK).")
    public static void quit(){
        //
    }

    @JRDoc_EN("Returns the current state of the game (Stopped, Paused, or Running).")
    @JRDoc_PT("Retorna o estado atual do jogo (Parado, Pausado ou Rodando).")
    public static State getState(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Checks if frame limit is enabled.")
    @JRDoc_PT("Verifica se o limite de frames está ativado.")
    @HideGetSet
    public static boolean isEnableFrameLimit() {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Enables or disables the frame limit.")
    @JRDoc_PT("Ativa ou desativa o limite de frames.")
    @HideGetSet
    public static void setEnableFrameLimit(boolean enableFrameLimit) {
        //
    }

    @JRDoc_EN("Returns the maximum number of frames per second allowed.")
    @JRDoc_PT("Retorna o número máximo de frames por segundo permitido.")
    @HideGetSet
    public static int getLimitFrames() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the maximum number of frames per second.")
    @JRDoc_PT("Define o número máximo de frames por segundo.")
    @HideGetSet
    public static void setLimitFrames(int limitFrames) {
        //
    }
}
