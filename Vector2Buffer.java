package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vector","Buffers"})
public class Vector2Buffer {
    //

    public Vector2Buffer() {
        //
    }

    @MethodArgs(args={"idx"})
    public Vector2 get(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public float getX(int idx){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public float getY(int idx){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public void put(Vector2 vector){
        //
    }
    @MethodArgs(args={"x","y"})
    public void put(float x, float y){
        //
    }

    @MethodArgs(args={"idx","x","y"})
    public void set(int idx, Vector2 vector){
        //
    }
    @MethodArgs(args={"idx","x","y"})
    public void set(int idx, float x, float y){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }

    public Vector2[] array(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"idx"})
    public void position(int idx){
        //
    }

    @HideGetSet
    public boolean isVboEnabled() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setVboEnabled(boolean value){
        //
    }

    public Vector2Buffer copy(){
        //
        return null;
        //

        //
    }

    public JAVARuntime.NativeFloatBuffer getFloatBuffer(){
        //
        return null;
        //

        //
    }
}
