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
    /*
    @MethodArgs(args={"materialShader", "shaderName"})
    public static FragmentShader loadFile(MaterialShader materialShader, String shaderName){

        FragmentShaderScript vertex = Core.classExporter.getBuilder().fromJson(
                Core.classExporter.loadJson(materialShader.getShaderFolderLocation() + "/" + shaderName + FormatDictionaries.FRAGMENT_GLSL, MainCore.pageToMainListener.getActivity()),
                FragmentShaderScript.class
        );

        if (vertex != null) {
            return new FragmentShader(vertex.getCode());
        }
        return null;

    }
    */

    @MethodArgs(args={"inputStream"})
    public static FragmentShader loadInputStream(InputStream inputStream) throws IOException {
        //
        return null;
        //

        //
    }
}
