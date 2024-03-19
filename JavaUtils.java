package JAVARuntime;

@ClassCategory(cat ={"Java"})
public final class JavaUtils {

    @MethodArgs(args ={"value"})
    public static boolean isNull(Object value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value == null;
        //>REMOVE-BRIDGE<
    }
}
