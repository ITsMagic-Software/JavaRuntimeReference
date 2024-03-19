package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Particles"})
public final class ParticleEmitter extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter instance;
    @IgnoreAutoComplete
    public ParticleEmitter(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public ParticleEmitter(Engine engine){}
    //>REMOVE-BRIDGE<

    public ParticleEmitter() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter());
        //>REMOVE-BRIDGE<
    }

    public enum AlphaBased {
        None, AlphaOverLifetime, BySpeed
    }
    //<REMOVE-BRIDGE>
    private static AlphaBased ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.AlphaBased un){
        return AlphaBased.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.AlphaBased ENUMCONVERT(AlphaBased un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.AlphaBased.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum ColorBased {
        Constant, ColorOverLifetime, BySpeed
    }
    //<REMOVE-BRIDGE>
    private static ColorBased ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorBased un){
        return ColorBased.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorBased ENUMCONVERT(ColorBased un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorBased.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum ColorMode {
        Normal, Additive
    }
    //<REMOVE-BRIDGE>
    private static ColorMode ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorMode un){
        return ColorMode.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorMode ENUMCONVERT(ColorMode un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ColorMode.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum EmissionShape {
        Sphere, Cone
    }
    //<REMOVE-BRIDGE>
    private static EmissionShape ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.EmissionShape un){
        return EmissionShape.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.EmissionShape ENUMCONVERT(EmissionShape un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.EmissionShape.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum SizeBased {
        SizeOverLifetime, Constant, BySpeed
    }
    //<REMOVE-BRIDGE>
    private static SizeBased ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.SizeBased un){
        return SizeBased.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.SizeBased ENUMCONVERT(SizeBased un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.SizeBased.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum TransparencyBased {
        Disabled, Alpha, GreyScale
    }
    //<REMOVE-BRIDGE>
    private static TransparencyBased ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.TransparencyBased un){
        return TransparencyBased.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.TransparencyBased ENUMCONVERT(TransparencyBased un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.TransparencyBased.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"position","movement"})
    public Particle emit(Vector3 position, Vector3 movement){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(position == null) throw new NullPointerException("Position can't be null");
        if(movement == null) throw new NullPointerException("Movement can't be null");
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.Particle p = instance.emit(position.instance, movement.instance);
        if(p != null){
            return p.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @UnimplementedDoc
    public boolean isAllowEmission(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isAllowEmission();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    @UnimplementedDoc
    public void setAllowEmission(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setAllowEmission(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public AlphaBased getAlphaBased(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getAlphaBased());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAlphaBased(AlphaBased value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setAlphaBased( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Curve getAlphaOverLifeTimeCurve(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Curve.Curve returnValue = instance.getAlphaOverLifeTimeCurve();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAlphaOverLifeTimeCurve(Curve value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setAlphaOverLifeTimeCurve( value.instance);
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
        com.itsmagic.engine.Engines.Engine.Color.ColorINT returnValue = instance.getColor();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColor(Color value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setColor( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ColorBased getColorBased(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getColorBased());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColorBased(ColorBased value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setColorBased( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ColorMode getColorMode(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getColorMode());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColorMode(ColorMode value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setColorMode( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ParticleConeShapeOptions getConeShapeOptions(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleConeShapeOptions returnValue = instance.getConeShapeOptions();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public ParticleSphereShapeOptions getSphereShapeOptions(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleSphereShapeOptions returnValue = instance.getSphereShapeOptions();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public EmissionShape getEmissionShape(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getEmissionShape());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEmissionShape(EmissionShape value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setEmissionShape( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getEmitDelaySeconds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getEmitDelaySeconds();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEmitDelaySeconds(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setEmitDelaySeconds( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getGravityMultiplier(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getGravityMultiplier();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGravityMultiplier(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setGravityMultiplier( value);
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
        return instance.getLayer();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayer(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setLayer( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxLifeSeconds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxLifeSeconds();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxLifeSeconds(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setMaxLifeSeconds( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getMaxParticles(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxParticles();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxParticles(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setMaxParticles( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SizeBased getSizeBased(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getSizeBased());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSizeBased(SizeBased value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setSizeBased( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Curve getSizeOverLifeTimeCurve(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Curve.Curve returnValue = instance.getSizeOverLifeTimeCurve();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSizeOverLifeTimeCurve(Curve value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setSizeOverLifeTimeCurve( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStartSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getStartSize();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStartSize(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setStartSize( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStartSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getStartSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStartSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setStartSpeed( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getTextureInstance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Texture.TextureInstance returnValue = instance.getTextureInstance();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTextureInstance(Texture value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.setTextureInstance(value.instance);
        } else {
            instance.setTextureInstance(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public TransparencyBased getTransparencyBased(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getTransparencyBased());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTransparencyBased(TransparencyBased value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setTransparencyBased( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }
}