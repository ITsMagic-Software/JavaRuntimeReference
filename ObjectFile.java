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
import com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.Manager.GameObjectFile;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.Manager.GameObjectManager;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.PFile.EmbedPFile;
import com.itsmagic.engine.Engines.Utils.FormatDictionaries;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files","Object"})
public class ObjectFile
//<REMOVE-BRIDGE>
extends EmbedPFile
//>REMOVE-BRIDGE<
{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private static String FILE_FORMAT = FormatDictionaries.OBJECT;

    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = ObjectFile.class;
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
                ObjectFile file = (ObjectFile) value;
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
                    ObjectFile c = new ObjectFile(variable.str_value);
                    if(variable.str_value != null && !variable.str_value.isEmpty()){
                        c.prepare();
                    }
                    return c;
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new ObjectFile();
            }
        });
    }

    @IgnoreAutoComplete
    public ObjectFile(String path) {
        super(path);
    }

    private transient final Object block = new Object();
    private transient GameObjectFile gameObjectFile;

    private void prepare() {
        synchronized (block) {
            if(gameObjectFile == null){
                gameObjectFile = GameObjectManager.load(getFilePath());
            }
        }
    }
    public GameObject instantiate() {
        synchronized (block){
            if(gameObjectFile == null){
                gameObjectFile = GameObjectManager.load(getFilePath());
            }
            if(gameObjectFile != null){
                GameObject gameObject = gameObjectFile.instantiate();
                Component link = gameObject.findComponent(Component.Type.ObjectLink);
                if(link != null) {
                    gameObject.removeComponent(link);
                }
                return gameObject;
            }
            return null;
        }
    }

    @Override
    public void setFilePath(String path) {
        super.setFilePath(path);
        synchronized (block){
            gameObjectFile = null;
        }
    }
    //>REMOVE-BRIDGE<

    private ObjectFile() {
        //<REMOVE-BRIDGE>
        super();
        //>REMOVE-BRIDGE<
    }

    public String toString() {
        return getClass().getName();
    }
}
