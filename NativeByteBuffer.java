package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeByteBuffer {
    //

    @MethodArgs({"capacity"})
    public NativeByteBuffer(int capacity) {
        //
    }

    @MethodArgs({"idx"})
    public byte get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"idx","value"})
    public void set(int index, byte value){
        //
    }
    @MethodArgs({"value"})
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
    @MethodArgs({"idx"})
    public void Position(int idx){
        //
    }
    @MethodArgs({"idx"})
    public void setPosition(int idx){
        //
    }
}
