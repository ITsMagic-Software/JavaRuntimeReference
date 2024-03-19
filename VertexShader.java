package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Graphics.RuntimeShading.VertexShaderScript;
//>REMOVE-BRIDGE<

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
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        VertexShaderScript vertex = ClassExporter.getBuilder().fromJson(
                ClassExporter.loadJson(materialShader.getShaderFolderLocation() + "/" + shaderName + FormatDictionaries.VERTEX_GLSL, Main.getActivity()),
                VertexShaderScript.class
        );

        if (vertex != null) {
            return new VertexShader(vertex.getCode());
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"inputStream"})
    public static VertexShader loadInputStream(InputStream inputStream) throws IOException {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new VertexShader(ClassExporter.loadJsonFromInputStream(inputStream));
        //>REMOVE-BRIDGE<
    }
}

