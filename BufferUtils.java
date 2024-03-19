package JAVARuntime;

//<REMOVE-BRIDGE>
//>REMOVE-BRIDGE<
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Buffers"})
public final class BufferUtils {
    @MethodArgs(args ={"count"})
    public static ByteBuffer createByteBuffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createByteBuffer(count);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static ByteBuffer createByteBuffer(byte[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createByteBuffer(data);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"count"})
    public static FloatBuffer createFloatBuffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createFloatBuffer(count);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static FloatBuffer createFloatBuffer(float[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createFloatBuffer(data);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"count"})
    public static IntBuffer createIntBuffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createIntBuffer(count);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static IntBuffer createIntBuffer(int[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createIntBuffer(data);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"count"})
    public static Vector3Buffer createVector3Buffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createVector3Buffer(count).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static Vector3Buffer createVector3Buffer(Vector3[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createVector3Buffer(data).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"count"})
    public static Vector2Buffer createVector2Buffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createVector2Buffer(count).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static Vector2Buffer createVector2Buffer(Vector2[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createVector2Buffer(data).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"count"})
    public static Point3Buffer createPoint3Buffer(int count){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createPoint3Buffer(count).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"data"})
    public static Point3Buffer createPoint3Buffer(Point3[] data){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Native.BufferUtils.createPoint3Buffer(data).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

}
