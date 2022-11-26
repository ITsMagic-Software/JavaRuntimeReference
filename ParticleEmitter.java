package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Particles"})
public class ParticleEmitter extends Component {

    //

        public ParticleEmitter() {
        //
        super();
        //

        //
    }

    public enum AlphaBased {
        None, AlphaOverLifetime, BySpeed
    }
    //

    public enum ColorBased {
        Constant, ColorOverLifetime, BySpeed
    }
    //

    public enum ColorMode {
        Normal, Additive
    }
    //

    public enum EmissionShape {
        Sphere, Cone
    }
    //

    public enum SizeBased {
        SizeOverLifetime, Constant, BySpeed
    }
    //

    public enum TransparencyBased {
        Disabled, Alpha, GreyScale
    }
    //

    @HideGetSet
    public AlphaBased getAlphaBased(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Curve getAlphaOverLifeTimeCurve(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ColorBased getColorBased(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ColorMode getColorMode(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ParticleConeShapeOptions getConeShapeOptions(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public EmissionShape getEmissionShape(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getEmitDelaySeconds(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getGravityMultiplier(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getLayer(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getMaxLifeSeconds(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getMaxParticles(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SizeBased getSizeBased(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Curve getSizeOverLifeTimeCurve(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ParticleSphereShapeOptions getSphereShapeOptions(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getStartSize(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getStartSpeed(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Texture getTextureInstance(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public TransparencyBased getTransparencyBased(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAlphaBased(AlphaBased value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAlphaOverLifeTimeCurve(Curve value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColorBased(ColorBased value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColorMode(ColorMode value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEmissionShape(EmissionShape value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEmitDelaySeconds(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGravityMultiplier(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayer(int value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxLifeSeconds(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxParticles(int value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSizeBased(SizeBased value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSizeOverLifeTimeCurve(Curve value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStartSize(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStartSpeed(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTextureInstance(Texture value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTransparencyBased(TransparencyBased value){
        //
    }
}