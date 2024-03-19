package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat ={"NurbsPath"})
public class NurbsPath3D {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D nurbsPath;
    public NurbsPath3D(com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D nurbsPath) {
        this.nurbsPath = nurbsPath;
    }
    @IgnoreAutoComplete
    //>REMOVE-BRIDGE<

    public NurbsPath3D() {
        //<REMOVE-BRIDGE>
        this.nurbsPath = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"points"})
    public NurbsPath3D(List<Vector3> points) {
        //<REMOVE-BRIDGE>
        List<com.itsmagic.engine.Engines.Engine.Vector.Vector3> l = new LinkedList<>();
        for (int i = 0; i < points.size(); i++) {
            l.add(points.get(i).instance);
        }
        this.nurbsPath = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D(l);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"continuous"})
    public NurbsPath3D(boolean continuous) {
        //<REMOVE-BRIDGE>
        this.nurbsPath = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D(continuous);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"points","continuous"})
    public NurbsPath3D(List<Vector3> points, boolean continuous) {
        //<REMOVE-BRIDGE>
        List<com.itsmagic.engine.Engines.Engine.Vector.Vector3> l = new LinkedList<>();
        for (int i = 0; i < points.size(); i++) {
            l.add(points.get(i).instance);
        }
        this.nurbsPath = new com.itsmagic.engine.Engines.Engine.NubsPathBezier.NurbsPath3D(l, continuous);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x"})
    public Vector3 evaluate(float u){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath.evaluate(u).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","out"})
    public Vector3 evaluate(float u, Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 outEngine = this.nurbsPath.evaluate(u);
        out.setX(outEngine.getX());
        out.setY(outEngine.getY());
        return out;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"resolution"})
    public List<Vector3> evaluatePath(int resolution){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath.evaluatePathJava(resolution);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"resolution","list"})
    public List<Vector3> evaluatePath(int resolution, List<Vector3> list){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath.evaluatePathJava(resolution, list);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector"})
    public void addPoint(Vector3 vector){
        //<REMOVE-BRIDGE>
        this.nurbsPath.addPoint(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"path"})
    public void addPath(List<Vector3> path){
        //<REMOVE-BRIDGE>
        for (int i = 0; i < path.size(); i++) {
            this.nurbsPath.addPoint(path.get(i).instance);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"i"})
    public Vector3 getPoint(int i){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.nurbsPath.getPoint(i).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector"})
    public void removePoint(Vector3 vector3){
        //<REMOVE-BRIDGE>
        this.nurbsPath.removePoint(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"i"})
    public void removePoint(int i){
        //<REMOVE-BRIDGE>
        this.nurbsPath.removePoint(i);
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
        return this.nurbsPath.pointsCount();
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
        return this.nurbsPath.isContinuous();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"continuous"})
    public void setContinuous(boolean continuous) {
        //<REMOVE-BRIDGE>
        this.nurbsPath.setContinuous(continuous);
        //>REMOVE-BRIDGE<
    }
}
