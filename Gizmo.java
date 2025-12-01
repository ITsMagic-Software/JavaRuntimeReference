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
    @MethodArgs({"position","scale"})
    public static void drawPoint(Vector3 position, float scale){
        //
    }
    @MethodArgs({"position","scale","color"})
    public static void drawPoint(Vector3 position, float scale, Color color){
        //
    }

    @MethodArgs({"position","scale"})
    public static void drawSphere(Vector3 position, float scale){
        //
    }
    @MethodArgs({"position","scale","color"})
    public static void drawSphere(Vector3 position, float scale, Color color){
        //
    }
    @MethodArgs({"position","scale","color"})
    public static void drawSphere(Vector3 position, Vector3 scale, Color color){
        //
    }

    @MethodArgs({"position","scale","texture"})
    public static void drawQuad(Vector3 position, float scale, Texture texture){
        //
    }
    @MethodArgs({"position","scale","texture"})
    public static void drawQuad(Vector3 position, Vector3 scale, Texture texture){
        //
    }
    @MethodArgs({"position","scale","texture","color"})
    public static void drawQuad(Vector3 position, Vector3 scale, Texture texture, Color color){
        //
    }

    @MethodArgs({"position","scale","texture"})
    public static void drawTransparentQuad(Vector3 position, Vector3 scale, Texture texture){
        //
    }

    @MethodArgs({"position","scale","texture","dualFaceRenderer"})
    public static void drawTransparentQuad(Vector3 position, Vector3 scale, Texture texture, boolean dualFace){
        //
    }

    @MethodArgs({"position","scale","texture","color"})
    public static void drawTransparentQuad(Vector3 position, Vector3 scale, Texture texture, Color color){
        //
    }

    @MethodArgs({"position","scale","texture","color","dualFaceRenderer"})
    public static void drawTransparentQuad(Vector3 position, Vector3 scale, Texture texture, Color color, boolean dualFace){
        //
    }

    @MethodArgs({"position","scale"})
    public static void drawCube(Vector3 position, float scale){
        //
    }
    @MethodArgs({"position","scale","color"})
    public static void drawCube(Vector3 position, float scale, Color color){
        //
    }
    @MethodArgs({"position","scale"})
    public static void drawCube(Vector3 position, Vector3 scale){
        //
    }
    @MethodArgs({"position","scale","color"})
    public static void drawCube(Vector3 position, Vector3 scale, Color color){
        //
    }

    @MethodArgs({"position","scale","color"})
    public static void drawTransparentCube(Vector3 position, Vector3 scale, Color color){
        //
    }

    @MethodArgs({"vertex","position"})
    public static void drawVertex(Vertex vertex, Vector3 position){
        //
    }
    @MethodArgs({"vertex","position","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Color color){
        //
    }
    @MethodArgs({"vertex","position","rotation"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation){
        //
    }
    @MethodArgs({"vertex","position","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Vector3 scale){
        //
    }
    @MethodArgs({"vertex","position","rotation","scale"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale){
        //
    }
    @MethodArgs({"vertex","position","rotation","scale","color"})
    public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color){
        //
    }

    @MethodArgs({"vertex","position","rotation","scale","color"})
    public static void drawWireframeVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale){
        //
    }
    @MethodArgs({"vertex","position","rotation","scale","color","color"})
    public static void drawWireframeVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color){
        //
    }
    @MethodArgs({"vertex","position","rotation","scale","color","color","texture"})
    public static void drawWireframeVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color, Texture texture){
        //
    }


    @MethodArgs({"gizmoElement"})
    public static void drawVertex(GizmoElement gizmoObject){
        //
    }
    @MethodArgs({"gizmoElement"})
    public static void drawGizmo(GizmoElement gizmoObject){
        //
    }
    @MethodArgs({"gizmoElement"})
    public static void drawElement(GizmoElement gizmoObject){
        //
    }
    @MethodArgs({"gizmoElement"})
    public static void draw(GizmoElement gizmoObject){
        //
    }

    //
}
