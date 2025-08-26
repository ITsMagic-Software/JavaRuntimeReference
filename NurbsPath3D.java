package JAVARuntime;

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat = {"NurbsPath"})
public class NurbsPath3D {

  public NurbsPath3D() {}

  @MethodArgs({"points"})
  public NurbsPath3D(List<Vector3> points) {}

  @MethodArgs({"continuous"})
  public NurbsPath3D(boolean continuous) {}

  @MethodArgs({"points", "continuous"})
  public NurbsPath3D(List<Vector3> points, boolean continuous) {}

  @MethodArgs({"x"})
  public Vector3 evaluate(float u) {

    return null;
  }

  @MethodArgs({"x", "out"})
  public Vector3 evaluate(float u, Vector3 out) {

    return null;
  }

  @MethodArgs({"resolution"})
  public List<Vector3> evaluatePath(int resolution) {

    return null;
  }

  @MethodArgs({"resolution", "list"})
  public List<Vector3> evaluatePath(int resolution, List<Vector3> list) {

    return null;
  }

  @MethodArgs({"vector"})
  public void addPoint(Vector3 vector) {}

  @MethodArgs({"path"})
  public void addPath(List<Vector3> path) {}

  @MethodArgs({"i"})
  public Vector3 getPoint(int i) {

    return null;
  }

  @MethodArgs({"vector"})
  public void removePoint(Vector3 vector3) {}

  @MethodArgs({"i"})
  public void removePoint(int i) {}

  public int pointsCount() {

    return 0;
  }

  public boolean isContinuous() {

    return false;
  }

  @MethodArgs({"continuous"})
  public void setContinuous(boolean continuous) {}
}
