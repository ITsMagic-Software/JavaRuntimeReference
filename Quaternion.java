package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Quaternion.QuaternionUtils;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Quaternion implements
        MulOperator,
        MulEqualOperator,
        EqualsComparator,
        JsonSerializer
{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion instance;
    @IgnoreAutoComplete
    public Quaternion(com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Quaternion() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        this.instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public Quaternion(float w, float x, float y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion(w, x, y, z);
        this.instance.setRuntime(this);
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
        return instance.getEulerX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //<REMOVE-BRIDGE>
        instance.setEulerX(value);
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
        return instance.getEulerY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //<REMOVE-BRIDGE>
        instance.setEulerY(value);
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
        return instance.getEulerZ();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //<REMOVE-BRIDGE>
        instance.setEulerZ(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getQX(){
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
    public void setQX(float value){
        //<REMOVE-BRIDGE>
        instance.setX(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getQY(){
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
    public void setQY(float value){
        //<REMOVE-BRIDGE>
        instance.setY(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getQZ(){
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
    public void setQZ(float value){
        //<REMOVE-BRIDGE>
        instance.setZ(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getQW(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getW();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setQW(float value){
        //<REMOVE-BRIDGE>
        instance.setW(value);
        //>REMOVE-BRIDGE<
    }

    /// Calcs
    @MethodArgs(args ={"value"})
    public Quaternion mul(Quaternion value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Quaternion quaternion = new Quaternion();
        quaternion.set(this);
        quaternion.mul(value.instance);
        return quaternion;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public Quaternion mul(float w, float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Quaternion quaternion = new Quaternion();
        quaternion.set(this);
        quaternion.mul(w, x, y, z);
        return quaternion;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Quaternion value){
        //<REMOVE-BRIDGE>
        instance.mulLocal(value.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public void mulLocal(float w, float x, float y, float z){
        //<REMOVE-BRIDGE>
        instance.mulLocal(w, x, y, z);
        //>REMOVE-BRIDGE<
    }

    public Quaternion normalize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quaternion = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quaternion.set(this.instance);
        quaternion.normalizeLocal();
        return quaternion.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public void normalizeLocal(){
        //<REMOVE-BRIDGE>
        this.instance.normalizeLocal();
        //>REMOVE-BRIDGE<
    }

    /// Utils
    @MethodArgs(args ={"value"})
    public boolean equals(Quaternion quaternion){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return QuaternionUtils.equals(this.instance, quaternion.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public boolean equals(float w, float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return QuaternionUtils.equals(this.instance, w, x, y, z);
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
        return QuaternionUtils.equals(this.instance, a);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Quaternion quaternion, float blend){
        //<REMOVE-BRIDGE>
        if(quaternion == null){
            throw new NullPointerException("value can't be null");
        }
        this.instance.blendLocal(quaternion.instance, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"to"})
    public void selfLookTo(Vector3 to){
        //<REMOVE-BRIDGE>
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to"})
    public void selfLookTo(Vector3 from, Vector3 to){
        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(from.instance, to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"to"})
    public void localLookTo(Vector3 to){
        //<REMOVE-BRIDGE>
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to"})
    public void localLookTo(Vector3 from, Vector3 to){
        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(from.instance, to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"to"})
    public void lookTo(Vector3 to){
        //<REMOVE-BRIDGE>
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to"})
    public void lookTo(Vector3 from, Vector3 to){
        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        this.instance.lookToLocal(from.instance, to.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to","up"})
    public void lookTo(Vector3 from, Vector3 to, Vector3 up){
        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        if(up == null){
            throw new NullPointerException("up vector can't be null");
        }
        this.instance.lookToLocal(from.instance, to.instance, up.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public Quaternion slerp(Quaternion b, float t) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quaternion = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quaternion.slerpLocal(this.instance, b.instance, t);
        return quaternion.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","speed"})
    public void slerpLocal(Quaternion b, float t){
        //<REMOVE-BRIDGE>
        instance.slerpLocal(b.instance, t);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","speed"})
    public void slerpLocal(Quaternion a, Quaternion b, float t){
        //<REMOVE-BRIDGE>
        instance.slerpLocal(a.instance, b.instance, t);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void set(Quaternion quaternion){
        //<REMOVE-BRIDGE>
        this.instance.set(quaternion.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public void set(float w, float x, float y, float z){
        //<REMOVE-BRIDGE>
        this.instance.set(w, x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //<REMOVE-BRIDGE>
        this.instance.set(a, a, a, a);
        //>REMOVE-BRIDGE<
    }

    public void setIdentity(){
        //<REMOVE-BRIDGE>
        this.instance.setIdentity();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public void setFromEuler(float x, float y, float z){
        //<REMOVE-BRIDGE>
        this.instance.fromEuler(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setFromEuler(Vector3 value){
        //<REMOVE-BRIDGE>
        if(value == null){
            throw new NullPointerException("value cant be null");
        }
        this.instance.fromEuler(value.instance);
        //>REMOVE-BRIDGE<
    }

    public Quaternion copy(){
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

    @MethodArgs(args ={"value"})
    public Vector3 rotateVector(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        return this.instance.rotateVector(vector3.instance, true).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","out"})
    public Vector3 rotateVector(Vector3 vector3, Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        this.instance.rotateVector(vector3.instance, out.instance, true);
        return out;
        //>REMOVE-BRIDGE<
    }

    /// Abstract
    @MethodArgs(args ={"value"})
    public static Quaternion fromEuler(Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(value == null){
            throw new NullPointerException("value cant be null");
        }
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.fromEuler(value.instance);
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static Quaternion createFromEuler(Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(value == null){
            throw new NullPointerException("value cant be null");
        }
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.fromEuler(value.instance);
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public static Quaternion createFromEuler(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.fromEuler(x, y, z);
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Quaternion zero(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.zero().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","blend"})
    public static Quaternion blendOut(Quaternion a, Quaternion b, float blend){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return QuaternionUtils.interpolate(a.instance, b.instance, blend).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b","speed"})
    public static Quaternion slerp(Quaternion a, Quaternion b, float t){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.slerp(a.instance, b.instance, t).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to"})
    public static Quaternion lookAt(Vector3 from, Vector3 to){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.lookToLocal(from.instance, to.instance);
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to","up"})
    public static Quaternion lookAt(Vector3 from, Vector3 to, Vector3 up){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(from == null){
            throw new NullPointerException("from vector can't be null");
        }
        if(to == null){
            throw new NullPointerException("to vector can't be null");
        }
        if(up == null){
            throw new NullPointerException("up vector can't be null");
        }
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.lookToLocal(from.instance, to.instance, up.instance);
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle","value"})
    public static Quaternion angleAxis(float angle, Vector3 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.mulLocal(com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.createFromAxisAngle(
                value.instance.getX(),
                value.instance.getY(),
                value.instance.getZ(),
                angle
        ));
        return quat.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle","x","y","z"})
    public static Quaternion angleAxis(float angle, float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion quat = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
        quat.mulLocal(com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.createFromAxisAngle(
                x,
                y,
                z,
                angle
        ));
        return quat.toJAVARuntime();
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
        if(otherObject instanceof Quaternion) {
            Quaternion other = (Quaternion) otherObject;
            return QuaternionUtils.equals(this.instance, other.instance);
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
        if(otherObject instanceof Quaternion) {
            Quaternion other = (Quaternion) otherObject;
            return !QuaternionUtils.equals(this.instance, other.instance);
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

    /// Operators
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
        Quaternion out = new Quaternion();
        out.set(this);

        if(otherObject instanceof Quaternion) {
            Quaternion other = (Quaternion) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion) {
            com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion other = (com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion) otherObject;
            out.instance.mulLocal(other);
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
        if(otherObject instanceof Quaternion) {
            Quaternion other = (Quaternion) otherObject;
            this.mulLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator *= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
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
        return "[" + instance.getW() + ";" + instance.getX() + ";" + instance.getY() + ";" + instance.getZ() + "]";
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public void deserializeLocal(String str) {
        //<REMOVE-BRIDGE>
        try {
            if(this.instance == null) {
                this.instance = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
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
