package JAVARuntime;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Vertex"})
public final class Vertex {

  public Vertex() {}

  public List<Vector3> getVertices() {

    return null;
  }

  public float[] getVerticesArray() {

    return null;
  }

  public NativeFloatBuffer getVerticesBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setVertices(List<Vector3> list) {}

  @MethodArgs({"value"})
  public void setVertices(float[] array) {}

  @MethodArgs({"value"})
  public void setVertices(NativeFloatBuffer vertices) {}

  @MethodArgs({"value"})
  public void setVertices(Vector3Buffer buffer) {}

  public List<Vector3> getTriangles() {

    return null;
  }

  public int[] getTrianglesArray() {

    return null;
  }

  public NativeIntBuffer getTrianglesBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setTriangles(List<Vector3> list) {}

  @MethodArgs({"value"})
  public void setTriangles(int[] array) {}

  @MethodArgs({"value"})
  public void setTriangles(NativeIntBuffer triangles) {}

  @MethodArgs({"value"})
  public void setTriangles(Point3Buffer buffer) {}

  public List<Vector3> getNormals() {

    return null;
  }

  public float[] getNormalsArray() {

    return null;
  }

  public NativeFloatBuffer getNormalsBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setNormals(List<Vector3> list) {}

  @MethodArgs({"value"})
  public void setNormals(float[] array) {}

  @MethodArgs({"value"})
  public void setNormals(NativeFloatBuffer normals) {}

  @MethodArgs({"value"})
  public void setNormals(Vector3Buffer buffer) {}

  public List<Vector2> getUVs() {

    return null;
  }

  public float[] getUVsArray() {

    return null;
  }

  public NativeFloatBuffer getUVsBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setUVs(List<Vector2> list) {}

  @MethodArgs({"value"})
  public void setUVs(float[] array) {}

  @MethodArgs({"value"})
  public void setUVs(NativeFloatBuffer uvs) {}

  @MethodArgs({"value"})
  public void setUVs(Vector2Buffer buffer) {}

  public List<Vector3> getJoints() {

    return null;
  }

  public float[] getJointsArray() {

    return null;
  }

  public NativeFloatBuffer getJointsBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setJoints(List<Vector3> list) {}

  @MethodArgs({"value"})
  public void setJoints(float[] array) {}

  @MethodArgs({"value"})
  public void setJoints(NativeFloatBuffer joints) {}

  @MethodArgs({"value"})
  public void setJoints(Vector3Buffer buffer) {}

  public List<Vector3> getWeights() {

    return null;
  }

  public float[] getWeightsArray() {

    return null;
  }

  public NativeFloatBuffer getWeightsBuffer() {

    return null;
  }

  @MethodArgs({"value"})
  public void setWeights(List<Vector3> list) {}

  @MethodArgs({"value"})
  public void setWeights(float[] array) {}

  @MethodArgs({"value"})
  public void setWeights(NativeFloatBuffer weights) {}

  @MethodArgs({"value"})
  public void setWeights(Vector3Buffer buffer) {}

  public enum RayMode {
    ClosestPoint,
    FirstHit
  }

  @MethodArgs({"transform", "ray"})
  public LaserHit traceLaser(Transform transform, Ray ray) {
    return traceLaser(transform, ray, RayMode.ClosestPoint);
  }

  @MethodArgs({"transform", "ray", "rayMode"})
  public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode) {

    return null;
  }

  @MethodArgs({"transform", "ray", "rayMode", "backfaceCulling"})
  public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode, boolean backfaceCulling) {

    return null;
  }

  @MethodArgs({"transform", "ray", "asyncLaserListener"})
  public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener) {
    traceLaserAsync(transform, ray, asyncLaserListener, RayMode.ClosestPoint);
  }

  @MethodArgs({"transform", "ray", "asyncLaserListener", "rayMode"})
  public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode) {}

  @MethodArgs({"transform", "ray", "asyncLaserListener", "rayMode", "backfaceCulling"})
  public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode, boolean backfaceCulling) {}

  public void apply() {}

  @MethodArgs({"regenerateTBN", "recalculateBoundingBox"})
  public void apply(boolean regenerateTBN, boolean recalculateBoundingBox) {}

  public void regenerateNormals() {}

  public AABB getBoundingBox() {

    return null;
  }

  public AABB recalculateBoundingBox() {

    return null;
  }

  /// Abstract
  @MethodArgs({"file"})
  public static Vertex loadFile(VertexFile pFile) {

    return null;
  }

  @MethodArgs({"file"})
  public static Vertex loadFile(File file) {

    return null;
  }

  @MethodArgs({"inputStream"})
  public static Vertex loadFile(InputStream inputStream) {

    return null;
  }

  private @interface PrimitiveExpose {}

  @PrimitiveExpose public static final int CUBE = 0;
  @PrimitiveExpose public static final int SPHERE = 1;
  @PrimitiveExpose public static final int CONE = 2;
  @PrimitiveExpose public static final int CYLINDER = 3;
  @PrimitiveExpose public static final int CIRCLE = 4;
  @PrimitiveExpose public static final int TORUS = 5;
  @PrimitiveExpose public static final int SQUARE = 6;
  @PrimitiveExpose public static final int SQUARE90 = 7;
  @PrimitiveExpose public static final int CAPSULE = 8;
  @PrimitiveExpose public static final int HALF_CAPSULE = 9;
  @PrimitiveExpose public static final int SPHERE_LOWPOLY = 10;

  @MethodArgs({"primitive"})
  public static Vertex loadPrimitive(int primitive) {

    return null;
  }
}
