package JAVARuntime;

//

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat={"NurbsPath"})
public class NurbsPath3D {

    //

    public NurbsPath3D() {
        //
    }
    @MethodArgs(args={"points"})
    public NurbsPath3D(List<Vector3> points) {
        //
    }
    @MethodArgs(args={"continuous"})
    public NurbsPath3D(boolean continuous) {
        //
    }
    @MethodArgs(args={"points","continuous"})
    public NurbsPath3D(List<Vector3> points, boolean continuous) {
        //
    }

    @MethodArgs(args={"x"})
    public Vector3 evaluate(float u){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"x","out"})
    public Vector3 evaluate(float u, Vector3 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"resolution"})
    public List<Vector3> evaluatePath(int resolution){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"resolution","list"})
    public List<Vector3> evaluatePath(int resolution, List<Vector3> list){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"vector"})
    public void addPoint(Vector3 vector){
        //
    }
    @MethodArgs(args={"path"})
    public void addPath(List<Vector3> path){
        //
    }
    @MethodArgs(args={"i"})
    public Vector3 getPoint(int i){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"vector"})
    public void removePoint(Vector3 vector3){
        //
    }
    @MethodArgs(args={"i"})
    public void removePoint(int i){
        //
    }
    public int pointsCount(){
        //
        return 0;
        //

        //
    }

    public boolean isContinuous() {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"continuous"})
    public void setContinuous(boolean continuous) {
        //
    }
}
