package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import java.lang.System;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Time"})
public class TimeCounter {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient long keyframe = System.nanoTime();
    @IgnoreAutoComplete
    private transient float intervalTime = 0f;
    @IgnoreAutoComplete
    private transient float lastFrameValue = 0;
    //>REMOVE-BRIDGE<

    public TimeCounter() {}

    public void start(){
        //<REMOVE-BRIDGE>
        keyframe = System.nanoTime();
        //>REMOVE-BRIDGE<
    }
    public void finish(){
        //<REMOVE-BRIDGE>
        intervalTime = System.nanoTime() - keyframe;
        intervalTime = intervalTime / 1000000f;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getElapsedMilliseconds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return intervalTime;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getElapsedSeconds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return intervalTime / 1000f;
        //>REMOVE-BRIDGE<
    }
}
