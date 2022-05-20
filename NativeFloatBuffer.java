package JAVARuntime;

//
import java.nio.FloatBuffer;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Buffers"})
public class NativeFloatBuffer {
    //

    @MethodArgs(args={"capacity"})
    public NativeFloatBuffer(int capacity) {
        //
    }

    @MethodArgs(args={"idx"})
    public float get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx","valuee"})
    public void set(int index, float value){
        //
    }
    @MethodArgs(args={"value"})
    public void put(float value){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }
    public long getPosition(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public void Position(int idx){
        //
    }
    @MethodArgs(args={"idx"})
    public void setPosition(int idx){
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

    public FloatBuffer toFloatBuffer(){
        //
        return null;
        //

        //
    }
}
