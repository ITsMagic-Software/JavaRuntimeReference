package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.Equalizer;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<



/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SoundEffects"})
public class EqualizerEffect extends AudioEffect{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient Equalizer effect;
    @IgnoreAutoComplete
    public EqualizerEffect(Equalizer effect) {
        super("Equalizer");
        this.effect = effect;
    }
    //>REMOVE-BRIDGE<

    public EqualizerEffect() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new Equalizer());
        this.effect = (Equalizer) super.instance;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"index"})
    public float getBandGain(int index){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return effect.bands[index];
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"index","value"})
    public void setBandGain(int index, float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        effect.bands[index] = Mathf.clamp(0, value, 1);
        //>REMOVE-BRIDGE<
    }
}
