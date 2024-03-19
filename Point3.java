package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.Time;
import com.itsmagic.engine.Engines.Engine.Vector.VectorUtils;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Point3 {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Point3.class;
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
                Point3 var = (Point3) value;
                if(var != null) {
                    return new Variable(fieldName, var.vector);
                } else {
                    return new Variable(fieldName, Variable.Type.Vector3);
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.Vector3){
                    if(variable.vector3_value != null) {
                        return new Point3(variable.vector3_value);
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Point3();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Vector3 vector;
    @IgnoreAutoComplete
    public Point3(com.itsmagic.engine.Engines.Engine.Vector.Vector3 vector) {
        this.vector = vector;
    }
    //>REMOVE-BRIDGE<

    public Point3() {
        //<REMOVE-BRIDGE>
        this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point3(int a) {
        //<REMOVE-BRIDGE>
        this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(a);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Point3(int x, int y, int z) {
        //<REMOVE-BRIDGE>
        this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return (int) vector.getX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(int value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.setX(value);
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return (int) vector.getY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(int value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.setY(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return (int) vector.getZ();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(int value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.setZ(value);
        //>REMOVE-BRIDGE<
    }


    /// Calcs
    @MethodArgs(args ={"value"})
    public Point3 mul(Point3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.mul(value.vector));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Point3 mul(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.mul(x, y, z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point3 mul(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.mul(a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        vector.mulLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Point3 value){
        //<REMOVE-BRIDGE>
        vector.mulLocal(value.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void mulLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.mulLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void mulLocal(float a){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.mulLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point3 div(Point3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Point3(vector.div(value.vector));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Point3 div(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.div(x, y, z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point3 div(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.div(a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        vector.divLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Point3 value){
        //<REMOVE-BRIDGE>
        vector.divLocal(value.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void divLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        vector.divLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void divLocal(float a){
        //<REMOVE-BRIDGE>
        vector.divLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point3 sum(Point3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.add(value.vector));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Point3 sum(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.add(x, y, z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point3 sum(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.add(a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.addLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Point3 value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.addLocal(value.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void sumLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.addLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void sumLocal(float a){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.addLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Point3 sub(Point3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.sub(value.vector));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Point3 sub(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.sub(x, y, z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Point3 sub(int a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(vector.sub(a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.subLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Point3 value){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.subLocal(value.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void subLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.subLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void subLocal(float a){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        vector.subLocal(a);
        //>REMOVE-BRIDGE<
    }


    /// Utils
    @MethodArgs(args ={"value"})
    public boolean equals(Point3 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return VectorUtils.equals(this.vector, vector.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public boolean equals(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return VectorUtils.equals(vector, x, y, z);
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return VectorUtils.equals(vector, a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void set(Point3 vector3){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.set(vector3.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void set(int x, int y, int z){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.set(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(int a){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.set(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Point3 vector3, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.lerpLocal(vector3.vector, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerp(int x, int y, int z, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.lerpLocal(x, y, z, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(int a, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.lerpLocal(a, speed);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Point3 vector3, int speed){
        //<REMOVE-BRIDGE>
        this.vector.lerpLocal(vector3.vector, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerpInSeconds(int x, int y, int z, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.lerpLocal(x, y, z, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(int a, int speed){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.lerpLocal(a, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Point3 vector3, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.blendLocal(vector3.vector, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","blend"})
    public void blend(int x, int y, int z, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.blendLocal(x, y, z, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(int a, int blend){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.blendLocal(a, blend);
        //>REMOVE-BRIDGE<
    }

    public Point3 normalize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(this.vector.normalize());
        //>REMOVE-BRIDGE<
    }
    public void normalizeLocal(){
        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        this.vector.normalize();
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.lengthF();
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.sqrtLength();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public float distance(Point3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.distance(vector3.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public float sqrDistance(Point3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.sqrtDistance(vector3.vector);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public float dot(Point3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.dot(vector3.vector);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public float dot(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.dot(x, y, z);
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return this.vector.dot(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector3 cross(Point3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return vector.cross(value.vector).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 cross(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return vector.cross(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Point3 copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return new Point3(this.vector.clone());
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
        if(this.vector == null){ this.vector = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(); }
        return "( " + ((int) this.vector.getX()) + " , " + ((int) this.vector.getY()) + " , " + ((int) this.vector.getZ()) + " )";
        //>REMOVE-BRIDGE<
    }

    /// Abstracts
    public static Point3 zero(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Point3();
        //>REMOVE-BRIDGE<
    }
}
