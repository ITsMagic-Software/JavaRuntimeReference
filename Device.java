package JAVARuntime;


//<REMOVE-BRIDGE>

import com.itsmagic.engine.Activities.Main.Main;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public final class Device {

    private Device() { }

    @UnimplementedDoc
    public static int getBatteryPercentage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Utils.Device.getBatteryPercentage();
        //>REMOVE-BRIDGE<
    }

    public static int availableProcessors(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Utils.Device.availableProcessors();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"url"})
    public static void openURL(String url){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.openURL(url);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"url"})
    public static void openLink(String url){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.openURL(url);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"pattern"})
    public static void vibrate(long... pattern){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.vibrate(pattern);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"pattern, repeat"})
    public static void vibrate(final long[] pattern, int repeat){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.vibrate(pattern, repeat);
        //>REMOVE-BRIDGE<
    }

    public static void stopVibrate(){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.stopVibrate();
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"text"})
    public static void setClipboard(String text) {
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Utils.Device.setClipboard(Main.getContext(), text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public static String getClipboard(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Utils.Device.getClipboard(Main.getContext());
        //>REMOVE-BRIDGE<
    }
}
