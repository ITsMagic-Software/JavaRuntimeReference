package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIImageUtils;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIUnit;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIImage extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIImage component;
    @IgnoreAutoComplete
    public SUIImage(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIImage component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIImage() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIImage());
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
        return component.getImageEntry().getColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getImageEntry().setColor(color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getImage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(this.component.getImageEntry().getTexture() != null){
            return this.component.getImageEntry().getTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setImage(Texture texture){
        //<REMOVE-BRIDGE>
        if(texture != null) {
            this.component.getImageEntry().setTexture(texture.instance);
        } else{
            this.component.getImageEntry().setTexture(null);
        }
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
        return component.getImageEntry().isIgnoreMask();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setIgnoreMask(boolean value){
        //<REMOVE-BRIDGE>
        this.component.getImageEntry().setIgnoreMask(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getImageEntry().getBorder();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBorder(int value){
        //<REMOVE-BRIDGE>
        this.component.getImageEntry().setBorder(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public SUnitType getBorderUnitType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIUnit.convertToJavaRuntime(component.getImageEntry().getBorderUnitType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBorderUnitType(SUnitType value){
        //<REMOVE-BRIDGE>
        this.component.getImageEntry().setBorderUnitType(SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","unitType"})
    public void setBorder(int value, SUnitType unitType){
        //<REMOVE-BRIDGE>
        this.component.getImageEntry().setBorder(value);
        this.component.getImageEntry().setBorderUnitType(SUIUnit.convertFromJavaRuntime(unitType));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SImageType getImageType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SUIImageUtils.convertToJavaRuntime(component.getImageEntry().getImageType());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImageType(SImageType sImageType){
        //<REMOVE-BRIDGE>
        this.component.getImageEntry().setImageType(SUIImageUtils.convertFromJavaRuntime(sImageType));
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIImage.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
