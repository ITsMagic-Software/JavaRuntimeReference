package JAVARuntime;
//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Native.BufferUtils;
import com.itsmagic.engine.Engines.Native.Base.NativeByteBuffer;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Buffers"})
public class OHDataBase {

    //<REMOVE-BRIDGE>
    private transient NativeByteBuffer buffer;
    public OHDataBase() { }

    @BuildClassConstructor
    public OHDataBase(Engine engine) { }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"capacity"})
    public OHDataBase(int capacity){
        //<REMOVE-BRIDGE>
        this.buffer = com.itsmagic.engine.Engines.Native.BufferUtils.createNativeByteBuffer(capacity);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"size"})
    public void incrementSize(int size){
        //<REMOVE-BRIDGE>
        this.resize(capacity() + size, true);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"size"})
    public void decrementSize(int size){
        //<REMOVE-BRIDGE>
        this.resize(capacity() - size, true);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"capacity"})
    public void resize(int newCapacity){
        //<REMOVE-BRIDGE>
        this.resize(newCapacity, true);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"capacity","copyData"})
    public void resize(int newCapacity, boolean copyData){
        //<REMOVE-BRIDGE>
        if(newCapacity != this.buffer.capacity()) {
            NativeByteBuffer nb = BufferUtils.createNativeByteBuffer(newCapacity);
            if(copyData) {
                if (newCapacity > this.buffer.capacity()) {
                    for (int i = 0; i < this.buffer.capacity(); i++) {
                        nb.put(this.buffer.get(i));
                    }
                } else if (newCapacity < this.buffer.capacity()) {
                    for (int i = 0; i < newCapacity; i++) {
                        nb.put(this.buffer.get(i));
                    }
                }
            }
            this.buffer = nb;
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"position"})
    public void position(int position){
        //<REMOVE-BRIDGE>
        this.buffer.position(position);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"bytes"})
    public void put(byte[] bytes){
        //<REMOVE-BRIDGE>
        this.buffer.put(bytes);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","value"})
    public void set(int position, byte value){
        //<REMOVE-BRIDGE>
        this.buffer.position(position);
        this.buffer.put(value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public byte get(int idx){
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
    public byte[] getBytes(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.buffer.array();
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
        return this.buffer.capacity();
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
