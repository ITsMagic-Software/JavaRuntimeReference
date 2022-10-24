package JAVARuntime;

//

@ClassCategory(cat ={"Buffers"})
public class OHIntDataBase {
    //

    @MethodArgs(args ={"capacity"})
    public OHIntDataBase(int capacity){
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
    @MethodArgs(args ={"value"})
    public void put(int[] value){
        //
    }
    @MethodArgs(args ={"value"})
    public void put(int value){
        //
    }
    @MethodArgs(args ={"position","value"})
    public void set(int position, int value){
        //
    }

    @MethodArgs(args ={"idx"})
    public int get(int idx){
        //
        return 0;
        //

        //
    }
    public int[] getBytes(){
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
