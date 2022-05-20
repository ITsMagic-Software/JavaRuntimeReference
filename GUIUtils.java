package JAVARuntime;

//

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"GUI"})
public class GUIUtils {
    public enum TouchFilter{
        All, Pressed, Down, Up, DownAndPressed, DownAndUp, PressedAndUp
    }

    //

    private GUIUtils() { }

    /// Abstracts
    @MethodArgs(args={"touch","x","y","width","height"})
    public static boolean isTouchInside(Touch touch, int x, int y, int width, int height){
        //
        return false;
        //

        //
    }

    @MethodArgs(args={"x","y","width","height"})
    public static Touch determineTouch(int x, int y, int width, int height){
        return determineTouch(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args={"x","y","width","height","touchFilter"})
    public static Touch determineTouch(int x, int y, int width, int height, TouchFilter touchFilter){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"x","y","width","height"})
    public static Touch[] determineTouches(int x, int y, int width, int height){
        return determineTouches(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args={"x","y","width","height","touchFilter"})
    public static Touch[] determineTouches(int x, int y, int width, int height, TouchFilter touchFilter){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"x","y","width","height"})
    public static List<Touch> determineTouchList(int x, int y, int width, int height){
        return determineTouchList(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args={"x","y","width","height","touchFilter"})
    public static List<Touch> determineTouchList(int x, int y, int width, int height, TouchFilter touchFilter){
        //
        return null;
        //

        //
    }
}
