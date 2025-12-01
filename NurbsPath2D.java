package JAVARuntime;

//

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat ={"NurbsPath"})
public class NurbsPath2D {

    //

    public NurbsPath2D() {
        //
    }
    @MethodArgs({"points"})
    public NurbsPath2D(List<Vector2> points) {
        //
    }
    @MethodArgs({"continuous"})
    public NurbsPath2D(boolean continuous) {
        //
    }
    @MethodArgs({"points","continuous"})
    public NurbsPath2D(List<Vector2> points, boolean continuous) {
        //
    }

    @MethodArgs({"x"})
    public Vector2 evaluate(float u){
        //
        return null;
        //

        //
    }
    @MethodArgs({"x","out"})
    public Vector2 evaluate(float u, Vector2 out){
        //
        return null;
        //

        //
    }

    @MethodArgs({"resolution"})
    public List<Vector2> evaluatePath(int resolution){
        //
        return null;
        //

        //
    }
    @MethodArgs({"resolution","list"})
    public List<Vector2> evaluatePath(int resolution, List<Vector2> list){
        //
        return null;
        //

        //
    }

    @MethodArgs({"vector"})
    public void addPoint(Vector2 vector){
        //
    }
    @MethodArgs({"path"})
    public void addPath(List<Vector2> path){
        //
    }
    @MethodArgs({"i"})
    public Vector2 getPoint(int i){
        //
        return null;
        //

        //
    }
    @MethodArgs({"vector2"})
    public void removePoint(Vector2 vector2){
        //
    }
    @MethodArgs({"i"})
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
    @MethodArgs({"continuous"})
    public void setContinuous(boolean continuous) {
        //
    }
}
