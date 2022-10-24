package JAVARuntime;

//

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping"})
public class BlinkLight extends Component {
    //

    public BlinkLight() {
        //
    }

    @HideGetSet
    public String getPattern() {
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"pattern"})
    public void setPattern(String pattern) {
        //
    }
    @HideGetSet
    @MethodArgs(args={"pattern"})
    public void setPattern(OHString pattern) {
        //
    }

    @HideGetSet
    public float getFrequency() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"frequency"})
    public void setFrequency(float frequency) {
        //
    }

    @HideGetSet
    public float getOffIntensity() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setOffIntensity(float value) {
        //
    }

    @HideGetSet
    public float getOnIntensity() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setOnIntensity(float value) {
        //
    }

    @HideGetSet
    public float getLerpSpeed() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setLerpSpeed(float value) {
        //
    }

    @HideGetSet
    public boolean isReverse() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setReverse(boolean value) {
        //
    }

    //
}
