package JAVARuntime;

//
import java.nio.IntBuffer;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeCharBuffer {
    //

    @MethodArgs(args ={"capacity"})
    public NativeCharBuffer(int capacity) {
        //
    }

    @MethodArgs(args ={"idx"})
    public char get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx","value"})
    public void set(int index, char value){
        //
    }
    @MethodArgs(args ={"value"})
    public void put(char value){
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
    @MethodArgs(args ={"idx"})
    public void Position(int idx){
        //
    }
    @MethodArgs(args ={"idx"})
    public void setPosition(int idx){
        //
    }
}
