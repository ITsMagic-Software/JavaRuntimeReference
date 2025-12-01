package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Point3 {
    //

    //

    public Point3() {
        //
    }
    @MethodArgs({"a"})
    public Point3(int a) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Point3(int x, int y, int z) {
        //
    }

    @HideGetSet
    public int getX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setX(int value){
        //
    }
    @HideGetSet
    public int getY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setY(int value){
        //
    }
    @HideGetSet
    public int getZ(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setZ(int value){
        //
    }


    /// Calcs
    @MethodArgs({"value"})
    public Point3 mul(Point3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public Point3 mul(int x, int y, int z){
        //
       return null;
        //

        //
    }
    @MethodArgs({"a"})
    public Point3 mul(int a){
        //
       return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void mulLocal(Vector3 value){
        //
    }
    @MethodArgs({"value"})
    public void mulLocal(Point3 value){
        //
    }
    @MethodArgs({"x","y","z"})
    public void mulLocal(float x, float y, float z){
        //
    }
    @MethodArgs({"a"})
    public void mulLocal(float a){
        //
    }

    @MethodArgs({"value"})
    public Point3 div(Point3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public Point3 div(int x, int y, int z){
        //
       return null;
        //

        //
    }
    @MethodArgs({"a"})
    public Point3 div(int a){
        //
       return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void divLocal(Vector3 value){
        //
    }
    @MethodArgs({"value"})
    public void divLocal(Point3 value){
        //
    }
    @MethodArgs({"x","y","z"})
    public void divLocal(float x, float y, float z){
        //
    }
    @MethodArgs({"a"})
    public void divLocal(float a){
        //
    }

    @MethodArgs({"value"})
    public Point3 sum(Point3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public Point3 sum(int x, int y, int z){
        //
       return null;
        //

        //
    }
    @MethodArgs({"a"})
    public Point3 sum(int a){
        //
       return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void sumLocal(Vector3 value){
        //
    }
    @MethodArgs({"value"})
    public void sumLocal(Point3 value){
        //
    }
    @MethodArgs({"x","y","z"})
    public void sumLocal(float x, float y, float z){
        //
    }
    @MethodArgs({"a"})
    public void sumLocal(float a){
        //
    }

    @MethodArgs({"value"})
    public Point3 sub(Point3 value){
        //
       return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public Point3 sub(int x, int y, int z){
        //
        return null;
        //

        //
    }
    @MethodArgs({"a"})
    public Point3 sub(int a){
        //
        return null;
        //

        //
    }
    @MethodArgs({"value"})
    public void subLocal(Vector3 value){
        //
    }
    @MethodArgs({"value"})
    public void subLocal(Point3 value){
        //
    }
    @MethodArgs({"x","y","z"})
    public void subLocal(float x, float y, float z){
        //
    }
    @MethodArgs({"a"})
    public void subLocal(float a){
        //
    }


    /// Utils
    @MethodArgs({"value"})
    public boolean equals(Point3 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public boolean equals(int x, int y, int z){
        //
        return false;
        //

        //
    }
    @MethodArgs({"a"})
    public boolean equals(int a){
        //
        return false;
        //

        //
    }

    @MethodArgs({"value"})
    public void set(Point3 vector3){
        //
    }
    @MethodArgs({"x","y","z"})
    public void set(int x, int y, int z){
        //
    }
    @MethodArgs({"a"})
    public void set(int a){
        //
    }

    @MethodArgs({"value","speed"})
    public void lerp(Point3 vector3, int speed){
        //
    }
    @MethodArgs({"x","y","z","speed"})
    public void lerp(int x, int y, int z, int speed){
        //
    }
    @MethodArgs({"a","speed"})
    public void lerp(int a, int speed){
        //
    }

    @MethodArgs({"value","speed"})
    public void lerpInSeconds(Point3 vector3, int speed){
        //
    }
    @MethodArgs({"x","y","z","speed"})
    public void lerpInSeconds(int x, int y, int z, int speed){
        //
    }
    @MethodArgs({"a","speed"})
    public void lerpInSeconds(int a, int speed){
        //
    }

    @MethodArgs({"value","blend"})
    public void blend(Point3 vector3, int blend){
        //
    }
    @MethodArgs({"x","y","z","blend"})
    public void blend(int x, int y, int z, int blend){
        //
    }
    @MethodArgs({"a","blend"})
    public void blend(int a, int blend){
        //
    }

    public Point3 normalize(){
        //
        return null;
        //

        //
    }
    public void normalizeLocal(){
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
    @MethodArgs({"value"})
    public float distance(Point3 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs({"value"})
    public float sqrDistance(Point3 vector3){
        //
       return 0;
        //

        //
    }

    @MethodArgs({"value"})
    public float dot(Point3 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public float dot(int x, int y, int z){
        //
       return 0;
        //

        //
    }
    @MethodArgs({"a"})
    public float dot(int a){
        //
       return 0;
        //

        //
    }

    @MethodArgs({"value"})
    public Vector3 cross(Point3 value){
        //
        return null;
        //

        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3 cross(int x, int y, int z){
        //
        return null;
        //

        //
    }

    public Point3 copy(){
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

    /// Abstracts
    public static Point3 zero(){
        //
        return null;
        //

        //
    }
}
