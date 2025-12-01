package JAVARuntime;

//

@ClassCategory(cat ={"Buffers"})
public class OH2LevelFloatArray extends OHFloatDataBase {

    //

    @MethodArgs({"countX","countY"})
    public OH2LevelFloatArray(int countX, int countY) {
        this(countX, countY, true);
    }
    @MethodArgs({"countX","countY","fill"})
    public OH2LevelFloatArray(int countX, int countY, boolean fill) {
        //
        super(countX * countY);
        //

        //
    }

    @MethodArgs({"x","y"})
    public float get(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"x","y","value"})
    public void set(int x, int y, float value){
        //
    }

    @MethodArgs({"x","y"})
    private int determineIndex(int x, int y){
        //
        return 0;
        //

        //
    }
}
