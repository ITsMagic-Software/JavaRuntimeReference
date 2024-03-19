package JAVARuntime;

//<REMOVE-BRIDGE>
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Time"})
public final class Time {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Time() { }

    /// Abstracts
    public static float deltaTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public static float getDeltaTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime();
        //>REMOVE-BRIDGE<
    }
    public static float frameTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getScaledDeltaTime();
        //>REMOVE-BRIDGE<
    }

    public static float unscaledDeltaTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getUnscaledDeltaTime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public static float getUnscaledDeltaTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getUnscaledDeltaTime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public static float getUnscaledFrameTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getUnscaledDeltaTime();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public static float getTimeSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getTimeScale();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public static void setTimeSpeed(float value){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Time.setTimeScale(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public static float getTimeScale(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Time.getTimeScale();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public static void setTimeScale(float value){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Time.setTimeScale(value);
        //>REMOVE-BRIDGE<
    }
}
