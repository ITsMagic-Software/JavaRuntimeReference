package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class Gizmo {
    //

    private Gizmo() { }

    /// Abstracts
    @MethodArgs(args ={"vertex","position"})
    public static void drawVertex(Vertex vertex, Vector3 position){
        //
    }
    @MethodArgs(args ={"vertex","position","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Color color){
        //
    }
    @MethodArgs(args ={"vertex","position","rotation"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation){
        //
    }
    @MethodArgs(args ={"vertex","position","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Vector3 scale){
        //
    }
    @MethodArgs(args ={"vertex","position","rotation","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale){
        //
    }
    @MethodArgs(args ={"vertex","position","rotation","scale","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color){
        //
    }
    @MethodArgs(args ={"vertex","position","rotation","scale","color","wireframe"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireframe){
        //
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawVertex(GizmoElement gizmoObject){
        //
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawGizmo(GizmoElement gizmoObject){
        //
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void drawElement(GizmoElement gizmoObject){
        //
    }
    @MethodArgs(args ={"gizmoElement"})
    public static void draw(GizmoElement gizmoObject){
        //
    }

    //
}
