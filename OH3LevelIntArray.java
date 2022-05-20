package JAVARuntime;

//

@ClassCategory(cat={"Buffers"})
public class OH3LevelIntArray extends OHIntDataBase {

    //

    @MethodArgs(args={"countX","countY","countZ"})
    public OH3LevelIntArray(int countX, int countY, int countZ) {
        this(countX, countY, countZ, true);
    }
    @MethodArgs(args={"countX","countY","countZ","fill"})
    public OH3LevelIntArray(int countX, int countY, int countZ, boolean fill) {
        //
        super(countZ * countY * countX);
        //

        //
    }

    @MethodArgs(args={"x","y","z"})
    public int get(int x, int y, int z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z","value"})
    public void set(int x, int y, int z, int value){
        //
    }

    @MethodArgs(args={"x","y","z"})
    private int determineIndex(int x, int y, int z){
        //
        return 0;
        //

        //
    }
}
