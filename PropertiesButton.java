package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Inspector"})
public class PropertiesButton {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = PropertiesButton.class;
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
                return null;
            }

            @Override
            public boolean isRestorable() {
                return false;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return null;
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient PropertiesButtonListener listener;
    @IgnoreAutoComplete
    public transient boolean runOnEngineThread = true;

    @BuildClassConstructor
    public PropertiesButton(Engine engine) {

    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"listener"})
    public PropertiesButton(PropertiesButtonListener listener) {
        //<REMOVE-BRIDGE>
        if(listener == null){
            throw new NullPointerException("Listener can't be null");
        }
        this.listener = listener;
        //>REMOVE-BRIDGE<
    }
}

