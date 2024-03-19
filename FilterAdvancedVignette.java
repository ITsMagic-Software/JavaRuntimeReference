package JAVARuntime;
//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterAdvancedVignette extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.AdvancedVignette filter;
    @IgnoreAutoComplete
    public FilterAdvancedVignette(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.AdvancedVignette filter) {
        super("Bloom");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterAdvancedVignette() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.AdvancedVignette());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.AdvancedVignette) super.filter;
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

    @HideGetSet
    public float getStart(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getStart();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStart(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.setStart(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFade(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getFade();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFade(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.setFade(value);
        //>REMOVE-BRIDGE<
    }
}
