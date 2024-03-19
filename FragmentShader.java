package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Graphics.RuntimeShading.FragmentShaderScript;

//>REMOVE-BRIDGE<

import java.io.IOException;
import java.io.InputStream;

@ClassCategory(cat ={"Shaders"})
public class FragmentShader {
    public transient String code;
    public FragmentShader(String code) {
        this.code = code;
    }

    /// Abstract
    @MethodArgs(args={"materialShader", "shaderName"})
    public static FragmentShader loadFile(MaterialShader materialShader, String shaderName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        FragmentShaderScript vertex = ClassExporter.getBuilder().fromJson(
                ClassExporter.loadJson(materialShader.getShaderFolderLocation() + "/" + shaderName + FormatDictionaries.FRAGMENT_GLSL, Main.getActivity()),
                FragmentShaderScript.class
        );

        if (vertex != null) {
            return new FragmentShader(vertex.getCode());
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"inputStream"})
    public static FragmentShader loadInputStream(InputStream inputStream) throws IOException {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new FragmentShader(ClassExporter.loadJsonFromInputStream(inputStream));
        //>REMOVE-BRIDGE<
    }
}
