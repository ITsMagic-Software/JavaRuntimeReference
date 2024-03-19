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
import com.itsmagic.engine.Engines.Engine.Vector.VectorUtils;
import com.itsmagic.engine.Engines.Engine.Time;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Vector3 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator, JsonSerializer
{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Vector3.class;
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
                Vector3 var = (Vector3) value;
                if(var != null) {
                    return new Variable(fieldName, var.instance);
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
                        return new Vector3(variable.vector3_value);
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Vector3();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Vector3 instance;
    @IgnoreAutoComplete
    public Vector3(com.itsmagic.engine.Engines.Engine.Vector.Vector3 instance) {
        this.instance = instance;
        instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Vector3() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3();
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3(float a) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(a);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3(int a) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(a);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public Vector3(float x, float y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, int y, int z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(float x, float y, int z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, float y, int z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, float y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, int y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3(x, y, z);
        instance.setRuntime(this);
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
        return instance.getX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(value);
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
        return instance.getY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getZ();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getXY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getX(), instance.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getXZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getX(), instance.getZ());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getYZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getY(), instance.getZ());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getYX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getY(), instance.getX());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getZX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getZ(), instance.getX());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getZY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector2(instance.getZ(), instance.getY());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public void SetXY(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setX(v.getX());
        instance.setY(v.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void SetXZ(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setX(v.getX());
        instance.setZ(v.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void SetYZ(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setY(v.getX());
        instance.setZ(v.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void SetYX(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setY(v.getX());
        instance.setX(v.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void SetZX(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setZ(v.getX());
        instance.setX(v.getY());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void SetZY(Vector2 v){
        //<REMOVE-BRIDGE>
        instance.setZ(v.getX());
        instance.setY(v.getY());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void sumX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(instance.getX() + value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(instance.getY() + value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(instance.getZ() + value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void subX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(instance.getX() - value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(instance.getY() - value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(instance.getZ() - value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void mulX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(instance.getX() * value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(instance.getY() * value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(instance.getZ() * value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void divX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(instance.getX() / value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(instance.getY() / value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(instance.getZ() / value);
        //>REMOVE-BRIDGE<
    }

    /// Calcs
    @MethodArgs(args ={"value"})
    public Vector3 mul(Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.mul(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 mul(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.mul(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3 mul(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.mul(a).toJAVARuntime();
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
    @MethodArgs(args ={"x","y","z"})
    public void mulLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        instance.mulLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void mulLocal(float a){
        //<REMOVE-BRIDGE>
        instance.mulLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector3 div(Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.div(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 div(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.div(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3 div(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.div(a).toJAVARuntime();
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
    @MethodArgs(args ={"x","y","z"})
    public void divLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        instance.divLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void divLocal(float a){
        //<REMOVE-BRIDGE>
        instance.divLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector3 sum(Vector3 value){
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
    @MethodArgs(args ={"x","y","z"})
    public Vector3 sum(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.add(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3 sum(float a){
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
    @MethodArgs(args ={"x","y","z"})
    public void sumLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        instance.addLocal(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void sumLocal(float a){
        //<REMOVE-BRIDGE>
        instance.addLocal(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Vector3 sub(Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.sub(value.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 sub(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.sub(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector3 sub(float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.sub(a).toJAVARuntime();
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
    @MethodArgs(args ={"x","y","z"})
    public void subLocal(float x, float y, float z){
        //<REMOVE-BRIDGE>
        instance.subLocal(x, y, z);
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
    public boolean equals(Vector3 vector){
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
    @MethodArgs(args ={"x","y","z"})
    public boolean equals(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VectorUtils.equals(instance, x, y, z);
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
    public void set(Vector3 vector3){
        //<REMOVE-BRIDGE>
        this.instance.set(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void set(float x, float y, float z){
        //<REMOVE-BRIDGE>
        this.instance.set(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //<REMOVE-BRIDGE>
        this.instance.set(a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Vector3 vector3, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(vector3.instance, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerp(float x, float y, float z, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(x, y, z, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(float a, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(a, speed);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Vector3 vector3, float speed){
        //<REMOVE-BRIDGE>
        float deltaTime = Time.getScaledDeltaTime();
        deltaTime = Mathf.clamp(0, deltaTime, 0.1f);
        this.instance.lerpLocal(vector3.instance, speed * deltaTime);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerpInSeconds(float x, float y, float z, float speed){
        //<REMOVE-BRIDGE>
        float deltaTime = Time.getScaledDeltaTime();
        deltaTime = Mathf.clamp(0, deltaTime, 0.1f);
        this.instance.lerpLocal(x, y, z, speed * deltaTime);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //<REMOVE-BRIDGE>
        float deltaTime = Time.getScaledDeltaTime();
        deltaTime = Mathf.clamp(0, deltaTime, 0.1f);
        this.instance.lerpLocal(a, speed * deltaTime);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Vector3 vector3, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(vector3.instance, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","blend"})
    public void blend(float x, float y, float z, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(x, y, z, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(float a, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(a, blend);
        //>REMOVE-BRIDGE<
    }

    public Vector3 normalize(){
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
    public Vector3 sqrNormalize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.sqrNormalize().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public void normalizeLocal(){
        //<REMOVE-BRIDGE>
        this.instance.normalizeLocal();
        //>REMOVE-BRIDGE<
    }
    public void sqrNormalizeLocal(){
        //<REMOVE-BRIDGE>
        this.instance.sqrNormalizeLocal();
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
        return this.instance.lengthF();
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
    public float magnitude(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) this.instance.magnitude();
        //>REMOVE-BRIDGE<
    }
    public float sqrMagnitude(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) this.instance.sqrtMagnitude();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public float distance(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.distance(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public float sqrDistance(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.sqrtDistance(vector3.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public float dot(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.dot(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public float dot(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.dot(x, y, z);
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
    public Vector3 cross(Vector3 value){
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
    @MethodArgs(args ={"x","y","z"})
    public Vector3 cross(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.cross(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Vector3 copy(){
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
    public static Vector3 zero(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.zero().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Vector3 one(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.one().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","velocity","smoothTime", "maxSeed","deltaTime"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return smoothDamp(a, b, velocity, smoothTime, maxSpeed, deltaTime, new Vector3());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","velocity","smoothTime", "maxSeed","deltaTime","out"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime, Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(out == null){ out = new Vector3(); }
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.smoothDamp(a.instance, b.instance, velocity.instance, smoothTime, maxSpeed, deltaTime, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"dir","normal"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return reflect(dir, normal, new Vector3());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"dir","normal","out"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal, Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(out == null){
            out = new Vector3();
        }
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.reflect(dir.instance, normal.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static float angle(Vector3 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.angle(a.instance, b.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","c"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null){
            throw new NullPointerException("a vector can't be null");
        }
        if(b == null){
            throw new NullPointerException("b vector can't be null");
        }
        if(c == null){
            throw new NullPointerException("c vector can't be null");
        }
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.triangleNormal(a.instance, b.instance, c.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","c","out"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c, Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null){
            throw new NullPointerException("a vector can't be null");
        }
        if(b == null){
            throw new NullPointerException("b vector can't be null");
        }
        if(c == null){
            throw new NullPointerException("c vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return com.itsmagic.engine.Engines.Engine.Vector.Vector3.triangleNormal(a.instance, b.instance, c.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public static Vector3 Max(Vector3 value1, Vector3 value2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector3(
                Mathf.max(value1.getX(), value2.getX()),
                Mathf.max(value1.getY(), value2.getY()),
                Mathf.max(value1.getZ(), value2.getZ())
        );
        //>REMOVE-BRIDGE<
    }
    public static Vector3 Min(Vector3 value1, Vector3 value2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Vector3(
                Mathf.min(value1.getX(), value2.getX()),
                Mathf.min(value1.getY(), value2.getY()),
                Mathf.min(value1.getZ(), value2.getZ())
        );
        //>REMOVE-BRIDGE<
    }

    public static Vector3 Negate(Vector3 value)
    {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value.mul(-1f);
        //>REMOVE-BRIDGE<
    }

    public static Vector3 up() {
        return new Vector3 (0,1,0);
    }
    public static Vector3 down() {
        return new Vector3 (0,-1,0);
    }
    public static Vector3 back() {
        return new Vector3 (0,0,-1);
    }
    public static Vector3 forward() {
        return new Vector3 (0,0,1);
    }
    public static Vector3 left() {
        return new Vector3 (-1,0,0);
    }
    public static Vector3 right() {
        return new Vector3 (1,0,0);
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
        Vector3 out = new Vector3();
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        Vector3 out = new Vector3();
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
            this.divLocal(other.getX(), other.getY(), 0);
        }
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        Vector3 out = new Vector3();
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
            this.mulLocal(other.getX(), other.getY(), 0);
        }
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        Vector3 out = new Vector3();
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        else if(otherObject instanceof Float) {
            Float other = (Float) otherObject;
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
        return "[" + getX() + ";" + getY() + ";" + getZ() + "]";
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public void deserializeLocal(String str) {
        //<REMOVE-BRIDGE>
        try {
            if(this.instance == null) {
                this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector3();
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
