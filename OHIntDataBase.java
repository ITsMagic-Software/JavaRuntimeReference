package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Native.BufferUtils;
import com.itsmagic.engine.Engines.Native.Base.NativeIntBuffer;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Buffers"})
public class OHIntDataBase {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Adapters.OHIntDataBase buffer;
    @IgnoreAutoComplete
    public OHIntDataBase(com.itsmagic.engine.Engines.Native.Adapters.OHIntDataBase buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public OHIntDataBase(Engine engine) { }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"capacity"})
    public OHIntDataBase(int capacity){
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.OHIntDataBase(capacity);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"size"})
    public void incrementSize(int size){
        //<REMOVE-BRIDGE>
        this.buffer.incrementSize(size);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"size"})
    public void decrementSize(int size){
        //<REMOVE-BRIDGE>
        this.buffer.decrementSize(size);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"capacity"})
    public void resize(int newCapacity){
        //<REMOVE-BRIDGE>
        this.buffer.resize(newCapacity);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"capacity","copyData"})
    public void resize(int newCapacity, boolean copyData){
        //<REMOVE-BRIDGE>
        this.buffer.resize(newCapacity, copyData);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"position"})
    public void position(int position){
        //<REMOVE-BRIDGE>
        this.buffer.position(position);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void put(int[] value){
        //<REMOVE-BRIDGE>
        this.buffer.put(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void put(int value){
        //<REMOVE-BRIDGE>
        this.buffer.put(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","value"})
    public void set(int position, int value){
        //<REMOVE-BRIDGE>
        this.buffer.set(position, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public int get(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.get(idx);
        //>REMOVE-BRIDGE<
    }
    public int[] getBytes(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.getBytes();
        //>REMOVE-BRIDGE<
    }

    public int size(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.size();
        //>REMOVE-BRIDGE<
    }
    public int capacity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.capacity();
        //>REMOVE-BRIDGE<
    }
}
