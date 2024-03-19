package JAVARuntime;
//

@ClassCategory(cat ={"Buffers"})
public class OHDataBase {

    //

    @MethodArgs(args ={"capacity"})
    public OHDataBase(int capacity){
        //
    }

    @MethodArgs(args ={"size"})
    public void incrementSize(int size){
        //
    }
    @MethodArgs(args ={"size"})
    public void decrementSize(int size){
        //
    }

    @MethodArgs(args ={"capacity"})
    public void resize(int newCapacity){
        //
    }
    @MethodArgs(args ={"capacity","copyData"})
    public void resize(int newCapacity, boolean copyData){
        //
    }

    @MethodArgs(args ={"position"})
    public void position(int position){
        //
    }

    @MethodArgs(args ={"bytes"})
    public void put(byte[] bytes){
        //
    }
    @MethodArgs(args ={"position","value"})
    public void set(int position, byte value){
        //
    }

    @MethodArgs(args ={"idx"})
    public byte get(int idx){
        //
        return 0;
        //

        //
    }
    public byte[] getBytes(){
        //
        return null;
        //

        //
    }

    public int size(){
        //
        return 0;
        //

        //
    }
    public int capacity(){
        //
        return 0;
        //

        //
    }
}
