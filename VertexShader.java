package JAVARuntime;

//

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat ={"Shaders"})
public class VertexShader {
    public String code;
    public VertexShader(String code) {
        this.code = code;
    }

    /// Abstract
    /*@MethodArgs(args={"materialShader", "shaderName"})
    public static VertexShader loadFile(MaterialShader materialShader, String shaderName){

        VertexShaderScript vertex = Core.classExporter.getBuilder().fromJson(
                Core.classExporter.loadJson(materialShader.getShaderFolderLocation() + "/" + shaderName + FormatDictionaries.VERTEX_GLSL, MainCore.pageToMainListener.getActivity()),
                VertexShaderScript.class
        );

        if (vertex != null) {
            return new VertexShader(vertex.getCode());
        }
        return null;

    }*/

    @MethodArgs(args ={"inputStream"})
    public static VertexShader loadInputStream(InputStream inputStream) throws IOException {
        //
        return null;
        //

        //
    }
}

