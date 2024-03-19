package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.BassBoost;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"SoundEffects"})
public class BassBoostEffect extends AudioEffect{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient BassBoost effect;
    @IgnoreAutoComplete
    @MethodArgs(args ={"effect"})
    public BassBoostEffect(BassBoost effect) {
        super("BassBoost");
        this.effect = effect;
    }
    //>REMOVE-BRIDGE<

    public BassBoostEffect() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super(null);
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new BassBoost());
        this.effect = (BassBoost) super.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStrength(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return effect.strength;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStrength(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        effect.strength = value;
        //>REMOVE-BRIDGE<
    }
}
