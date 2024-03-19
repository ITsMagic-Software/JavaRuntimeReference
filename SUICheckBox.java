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
public final class SUICheckBox extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICheckBox component;
    @IgnoreAutoComplete
    public SUICheckBox(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICheckBox component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUICheckBox() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUICheckBox());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isChecked(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isChecked();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressed(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setChecked(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getUncheckedColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getOnUncheckedImage().getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setUncheckedColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getOnUncheckedImage().setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getUncheckedImage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.component.getOnUncheckedImage().getTexture() != null){
            return this.component.getOnUncheckedImage().getTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setUncheckedImage(Texture texture){
        //<REMOVE-BRIDGE>
        if(texture != null) {
            this.component.getOnUncheckedImage().setTexture(texture.instance);
        } else{
            this.component.getOnUncheckedImage().setTexture(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isUncheckedIgnoreMask(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnUncheckedImage().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUncheckedIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getOnUncheckedImage().setIgnoreMask(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getUncheckedBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnUncheckedImage().getBorder();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUncheckedBorder(int value){
        //<REMOVE-BRIDGE>
        this.component.getOnUncheckedImage().setBorder(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getUncheckedBorderUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getOnUncheckedImage().getBorderUnitType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUncheckedBorderUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getOnUncheckedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setUncheckedBorder(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getOnUncheckedImage().setBorder(value);
        this.component.getOnUncheckedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(unitType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SImageType getUncheckedImageType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIImageUtils.convertToJavaRuntime(component.getOnUncheckedImage().getImageType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setUncheckedImageType(SImageType sImageType){
        //<REMOVE-BRIDGE>
        this.component.getOnUncheckedImage().setImageType(SUIImageUtils.convertFromJavaRuntime(sImageType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getCheckedColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getOnCheckedImage().getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setCheckedColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getOnCheckedImage().setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getCheckedImage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.component.getOnCheckedImage().getTexture() != null){
            return this.component.getOnCheckedImage().getTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setCheckedImage(Texture texture){
        //<REMOVE-BRIDGE>
        if(texture != null) {
            this.component.getOnCheckedImage().setTexture(texture.instance);
        } else{
            this.component.getOnCheckedImage().setTexture(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isCheckedIgnoreMask(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnCheckedImage().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCheckedIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getOnCheckedImage().setIgnoreMask(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getCheckedBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getOnCheckedImage().getBorder();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCheckedBorder(int value){
        //<REMOVE-BRIDGE>
        this.component.getOnCheckedImage().setBorder(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getCheckedBorderUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getOnCheckedImage().getBorderUnitType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCheckedBorderUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getOnCheckedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setCheckedBorder(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getOnCheckedImage().setBorder(value);
        this.component.getOnCheckedImage().setBorderUnitType(SUIUnit.convertFromJavaRuntime(unitType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SImageType getCheckedImageType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIImageUtils.convertToJavaRuntime(component.getOnCheckedImage().getImageType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCheckedImageType(SImageType sImageType){
        //<REMOVE-BRIDGE>
        this.component.getOnCheckedImage().setImageType(SUIImageUtils.convertFromJavaRuntime(sImageType));
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
        return super.componentClassMatch(a, b, SUICheckBox.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
