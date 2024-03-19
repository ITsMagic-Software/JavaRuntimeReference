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
public class Point3Buffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.Adapters.Point3Buffer buffer;
    @IgnoreAutoComplete
    public Point3Buffer(com.itsmagic.engine.Engines.Native.Adapters.Point3Buffer buffer) {
        this.buffer = buffer;
        this.buffer.setRuntime(this);
    }

    @BuildClassConstructor
    public Point3Buffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    public Point3Buffer(int vectorCount) {
        //<REMOVE-BRIDGE>
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Point3Buffer(vectorCount);
        //>REMOVE-BRIDGE<
    }
    public Point3Buffer(NativeIntBuffer nativeIntBuffer) {
        //<REMOVE-BRIDGE>
        if(nativeIntBuffer == null) throw new NullPointerException("nativeIntBuffer can't be null");
        if(nativeIntBuffer.capacity() % 3 != 0) throw new RuntimeException("nativeIntBuffer capacity must be divisible by 3, in order to be able to store an array of Point3");
        this.buffer = new com.itsmagic.engine.Engines.Native.Adapters.Point3Buffer(nativeIntBuffer.buffer);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public Point3 get(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.get(idx);
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
    public void put(Point3 point3){
        //<REMOVE-BRIDGE>
        buffer.put(point3);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void put(int x, int y, int z){
        //<REMOVE-BRIDGE>
        buffer.put(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx","value"})
    public void set(int idx, Point3 point3){
        //<REMOVE-BRIDGE>
        buffer.set(idx, point3);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx","x","y","z"})
    public void set(int idx, int x, int y, int z){
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

    public Point3[] array(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Point3[] array = new Point3[capacity()];
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

    public JAVARuntime.NativeIntBuffer getFloatBuffer(){
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
