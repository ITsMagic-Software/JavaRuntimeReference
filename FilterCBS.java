package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterCBS extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.CBS filter;
    @IgnoreAutoComplete
    public FilterCBS(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.CBS filter) {
        super("CBS");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterCBS() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.CBS());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.CBS) super.filter;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSaturation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.saturation;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSaturation(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.saturation = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getBrightness(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.brightness;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBrightness(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.brightness = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getContrast(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.contrast;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setContrast(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.contrast = value;
        //>REMOVE-BRIDGE<
    }
}
