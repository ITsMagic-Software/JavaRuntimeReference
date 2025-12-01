package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Time"})
public class TimeCounter {
    //

    public TimeCounter() {}

    @JRDoc_EN("Starts the time counter.")
    @JRDoc_PT("Inicia o contador de tempo.")
    public void start(){
        //
    }
    @JRDoc_EN("Finishes the time counter and calculates the elapsed time.")
    @JRDoc_PT("Finaliza o contador de tempo e calcula o tempo decorrido.")
    public void finish(){
        //
    }

    @JRDoc_EN("Returns the elapsed time in milliseconds.")
    @JRDoc_PT("Retorna o tempo decorrido em milissegundos.")
    @HideGetSet
    public float getElapsedMilliseconds(){
        //
        return 0;
        //

        //
    }

    @JRDoc_EN("Returns the elapsed time in seconds.")
    @JRDoc_PT("Retorna o tempo decorrido em segundos.")
    @HideGetSet
    public float getElapsedSeconds(){
        //
        return 0;
        //

        //
    }
}
