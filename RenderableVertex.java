package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

public final class RenderableVertex {
    //<REMOVE-BRIDGE>
    private transient Vertex vertex;
    public transient List<RenderableObject> objects = new ArrayList<>();
    //>REMOVE-BRIDGE<

    public RenderableVertex() {}

    @HideGetSet
    public Vertex getVertex() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return vertex;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setVertex(Vertex vertex) {
        //<REMOVE-BRIDGE>
        this.vertex = vertex;
        //>REMOVE-BRIDGE<
    }

    public int objectCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return objects.size();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public RenderableObject objectAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return objects.get(idx);
        //>REMOVE-BRIDGE<
    }
    public void addObject(RenderableObject object){
        //<REMOVE-BRIDGE>
        objects.add(object);
        //>REMOVE-BRIDGE<
    }
}
