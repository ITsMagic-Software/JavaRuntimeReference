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
public final class FloatSlider {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = FloatSlider.class;
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
                FloatSlider var = (FloatSlider) value;
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
                    return FloatSlider.deserialize(variable.str_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new FloatSlider(0,0,1);
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    public transient float value;
    public transient float min;
    public transient float max;
    //public float step = 0f;

    @MethodArgs(args ={"value","min","max"})
    public FloatSlider(float value, float min, float max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }
    /*public FloatSlider(float value, float min, float max, float step) {
        this.value = value;
        this.min = min;
        this.max = max;
        this.step = step;
    }*/

    @HideGetSet
    public float getValue() {
        return value;
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(float value) {
        this.value = value;
    }

    @HideGetSet
    public float getMin() {
        return min;
    }
    @HideGetSet
    @MethodArgs(args ={"min"})
    public void setMin(float min) {
        this.min = min;
    }

    @HideGetSet
    public float getMax() {
        return max;
    }
    @HideGetSet
    @MethodArgs(args ={"max"})
    public void setMax(float max) {
        this.max = max;
    }

    /**
     * Step is crashing if the step is a number like 0.04864f
     * Fix soon
     * @return
     */
    /*public float getStep() {
        return step;
    }
    @MethodArgs(args={"step"})
    public void setStep(float step) {
        this.step = step;
    }*/

    public String toString(){
        return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
    }
    public String serialize(){
        return value + ";" + min + ";" + max + ";" + 0;
    }

    /// Abstract
    @MethodArgs(args ={"str"})
    public static FloatSlider deserialize(String str){
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
        return new FloatSlider(
                Mathf.stringToFloat(values[0])
                ,Mathf.stringToFloat(values[1])
                ,Mathf.stringToFloat(values[2])
                //,Mathf.StringToFloat(values[3])
        );
        //>REMOVE-BRIDGE<
    }
}
