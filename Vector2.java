package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public class Vector2 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator, JsonSerializer
{

    //

    //

    public Vector2() {
        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(float x, float y) {
        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(int x, float y) {
        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(float x, int y) {
        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2(int x, int y) {
        //
    }
    @MethodArgs(args ={"a"})
    public Vector2(float a) {
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


    /// Calcs
    @MethodArgs(args ={"value"})
    public Vector2 mul(Vector2 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 mul(float x, float y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector2 mul(float a){
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
    @MethodArgs(args ={"x","y"})
    public void mulLocal(float x, float y){
        //
    }
    @MethodArgs(args ={"a"})
    public void mulLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector2 div(Vector2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 div(float x, float y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector2 div(float a){
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
    @MethodArgs(args ={"x","y"})
    public void divLocal(float x, float y){
        //
    }
    @MethodArgs(args ={"a"})
    public void divLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector2 sum(Vector2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 sum(float x, float y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector2 sum(float a){
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
    @MethodArgs(args ={"x","y"})
    public void sumLocal(float x, float y){
        //
    }
    @MethodArgs(args ={"a"})
    public void sumLocal(float a){
        //
    }

    @MethodArgs(args ={"value"})
    public Vector2 sub(Vector2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector2 sub(float x, float y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Vector2 sub(float a){
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
    @MethodArgs(args ={"x","y"})
    public void subLocal(float x, float y){
        //
    }
    @MethodArgs(args ={"a"})
    public void subLocal(float a){
        //
    }

    /// Utils
    @MethodArgs(args ={"value"})
    public boolean equals(Vector2 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public boolean equals(float x, float y){
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
    public void set(Vector2 vector2){
        //
    }
    @MethodArgs(args ={"x","y"})
    public void set(float x, float y){
        //
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Vector2 vector2, float speed){
        //
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerp(float x, float y, float speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(float a, float speed){
        //
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Vector2 vector2, float speed){
        //
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerpInSeconds(float x, float y, float speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Vector2 vector2, float blend){
        //
    }
    @MethodArgs(args ={"x","y","blend"})
    public void blend(float x, float y, float blend){
        //
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(float a, float blend){
        //
    }

    public Vector2 normalize(){
        //
        return null;
        //

        //
    }
    public void normalizeLocal(){
        //
    }

    @MethodArgs(args ={"angle"})
    public void rotateLocal(float angle){
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
    @MethodArgs(args ={"value"})
    public float distance(Vector2 vector2){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public float sqrDistance(Vector2 vector2){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public float dot(Vector2 vector2){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float dot(float x, float y){
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
    public Vector3 cross(Vector2 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector3 cross(float x, float y){
        //
        return null;
        //

        //
    }

    public Vector2 copy(){
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
    public static Vector2 zero(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"vector","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, float angle){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector","pivot","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, Vector2 pivot, float angle){
        //
        return null;
        //

        //
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
