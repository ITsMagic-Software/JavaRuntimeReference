package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterGaussianBlur extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.GaussianBlur filter;
    @IgnoreAutoComplete
    public FilterGaussianBlur(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.GaussianBlur filter) {
        super("GaussianBlur");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterGaussianBlur() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.GaussianBlur());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.GaussianBlur) super.filter;
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
    public float getSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.size;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSize(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.size = value;
        //>REMOVE-BRIDGE<
    }
}
