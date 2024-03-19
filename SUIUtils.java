package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI"})
public final class SUIUtils {

    private SUIUtils() { }

    @MethodArgs(args ={"position"})
    public static Vector2 convertTouchPosition(Point2 position){
        return convertTouchPosition(position.getX(), position.getY(), new Vector2());
    }

    @MethodArgs(args ={"position"})
    public static Vector2 convertTouchPosition(Vector2 position){
        return convertTouchPosition((int)position.getX(), (int)position.getY(), new Vector2());
    }

    @MethodArgs(args ={"x","y"})
    public static Vector2 convertTouchPosition(int x, int y){
        return convertTouchPosition(x, y, new Vector2());
    }

    @MethodArgs(args ={"x","y","out"})
    public static Vector2 convertTouchPosition(int x, int y, Vector2 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        out.setX(x);
        out.setY(Screen.height() - y - 1);
        return out;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"y"})
    public static int convertTouchPositionY(int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Screen.getHeight() - y - 1;
        //>REMOVE-BRIDGE<
    }
}
