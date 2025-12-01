package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Toast {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;

    private Toast() { }

    @JRDoc_EN("Shows a toast message on the screen with the given text and duration (use Toast.LENGTH_SHORT or Toast.LENGTH_LONG for length).")
    @JRDoc_PT("Exibe uma mensagem toast na tela com o texto e duração informados (use Toast.LENGTH_SHORT ou Toast.LENGTH_LONG para o length).")
    @MethodArgs({"text","length"})
    public static void showText(String text, int length){
        //
    }
}

