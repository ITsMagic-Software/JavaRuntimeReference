package JAVARuntime;

//



/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SoundEffects"})
public class EqualizerEffect extends AudioEffect{
    //

    public EqualizerEffect() {
        //
        super(null);
        //

        //
    }

    @MethodArgs(args ={"index"})
    public float getBandGain(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"index","value"})
    public void setBandGain(int index, float value){
        //
    }
}
