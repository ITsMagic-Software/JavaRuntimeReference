package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Vector.Vector2;
import com.itsmagic.engine.Engines.Input.Input;
//>REMOVE-BRIDGE<

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public final class GUIUtils {
    public enum TouchFilter{
        All, Pressed, Down, Up, DownAndPressed, DownAndUp, PressedAndUp
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static boolean applyFilter(com.itsmagic.engine.Engines.Input.VOS.Touch touch, TouchFilter touchFilter){
        if(touchFilter == TouchFilter.All){
            return touch.isDown() || touch.isPressed() || touch.isUp();
        }
        else if(touchFilter == TouchFilter.Pressed){
            return touch.isPressed();
        }
        else if(touchFilter == TouchFilter.Down){
            return touch.isDown();
        }
        else if(touchFilter == TouchFilter.Up){
            return touch.isUp();
        }
        else if(touchFilter == TouchFilter.DownAndPressed){
            return touch.isDown() || touch.isPressed();
        }
        else if(touchFilter == TouchFilter.DownAndUp){
            return touch.isDown() || touch.isUp();
        }
        else if(touchFilter == TouchFilter.PressedAndUp){
            return touch.isPressed() || touch.isUp();
        }
        return false;
    }
    //>REMOVE-BRIDGE<

    private GUIUtils() { }

    /// Abstracts
    @MethodArgs(args ={"touch","x","y","width","height"})
    public static boolean isTouchInside(Touch touch, int x, int y, int width, int height){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2 pos = touch.touch.getGameViewPosition();
        return pos.x >= x && pos.x <= x + width
                && pos.y >= y && pos.y <= y + height;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","width","height"})
    public static Touch determineTouch(int x, int y, int width, int height){
        return determineTouch(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args ={"x","y","width","height","touchFilter"})
    public static Touch determineTouch(int x, int y, int width, int height, TouchFilter touchFilter){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        List<com.itsmagic.engine.Engines.Input.VOS.Touch> inputTouches = Input.touchs;
        for (int i = 0; i < inputTouches.size(); i++) {
            com.itsmagic.engine.Engines.Input.VOS.Touch touch = inputTouches.get(i);
            if(touch != null && applyFilter(touch, touchFilter)){
                Vector2 pos = touch.getGameViewPosition();
                if(pos.x >= x && pos.x <= x + width){
                    if(pos.y >= y && pos.y <= y + height){
                        return touch.toJAVARuntime();
                    }
                }
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","width","height"})
    public static Touch[] determineTouches(int x, int y, int width, int height){
        return determineTouches(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args ={"x","y","width","height","touchFilter"})
    public static Touch[] determineTouches(int x, int y, int width, int height, TouchFilter touchFilter){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        ArrayList<Touch> touches = new ArrayList<>();
        List<com.itsmagic.engine.Engines.Input.VOS.Touch> inputTouches = Input.touchs;
        for (int i = 0; i < inputTouches.size(); i++) {
            com.itsmagic.engine.Engines.Input.VOS.Touch touch = inputTouches.get(i);
            if(applyFilter(touch, touchFilter)){
                Vector2 pos = touch.getGameViewPosition();
                if(pos.x >= x && pos.x <= x + width){
                    if(pos.y >= y && pos.y <= y + height){
                        touches.add(touch.toJAVARuntime());
                    }
                }
            }
        }
        if(!touches.isEmpty()) {
            Touch[] touchesArray = new Touch[touches.size()];
            for (int i = 0; i < touches.size(); i++) {
                touchesArray[i] = touches.get(i);
            }
            return touchesArray;
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","width","height"})
    public static List<Touch> determineTouchList(int x, int y, int width, int height){
        return determineTouchList(x, y, width, height, TouchFilter.All);
    }
    @MethodArgs(args ={"x","y","width","height","touchFilter"})
    public static List<Touch> determineTouchList(int x, int y, int width, int height, TouchFilter touchFilter){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        List<Touch> touches = new LinkedList<>();
        List<com.itsmagic.engine.Engines.Input.VOS.Touch> inputTouches = Input.touchs;
        for (int i = 0; i < inputTouches.size(); i++) {
            com.itsmagic.engine.Engines.Input.VOS.Touch touch = inputTouches.get(i);
            if(applyFilter(touch, touchFilter)){
                Vector2 pos = touch.getGameViewPosition();
                if(pos.x >= x && pos.x <= x + width){
                    if(pos.y >= y && pos.y <= y + height){
                        touches.add(touch.toJAVARuntime());
                    }
                }
            }
        }
        return touches;
        //>REMOVE-BRIDGE<
    }


}
