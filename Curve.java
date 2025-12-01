package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Curve {
    public enum WrapMode{
        Loop, ClampToBorder, PingPong
    }

    //

    //

    public Curve() {
        //
    }

    @MethodArgs({"x","y"})
    public void addPoint(float x, float y){
        //
    }
    @MethodArgs({"idx","x","y"})
    public void setPoint(int idx, float x, float y){
        //
    }
    @MethodArgs({"idx"})
    public Vector2 pointAt(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs({"idx","out"})
    public Vector2 pointAt(int idx, Vector2 out){
        //
        return null;
        //

        //
    }
    public void clear(){
        //
    }
    public int pointsCount(){
        //
        return 0;
        //

        //
    }

    @MethodArgs({"x"})
    public float evaluate(float x){
        //
        return 0;
        //

        //
    }

    public void apply(){
        //
    }

    public WrapMode getWrapMode() {
        //
        return null;
        //

        //
    }
    @MethodArgs({"wrapMode"})
    public void setWrapMode(WrapMode wrapMode) {
        //
    }

    public String toJson(){
        //
        return null;
        //

        //
    }
    @MethodArgs({"json"})
    public Curve fromJson(String json){
        //
        return null;
        //

        //
    }
}
