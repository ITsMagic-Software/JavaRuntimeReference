package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"CameraFilters"})
public final class FilterRadialFlare extends CameraFilter{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.RadialFlare filter;
    @IgnoreAutoComplete
    public FilterRadialFlare(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.RadialFlare filter) {
        super("FilterRadialFlare");
        this.filter = filter;
    }
    //>REMOVE-BRIDGE<

    public FilterRadialFlare() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.RadialFlare());
        this.filter = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.RadialFlare) super.filter;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFlareBrightness(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getFlareBrightness();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFlareBrightness(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.setFlareBrightness(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getImageBrightness(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getImageBrightness();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImageBrightness(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.setImageBrightness(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRadialLength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getRadialLength();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRadialLength(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        filter.setRadialLength(value);
        //>REMOVE-BRIDGE<
    }
}
