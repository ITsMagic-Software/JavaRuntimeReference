package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera;
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class Gizmo {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Gizmo() { }

    /// Abstracts
    @MethodArgs(args ={"vertex","position"})
    public static void drawVertex(Vertex vertex, Vector3 position){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(new GizmoObject(vertex, position));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GizmoObject gizmo = new GizmoObject(vertex, position);
        gizmo.setColor(color);
        GraphicsEngine.Scene.addGizmo(gizmo);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","rotation"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(new GizmoObject(vertex, position, rotation));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Vector3 scale){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(new GizmoObject(vertex, position, new Quaternion(), scale));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","rotation","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(new GizmoObject(vertex, position, rotation, scale));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","rotation","scale","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GizmoObject gizmo = new GizmoObject(vertex, position, rotation, scale);
        gizmo.setColor(color);
        GraphicsEngine.Scene.addGizmo(gizmo);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vertex","position","rotation","scale","color","wireframe"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireframe){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(new GizmoObject(vertex, position, rotation, scale, wireframe));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawVertex(GizmoElement gizmoObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(gizmoObject);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawGizmo(GizmoElement gizmoObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(gizmoObject);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawElement(GizmoElement gizmoObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(gizmoObject);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void draw(GizmoElement gizmoObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GraphicsEngine.Scene.addGizmo(gizmoObject);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    //
    //>REMOVE-BRIDGE<
}
