package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.Vector.VectorUtils;
import com.itsmagic.engine.Engines.Engine.Time;
import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Point2 {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Point2.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
                if(JCompiler.correctName(thisClass.getName()).equals(JCompiler.correctName(className))){
                    return true;
                }
                return false;
            }

            @Override
            public String getSimpleName(UserPointer userPointer) {
                return thisClass.getSimpleName();
            }
            //
            @Override
            public Variable save(String fieldName, Object value, UserPointer userPointer) {
                Point2 var = (Point2) value;
                if(var != null) {
                    return new Variable(fieldName, var.vector2);
                } else {
                    return new Variable(fieldName, Variable.Type.Vector2);
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.Vector2){
                    if(variable.vector2_value != null) {
                        return new Point2(variable.vector2_value);
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Point2();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Vector2 vector2;
    @IgnoreAutoComplete
    public Point2(com.itsmagic.engine.Engines.Engine.Vector.Vector2 vector2) {
        this.vector2 = vector2;
    }
    //>REMOVE-BRIDGE<

    public Point2() {
        //<REMOVE-BRIDGE>
        this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Point2(int x, int y) {
        //<REMOVE-BRIDGE>
        this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(x, y);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return (int) vector2.x;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(int value){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        vector2.x = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return (int) vector2.y;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(int value){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        vector2.y = value;
        //>REMOVE-BRIDGE<
    }


    /// Calcs
    @MethodArgs(args ={"value"})
    public Point2 mul(Point2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.multiply(value.vector2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Point2 mul(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.multiply(x, y));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point2 mul(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.multiply(a));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point2 div(Point2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Point2(vector2.divide(value.vector2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Point2 div(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.divide(x, y));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point2 div(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.divide(a));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point2 sum(Point2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.add(value.vector2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Point2 sum(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.add(x, y));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point2 sum(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.add(a));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point2 sub(Point2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.remove(value.vector2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Point2 sub(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.remove(x, y));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point2 sub(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(vector2.remove(a));
        //>REMOVE-BRIDGE<
    }


    /// Utils
    @MethodArgs(args ={"point2"})
    public boolean equals(Point2 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return VectorUtils.equals(vector2, vector.vector2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public boolean equals(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return VectorUtils.equals(vector2, x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public boolean equals(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return VectorUtils.equals(vector2, a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2"})
    public void set(Point2 vector3){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.set(vector3.vector2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void set(int x, int y){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.set(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(int a){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.set(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2","speed"})
    public void lerp(Point2 vector3, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.lerpQuick(vector3.vector2, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerp(int x, int y, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.lerpQuick(x, y, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(int a, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.lerpQuick(a, speed);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2","speed"})
    public void lerpInSeconds(Point2 vector3, int speed){
        //<REMOVE-BRIDGE>
        this.vector2.lerpQuick(vector3.vector2, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerpInSeconds(int x, int y, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.lerpQuick(x, y, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(int a, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.lerpQuick(a, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2","blend"})
    public void blend(Point2 vector3, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.blendQuick(vector3.vector2, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","blend"})
    public void blend(int x, int y, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.blendQuick(x, y, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(int a, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.blendQuick(a, blend);
        //>REMOVE-BRIDGE<
    }

    public Point2 normalize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(this.vector2.normalize());
        //>REMOVE-BRIDGE<
    }
    public void normalizeLocal(){
        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        this.vector2.normalize();
        //>REMOVE-BRIDGE<
    }

    public float length(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.length();
        //>REMOVE-BRIDGE<
    }
    public float sqrLength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.sqrtLength();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"point2"})
    public float distance(Point2 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.distance(vector3.vector2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"point2"})
    public float sqrDistance(Point2 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.sqrtDistance(vector3.vector2);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2"})
    public float dot(Point2 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.dot(vector3.vector2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float dot(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.dot(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public float dot(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return this.vector2.dot(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2"})
    public Vector3 cross(Point2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return vector2.cross(value.vector2).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector3 cross(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return vector2.cross(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Point2 copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return new Point2(this.vector2.clone());
        //>REMOVE-BRIDGE<
    }

    public String toString() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector2 == null){ this.vector2 = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(); }
        return "(" + ((int)this.vector2.x) + " , " + ((int)this.vector2.y) + ")";
        //>REMOVE-BRIDGE<
    }

    /// Abstracts
    public static Point2 zero(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Point2();
        //>REMOVE-BRIDGE<
    }
}
