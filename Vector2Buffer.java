package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector","Buffers"})
public class Vector2Buffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Adapters.Vector2Buffer buffer;
    @IgnoreAutoComplete
    public Vector2Buffer(com.itsmagic.engine.Engines.Native.Adapters.Vector2Buffer buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public Vector2Buffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    public Vector2Buffer(int vectorCount) {
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Vector2Buffer(vectorCount);
        //>REMOVE-BRIDGE<
    }
    public Vector2Buffer(NativeFloatBuffer nativeFloatBuffer) {
        //<REMOVE-BRIDGE>
        if(nativeFloatBuffer == null) throw new NullPointerException("nativeFloatBuffer can't be null");
        if(nativeFloatBuffer.capacity() % 2 != 0) throw new RuntimeException("nativeFloatBuffer capacity must be divisible by 2, in order to be able to store an array of Vector2");
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Vector2Buffer(nativeFloatBuffer.buffer);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public Vector2 get(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.get(idx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public float getX(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.getX(idx);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public float getY(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.getY(idx);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void put(Vector2 vector){
        //<REMOVE-BRIDGE>
        buffer.put(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void put(float x, float y){
        //<REMOVE-BRIDGE>
        buffer.put(x, y);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx","x","y"})
    public void set(int idx, Vector2 vector){
        //<REMOVE-BRIDGE>
        buffer.set(idx, vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx","x","y"})
    public void set(int idx, float x, float y){
        //<REMOVE-BRIDGE>
        buffer.set(idx, x, y);
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

    public Vector2[] array(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector2[] array = new Vector2[capacity()];
        for (int i = 0; i < capacity(); i++) {
            array[i] = get(i);
        }
        return array;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public void position(int idx){
        //<REMOVE-BRIDGE>
        buffer.position(idx);
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

    public Vector2Buffer copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.deepClone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public JAVARuntime.NativeFloatBuffer getFloatBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.getBuffer().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
}
