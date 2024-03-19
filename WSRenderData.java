package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Graphics.RuntimeShading.WorldShaderDataListener;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Shaders"})
public class WSRenderData {

    //<REMOVE-BRIDGE>
    public transient WorldShaderDataListener listener;
    public WSRenderData(WorldShaderDataListener listener) {
        this.listener = listener;
    }
    //>REMOVE-BRIDGE<

    private WSRenderData() { }

    public int lightCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return listener.lightCount();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Light lightAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.ComponentsV2.Light.Light obj = listener.lightAt(idx);
        if(obj != null){
            return (Light) obj.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    public int cameraCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return listener.cameraCount();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Camera bakeAt(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera obj = listener.cameraAt(idx);
        if (obj != null) {
            return (Camera) obj.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
