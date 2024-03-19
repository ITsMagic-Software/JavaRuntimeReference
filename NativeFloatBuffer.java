package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
import java.nio.FloatBuffer;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Buffers"})
public class NativeFloatBuffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Base.NativeFloatBuffer buffer;
    @IgnoreAutoComplete
    public NativeFloatBuffer(com.itsmagic.engine.Engines.Native.Base.NativeFloatBuffer buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public NativeFloatBuffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"capacity"})
    public NativeFloatBuffer(int capacity) {
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Base.NativeFloatBuffer(capacity);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public float get(int index){
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
    @MethodArgs(args ={"idx","valuee"})
    public void set(int index, float value){
        //<REMOVE-BRIDGE>
        this.buffer.set(index, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void put(float value){
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
    public int position(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx * 3);
        //>REMOVE-BRIDGE<
        return idx;
    }
    @MethodArgs(args ={"idx"})
    public void setPosition(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx * 3);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isVboEnabled() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.isVboEnabled();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVboEnabled(boolean value){
        //<REMOVE-BRIDGE>
        buffer.setVboEnabled(value);
        //>REMOVE-BRIDGE<
    }
}
