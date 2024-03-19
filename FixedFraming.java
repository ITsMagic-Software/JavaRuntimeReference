package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Framerate"})
public final class FixedFraming {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient com.itsmagic.engine.Engines.Engine.FixedFraming.FixedFraming fixedFraming;
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"framesPerSecond", "FixedFrameListener", "fixedFrameListener"})
    public FixedFraming(int framesPerSecond, FixedFrameListener fixedFrameListener) {
        //<REMOVE-BRIDGE>
        this.fixedFraming = new com.itsmagic.engine.Engines.Engine.FixedFraming.FixedFraming(framesPerSecond, new com.itsmagic.engine.Engines.Engine.FixedFraming.FixedFrameListener() {
            @Override
            public void repeat(float deltaTime) {
                fixedFrameListener.repeat(deltaTime);
            }
        });
        //>REMOVE-BRIDGE<
    }

    public void engineRepeat(){
        //<REMOVE-BRIDGE>
        this.fixedFraming.engineRepeat();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"allowTimeScale"})
    public void setAllowTimeScale(boolean allowTimeScale) {
        //<REMOVE-BRIDGE>
        this.fixedFraming.setAllowTimeScale(allowTimeScale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"desyncLowFrameRate"})
    public void setDesyncLowFrameRate(boolean desyncLowFrameRate) {
        //<REMOVE-BRIDGE>
        this.fixedFraming.setDesyncLowFrameRate(desyncLowFrameRate);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"desyncHighFrameRate"})
    public void setDesyncHighFrameRate(boolean desyncHighFrameRate) {
        //<REMOVE-BRIDGE>
        this.fixedFraming.setDesyncHighFrameRate(desyncHighFrameRate);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFixedFrames() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return fixedFraming.getFixedFrames();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"framesPerSecond"})
    public void setFixedFrames(int framesPerSecond) {
        //<REMOVE-BRIDGE>
        this.fixedFraming.setFixedFrames(framesPerSecond);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"fixedFrameListener"})
    public void setFixedFrameListener(FixedFrameListener fixedFrameListener) {
        //<REMOVE-BRIDGE>
        this.fixedFraming.setFixedFrameListener(new com.itsmagic.engine.Engines.Engine.FixedFraming.FixedFrameListener() {
            @Override
            public void repeat(float deltaTime) {
                fixedFrameListener.repeat(deltaTime);
            }
        });
        //>REMOVE-BRIDGE<
    }
}
