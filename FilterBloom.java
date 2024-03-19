package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterBloom extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Bloom filter;
    @IgnoreAutoComplete
    public FilterBloom(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Bloom filter) {
        super("Bloom");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterBloom() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Bloom());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.Bloom) super.filter;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getResolution(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.resolution;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolution(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.resolution = value;
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
