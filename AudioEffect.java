package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"SoundEffects"})
public class AudioEffect {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.AudioEffect instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"effect"})
    public AudioEffect(com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.AudioEffect instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<
    @MethodArgs(args ={"tittle"})
    public AudioEffect(String tittle) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.AudioEffect(tittle);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getTittle();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"tittle"})
    public void setTittle(String tittle){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setSerialisedType(tittle);
        //>REMOVE-BRIDGE<
    }
}
