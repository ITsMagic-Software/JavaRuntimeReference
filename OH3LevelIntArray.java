package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Buffers"})
public class OH3LevelIntArray extends OHIntDataBase {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Adapters.OH3LevelIntArray buffer;
    @IgnoreAutoComplete
    public OH3LevelIntArray(com.itsmagic.engine.Engines.Native.Adapters.OH3LevelIntArray buffer) {
        super(buffer);
        this.buffer = buffer;
    }

    @BuildClassConstructor
    public OH3LevelIntArray(Engine engine) {
        super(engine);
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"countX","countY","countZ"})
    public OH3LevelIntArray(int countX, int countY, int countZ) {
        this(countX, countY, countZ, true);
    }
    @MethodArgs(args ={"countX","countY","countZ","fill"})
    public OH3LevelIntArray(int countX, int countY, int countZ, boolean fill) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(countZ * countY * countX);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Native.Adapters.OH3LevelIntArray(countX, countY, countZ));
        this.buffer.setRuntime(this);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public int get(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.get(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","value"})
    public void set(int x, int y, int z, int value){
        //<REMOVE-BRIDGE>
        this.buffer.set(x, y, z, value);
        //>REMOVE-BRIDGE<
    }

    public int getSizeX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.getCountX();
        //>REMOVE-BRIDGE<
    }
    public int getSizeY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.getCountY();
        //>REMOVE-BRIDGE<
    }
    public int getSizeZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.getCountZ();
        //>REMOVE-BRIDGE<
    }
}
