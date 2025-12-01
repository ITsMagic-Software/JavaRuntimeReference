package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class SSAO extends Component {

    //

        public SSAO() {
        //
        super();
        //

        //
    }

    public enum QualityLevel {
        LOW, MEDIUM, HIGH, ULTRA
    }
    //

    @HideGetSet
    public float getBias(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getBilateralThreshold(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getIntensity(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public QualityLevel getLowPassFilter(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getMinHorizonAngleRad(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getPower(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public QualityLevel getQuality(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getRadius(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public QualityLevel getUpsampling(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"bias"})
    public void setBias(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"bilateralThreshold"})
    public void setBilateralThreshold(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"intensity"})
    public void setIntensity(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"lowPassFilter"})
    public void setLowPassFilter(QualityLevel value){
        //
    }

    @HideGetSet
    @MethodArgs({"minHorizonAngleRad"})
    public void setMinHorizonAngleRad(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"power"})
    public void setPower(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"quality"})
    public void setQuality(QualityLevel value){
        //
    }

    @HideGetSet
    @MethodArgs({"radius"})
    public void setRadius(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"upsampling"})
    public void setUpsampling(QualityLevel value){
        //
    }


}