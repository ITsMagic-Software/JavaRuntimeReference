package JAVARuntime;

//<REMOVE-BRIDGE>
import android.content.Context;

//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.Curve.CurveInspector;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Activities.Main.Main;
import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Curve {
    public enum WrapMode{
        Loop, ClampToBorder, PingPong
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Curve.class;
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
                Curve var = (Curve) value;
                if(var != null) {
                    return new Variable(fieldName, var.instance.toJson(Main.getContext()));
                } else {
                    return new Variable(fieldName, Variable.Type.String);
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.String){
                    com.itsmagic.engine.Engines.Engine.Curve.Curve curve = com.itsmagic.engine.Engines.Engine.Curve.Curve.fromJson(variable.str_value, Main.getContext());
                    if(curve != null) {
                        return curve.toJAVARuntime();
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Curve();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Curve.Curve instance;
    @IgnoreAutoComplete
    public Curve(com.itsmagic.engine.Engines.Engine.Curve.Curve instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public Curve() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Curve.Curve(Main.getContext());
        //>REMOVE-BRIDGE<
    }

    public void addPoint(float x, float y){
        //<REMOVE-BRIDGE>
        instance.addPoint(x, y);
        //>REMOVE-BRIDGE<
    }
    public void setPoint(int idx, float x, float y){
        //<REMOVE-BRIDGE>
        instance.setPoint(idx, x, y);
        //>REMOVE-BRIDGE<
    }
    public Vector2 pointAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return pointAt(idx, new Vector2());
        //>REMOVE-BRIDGE<
    }
    public Vector2 pointAt(int idx, Vector2 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(out == null){
            throw new NullPointerException("Out vector2 can't be null");
        }
        return instance.pointAt(idx, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public void clear(){
        //<REMOVE-BRIDGE>
        instance.clear();
        //>REMOVE-BRIDGE<
    }
    public int pointsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.pointsCount();
        //>REMOVE-BRIDGE<
    }

    public float evaluate(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        x = Mathf.clamp01(x);
        return instance.evaluate(x);
        //>REMOVE-BRIDGE<
    }

    public void apply(){
        //<REMOVE-BRIDGE>
        instance.apply();
        //>REMOVE-BRIDGE<
    }

    public WrapMode getWrapMode() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Curve.Curve.convert(instance.getWrapMode());
        //>REMOVE-BRIDGE<
    }
    public void setWrapMode(WrapMode wrapMode) {
        //<REMOVE-BRIDGE>
        instance.setWrapMode(com.itsmagic.engine.Engines.Engine.Curve.Curve.convert(wrapMode));
        //>REMOVE-BRIDGE<
    }

    public String toJson(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.toJson(Main.getContext());
        //>REMOVE-BRIDGE<
    }
    public Curve fromJson(String json){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.fromJson(json, Main.getContext()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
}
