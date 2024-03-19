package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Engine.Color.ColorUtils;
import com.itsmagic.engine.Engines.Engine.Time;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
import com.itsmagic.engine.Engines.Utils.PrimiviteColors;
import com.itsmagic.engine.Engines.Engine.Color.ColorINT;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Color implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator, JsonSerializer
{
    //<REMOVE-BRIDGE>

    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Color.class;
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
                Color color = (Color) value;
                if(color != null) {
                    return new Variable(fieldName, color.instance);
                } else {
                    return new Variable(fieldName, Variable.Type.Color);
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.Color){
                    return new Color(variable.color_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Color();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient ColorINT instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"colorINT"})
    public Color(ColorINT instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Color() {
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"r","g","b"})
    public Color(int r, int g, int b) {
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT(r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"r","g","b"})
    public Color(float r, float g, float b) {
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT(r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b"})
    public Color(int a, int r, int g, int b) {
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT(a, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b"})
    public Color(float a, float r, float g, float b) {
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT(a, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"hex"})
    public Color(String hex){
        //<REMOVE-BRIDGE>
        this.instance = new ColorINT();
        this.instance.setHex(hex);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public void set(Color color){
        //<REMOVE-BRIDGE>
        this.instance.intColor = color.instance.intColor;
        //>REMOVE-BRIDGE<
    }

    /**
     * Integer color
     * Also called by HEX
     */
    public int getInt(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.intColor;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void setInt(int color){
        //<REMOVE-BRIDGE>
        this.instance.intColor = color;
        //>REMOVE-BRIDGE<
    }

    /**
     * Hex color
     */
    @MethodArgs(args ={"hex"})
    public void fromHexString(String hex){
        //<REMOVE-BRIDGE>
        this.instance.setHex(hex);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"hex"})
    public void fromHex(String hex){
        //<REMOVE-BRIDGE>
        this.instance.setHex(hex);
        //>REMOVE-BRIDGE<
    }
    public String getHexString(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getHex();
        //>REMOVE-BRIDGE<
    }
    public String toHex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getHex();
        //>REMOVE-BRIDGE<
    }

    /**
     * Integer value of the ARGB channels (0-255)
     */
    public int getIntAlpha(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getAlpha();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setIntAlpha(int value){
        //<REMOVE-BRIDGE>
        this.instance.setAlpha(value);
        //>REMOVE-BRIDGE<
    }
    public int getIntRed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getRed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setIntRed(int value){
        //<REMOVE-BRIDGE>
        this.instance.setRed(value);
        //>REMOVE-BRIDGE<
    }
    public int getIntGreen(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getGreen();
        //>REMOVE-BRIDGE<
    }
    @Deprecated
    @DeprecatedInfo(info={"method with spelling error, use setIntGreen"})
    @MethodArgs(args ={"value"})
    public void setIntGree(int value){
        //<REMOVE-BRIDGE>
        this.instance.setGreen(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setIntGreen(int value){
        //<REMOVE-BRIDGE>
        this.instance.setGreen(value);
        //>REMOVE-BRIDGE<
    }
    public int getIntBlue(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getBlue();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setIntBlue(int value){
        //<REMOVE-BRIDGE>
        this.instance.setBlue(value);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"a","r","g","b"})
    public void setInts(int a, int r, int g, int b){
        //<REMOVE-BRIDGE>
        this.instance.setInts(a, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"r","g","b"})
    public void setInts(int r, int g, int b){
        //<REMOVE-BRIDGE>
        this.instance.setInts(r, g, b);
        //>REMOVE-BRIDGE<
    }

    /**
     * Float value of the ARGB channels (0.0f - 1.0f)
     */
    public float getFloatAlpha(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getFAlpha();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setFloatAlpha(float value){
        //<REMOVE-BRIDGE>
        this.instance.setFAlpha(value);
        //>REMOVE-BRIDGE<
    }

    public float getFloatRed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getFRed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setFloatRed(float value){
        //<REMOVE-BRIDGE>
        this.instance.setFRed(value);
        //>REMOVE-BRIDGE<
    }

    public float getFloatGreen(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getFGreen();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setFloatGreen(float value){
        //<REMOVE-BRIDGE>
        this.instance.setFGreen(value);
        //>REMOVE-BRIDGE<
    }

    public float getFloatBlue(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getFBlue();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setFloatBlue(float value){
        //<REMOVE-BRIDGE>
        this.instance.setFBlue(value);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"a","r","g","b"})
    public void setFloats(float a, float r, float g, float b){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(a, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"r","g","b"})
    public void setFloats(float r, float g, float b){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(r, g, b);
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public Color sum(Color color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha() + color.getFloatAlpha(),
                getFloatRed() + color.getFloatRed(),
                getFloatGreen() + color.getFloatGreen(),
                getFloatBlue() + color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color sum(Vector3 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() + color.getX(),
                getFloatGreen() + color.getY(),
                getFloatBlue() + color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color sum(Vector2 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() + color.getX(),
                getFloatGreen() + color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public Color sub(Color color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha() - color.getFloatAlpha(),
                getFloatRed() - color.getFloatRed(),
                getFloatGreen() - color.getFloatGreen(),
                getFloatBlue() - color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color sub(Vector3 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() - color.getX(),
                getFloatGreen() - color.getY(),
                getFloatBlue() - color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color sub(Vector2 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() - color.getX(),
                getFloatGreen() - color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public Color mul(Color color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha() * color.getFloatAlpha(),
                getFloatRed() * color.getFloatRed(),
                getFloatGreen() * color.getFloatGreen(),
                getFloatBlue() * color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color mul(Vector3 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() * color.getX(),
                getFloatGreen() * color.getY(),
                getFloatBlue() * color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color mul(Vector2 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() * color.getX(),
                getFloatGreen() * color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public Color div(Color color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha() / color.getFloatAlpha(),
                getFloatRed() / color.getFloatRed(),
                getFloatGreen() / color.getFloatGreen(),
                getFloatBlue() / color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color div(Vector3 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() / color.getX(),
                getFloatGreen() / color.getY(),
                getFloatBlue() / color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public Color div(Vector2 color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Color(getFloatAlpha(),
                getFloatRed() / color.getX(),
                getFloatGreen() / color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public void sumLocal(Color color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha() + color.getFloatAlpha(),
                getFloatRed() + color.getFloatRed(),
                getFloatGreen() + color.getFloatGreen(),
                getFloatBlue() + color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void sumLocal(Vector3 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() + color.getX(),
                getFloatGreen() + color.getY(),
                getFloatBlue() + color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void sumLocal(Vector2 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() + color.getX(),
                getFloatGreen() + color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public void subLocal(Color color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha() - color.getFloatAlpha(),
                getFloatRed() - color.getFloatRed(),
                getFloatGreen() - color.getFloatGreen(),
                getFloatBlue() - color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void subLocal(Vector3 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() - color.getX(),
                getFloatGreen() - color.getY(),
                getFloatBlue() - color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void subLocal(Vector2 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() - color.getX(),
                getFloatGreen() - color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public void mulLocal(Color color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha() * color.getFloatAlpha(),
                getFloatRed() * color.getFloatRed(),
                getFloatGreen() * color.getFloatGreen(),
                getFloatBlue() * color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void mulLocal(Vector3 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() * color.getX(),
                getFloatGreen() * color.getY(),
                getFloatBlue() * color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void mulLocal(Vector2 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() * color.getX(),
                getFloatGreen() * color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"color"})
    public void divLocal(Color color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha() / color.getFloatAlpha(),
                getFloatRed() / color.getFloatRed(),
                getFloatGreen() / color.getFloatGreen(),
                getFloatBlue() / color.getFloatBlue());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void divLocal(Vector3 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() / color.getX(),
                getFloatGreen() / color.getY(),
                getFloatBlue() / color.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void divLocal(Vector2 color){
        //<REMOVE-BRIDGE>
        this.instance.setFloats(getFloatAlpha(),
                getFloatRed() / color.getX(),
                getFloatGreen() / color.getY(),
                getFloatBlue());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerp(Color color, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(color.instance, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","speed"})
    public void lerp(float a, float r, float g, float b, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(r, g, b, a, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerp(float a, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(a, a, a, a, speed);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    @UnimplementedDoc
    public Color lerpOut(Color color, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(color.instance, speed).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b","speed"})
    @UnimplementedDoc
    public Color lerpOut(float a, float r, float g, float b, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(r,g,b,a, speed).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    @UnimplementedDoc
    public Color lerpOut(float a, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(a,a,a,a, speed).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","speed"})
    public void lerpInSeconds(Color color, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(color.instance, speed * com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b","speed"})
    public void lerpInSeconds(float a, float r, float g, float b, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(r, g, b, a, speed * com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //<REMOVE-BRIDGE>
        this.instance.lerpLocal(a,a,a,a, speed * Time.getScaledDeltaTime());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(Color color, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(color.instance, speed * com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(float a, float r, float g, float b, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(r,g,b,a, speed * com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(float a, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.lerp(a,a,a,a, speed * com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    public void blend(Color color, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(color.instance, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b","blend"})
    public void blend(float a, float r, float g, float b, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(r,g,b,a, blend);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    public void blend(float a, float blend){
        //<REMOVE-BRIDGE>
        this.instance.blendLocal(a,a,a,a, blend);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","blend"})
    @UnimplementedDoc
    public Color blendOut(Color color, float blend){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.blend(color.instance, blend).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","r","g","b","blend"})
    @UnimplementedDoc
    public Color blendOut(float a, float r, float g, float b, float blend){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.blend(r,g,b,a, blend).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","blend"})
    @UnimplementedDoc
    public Color blendOut(float a, float blend){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.blend(a,a,a,a, blend).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public String toString() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.toStringInt();
        //>REMOVE-BRIDGE<
    }

    public static Color RED(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.RED.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color WHITE(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.WHITE.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color BLACK(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.BLACK.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color GREEN(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.GREEN.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color BLUE(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.BLUE.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color YELLOW(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.YELLOW.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Color PINK(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return PrimiviteColors.PINK.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Color copy() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    /// Comparators
    @MethodArgs(args ={"otherObject"})
    public boolean equals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            return ColorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return ColorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Point3) {
            Point3 other = (Point3) otherObject;
            return ColorUtils.equals(this.instance, other);
        }
        else {
            throw new IllegalOperatorException("The operator == is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public boolean pointerEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this == otherObject;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public boolean notEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            return !ColorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            return !ColorUtils.equals(this.instance, other.instance);
        }
        else if(otherObject instanceof Point3) {
            Point3 other = (Point3) otherObject;
            return !ColorUtils.equals(this.instance, other);
        }
        else {
            throw new IllegalOperatorException("The operator != is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static boolean isNull(Object value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value == null;
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"otherObject"})
    public boolean greaterThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            if(this.instance.getFRed() > other.instance.getFRed()){
                if(this.instance.getFGreen() > other.instance.getGreen()) {
                    if(this.instance.getFBlue() > other.instance.getBlue()) {
                        if(this.instance.getFAlpha() > other.instance.getFAlpha()){
                            return true;
                        }
                    }
                }
            }
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            if(this.instance.getFRed() > other.instance.getX()){
                if(this.instance.getFGreen() > other.instance.getY()) {
                    if(this.instance.getFBlue() > other.instance.getZ()) {
                        return true;
                    }
                }
            }
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            if(this.instance.getFRed() > other.instance.getX()){
                if(this.instance.getFGreen() > other.instance.getY()) {
                    return true;
                }
            }
        }
        else {
            throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", float");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", int");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", long");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", double");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            if(this.instance.getFRed() >= other.instance.getFRed()){
                if(this.instance.getFGreen() >= other.instance.getGreen()) {
                    if(this.instance.getFBlue() >= other.instance.getBlue()) {
                        if(this.instance.getFAlpha() >= other.instance.getFAlpha()){
                            return true;
                        }
                    }
                }
            }
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            if(this.instance.getFRed() >= other.instance.getX()){
                if(this.instance.getFGreen() >= other.instance.getY()) {
                    if(this.instance.getFBlue() >= other.instance.getZ()) {
                        return true;
                    }
                }
            }
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            if(this.instance.getFRed() >= other.instance.getX()){
                if(this.instance.getFGreen() >= other.instance.getY()) {
                    return true;
                }
            }
        }
        else {
            throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", float");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", int");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", long");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", double");
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"otherObject"})
    public boolean lessThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            if(this.instance.getFRed() < other.instance.getFRed()){
                if(this.instance.getFGreen() < other.instance.getGreen()) {
                    if(this.instance.getFBlue() < other.instance.getBlue()) {
                        if(this.instance.getFAlpha() < other.instance.getFAlpha()){
                            return true;
                        }
                    }
                }
            }
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            if(this.instance.getFRed() < other.instance.getX()){
                if(this.instance.getFGreen() < other.instance.getY()) {
                    if(this.instance.getFBlue() < other.instance.getZ()) {
                        return true;
                    }
                }
            }
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            if(this.instance.getFRed() < other.instance.getX()){
                if(this.instance.getFGreen() < other.instance.getY()) {
                    return true;
                }
            }
        }
        else {
            throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", float");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", int");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", long");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", double");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            if(this.instance.getFRed() <= other.instance.getFRed()){
                if(this.instance.getFGreen() <= other.instance.getGreen()) {
                    if(this.instance.getFBlue() <= other.instance.getBlue()) {
                        if(this.instance.getFAlpha() <= other.instance.getFAlpha()){
                            return true;
                        }
                    }
                }
            }
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            if(this.instance.getFRed() <= other.instance.getX()){
                if(this.instance.getFGreen() <= other.instance.getY()) {
                    if(this.instance.getFBlue() <= other.instance.getZ()) {
                        return true;
                    }
                }
            }
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            if(this.instance.getFRed() <= other.instance.getX()){
                if(this.instance.getFGreen() <= other.instance.getY()) {
                    return true;
                }
            }
        }
        else {
            throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", float");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", int");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public boolean lessOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", long");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public boolean lessOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", double");
        //>REMOVE-BRIDGE<
    }

    /// Operators
    @MethodArgs(args ={"otherObject"})
    public <T> T sum(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Color out = new Color();
        out.set(this);

        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            out.sumLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.sumLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.sumLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator + is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public void sumEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            this.sumLocal(other);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.sumLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.sumLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator += is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"otherObject"})
    public <T> T div(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Color out = new Color();
        out.set(this);

        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            out.divLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.divLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.divLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator / is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public void divEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            this.divLocal(other);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.divLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.divLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator /= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"otherObject"})
    public <T> T mul(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Color out = new Color();
        out.set(this);

        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.mulLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator * is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public void mulEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            this.mulLocal(other);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.mulLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.mulLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator *= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"otherObject"})
    public <T> T sub(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Color out = new Color();
        out.set(this);

        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            out.subLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            out.subLocal(other);
            return (T) out;
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            out.subLocal(other);
            return (T) out;
        }
        else {
            throw new IllegalOperatorException("The operator - is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"otherObject"})
    public void subEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof Color) {
            Color other = (Color) otherObject;
            this.subLocal(other);
        }
        else if(otherObject instanceof Vector3) {
            Vector3 other = (Vector3) otherObject;
            this.subLocal(other);
        }
        else if(otherObject instanceof Vector2) {
            Vector2 other = (Vector2) otherObject;
            this.subLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator -= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public String serializeToString() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return "[" + instance.getFRed() + ";" + instance.getFGreen() + ";" + instance.getFBlue() + ";" + instance.getFAlpha() + "]";
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public void deserializeLocal(String str) {
        //<REMOVE-BRIDGE>
        try {
            if(this.instance == null) {
                this.instance = new ColorINT();
                instance.setRuntime(this);
            }

            if(str == null || str.isEmpty()) return;

            String[] lines = str.substring(1, str.length() - 1).split(";");
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                float value = Mathf.stringToFloat(line);
                instance.setFromIndex(value, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //>REMOVE-BRIDGE<
    }
}
