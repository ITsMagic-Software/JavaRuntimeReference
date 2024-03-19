package JAVARuntime;

//<REMOVE-BRIDGE>

import com.itsmagic.engine.Activities.Main.Main;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public final class Toast {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;

    private Toast() { }

    @MethodArgs(args ={"text","length"})
    public static void showText(String text, int length){
        //<REMOVE-BRIDGE>
        Main.runOnUiThread(new java.lang.Runnable() {
            @Override
            public void run() {
                android.widget.Toast.makeText(Main.getContext(), text, length).show();
            }
        });
        //>REMOVE-BRIDGE<
    }
}

