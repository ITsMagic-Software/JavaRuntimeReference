package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.Time;
import com.itsmagic.engine.Engines.Engine.Vector.VectorUtils;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Vector2 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator, JsonSerializer
{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Vector2.class;
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
                Vector2 var = (Vector2) value;
                if(var != null) {
                    return new Variable(fieldName, var.instance);
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
                        return new Vector2(variable.vector2_value);
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Vector2();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Vector2 instance;
    @IgnoreAutoComplete
    public Vector2(com.itsmagic.engine.Engines.Engine.Vector.Vector2 instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Vector2() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(float x, float y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(int x, float y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(float x, int y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(int x, int y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector2(float a) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2(a);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.x;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //<REMOVE-BRIDGE>
        instance.x = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.y;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //<REMOVE-BRIDGE>
        instance.y = value;
        //>REMOVE-BRIDGE<
    }


    /// Calcs
    @MethodArgs(args ={"value"})
    public Vector2 mul(Vector2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.multiply(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 mul(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.multiply(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector2 mul(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.multiply(a).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        instance.mulLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Vector2 value){
        //<REMOVE-BRIDGE>
        instance.mulLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void mulLocal(float x, float y){
        //<REMOVE-BRIDGE>
        instance.mulLocal(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void mulLocal(float a){
        //<REMOVE-BRIDGE>
        instance.mulLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector2 div(Vector2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.divide(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 div(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.divide(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector2 div(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.divide(a).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        instance.divLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Vector2 value){
        //<REMOVE-BRIDGE>
        instance.divLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void divLocal(float x, float y){
        //<REMOVE-BRIDGE>
        instance.divLocal(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void divLocal(float a){
        //<REMOVE-BRIDGE>
        instance.divLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector2 sum(Vector2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.add(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 sum(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.add(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector2 sum(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.add(a).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        instance.addLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Vector2 value){
        //<REMOVE-BRIDGE>
        instance.addLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void sumLocal(float x, float y){
        //<REMOVE-BRIDGE>
        instance.addLocal(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void sumLocal(float a){
        //<REMOVE-BRIDGE>
        instance.addLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector2 sub(Vector2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.remove(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 sub(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.remove(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector2 sub(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.remove(a).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Vector3 value){
        //<REMOVE-BRIDGE>
        instance.subLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Vector2 value){
        //<REMOVE-BRIDGE>
        instance.subLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void subLocal(float x, float y){
        //<REMOVE-BRIDGE>
        instance.subLocal(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void subLocal(float a){
        //<REMOVE-BRIDGE>
        instance.subLocal(a);
        //>REMOVE-BRIDGE<
    }

    /// Utils
    @MethodArgs(args ={"value"})
    public boolean equals(Vector2 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VectorUtils.equals(this.instance, vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public boolean equals(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VectorUtils.equals(instance, x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public boolean equals(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VectorUtils.equals(instance, a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void set(Vector2 vector2){
        //<REMOVE-BRIDGE>
        this.instance.set(vector2.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void set(float x, float y){
        //<REMOVE-BRIDGE>
        this.instance.set(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //<REMOVE-BRIDGE>
        this.instance.set(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Vector2 vector2, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(vector2.instance, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerp(float x, float y, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(x, y, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(float a, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(a, speed);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Vector2 vector2, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(vector2.instance, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerpInSeconds(float x, float y, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(x, y, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpQuick(a, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Vector2 vector2, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendQuick(vector2.instance, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","blend"})
    public void blend(float x, float y, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendQuick(x, y, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(float a, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendQuick(a, blend);
        //>REMOVE-BRIDGE<
    }

    public Vector2 normalize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.normalize().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public void normalizeLocal(){
        //<REMOVE-BRIDGE>
        this.instance.normalizeLocal();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"angle"})
    public void rotateLocal(float angle){
        //<REMOVE-BRIDGE>
        this.instance.rotateLocal(angle);
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
        return this.instance.length();
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
        return this.instance.sqrtLength();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public float distance(Vector2 vector2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.distance(vector2.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public float sqrDistance(Vector2 vector2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.sqrtDistance(vector2.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public float dot(Vector2 vector2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.dot(vector2.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float dot(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.dot(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public float dot(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.dot(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector3 cross(Vector2 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.cross(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector3 cross(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.cross(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Vector2 copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.clone().toJAVARuntime();
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
        return instance.toString();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"decimals"})
    public String toString(int decimals) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.toString(decimals);
        //>REMOVE-BRIDGE<
    }

    /// Abstracts
    public static Vector2 zero(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Vector.Vector2.zero().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        Vector2 out = vector.copy();
        out.rotateLocal(angle);
        return out;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector","pivot","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, Vector2 pivot, float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        float x = vector.getX() - pivot.getX();
        float y = vector.getY() - pivot.getY();
        float newX = (x  * Math.cos(angle)) - (y * Math.sin(angle));
        float newY = (x * Math.sin(angle))  + (y * Math.cos(angle));
        return new Vector2(newX + pivot.getX(), newY + pivot.getY());
        //>REMOVE-BRIDGE<
    }

    /// Comparators
    @MethodArgs(args ={"value"})
    public boolean equals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return VectorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return VectorUtils.equals(this.instance, other.instance);
        }
        else {
            throw new IllegalOperatorException("The operator == is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean pointerEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this == otherObject;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean notEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return !VectorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return !VectorUtils.equals(this.instance, other.instance);
        }
        else {
            throw new IllegalOperatorException("The operator != is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static boolean isNull(Object value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value == null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public boolean greaterThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return this.instance.sqrtLength() > other.instance.sqrtLength();
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return this.instance.sqrtLength() > other.instance.sqrtLength();
        }
        else {
            throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return this.instance.sqrtLength() > other.instance.sqrtLength() || this.instance.equally(other.instance);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return this.instance.sqrtLength() > other.instance.sqrtLength() || this.instance.equally(other.instance);
        }
        else {
            throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() >= v;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public boolean lessThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return this.instance.sqrtLength() < other.instance.sqrtLength();
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return this.instance.sqrtLength() < other.instance.sqrtLength();
        }
        else {
            throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return this.instance.sqrtLength() < other.instance.sqrtLength() || this.instance.equally(other.instance);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            return this.instance.sqrtLength() < other.instance.sqrtLength() || this.instance.equally(other.instance);
        }
        else {
            throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lengthF() <= v;
        //>REMOVE-BRIDGE<
    }

    /// Operators
    @MethodArgs(args ={"value"})
    public <T> T sum(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2 out = new Vector2();
        out.set(this);

        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.sumLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.sumLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator + is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.sumLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.sumLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator += is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public <T> T div(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2 out = new Vector2();
        out.set(this);

        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.divLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.divLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator / is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.divLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.divLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator /= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public <T> T mul(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2 out = new Vector2();
        out.set(this);

        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator * is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.mulLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.mulLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator *= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public <T> T sub(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2 out = new Vector2();
        out.set(this);

        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.subLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.subLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator - is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.subLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.subLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator -= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    public void addAdd() {
        //<REMOVE-BRIDGE>
        this.sumLocal(1);
        //>REMOVE-BRIDGE<
    }
    public void removeRemove() {
        //<REMOVE-BRIDGE>
        this.sumLocal(-1);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public String serializeToString() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return "[" + getX() + ";" + getY() + "]";
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public void deserializeLocal(String str) {
        //<REMOVE-BRIDGE>
        try {
            if(this.instance == null) {
                this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector2();
                instance.setRuntime(this);
            }

            if(str == null || str.isEmpty()) return;

            String[] lines = str.substring(1, str.length() - 1).split(";");
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                float value = Mathf.stringToFloat(line);
                instance.setFromIndex(value, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //>REMOVE-BRIDGE<
    }
}
