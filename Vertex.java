package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vertex"})
public class Vertex {
    //

    public Vertex() {
        //
    }

    public ArrayList getVertices(){
        //
        return null;
        //

        //
    }
    public float[] getVerticesArray(){
        //
        return null;
        //

        //
    }
    public NativeFloatBuffer getVerticesBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setVertices(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setVertices(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setVertices(float[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setVertices(NativeFloatBuffer vertices){
        //
    }
    @MethodArgs(args={"value"})
    public void setVertices(Vector3Buffer buffer){
        //
    }

    public ArrayList getTriangles(){
        //
        return null;
        //

        //
    }
    public int[] getTrianglesArray(){
        //
        return null;
        //

        //
    }
    public NativeIntBuffer getTrianglesBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setTriangles(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setTriangles(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setTriangles(int[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setTriangles(NativeIntBuffer triangles){
        //
    }
    @MethodArgs(args={"value"})
    public void setTriangles(Point3Buffer buffer){
        //
    }

    public ArrayList getNormals(){
        //
        return null;
        //

        //
    }
    public float[] getNormalsArray(){
        //
        return null;
        //

        //
    }
    public NativeFloatBuffer getNormalsBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setNormals(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setNormals(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setNormals(float[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setNormals(NativeFloatBuffer normals){
        //
    }
    @MethodArgs(args={"value"})
    public void setNormals(Vector3Buffer buffer){
        //
    }

    public ArrayList getUVs(){
        //
        return null;
        //

        //
    }
    public float[] getUVsArray(){
        //
        return null;
        //

        //
    }
    public NativeFloatBuffer getUVsBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setUVs(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setUVs(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setUVs(float[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setUVs(NativeFloatBuffer uvs){
        //
    }
    @MethodArgs(args={"value"})
    public void setUVs(Vector2Buffer buffer){
        //
    }

    public ArrayList getJoints(){
        //
        return null;
        //

        //
    }
    public float[] getJointsArray(){
        //
        return null;
        //

        //
    }
    public NativeFloatBuffer getJointsBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setJoints(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setJoints(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setJoints(float[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setJoints(NativeFloatBuffer joints){
        //
    }
    @MethodArgs(args={"value"})
    public void setJoints(Vector3Buffer buffer){
        //
    }

    public ArrayList getWeights(){
        //
        return null;
        //

        //
    }
    public float[] getWeightsArray(){
        //
        return null;
        //

        //
    }
    public NativeFloatBuffer getWeightsBuffer(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setWeights(List list){
        //
    }
    @MethodArgs(args={"value"})
    public void setWeights(ArrayList list){
        //
    }
    @MethodArgs(args={"value"})
    public void setWeights(float[] array){
        //
    }
    @MethodArgs(args={"value"})
    public void setWeights(NativeFloatBuffer weights){
        //
    }
    @MethodArgs(args={"value"})
    public void setWeights(Vector3Buffer buffer){
        //
    }

    public enum RayMode{ClosestPoint, FirstHit}
    @MethodArgs(args={"transform","ray"})
    public LaserHit traceLaser(Transform transform, Ray ray){
        return traceLaser(transform, ray, RayMode.ClosestPoint);
    }
    @MethodArgs(args={"transform","ray","rayMode"})
    public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"transform","ray","rayMode","backfaceCulling"})
    public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode, boolean backfaceCulling){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"transform","ray","asyncLaserListener"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener){
        traceLaserAsync(transform, ray, asyncLaserListener, RayMode.ClosestPoint);
    }
    @MethodArgs(args={"transform","ray","asyncLaserListener","rayMode"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode){
        //
    }
    @MethodArgs(args={"transform","ray","asyncLaserListener","rayMode","backfaceCulling"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode, boolean backfaceCulling){
        //
    }

    public void apply(){
        //
    }
    @MethodArgs(args={"regenerateTBN","recalculateBoundingBox"})
    public void apply(boolean regenerateTBN, boolean recalculateBoundingBox){
        //
    }

    public AABB getBoundingBox(){
        //
        return null;
        //

        //
    }
    public AABB recalculateBoundingBox(){
        //
        return null;
        //

        //
    }

    /// Abstract
    @MethodArgs(args={"file"})
    public static Vertex loadFile(VertexFile pFile){
        //
        return null;
        //

        //
    }

    public static final int CUBE = 456;
    public static final int SPHERE = 457;
    public static final int CONE = 458;
    public static final int CYLINDER = 459;
    public static final int CIRCLE = 460;
    public static final int TORUS = 461;
    public static final int SQUARE = 462;
    public static final int SQUARE90 = 463;
    public static final int CAPSULE = 464;
    public static final int HALF_CAPSULE = 465;

    @MethodArgs(args={"primitive"})
    public static Vertex loadPrimitive(int primitive){
        //
        return null;
        //

        //
    }
}
