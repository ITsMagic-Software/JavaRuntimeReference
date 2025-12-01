package JAVARuntime;

//

@ClassCategory(cat ={"Buffers"})
public class OH3LevelIntArray extends OHIntDataBase {

    //

    @MethodArgs({"countX","countY","countZ"})
    public OH3LevelIntArray(int countX, int countY, int countZ) {
        this(countX, countY, countZ, true);
    }
    @MethodArgs({"countX","countY","countZ","fill"})
    public OH3LevelIntArray(int countX, int countY, int countZ, boolean fill) {
        //
        super(countZ * countY * countX);
        //

        //
    }

    @MethodArgs({"x","y","z"})
    public int get(int x, int y, int z){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"x","y","z","value"})
    public void set(int x, int y, int z, int value){
        //
    }

    public int getSizeX(){
        //
        return 0;
        //

        //
    }
    public int getSizeY(){
        //
        return 0;
        //

        //
    }
    public int getSizeZ(){
        //
        return 0;
        //

        //
    }
}
