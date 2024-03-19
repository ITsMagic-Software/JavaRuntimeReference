package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Buffers"})
public class OH2LevelIntArray extends OHIntDataBase {

    //<REMOVE-BRIDGE>
    private transient int countX;
    private transient int countY;

    @BuildClassConstructor
    public OH2LevelIntArray(Engine engine) {
        super(engine);
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"countX","countY"})
    public OH2LevelIntArray(int countX, int countY) {
        this(countX, countY, true);
    }
    @MethodArgs(args ={"countX","countY","fill"})
    public OH2LevelIntArray(int countX, int countY, boolean fill) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(countX * countY);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super( countY * countX);
        this.countX = countX;
        this.countY = countY;

        if(fill) {
            for (int i = 0; i < super.capacity(); i++) {
                super.put(0);
            }
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public int get(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return super.get(determineIndex(x, y));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void set(int x, int y, int value){
        //<REMOVE-BRIDGE>
        int idx = determineIndex(x, y);
        super.set(idx, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    private int determineIndex(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(x < 0 || y < 0){
            throw new IndexOutOfBoundsException();
        }
        if(x >= countX || y >= countY){
            throw new IndexOutOfBoundsException();
        }
        int xidx = x * countY;
        return xidx + y;
        //>REMOVE-BRIDGE<
    }
}
