package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public class Curve {
    public enum WrapMode{
        Loop, ClampToBorder, PingPong
    }

    //

    //

    public Curve() {
        //
    }

    public void addPoint(float x, float y){
        //
    }
    public void setPoint(int idx, float x, float y){
        //
    }
    public Vector2 pointAt(int idx){
        //
        return null;
        //

        //
    }
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
    public void setWrapMode(WrapMode wrapMode) {
        //
    }

    public String toJson(){
        //
        return null;
        //

        //
    }
    public Curve fromJson(String json){
        //
        return null;
        //

        //
    }
}
