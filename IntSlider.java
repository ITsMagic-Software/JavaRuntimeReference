package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Inspector"})
public final class IntSlider {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = IntSlider.class;
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
                IntSlider var = (IntSlider) value;
                if(var != null) {
                    return new Variable(fieldName, var.serialize());
                } else {
                    return new Variable(fieldName, "");
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.String){
                    return IntSlider.deserialize(variable.str_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new IntSlider(0,0,1);
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    public transient int value;
    public transient int min;
    public transient int max;

    @MethodArgs(args ={"value","min","max"})
    public IntSlider(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    @HideGetSet
    public int getValue() {
        return value;
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(int value) {
        this.value = value;
    }

    @HideGetSet
    public int getMin() {
        return min;
    }
    @HideGetSet
    @MethodArgs(args ={"min"})
    public void setMin(int min) {
        this.min = min;
    }

    @HideGetSet
    public int getMax() {
        return max;
    }
    @HideGetSet
    @MethodArgs(args ={"max"})
    public void setMax(int max) {
        this.max = max;
    }

    /*public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }*/

    public String toString(){
        return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
    }
    public String serialize(){
        return value + ";" + min + ";" + max + ";" + 0;
    }

    /// Abstract
    public static IntSlider deserialize(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null || str.isEmpty()) {
            //return null;
            throw new ClassCastException();
        }
        String[] values = str.split(";");
        if(values.length < 4){
            //return null;
            throw new ClassCastException();
        }
        return new IntSlider(
                Mathf.stringToInt(values[0])
                ,Mathf.stringToInt(values[1])
                ,Mathf.stringToInt(values[2])
                //,Mathf.StringToInt(values[3])
        );
        //>REMOVE-BRIDGE<
    }
}
