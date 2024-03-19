package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Editor"})
public class EditorPanel {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Activities.Editor.Interface.Objects.EditorPanel panel;
    @IgnoreAutoComplete
    public EditorPanel(com.itsmagic.engine.Activities.Editor.Interface.Objects.EditorPanel panel) {
        this.panel = panel;
    }
    @BuildClassConstructor
    public EditorPanel(Engine engine) {}
    //>REMOVE-BRIDGE<

    public EditorPanel() {
        //<REMOVE-BRIDGE>
        this.panel = null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"touch","x","y","width","height"})
    public boolean isTouchInside(Touch touch){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(touch == null){
            throw new NullPointerException("touch can't be null");
        }
        return panel.isTouchInside(touch.touch);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"touchFilter"})
    public Touch determineTouch(GUIUtils.TouchFilter touchFilter){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = panel.determineTouch(touchFilter, true);
        if(touch != null){
            return touch.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"touchFilter","offset"})
    public Touch determineTouch(GUIUtils.TouchFilter touchFilter, int offset){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Input.VOS.Touch touch = panel.determineTouch(touchFilter, offset,true);
        if(touch != null){
            return touch.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"touch"})
    public Vector2 determineTouchPosition(Touch touch){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        if(touch == null){
            throw new NullPointerException("touch can't be null");
        }
        com.itsmagic.engine.Engines.Engine.Vector.Vector2 pos = panel.getTouchPosition(touch.touch);
        if(pos != null){
            return pos.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"touch","out"})
    public Vector2 determineTouchPosition(Touch touch, Vector2 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        if(touch == null){
            throw new NullPointerException("touch can't be null");
        }
        com.itsmagic.engine.Engines.Engine.Vector.Vector2 pos = panel.getTouchPosition(touch.touch, out.instance);
        if(pos != null){
            return pos.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getContentXPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getContentXPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getContentYPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getContentYPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getContentWidthPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getContentWPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getContentHeightPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getContentHPixels();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getTotalXPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getXPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getTotalYPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getYPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getTotalWidthPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getWPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getTotalHeightPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getHPixels();
        //>REMOVE-BRIDGE<
    }

    public void requestDetach(){
        //<REMOVE-BRIDGE>
        panel.requestDetach();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isVisible(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.isVisible();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isFloating(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.isFloatingPanel();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.getTittle();
        //>REMOVE-BRIDGE<
    }

    public EditorPanel copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return panel.copy().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
}
