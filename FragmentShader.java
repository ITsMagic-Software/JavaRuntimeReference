package JAVARuntime;

//

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat={"Shaders"})
public class FragmentShader {
    public String code;
    public FragmentShader(String code) {
        this.code = code;
    }

    /// Abstract
    @MethodArgs(args={"materialShader", "shaderName"})
    public static FragmentShader loadFile(MaterialShader materialShader, String shaderName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"inputStream"})
    public static FragmentShader loadInputStream(InputStream inputStream) throws IOException {
        //
        return null;
        //

        //
    }
}
