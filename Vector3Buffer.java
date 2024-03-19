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
public class Vector3Buffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Adapters.Vector3Buffer buffer;
    @IgnoreAutoComplete
    public Vector3Buffer(com.itsmagic.engine.Engines.Native.Adapters.Vector3Buffer buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public Vector3Buffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    public Vector3Buffer(int vectorCount) {
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Vector3Buffer(vectorCount);
        //>REMOVE-BRIDGE<
    }
    public Vector3Buffer(NativeFloatBuffer nativeFloatBuffer) {
        //<REMOVE-BRIDGE>
        if(nativeFloatBuffer == null) throw new NullPointerException("nativeFloatBuffer can't be null");
        if(nativeFloatBuffer.capacity() % 3 != 0) throw new RuntimeException("nativeFloatBuffer capacity must be divisible by 3, in order to be able to store an array of Vector3");
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Vector3Buffer(nativeFloatBuffer.buffer);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public Vector3 get(int idx){
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
    @MethodArgs(args ={"idx"})
    public float getZ(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.getZ(idx);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void put(Vector3 vector3){
        //<REMOVE-BRIDGE>
        buffer.put(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void put(float x, float y, float z){
        //<REMOVE-BRIDGE>
        buffer.put(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx","value"})
    public void set(int idx, Vector3 vector3){
        //<REMOVE-BRIDGE>
        buffer.set(idx, vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx","x","y","z"})
    public void set(int idx, float x, float y, float z){
        //<REMOVE-BRIDGE>
        buffer.set(idx, x, y, z);
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

    public Vector3[] array(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Vector3[] array = new Vector3[capacity()];
        for (int i = 0; i < capacity(); i++) {
            array[i] = get(i);
        }
        return array;
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
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        buffer.position( idx);
        return buffer.getPosition();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public void setPosition(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx);
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

    public Vector3Buffer copy(){
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

