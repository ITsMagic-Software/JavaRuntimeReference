package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Native.Base.NativeIntBuffer;
//>REMOVE-BRIDGE<
import java.nio.ByteOrder;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector","Buffers"})
public class Point2Buffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient NativeIntBuffer buffer;
    @IgnoreAutoComplete
    public Point2Buffer(NativeIntBuffer buffer) {
        this.buffer = buffer;
    }

    @BuildClassConstructor
    public Point2Buffer(Engine engine) { }
    //>REMOVE-BRIDGE<

    public Point2Buffer() {
        //<REMOVE-BRIDGE>
        throw new IllegalBufferException("Don't use Point2Buffer constructor, create using BufferUtils.createPoint2Buffer()");
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public Point2 get(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Point2 vector3 = new Point2();
        vector3.setX( buffer.get( (idx * 2) +0 ) );
        vector3.setY( buffer.get( (idx * 2) +1 ) );
        return vector3;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public int getX(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.get( (idx * 2) +0 );
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public int getY(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return buffer.get( (idx * 2) +1 );
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"point2"})
    public void put(Point2 vector3){
        //<REMOVE-BRIDGE>
        buffer.put(vector3.getX());
        buffer.put(vector3.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public void put(int x, int y){
        //<REMOVE-BRIDGE>
        buffer.put(x);
        buffer.put(y);
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
        return buffer.capacity() / 2;
        //>REMOVE-BRIDGE<
    }

    public Point2[] array(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Point2[] array = new Point2[capacity()];
        for (int i = 0; i < capacity(); i++) {
            array[i] = get(i);
        }
        return array;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public void position(int idx){
        //<REMOVE-BRIDGE>
        buffer.position( idx * 2);
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
        return buffer.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
}
