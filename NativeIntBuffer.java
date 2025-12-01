package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeIntBuffer {
    //

    @MethodArgs({"capacity"})
    public NativeIntBuffer(int capacity) {
        //
    }

    @MethodArgs({"idx"})
    public int get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"idx","value"})
    public void set(int index, int value){
        //
    }
    @MethodArgs({"value"})
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
    @MethodArgs({"idx"})
    public void Position(int idx){
        //
    }
    @MethodArgs({"idx"})
    public void setPosition(int idx){
        //
    }
}
