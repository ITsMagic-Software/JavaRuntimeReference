package JAVARuntime;


//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public class Device {

    private Device() { }

    public static int availableProcessors(){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"url"})
    public static void openURL(String url){
        //
    }
    @MethodArgs(args ={"url"})
    public static void openLink(String url){
        //
    }

    @MethodArgs(args ={"pattern"})
    public static void vibrate(long... pattern){
        //
    }
    @MethodArgs(args ={"pattern, repeat"})
    public static void vibrate(final long[] pattern, int repeat){
        //
    }

    public static void stopVibrate(){
        //
    }

    @UnimplementedDoc
    @MethodArgs(args ={"text"})
    public static void setClipboard(String text) {
        //
    }
    @UnimplementedDoc
    public static String getClipboard(){
        //
        return null;
        //

        //
    }
}
