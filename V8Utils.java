package JAVARuntime;

//

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Java"})
public class V8Utils {

    private V8Utils() { }

    @MethodArgs(args={"v8"})
    public static List getObjects(V8 v8){
        //
        return null;
        //


        //
    }
    @MethodArgs(args={"type","v8"})
    public static V8Object getStaticObject(Class classType, V8 v8){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"type","instance","v8"})
    public static V8Object getInstancedObject(Class classType, Object instance, V8 v8){
        //
        return null;
        //

        //
    }
}
