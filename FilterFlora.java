package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterFlora extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Flora filter;
    @IgnoreAutoComplete
    public FilterFlora(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Flora filter) {
        super("Flora");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterFlora() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Flora());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Flora) super.filter;
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
