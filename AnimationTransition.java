package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Animation.AnimationDatabase;
import com.itsmagic.engine.Engines.Engine.Animation.AnimationInstance;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations"})
@UnimplementedDoc
public final class AnimationTransition {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Animation.AnimationTransition instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"animation"})
    public AnimationTransition(com.itsmagic.engine.Engines.Engine.Animation.AnimationTransition instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    private AnimationTransition() {

    }

    @UnimplementedDoc
    public boolean isFinished(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isFinished();
        //>REMOVE-BRIDGE<
    }
}
