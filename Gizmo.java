package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Debug"})
public final class Gizmo {

  private Gizmo() {}

  /// Abstracts
  @MethodArgs({"position", "scale"})
  public static void drawPoint(Vector3 position, float scale) {}

  @MethodArgs({"position", "scale", "color"})
  public static void drawPoint(Vector3 position, float scale, Color color) {}

  @MethodArgs({"position", "scale"})
  public static void drawSphere(Vector3 position, float scale) {}

  @MethodArgs({"position", "scale", "color"})
  public static void drawSphere(Vector3 position, float scale, Color color) {}

  @MethodArgs({"position", "scale"})
  public static void drawCube(Vector3 position, float scale) {}

  @MethodArgs({"position", "scale", "color"})
  public static void drawCube(Vector3 position, float scale, Color color) {}

  @MethodArgs({"vertex", "position"})
  public static void drawVertex(Vertex vertex, Vector3 position) {}

  @MethodArgs({"vertex", "position", "color"})
  public static void drawVertex(Vertex vertex, Vector3 position, Color color) {}

  @MethodArgs({"vertex", "position", "rotation"})
  public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation) {}

  @MethodArgs({"vertex", "position", "scale"})
  public static void drawVertex(Vertex vertex, Vector3 position, Vector3 scale) {}

  @MethodArgs({"vertex", "position", "rotation", "scale"})
  public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale) {}

  @MethodArgs({"vertex", "position", "rotation", "scale", "color"})
  public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, Color color) {}

  @MethodArgs({"vertex", "position", "rotation", "scale", "color", "wireframe"})
  public static void drawVertex(Vertex vertex, Vector3 position, Quaternion rotation, Vector3 scale, boolean wireframe) {}

  @MethodArgs({"gizmoElement"})
  public static void drawVertex(GizmoElement gizmoObject) {}

  @MethodArgs({"gizmoElement"})
  public static void drawGizmo(GizmoElement gizmoObject) {}

  @MethodArgs({"gizmoElement"})
  public static void drawElement(GizmoElement gizmoObject) {}

  @MethodArgs({"gizmoElement"})
  public static void draw(GizmoElement gizmoObject) {}
}
