package JAVARuntime;


//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class Device {

    private Device() { }

    @JRDoc_EN("Returns the device's battery percentage.")
    @JRDoc_PT("Retorna a porcentagem de bateria do dispositivo.")
    @UnimplementedDoc
    public static int getBatteryPercentage(){
        //
        return 0;
        //

        //
    }

    @JRDoc_EN("Returns the number of available processors on the device.")
    @JRDoc_PT("Retorna o número de processadores disponíveis no dispositivo.")
    public static int availableProcessors(){
        //
        return 0;
        //

        //
    }

    @JRDoc_EN("Opens the specified URL in the default web browser.")
    @JRDoc_PT("Abre a URL especificada no navegador padrão.")
    @MethodArgs({"url"})
    public static void openURL(String url){
        //
    }
    @JRDoc_EN("Opens the specified link in the default web browser.")
    @JRDoc_PT("Abre o link especificada no navegador padrão.")
    @MethodArgs({"url"})
    public static void openLink(String url){
        //
    }

    @JRDoc_EN("Vibrates the device for the specified duration (in milliseconds).")
    @JRDoc_PT("Faz o dispositivo vibrar pela duração especificada (em milissegundos).")
    @MethodArgs({"pattern"})
    public static void vibrateOneShot(long pattern){
        //
    }

    /**
     * * @param timings The pattern of alternating on-off timings, starting with an 'off' timing, and
     *                  representing the length of time to sustain the individual item (not
     *                  cumulative).
     *  @param repeat The index into the timings array at which to repeat, or -1 if you don't
     *                want to repeat indefinitely.
     */
    @JRDoc_EN("Makes the device vibrate following the time durations (in milliseconds) defined in the array, alternating between vibration and pause (starting with a pause). After completing the array, the repetition begins at the specified index (-1 to not repeat).")
    @JRDoc_PT("Faz o dispositivo vibrar seguindo as durações de tempo (em milissegundos) definidas no array, alternando entre vibração e pausa (iniciando com pausa). Após percorrer todo o array, a repetição começa no índice especificado (-1 para não repetir).")
    @MethodArgs({"timings, repeat"})
    public static void vibratePattern(final long[] timings, int repeat){
        //
    }

    @JRDoc_EN("Stops any ongoing vibration on the device.")
    @JRDoc_PT("Para qualquer vibração em andamento no dispositivo.")
    public static void stopVibrate(){
        //
    }

    @JRDoc_EN("Sets the visibility of the mouse cursor on the device.")
    @JRDoc_PT("Define a visibilidade do cursor do mouse no dispositivo.")
    @MethodArgs({"visible"})
    public static void setMouseVisible(boolean visible){
        //
    }

    @JRDoc_EN("Copies the given text to the device's clipboard.")
    @JRDoc_PT("Copia o texto fornecido para a área de transferência do dispositivo.")
    @UnimplementedDoc
    @MethodArgs({"text"})
    public static void setClipboard(String text) {
        //
    }
    @JRDoc_EN("Returns the text in the device's clipboard.")
    @JRDoc_PT("Retorna o texto da área de transferência do dispositivo.")
    @UnimplementedDoc
    public static String getClipboard(){
        //
        return null;
        //

        //
    }
}
