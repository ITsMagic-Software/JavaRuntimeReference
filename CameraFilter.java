package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filter;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filters.JavaFilter;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"CameraFilters"})
public class CameraFilter{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public enum Type{JavaFilter, EngineFilter}

    @IgnoreAutoComplete
    public transient Type type;

    // CALL THIS WHEN THIS CLASS EXTENDS A ENGINE COMPONENT
    @IgnoreAutoComplete
    public transient Filter filter;
    @IgnoreAutoComplete
    @MethodArgs(args ={"filter","camera"})
    public CameraFilter(Filter filter, com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera camera) {
        this.filter = filter;
        this.type = Type.EngineFilter;
        this.setFilterCamera(camera);
    }
    
    @MethodArgs(args ={"filter"})
    public CameraFilter(Filter filter) {
        this.filter = filter;
        this.type = Type.EngineFilter;
        this.setFilterCamera(filter.camera);
    }

    // CALL THIS WHEN THIS CLASS EXTENDS A JAVA SCRIPT
    @IgnoreAutoComplete
    public transient JavaFilter javaFilter;
    @IgnoreAutoComplete
    @MethodArgs(args ={"javaFilter","camera"})
    public CameraFilter(JavaFilter javaFilter, com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera camera) {
        this.javaFilter = javaFilter;
        this.type = Type.JavaFilter;
        this.setFilterCamera(camera);
    }

    @IgnoreAutoComplete
    @MethodArgs(args ={"camera"})
    public void setFilterCamera(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera camera){
        if(camera != null) {
            this.myCamera = (Camera) camera.toJAVARuntime();
        } else {
            this.myCamera = null;
        }
    }
    //>REMOVE-BRIDGE<

    // USED TO ACCESS MYOBJECT FROM JAVA SCRIPTS
    public transient Camera myCamera;

    public CameraFilter() {
    }
    @MethodArgs(args ={"tittle"})
    public CameraFilter(String tittle) {
        //<REMOVE-BRIDGE>
        this.filter = new Filter(tittle);
        //>REMOVE-BRIDGE<
    }

    public void start(){

    }

    public void preDraw(){
        //<REMOVE-BRIDGE>
        if(filter != null && javaFilter == null){
            filter.preDraw(myCamera.getFrameBuffer().frameBuffer, myCamera.instance);
        }
        //>REMOVE-BRIDGE<
    }
    public void posDraw(){
        //<REMOVE-BRIDGE>
        if(filter != null && javaFilter == null){
            filter.posDraw(myCamera.getFrameBuffer().frameBuffer, myCamera.instance);
        }
        //>REMOVE-BRIDGE<
    }
    public void onDestroy(){
        //<REMOVE-BRIDGE>
        if(filter != null && javaFilter == null){
            filter.onDestroy();
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return filter.getTittle();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"tittle"})
    public void setTittle(String tittle){
        //<REMOVE-BRIDGE>
        filter.setSerialisedType(tittle);
        //>REMOVE-BRIDGE<
    }

    public String getFilterMenu(){
        return null;
    }
}
