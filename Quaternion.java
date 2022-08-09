package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vector"})
public class Quaternion implements
        MulOperator,
        MulEqualOperator,
        EqualsComparator
{
    //

    public Quaternion() {
        //
    }
    @MethodArgs(args={"w","x","y","z"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
    public void setQW(float value){
        //
    }

    /// Calcs
    @MethodArgs(args={"value"})
    public Quaternion mul(Quaternion value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"w","x","y","z"})
    public Quaternion mul(float w, float x, float y, float z){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void mulLocal(Quaternion value){
        //
    }
    @MethodArgs(args={"w","x","y","z"})
    public void mulLocal(float w, float x, float y, float z){
        //
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
    @MethodArgs(args={"value"})
    public boolean equals(Quaternion quaternion){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"w","x","y","z"})
    public boolean equals(float w, float x, float y, float z){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"a"})
    public boolean equals(float a){
        //
        return false;
        //

        //
    }

    @MethodArgs(args={"value","blend"})
    public void blend(Quaternion quaternion, float blend){
        //
    }
    @MethodArgs(args={"to"})
    public void selfLookTo(Vector3 to){
        //
    }
    @MethodArgs(args={"from","to"})
    public void selfLookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs(args={"to"})
    public void localLookTo(Vector3 to){
        //
    }
    @MethodArgs(args={"from","to"})
    public void localLookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs(args={"to"})
    public void lookTo(Vector3 to){
        //
    }
    @MethodArgs(args={"from","to"})
    public void lookTo(Vector3 from, Vector3 to){
        //
    }
    @MethodArgs(args={"from","to","up"})
    public void lookTo(Vector3 from, Vector3 to, Vector3 up){
        //
    }

    @MethodArgs(args={"value","speed"})
    public Quaternion slerp(Quaternion b, float t) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value","speed"})
    public void slerpLocal(Quaternion b, float t){
        //
    }
    @MethodArgs(args={"a","b","speed"})
    public void slerpLocal(Quaternion a, Quaternion b, float t){
        //
    }

    @MethodArgs(args={"value"})
    public void set(Quaternion quaternion){
        //
    }
    @MethodArgs(args={"w","x","y","z"})
    public void set(float w, float x, float y, float z){
        //
    }
    @MethodArgs(args={"a"})
    public void set(float a){
        //
    }

    public void setIdentity(){
        //
    }

    @MethodArgs(args={"x","y","z"})
    public void setFromEuler(float x, float y, float z){
        //
    }
    @MethodArgs(args={"value"})
    public void setFromEuler(Vector3 value){
        //
    }

    public Quaternion copy(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"value"})
    public Vector3 rotateVector(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value","out"})
    public Vector3 rotateVector(Vector3 vector3, Vector3 out){
        //
        return null;
        //

        //
    }

    /// Abstract
    @MethodArgs(args={"value"})
    public static Quaternion fromEuler(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static Quaternion createFromEuler(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"x","y","z"})
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
    @MethodArgs(args={"a","b","blend"})
    public static Quaternion blendOut(Quaternion a, Quaternion b, float blend){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"a","b","speed"})
    public static Quaternion slerp(Quaternion a, Quaternion b, float t){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"from","to"})
    public static Quaternion lookAt(Vector3 from, Vector3 to){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"from","to","up"})
    public static Quaternion lookAt(Vector3 from, Vector3 to, Vector3 up){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"angle","value"})
    public static Quaternion angleAxis(float angle, Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"angle","x","y","z"})
    public static Quaternion angleAxis(float angle, float x, float y, float z){
        //
        return null;
        //

        //
    }

    /// Comparators
    @MethodArgs(args={"value"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }

    /// Operators
    @MethodArgs(args={"value"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void mulEqual(Object otherObject) {
        //
    }
}
