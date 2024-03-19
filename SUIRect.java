package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Layouts.Types.Constraint.Injection.SUIConstraintInjection;
import com.itsmagic.engine.Engines.Engine.SupremeUI.Utils.SUIUnit;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIRect extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIRect component;
    @IgnoreAutoComplete
    public SUIRect(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIRect component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIRect() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIRect());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Quaternion getRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getRotation().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotation(Quaternion value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setRotation(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getScreenX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getScreenX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getScreenY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getScreenY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getScreenW(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getScreenW();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getScreenH(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getScreenH();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getLayer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getLayer();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayer(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setLayer(value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"entry"})
    public int getInt(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getInt(entry);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setInt(String entry, int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setInt(entry, value);
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setWidth(int value){
        setInt("Width", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setHeight(int value){
        setInt("Height", value);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftMargin(int value){
        setInt("LeftMargin", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopMargin(int value){
        setInt("TopMargin", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightMargin(int value){
        setInt("RightMargin", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomMargin(int value){
        setInt("BottomMargin", value);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftPadding(int value){
        setInt("LeftPadding", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopPadding(int value){
        setInt("TopPadding", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightPadding(int value){
        setInt("RightPadding", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomPadding(int value){
        setInt("BottomPadding", value);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setWidthPercentage(float value){
        setFloat("WidthPercentage", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setHeightPercentage(float value){
        setFloat("HeightPercentage", value);
    }

    @MethodArgs(args ={"entry"})
    public float getFloat(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getFloat(entry);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setFloat(String entry, float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setFloat(entry, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"entry"})
    public SUnitType getUnit(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUIUnit.convertToJavaRuntime(component.getUnit(entry));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setUnit(String entry, SUnitType value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setUnit(entry, SUIUnit.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setWidthUnitType(SUnitType value){
        setUnit("widthUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setHeightUnitType(SUnitType value){
        setUnit("heightUnitType", value);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftMarginUnitType(SUnitType value){
        setUnit("leftMarginUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopMarginUnitType(SUnitType value){
        setUnit("topMarginUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightMarginUnitType(SUnitType value){
        setUnit("rightMarginUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomMarginUnitType(SUnitType value){
        setUnit("bottomMarginUnitType", value);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftPaddingUnitType(SUnitType value){
        setUnit("leftPaddingUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopPaddingUnitType(SUnitType value){
        setUnit("topPaddingUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightPaddingUnitType(SUnitType value){
        setUnit("rightPaddingUnitType", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomPaddingUnitType(SUnitType value){
        setUnit("bottomPaddingUnitType", value);
    }

    @MethodArgs(args ={"entry"})
    public SpatialObject getAnchorObject(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GameObject object = component.getAnchorObject(entry);
        if(object != null){
            return object.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setAnchorObject(String entry, SpatialObject value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null){
            component.setAnchorObject(entry, value.instance.get());
        } else {
            component.setAnchorObject(entry, null);
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftAnchorObject(SpatialObject value){
        setAnchorObject("leftAnchor", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopAnchorObject(SpatialObject value){
        setAnchorObject("topAnchor", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightAnchorObject(SpatialObject value){
        setAnchorObject("rightAnchor", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomAnchorObject(SpatialObject value){
        setAnchorObject("bottomAnchor", value);
    }

    @MethodArgs(args ={"entry"})
    public SVerticalConstraintTarget getVerticalAnchorType(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUIConstraintInjection.convertToJavaRuntime(component.getVerticalAnchorType(entry));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setVerticalAnchorType(String entry, SVerticalConstraintTarget value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setVerticalAnchorType(entry, SUIConstraintInjection.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setTopAnchorTarget(SVerticalConstraintTarget value){
        setVerticalAnchorType("topAnchor", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setBottomAnchorTarget(SVerticalConstraintTarget value){
        setVerticalAnchorType("bottomAnchor", value);
    }

    @MethodArgs(args ={"entry"})
    public SHorizontalConstraintTarget getHorizontalAnchorType(String entry){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUIConstraintInjection.convertToJavaRuntime(component.getHorizontalAnchorType(entry));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entry","value"})
    public void setHorizontalAnchorType(String entry, SHorizontalConstraintTarget value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setHorizontalAnchorType(entry, SUIConstraintInjection.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setLeftAnchorTarget(SHorizontalConstraintTarget value){
        setHorizontalAnchorType("leftAnchor", value);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"value"})
    public void setRightAnchorTarget(SHorizontalConstraintTarget value){
        setHorizontalAnchorType("rightAnchor", value);
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIRect.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
