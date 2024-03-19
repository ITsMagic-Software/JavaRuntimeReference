package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterChromaticAberration extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.ChromaticAberration filter;
    @IgnoreAutoComplete
    public FilterChromaticAberration(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.ChromaticAberration filter) {
        super("ChromaticAberration");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterChromaticAberration() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.ChromaticAberration());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.ChromaticAberration) super.filter;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getIntensity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.intensity;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setIntensity(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.intensity = value;
        //>REMOVE-BRIDGE<
    }
}
