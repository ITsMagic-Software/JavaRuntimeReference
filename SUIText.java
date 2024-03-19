package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.SupremeUI.ComponentExtras.SUITextEntry;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIUnit;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIText extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIText component;
    @IgnoreAutoComplete
    public SUIText(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIText component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIText() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIText());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getTextEntry().getFontColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getTextEntry().setFontColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getText(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getText();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(String text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(text);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"textLines"})
    public void setText(String... text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            if(i > 0){
                str.append("\n");
            }
            str.append(text[i]);
        }
        this.component.setText(str.toString());
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(float text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(int text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(double text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(boolean text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(short text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(byte text){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setText(""+text);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getResolution(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getTextEntry().getResolution();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolution(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getTextEntry().setResolution(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getResolutionUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getTextEntry().getResolutionUnit());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolutionUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getTextEntry().setResolutionUnit(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setResolution(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getTextEntry().setResolution(value);
        this.component.getTextEntry().setResolutionUnit(SUIUnit.convertFromJavaRuntime(unitType));
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
    public float getScale(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getTextEntry().getScale();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScale(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getTextEntry().setScale(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public STextAlignment getAlignment(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUITextEntry.convertToJavaRuntime(component.getTextEntry().getAlignment());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet

    @MethodArgs(args ={"value"})
    public void setAlignment(STextAlignment value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.getTextEntry().setAlignment(SUITextEntry.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isIgnoreMask(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getTextEntry().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getTextEntry().setIgnoreMask(value);
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
        Thread.requestEngineThread();
        if(component.getTextEntry().getFont() != null){
            return component.getTextEntry().getFont().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFont(Font value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null){
            component.getTextEntry().setFont(value.font);
        } else {
            component.getTextEntry().setFont(null);
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIText.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
