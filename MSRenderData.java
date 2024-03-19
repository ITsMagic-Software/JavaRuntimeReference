package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Graphics.RuntimeShading.MaterialShaderDataListener;

import java.util.ArrayList;
import java.util.List;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Shaders"})
public class MSRenderData {

    //<REMOVE-BRIDGE>
    public transient List<RenderableVertex> vertexes = new ArrayList<>();
    public transient List<Light> lights = new ArrayList<>();

    public MSRenderData(Engine engine) {

    }

    //>REMOVE-BRIDGE<

    private MSRenderData() { }

    public int vertexCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return vertexes.size();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public RenderableVertex renderableVertexAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return vertexes.get(idx);
        //>REMOVE-BRIDGE<
    }

    public int lightCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return lights.size();
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
        Light obj = lights.get(idx);
        if(obj != null){
            return obj;
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
