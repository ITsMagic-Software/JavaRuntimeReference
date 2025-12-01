package JAVARuntime;

//

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
    //

    public Quaternion() {
        //
    }
    @MethodArgs({"w","x","y","z"})
    public Quaternion(float w, float x, float y, float z) {
        //
    }

    @HideGetSet
    public float getX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setX(float value){
        //
    }
    @HideGetSet
    public float getY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setY(float value){
        //
    }
    @HideGetSet
    public float getZ(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setZ(float value){
        //
    }

    @HideGetSet
    public float getQX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setQX(float value){
        //
    }
    @HideGetSet
    public float getQY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setQY(float value){
        //
    }
    @HideGetSet
    public float getQZ(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setQZ(float value){
        //
    }
    @HideGetSet
    public float getQW(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setQW(float value){
        //
    }

    @MethodArgs({"x","y","z"})
    public void increment(float eulerX, float eulerY, float eulerZ){
        mulLocal(Quaternion.fromEuler(eulerX, eulerY, eulerZ));
    }

    /// Calcs
    @MethodArgs({"value"})
    public Quaternion mul(Quaternion value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"w","x","y","z"})
    public Quaternion mul(float w, float x, float y, float z){
        //
        return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void mulLocal(Quaternion value){
        //
    }
    @MethodArgs({"w","x","y","z"})
    public void mulLocal(float w, float x, float y, float z){
        //
    }

    @MethodArgs({"value"})
    public Quaternion multiply(Quaternion value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"w","x","y","z"})
    public Quaternion multiply(float w, float x, float y, float z){
        //
        return null;
        //

        //
    }

    // IF YOU WANT TO SUM ROTATIONS, YOU SHOULD MULTIPLY BOTH QUATERNIONS
    // THOSE "sum" METHODS ARE JUST ALIAS FOR BETTER UNDERSTANDABLE
    @MethodArgs({"value"})
    public Quaternion sum(Quaternion value){
        return mul(value);
    }
    @MethodArgs({"w","x","y","z"})
    public Quaternion sum(float w, float x, float y, float z){
        return mul(w,x,y,z);
    }
    @MethodArgs({"value"})
    public void sumLocal(Quaternion value){
        mulLocal(value);
    }
    @MethodArgs({"w","x","y","z"})
    public void sumLocal(float w, float x, float y, float z){
        mulLocal(w,x,y,z);
    }

    @MethodArgs({"value"})
    public Quaternion add(Quaternion value){
        return mul(value);
    }
    @MethodArgs({"w","x","y","z"})
    public Quaternion add(float w, float x, float y, float z){
        return mul(w,x,y,z);
    }

    public Quaternion normalize(){
        //
        return null;
        //

        //
    }
    public void normalizeLocal(){
        //
    }

    /// Utils
    @MethodArgs({"value"})
    public boolean equals(Quaternion quaternion){
        //
        return false;
        //

        //
    }
    @MethodArgs({"w","x","y","z"})
    public boolean equals(float w, float x, float y, float z){
        //
        return false;
        //

        //
    }
    @MethodArgs({"a"})
    public boolean equals(float a){
        //
        return false;
        //

        //
    }

    @MethodArgs({"value","blend"})
    public Quaternion blend(Quaternion quaternion, float blend){
        //
        return null;
        //

        //
    }
    @MethodArgs({"value","blend"})
    public void blendLocal(Quaternion quaternion, float blend){
        //
    }

    @MethodArgs({"direction"})
    public void selfLookTo(Vector3 direction){
        //
    }
    @MethodArgs({"from","to"})
    public void selfLookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs({"direction"})
    public void localLookTo(Vector3 direction){
        //
    }
    @MethodArgs({"from","to"})
    public void localLookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs({"direction"})
    public void lookTo(Vector3 direction){
        //
    }
    @MethodArgs({"from","to"})
    public void lookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs({"from","to","up"})
    public void lookTo(Vector3 from, Vector3 to, Vector3 up){
        //
    }

    @MethodArgs({"value","speed"})
    public Quaternion slerp(Quaternion b, float t) {
        //
        return null;
        //

        //
    }
    @MethodArgs({"value","speed"})
    public void slerpLocal(Quaternion b, float t){
        //
    }
    @MethodArgs({"a","b","speed"})
    public void slerpLocal(Quaternion a, Quaternion b, float t){
        //
    }

    @MethodArgs({"value"})
    public void set(Quaternion quaternion){
        //
    }
    @MethodArgs({"w","x","y","z"})
    public void set(float w, float x, float y, float z){
        //
    }
    @MethodArgs({"a"})
    public void set(float a){
        //
    }

    public void setIdentity(){
        //
    }

    @MethodArgs({"x","y","z"})
    public void setFromEuler(float x, float y, float z){
        //
    }
    @MethodArgs({"value"})
    public void setFromEuler(Vector3 value){
        //
    }

    public Vector3 toEuler(){
        //
        return null;
        //

        //
    }

    public Quaternion copy(){
        //
        return null;
        //

        //
    }

    @MethodArgs({"value"})
    public Vector3 rotateVector(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs({"value","out"})
    public Vector3 rotateVector(Vector3 vector3, Vector3 out){
        //
        return null;
        //

        //
    }

    /// Abstract
    @MethodArgs({"value"})
    public static Quaternion fromEuler(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public static Quaternion fromEuler(float x, float y, float z){
        //
        return null;
        //

        //
    }
    @MethodArgs({"value"})
    public static Quaternion createFromEuler(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public static Quaternion createFromEuler(float x, float y, float z){
        //
        return null;
        //

        //
    }
    public static Quaternion zero(){
        //
        return null;
        //

        //
    }

    @MethodArgs({"a","b","speed"})
    public static Quaternion slerp(Quaternion a, Quaternion b, float t){
        //
        return null;
        //

        //
    }
    @MethodArgs({"from","to"})
    public static Quaternion lookAt(Vector3 from, Vector3 to){
        //
        return null;
        //

        //
    }
    @MethodArgs({"from","to","up"})
    public static Quaternion lookAt(Vector3 from, Vector3 to, Vector3 up){
        //
        return null;
        //

        //
    }

    @MethodArgs({"angle","value"})
    public static Quaternion angleAxis(float angle, Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"angle","x","y","z"})
    public static Quaternion angleAxis(float angle, float x, float y, float z){
        //
        return null;
        //

        //
    }

    @MethodArgs({"forward"})
    public static Quaternion lookRotation(Vector3 forward){
        //
        return null;
        //

        //
    }
    @MethodArgs({"forward","upwards"})
    public static Quaternion lookRotation(Vector3 forward, Vector3 upwards){
        //
        return null;
        //

        //
    }

    /// Comparators
    @MethodArgs({"value"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs({"value"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs({"value"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs({"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }

    /// Operators
    @MethodArgs({"value"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void mulEqual(Object otherObject) {
        //
    }

    //
    public String serializeToString() {
        //
        return null;
        //

        //
    }

    //
    public void deserializeLocal(String str) {
        //
    }
}
