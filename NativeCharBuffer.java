package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;

//>REMOVE-BRIDGE<
import java.nio.IntBuffer;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeCharBuffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Base.NativeCharBuffer buffer;
    @IgnoreAutoComplete
    public NativeCharBuffer(com.itsmagic.engine.Engines.Native.Base.NativeCharBuffer buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public NativeCharBuffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"capacity"})
    public NativeCharBuffer(int capacity) {
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Base.NativeCharBuffer(capacity);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public char get(int index){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.get(index);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx","value"})
    public void set(int index, char value){
        //<REMOVE-BRIDGE>
        this.buffer.set(index, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void put(char value){
        //<REMOVE-BRIDGE>
        this.buffer.put(value);
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
        return buffer.capacity();
        //>REMOVE-BRIDGE<
    }
    public int getPosition(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.getPosition();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public void Position(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx * 3);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public void setPosition(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx * 3);
        //>REMOVE-BRIDGE<
    }
}
