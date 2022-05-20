package JAVARuntime;

//
import java.nio.IntBuffer;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Buffers"})
public class NativeIntBuffer {
    //

    @MethodArgs(args={"capacity"})
    public NativeIntBuffer(int capacity) {
        //
    }

    @MethodArgs(args={"idx"})
    public int get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx","value"})
    public void set(int index, int value){
        //
    }
    @MethodArgs(args={"value"})
    public void put(int value){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }
    public int getPosition(){
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

    public IntBuffer toIntBuffer(){
        //
        return null;
        //

        //
    }
}
