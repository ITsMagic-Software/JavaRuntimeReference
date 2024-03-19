package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.TextRender.FontController;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class Text3D extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Text3D.Text3D component;
    @IgnoreAutoComplete
    public Text3D(com.itsmagic.engine.Engines.Engine.ComponentsV2.Text3D.Text3D component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }

    @BuildClassConstructor
    public Text3D(Engine engine) { }
    //>REMOVE-BRIDGE<

    public Text3D() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Text3D.Text3D());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFont(Font font){
        //<REMOVE-BRIDGE>
        if(font != null){
            this.component.setFont(font.font);
        } else {
            this.component.setFont(null);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Font getFont(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.TextRender.Font font = component.getFont();
        if(font != null) {
            if (font.getFile().equals(FontController.DEFAULT_FONT)) {
                return null;
            }
            return font.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getText() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getText().toString();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(String text) {
        //<REMOVE-BRIDGE>
        component.setText(text);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        //<REMOVE-BRIDGE>
        if(color == null){
            throw new NullPointerException("Color can't be null");
        }
        component.setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    public float measureWidth(String text){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.measureWidth(text);
        //>REMOVE-BRIDGE<
    }
    public float measureWidth(String[] lines){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.measureWidth(lines);
        //>REMOVE-BRIDGE<
    }
    public float measureHeight(String text){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.measureHeight(text);
        //>REMOVE-BRIDGE<
    }
    public float measureHeight(String[] lines){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.measureHeight(lines);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getScale();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(float scale) {
        //<REMOVE-BRIDGE>
        component.setScale(scale);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getResolution() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getResolution();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"resolution"})
    public void setResolution(int resolution) {
        //<REMOVE-BRIDGE>
        component.setResolution(resolution);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, Text3D.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
