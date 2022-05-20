package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Time"})
public class Time {
    //

    private Time() { }

    /// Abstracts
    public static float deltaTime(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public static float getDeltaTime(){
        //
        return 0;
        //

        //
    }
    public static float frameTime(){
        //
        return 0;
        //

        //
    }

    public static float unscaledDeltaTime(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public static float getUnscaledDeltaTime(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public static float getUnscaledFrameTime(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public static float getTimeSpeed(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public static void setTimeSpeed(float value){
        //
    }

    @HideGetSet
    public static float getTimeScale(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public static void setTimeScale(float value){
        //
    }

    @HideGetSet
    public static float getLastFrameUnscaledDeltaTime(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public static float getLastFrameDeltaTime(){
        //
        return 0;
        //

        //
    }
}
