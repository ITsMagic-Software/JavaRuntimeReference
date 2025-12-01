package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Framerate"})
public final class FixedFraming {
    //

    @MethodArgs({"framesPerSecond", "FixedFrameListener", "fixedFrameListener"})
    public FixedFraming(int framesPerSecond, FixedFrameListener fixedFrameListener) {
        //
    }

    public void engineRepeat(){
        //
    }

    @MethodArgs({"allowTimeScale"})
    public void setAllowTimeScale(boolean allowTimeScale) {
        //
    }
    @MethodArgs({"desyncLowFrameRate"})
    public void setDesyncLowFrameRate(boolean desyncLowFrameRate) {
        //
    }
    @MethodArgs({"desyncHighFrameRate"})
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
    @MethodArgs({"framesPerSecond"})
    public void setFixedFrames(int framesPerSecond) {
        //
    }

    @MethodArgs({"fixedFrameListener"})
    public void setFixedFrameListener(FixedFrameListener fixedFrameListener) {
        //
    }
}
