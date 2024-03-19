package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.SupremeUI.ComponentExtras.SUIEventEntry;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIImageUtils;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIUnit;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIButton extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIButton component;
    @IgnoreAutoComplete
    public SUIButton(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIButton component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIButton() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIButton());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isPressed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isDown();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isUp(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isUp();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getNormalColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getOnNormalImage().getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setNormalColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getOnNormalImage().setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getNormalImage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.component.getOnNormalImage().getTexture() != null){
            return this.component.getOnNormalImage().getTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setNormalImage(Texture texture){
        //<REMOVE-BRIDGE>
        if(texture != null) {
            this.component.getOnNormalImage().setTexture(texture.instance);
        } else{
            this.component.getOnNormalImage().setTexture(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isNormalIgnoreMask(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnNormalImage().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getOnNormalImage().setIgnoreMask(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getNormalBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnNormalImage().getBorder();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalBorder(int value){
        //<REMOVE-BRIDGE>
        this.component.getOnNormalImage().setBorder(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getNormalBorderUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getOnNormalImage().getBorderUnitType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalBorderUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getOnNormalImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setNormalBorder(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getOnNormalImage().setBorder(value);
        this.component.getOnNormalImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(unitType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SImageType getNormalImageType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIImageUtils.convertToJavaRuntime(component.getOnNormalImage().getImageType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalImageType(SImageType sImageType){
        //<REMOVE-BRIDGE>
        this.component.getOnNormalImage().setImageType(SUIImageUtils.convertFromJavaRuntime(sImageType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getPressedColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getOnPressedImage().getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setPressedColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getOnPressedImage().setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getPressedImage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.component.getOnPressedImage().getTexture() != null){
            return this.component.getOnPressedImage().getTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setPressedImage(Texture texture){
        //<REMOVE-BRIDGE>
        if(texture != null) {
            this.component.getOnPressedImage().setTexture(texture.instance);
        } else{
            this.component.getOnPressedImage().setTexture(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isPressedIgnoreMask(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnPressedImage().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getOnPressedImage().setIgnoreMask(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getPressedBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnPressedImage().getBorder();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedBorder(int value){
        //<REMOVE-BRIDGE>
        this.component.getOnPressedImage().setBorder(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getPressedBorderUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getOnPressedImage().getBorderUnitType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedBorderUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getOnPressedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setPressedBorder(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getOnPressedImage().setBorder(value);
        this.component.getOnPressedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(unitType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SImageType getPressedImageType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIImageUtils.convertToJavaRuntime(component.getOnPressedImage().getImageType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedImageType(SImageType sImageType){
        //<REMOVE-BRIDGE>
        this.component.getOnPressedImage().setImageType(SUIImageUtils.convertFromJavaRuntime(sImageType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isClickable(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getEventEntry().isClickable();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setClickable(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getEventEntry().setClickable(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public STargetRect getTargetRectType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUIEventEntry.convertToJavaRuntime(component.getEventEntry().getRectObject());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTargetRectType(STargetRect value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getEventEntry().setRectObject(SUIEventEntry.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getTargetRectObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getEventEntry().getObjectReference().getObject() != null) {
            return component.getEventEntry().getObjectReference().getObject().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTargetRectObject(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null){
            component.getEventEntry().getObjectReference().set(object.instance.get());
        } else {
            component.getEventEntry().getObjectReference().set(null);
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIButton.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
