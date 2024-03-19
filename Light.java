package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class Light extends Component{
    public static final int TYPE_SUN = 0;
    public static final int TYPE_POINT = 1;
    public static final int TYPE_SPOT = 2;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Light.Light component;
    @IgnoreAutoComplete
    public Light(com.itsmagic.engine.Engines.Engine.ComponentsV2.Light.Light component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Light() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Light.Light());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"type"})
    public Light(int type) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Light.Light(type));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMinAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.minAngle;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.minAngle = value;
        //>REMOVE-BRIDGE<
    }


    @HideGetSet
    public float getMaxAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.maxAngle;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.maxAngle = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getIntensity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.intensity;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setIntensity(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.intensity = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDiameter(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.diameter;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDiameter(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.diameter = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.distance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.distance = value;
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
        return component.color.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColor(Color value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.color = value.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isShadowEnabled(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.allowShadow;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowEnabled(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.allowShadow = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getShadowResolution(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.shadowResolutionV2;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowResolution(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.shadowResolutionV2 = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getShadowBlurSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.shadowBlurSize;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowBlurSize(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.shadowBlurSize = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getShadowBlur(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.shadowBlurV2;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowBlur(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.shadowBlurV2 = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getShadowStrength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.shadowStrength;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowStrength(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.shadowStrength = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getShadowVisibleDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.shadowVisibleDistanceV2;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowVisibleDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.shadowVisibleDistanceV2 = value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public void forcePriority(int idx){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.forcePriority(idx);
        //>REMOVE-BRIDGE<
    }

    public CustomLightShadowViewCalculator getCustomLightShadowViewCalculator(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.customLightShadowViewCalculator;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"listener"})
    public void setCustomLightShadowViewCalculator(CustomLightShadowViewCalculator customLightShadowViewCalculator){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.customLightShadowViewCalculator = customLightShadowViewCalculator;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, Light.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
