package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Framerate"})
public class FixedFraming {
    //

    @MethodArgs(args={"framesPerSecond", "FixedFrameListener", "fixedFrameListener"})
    public FixedFraming(int framesPerSecond, FixedFrameListener fixedFrameListener) {
        //
    }

    public void engineRepeat(){
        //
    }

    @MethodArgs(args={"allowTimeScale"})
    public void setAllowTimeScale(boolean allowTimeScale) {
        //
    }
    @MethodArgs(args={"desyncLowFrameRate"})
    public void setDesyncLowFrameRate(boolean desyncLowFrameRate) {
        //
    }
    @MethodArgs(args={"desyncHighFrameRate"})
    public void setDesyncHighFrameRate(boolean desyncHighFrameRate) {
        //
    }

    @HideGetSet
    public float getFixedFrames() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"framesPerSecond"})
    public void setFixedFrames(int framesPerSecond) {
        //
    }

    @MethodArgs(args={"fixedFrameListener"})
    public void setFixedFrameListener(FixedFrameListener fixedFrameListener) {
        //
    }
}
