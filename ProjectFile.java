package JAVARuntime;

//<REMOVE-BRIDGE>
import android.content.Context;

//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.PFile.EmbedPFile;
import com.itsmagic.engine.Engines.Utils.StringFunctions.StringUtils;
import com.itsmagic.engine.Engines.Utils.Variable;
import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

import java.io.InputStream;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
@UnimplementedDoc
public class ProjectFile
//<REMOVE-BRIDGE>
extends EmbedPFile
//>REMOVE-BRIDGE<
{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient final String format;

    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = ProjectFile.class;
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
                ProjectFile file = (ProjectFile) value;
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
                    String format = StringUtils.getExtensionName(variable.str_value);
                    if(format != null && !format.isEmpty()) {
                        return new ProjectFile(format, variable.str_value);
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new ProjectFile(".txt");
            }
        });
    }

    @IgnoreAutoComplete
    public ProjectFile(String format, String path) {
        super(path);
        this.format = format;
    }
    //>REMOVE-BRIDGE<

    @UnimplementedDoc
    public ProjectFile(String format) {
        //<REMOVE-BRIDGE>
        super();
        this.format = format;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public String getFormat() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return format;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public InputStream getInputStream(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return ClassExporter.getInputStream(getFilePath());
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public String loadText(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return FileLoader.loadTextFromFile(this);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public String toString() {
        return getClass().getName();
    }
}
