package JAVARuntime;

//

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat={"NurbsPath"})
public class NurbsPath2D {

    //

    public NurbsPath2D() {
        //
    }
    @MethodArgs(args={"points"})
    public NurbsPath2D(List<Vector2> points) {
        //
    }
    @MethodArgs(args={"continuous"})
    public NurbsPath2D(boolean continuous) {
        //
    }
    @MethodArgs(args={"points","continuous"})
    public NurbsPath2D(List<Vector2> points, boolean continuous) {
        //
    }

    @MethodArgs(args={"x"})
    public Vector2 evaluate(float u){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"x","out"})
    public Vector2 evaluate(float u, Vector2 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"resolution"})
    public List<Vector2> evaluatePath(int resolution){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"resolution","list"})
    public List<Vector2> evaluatePath(int resolution, List<Vector2> list){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"vector"})
    public void addPoint(Vector2 vector){
        //
    }
    @MethodArgs(args={"path"})
    public void addPath(List<Vector2> path){
        //
    }
    @MethodArgs(args={"i"})
    public Vector2 getPoint(int i){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"vector2"})
    public void removePoint(Vector2 vector2){
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
