package JAVARuntime;

//<REMOVE-BRIDGE>

import android.content.Context;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.PFile.EmbedPFile;
import com.itsmagic.engine.Engines.Utils.FormatDictionaries;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Shaders"})
public class VertexGLSLFile
//<REMOVE-BRIDGE>
extends EmbedPFile
//>REMOVE-BRIDGE<
{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private static String FILE_FORMAT = FormatDictionaries.VERTEX_GLSL;

    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = VertexGLSLFile.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
                if(JCompiler.correctName(thisClass.getName()).equals(JCompiler.correctName(className))){
                    return true;
                }
                return false;
            }

            @Override
            public String getSimpleName(UserPointer userPointer) {
                return thisClass.getSimpleName();
            }

            //
            @Override
            public Variable save(String fieldName, Object value, UserPointer userPointer) {
                VertexGLSLFile file = (VertexGLSLFile) value;
                if(file != null) {
                    return new Variable(fieldName, file.getFilePath(), Variable.Type.File);
                } else {
                    return new Variable(fieldName, "", Variable.Type.File);
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.File){
                    return new VertexGLSLFile(variable.str_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new VertexGLSLFile();
            }
        });
    }

    @IgnoreAutoComplete
    public VertexGLSLFile(String path) {
        super(path);
    }
    //>REMOVE-BRIDGE<

    private VertexGLSLFile() {
        //<REMOVE-BRIDGE>
        super();
        //>REMOVE-BRIDGE<
    }

    public String toString() {
        return getClass().getName();
    }
}
