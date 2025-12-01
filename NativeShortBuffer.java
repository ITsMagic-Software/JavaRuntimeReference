package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeShortBuffer {
    //

    @MethodArgs({"capacity"})
    public NativeShortBuffer(int capacity) {
        //
    }

    @MethodArgs({"idx"})
    public short get(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"idx","valuee"})
    public void set(int index, short value){
        //
    }
    @MethodArgs({"value"})
    public void put(short value){
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
    public int position(int idx){
        //
        return idx;
    }
    @MethodArgs({"idx"})
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
    @MethodArgs({"value"})
    public void setVboEnabled(boolean value){
        //
    }
}
