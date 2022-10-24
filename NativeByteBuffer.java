package JAVARuntime;

import java.nio.ByteBuffer;
//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeByteBuffer {
    //

    @MethodArgs(args ={"capacity"})
    public NativeByteBuffer(int capacity) {
        //
    }

    @MethodArgs(args ={"idx"})
    public byte get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx","value"})
    public void set(int index, byte value){
        //
    }
    @MethodArgs(args ={"value"})
    public void put(byte value){
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

    public ByteBuffer toIntBuffer(){
        //
        return null;
        //

        //
    }
}
