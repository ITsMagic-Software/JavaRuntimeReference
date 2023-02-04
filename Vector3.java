package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public class Vector3 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator
{

    //

    //

    public Vector3() {
        //
    }
    @MethodArgs(args ={"a"})
    public Vector3(float a) {
        //
    }
    @MethodArgs(args ={"a"})
    public Vector3(int a) {
        //
    }

    @MethodArgs(args ={"x","y","z"})
    public Vector3(float x, float y, float z) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, int y, int z) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(float x, float y, int z) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, float y, int z) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, float y, float z) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3(int x, int y, float z) {
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //
    }

    @HideGetSet
    @UnimplementedDoc
    public Vector2 getXY(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getXZ(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getYZ(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getYX(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getZX(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getZY(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @UnimplementedDoc
    public void SetXY(Vector2 v){
        //
    }
    @HideGetSet
    @UnimplementedDoc
    public void SetXZ(Vector2 v){
        //
    }
    @HideGetSet
    @UnimplementedDoc
    public void SetYZ(Vector2 v){
        //
    }
    @HideGetSet
    @UnimplementedDoc
    public void SetYX(Vector2 v){
        //
    }
    @HideGetSet
    @UnimplementedDoc
    public void SetZX(Vector2 v){
        //
    }
    @HideGetSet
    @UnimplementedDoc
    public void SetZY(Vector2 v){
        //
    }

    @MethodArgs(args ={"value"})
    public void sumX(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void sumY(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void sumZ(float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void subX(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void subY(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void subZ(float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void mulX(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void mulY(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void mulZ(float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void divX(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void divY(float value){
        //
    }
    @MethodArgs(args ={"value"})
    public void divZ(float value){
        //
    }

    /// Calcs
    @MethodArgs(args ={"value"})
    public Vector3 mul(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 mul(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector3 mul(float a){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Vector3 value){
        //
    }
    @MethodArgs(args ={"value"})
    public void mulLocal(Vector2 value){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void mulLocal(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"a"})
    public void mulLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector3 div(Vector3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 div(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector3 div(float a){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Vector3 value){
        //
    }
    @MethodArgs(args ={"value"})
    public void divLocal(Vector2 value){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void divLocal(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"a"})
    public void divLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector3 sum(Vector3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 sum(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector3 sum(float a){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Vector3 value){
        //
    }
    @MethodArgs(args ={"value"})
    public void sumLocal(Vector2 value){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void sumLocal(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"a"})
    public void sumLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector3 sub(Vector3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 sub(float x, float y, float z){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector3 sub(float a){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Vector3 value){
        //
    }
    @MethodArgs(args ={"value"})
    public void subLocal(Vector2 value){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void subLocal(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"a"})
    public void subLocal(float a){
        //
    }


    /// Utils
    @MethodArgs(args ={"value"})
    public boolean equals(Vector3 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public boolean equals(float x, float y, float z){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public boolean equals(float a){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public void set(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void set(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Vector3 vector3, float speed){
        //
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerp(float x, float y, float z, float speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(float a, float speed){
        //
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Vector3 vector3, float speed){
        //
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerpInSeconds(float x, float y, float z, float speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Vector3 vector3, float blend){
        //
    }
    @MethodArgs(args ={"x","y","z","blend"})
    public void blend(float x, float y, float z, float blend){
        //
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(float a, float blend){
        //
    }

    public Vector3 normalize(){
        //
        return null;
        //

        //
    }
    public Vector3 sqrNormalize(){
        //
        return null;
        //

        //
    }
    public void normalizeLocal(){
        //
    }
    public void sqrNormalizeLocal(){
        //
    }

    public float length(){
        //
       return 0;
        //

        //
    }
    public float sqrLength(){
        //
       return 0;
        //

        //
    }
    public float magnitude(){
        //
       return 0;
        //

        //
    }
    public float sqrMagnitude(){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public float distance(Vector3 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public float sqrDistance(Vector3 vector3){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public float dot(Vector3 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public float dot(float x, float y, float z){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public float dot(float a){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public Vector3 cross(Vector3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector3 cross(float x, float y, float z){
        //
        return null;
        //

        //
    }

    public Vector3 copy(){
        //
        return null;
        //

        //
    }

    public String toString() {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"decimals"})
    public String toString(int decimals) {
        //
        return null;
        //

        //
    }

    /// Abstracts
    public static Vector3 zero(){
        //
        return null;
        //

        //
    }
    public static Vector3 one(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a","b","velocity","smoothTime", "maxSeed","deltaTime"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a","b","velocity","smoothTime", "maxSeed","deltaTime","out"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime, Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"dir","normal"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"dir","normal","out"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal, Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a","b"})
    public static float angle(Vector3 a, Vector3 b){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"a","b","c"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a","b","c","out"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c, Vector3 out){
        //
        return null;
        //

        //
    }

    public static Vector3 Max(Vector3 value1, Vector3 value2){
        //
        return null;
        //

        //
    }
    public static Vector3 Min(Vector3 value1, Vector3 value2){
        //
        return null;
        //

        //
    }

    public static Vector3 Negate(Vector3 value)
    {
        //
        return null;
        //

        //
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
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public boolean greaterThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(double v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public boolean lessThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(double v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    /// Operators
    @MethodArgs(args ={"value"})
    public <T> T sum(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void sumEqual(Object otherObject) {
        //
    }

    @MethodArgs(args ={"value"})
    public <T> T div(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void divEqual(Object otherObject) {
        //
    }

    @MethodArgs(args ={"value"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void mulEqual(Object otherObject) {
        //
    }

    @MethodArgs(args ={"value"})
    public <T> T sub(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void subEqual(Object otherObject) {
        //
    }

    public void addAdd() {
        //
    }
    public void removeRemove() {
        //
    }
}
