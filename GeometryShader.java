package JAVARuntime;

//

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat={"Shaders"})
public class GeometryShader {
    public String code;
    public GeometryShader(String code) {
        this.code = code;
    }

    /// Abstract
    /*
    @MethodArgs(args={"materialShader", "shaderName"})
    public static GeometryShader loadFile(MaterialShader materialShader, String shaderName){

        FragmentShaderScript vertex = Core.classExporter.getBuilder().fromJson(
                Core.classExporter.loadJson(materialShader.getShaderFolderLocation() + "/" + shaderName + FormatDictionaries.GEOMETRY_GLSL, MainCore.pageToMainListener.getActivity()),
                FragmentShaderScript.class
        );

        if (vertex != null) {
            return new GeometryShader(vertex.getCode());
        }
        return null;

    }
    */

    @MethodArgs(args={"inputStream"})
    public static GeometryShader loadInputStream(InputStream inputStream) throws IOException {
        //
        return null;
        //

        //
    }
}
