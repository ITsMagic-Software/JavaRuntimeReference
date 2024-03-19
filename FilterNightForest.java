package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterNightForest extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.NightForest filter;
    @IgnoreAutoComplete
    public FilterNightForest(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.NightForest filter) {
        super("NightForest");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterNightForest() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.NightForest());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.NightForest) super.filter;
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
