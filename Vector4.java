package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vector"})
public class Vector4 {

    //

    public Vector4() {
        //
    }
    @MethodArgs(args={"x","y","z","w"})
    public Vector4(float x, float y, float z, float w) {
        //
    }
    @MethodArgs(args={"x","y","z"})
    public Vector4(float x, float y, float z) {
        //
    }
    @MethodArgs(args={"x","y"})
    public Vector4(float x, float y) {
        //
    }
    @MethodArgs(args={"a"})
    public Vector4(float a) {
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
    public float getW(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setW(float value){
        //
    }

    @MethodArgs(args={"value"})
    public void set(Vector4 vector){
        //
    }
    @MethodArgs(args={"x","y","z","w"})
    public void set(float x, float y, float z, float w){
        //
    }
    @MethodArgs(args={"a"})
    public void set(float a){
        //
    }
}
