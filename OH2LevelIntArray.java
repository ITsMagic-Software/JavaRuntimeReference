package JAVARuntime;

//

@ClassCategory(cat={"Buffers"})
public class OH2LevelIntArray extends OHIntDataBase {

    //

    @MethodArgs(args={"countX","countY"})
    public OH2LevelIntArray(int countX, int countY) {
        this(countX, countY, true);
    }
    @MethodArgs(args={"countX","countY","fill"})
    public OH2LevelIntArray(int countX, int countY, boolean fill) {
        //
        super(countX * countY);
        //

        //
    }

    @MethodArgs(args={"x","y"})
    public int get(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","value"})
    public void set(int x, int y, int value){
        //
    }

    @MethodArgs(args={"x","y"})
    private int determineIndex(int x, int y){
        //
        return 0;
        //

        //
    }
}
