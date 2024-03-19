package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterRose extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Rose filter;
    @IgnoreAutoComplete
    public FilterRose(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Rose filter) {
        super("Rose");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterRose() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Rose());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Rose) super.filter;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStrength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.color.getFAlpha();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStrength(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.color.setFAlpha(value);
        //>REMOVE-BRIDGE<
    }
}
