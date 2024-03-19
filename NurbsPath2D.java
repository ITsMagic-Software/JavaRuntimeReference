package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat ={"NurbsPath"})
public class NurbsPath2D {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D nurbsPath2D;
    public NurbsPath2D(com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D nurbsPath2D) {
        this.nurbsPath2D = nurbsPath2D;
    }
    @IgnoreAutoComplete
    //>REMOVE-BRIDGE<

    public NurbsPath2D() {
        //<REMOVE-BRIDGE>
        this.nurbsPath2D = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"points"})
    public NurbsPath2D(List<Vector2> points) {
        //<REMOVE-BRIDGE>
        List<com.itsmagic.engine.Engines.Engine.Vector.Vector2> l = new LinkedList<>();
        for (int i = 0; i < points.size(); i++) {
            l.add(points.get(i).instance);
        }
        this.nurbsPath2D = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D(l);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"continuous"})
    public NurbsPath2D(boolean continuous) {
        //<REMOVE-BRIDGE>
        this.nurbsPath2D = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D(continuous);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"points","continuous"})
    public NurbsPath2D(List<Vector2> points, boolean continuous) {
        //<REMOVE-BRIDGE>
        List<com.itsmagic.engine.Engines.Engine.Vector.Vector2> l = new LinkedList<>();
        for (int i = 0; i < points.size(); i++) {
            l.add(points.get(i).instance);
        }
        this.nurbsPath2D = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath2D(l, continuous);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x"})
    public Vector2 evaluate(float u){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.evaluate(u).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","out"})
    public Vector2 evaluate(float u, Vector2 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Vector.Vector2 outEngine = this.nurbsPath2D.evaluate(u);
        out.setX(outEngine.x);
        out.setY(outEngine.y);
        return out;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"resolution"})
    public List<Vector2> evaluatePath(int resolution){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.evaluatePathJava(resolution);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"resolution","list"})
    public List<Vector2> evaluatePath(int resolution, List<Vector2> list){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.evaluatePathJava(resolution, list);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector"})
    public void addPoint(Vector2 vector){
        //<REMOVE-BRIDGE>
        this.nurbsPath2D.addPoint(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"path"})
    public void addPath(List<Vector2> path){
        //<REMOVE-BRIDGE>
        for (int i = 0; i < path.size(); i++) {
            this.nurbsPath2D.addPoint(path.get(i).instance);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"i"})
    public Vector2 getPoint(int i){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.getPoint(i).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector2"})
    public void removePoint(Vector2 vector2){
        //<REMOVE-BRIDGE>
        this.nurbsPath2D.removePoint(vector2.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"i"})
    public void removePoint(int i){
        //<REMOVE-BRIDGE>
        this.nurbsPath2D.removePoint(i);
        //>REMOVE-BRIDGE<
    }
    public int pointsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.pointsCount();
        //>REMOVE-BRIDGE<
    }

    public boolean isContinuous() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath2D.isContinuous();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"continuous"})
    public void setContinuous(boolean continuous) {
        //<REMOVE-BRIDGE>
        this.nurbsPath2D.setContinuous(continuous);
        //>REMOVE-BRIDGE<
    }
}
