package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public class Point2 {
    //

    //

    public Point2() {
        //
    }
    @MethodArgs(args ={"x","y"})
    public Point2(int x, int y) {
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setY(int value){
        //
    }


    /// Calcs
    @MethodArgs(args ={"value"})
    public Point2 mul(Point2 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Point2 mul(int x, int y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Point2 mul(int a){
        //
       return null;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public Point2 div(Point2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Point2 div(int x, int y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Point2 div(int a){
        //
       return null;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public Point2 sum(Point2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Point2 sum(int x, int y){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Point2 sum(int a){
        //
       return null;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public Point2 sub(Point2 value){
        //
       return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Point2 sub(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public Point2 sub(int a){
        //
        return null;
        //

        //
    }


    /// Utils
    @MethodArgs(args ={"point2"})
    public boolean equals(Point2 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public boolean equals(int x, int y){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public boolean equals(int a){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"point2"})
    public void set(Point2 vector3){
        //
    }
    @MethodArgs(args ={"x","y"})
    public void set(int x, int y){
        //
    }
    @MethodArgs(args ={"a"})
    public void set(int a){
        //
    }

    @MethodArgs(args ={"point2","speed"})
    public void lerp(Point2 vector3, int speed){
        //
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerp(int x, int y, int speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(int a, int speed){
        //
    }

    @MethodArgs(args ={"point2","speed"})
    public void lerpInSeconds(Point2 vector3, int speed){
        //
    }
    @MethodArgs(args ={"x","y","speed"})
    public void lerpInSeconds(int x, int y, int speed){
        //
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(int a, int speed){
        //
    }

    @MethodArgs(args ={"point2","blend"})
    public void blend(Point2 vector3, int blend){
        //
    }
    @MethodArgs(args ={"x","y","blend"})
    public void blend(int x, int y, int blend){
        //
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(int a, int blend){
        //
    }

    public Point2 normalize(){
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
    @MethodArgs(args ={"point2"})
    public float distance(Point2 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"point2"})
    public float sqrDistance(Point2 vector3){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"point2"})
    public float dot(Point2 vector3){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float dot(int x, int y){
        //
       return 0;
        //

        //
    }
    @MethodArgs(args ={"a"})
    public float dot(int a){
        //
       return 0;
        //

        //
    }

    @MethodArgs(args ={"point2"})
    public Vector3 cross(Point2 value){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public Vector3 cross(int x, int y){
        //
        return null;
        //

        //
    }

    public Point2 copy(){
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
    public static Point2 zero(){
        //
        return null;
        //

        //
    }
}
