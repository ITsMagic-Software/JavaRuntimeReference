package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIScrollView extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView instance;
    @IgnoreAutoComplete
    public SUIScrollView(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public SUIScrollView(Engine engine){}
    //>REMOVE-BRIDGE<

        public SUIScrollView() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView());
        //>REMOVE-BRIDGE<
    }

    public enum LayoutObject {
        Child0, Other
    }
    //<REMOVE-BRIDGE>
    private static LayoutObject ENUMCONVERT(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.LayoutObject un){
        return LayoutObject.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.LayoutObject ENUMCONVERT(LayoutObject un){
        return com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.LayoutObject.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum Orientation {
        Horizontal, Vertical, Both
    }
    //<REMOVE-BRIDGE>
    private static Orientation ENUMCONVERT(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.Orientation un){
        return Orientation.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.Orientation ENUMCONVERT(Orientation un){
        return com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIScrollView.Orientation.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public LayoutObject getLayoutObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getLayoutObject());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Orientation getOrientation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getOrientation());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getScrollX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScrollX();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getScrollY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScrollY();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayoutObject(LayoutObject value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setLayoutObject( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOrientation(Orientation value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setOrientation( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScrollX(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setScrollX( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScrollY(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setScrollY( value);
        //>REMOVE-BRIDGE<
    }


}