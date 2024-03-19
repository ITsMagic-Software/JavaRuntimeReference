package JAVARuntime;

//

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat ={"Shaders"})
public class VertexShader {
    public transient String code;
    public VertexShader(String code) {
        this.code = code;
    }

    /// Abstract
    @MethodArgs(args={"materialShader", "shaderName"})
    public static VertexShader loadFile(MaterialShader materialShader, String shaderName){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"inputStream"})
    public static VertexShader loadInputStream(InputStream inputStream) throws IOException {
        //
        return null;
        //

        //
    }
}

