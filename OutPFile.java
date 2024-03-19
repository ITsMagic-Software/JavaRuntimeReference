package JAVARuntime;

//<REMOVE-BRIDGE>

import android.content.Context;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Components.ProjectController.ProjectController;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Utils.Variable;

import java.io.File;
import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public class OutPFile {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = OutPFile.class;
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
                OutPFile file = (OutPFile) value;
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
                    return new OutPFile(variable.str_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return null;
            }
        });
    }
    //>REMOVE-BRIDGE<

    private transient String filePath;

    public OutPFile() {

    }
    @MethodArgs(args ={"filePath"})
    public OutPFile(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
    @MethodArgs(args ={"filePath"})
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAbsolutePath() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        //

        /// Return app directory if its a compilled game
        return getFilePath();
        //>REMOVE-BRIDGE<
    }

    public String toString() {
        return getFilePath();
    }
}
