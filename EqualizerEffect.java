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

    @MethodArgs({"index"})
    public float getBandGain(int index){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"index","value"})
    public void setBandGain(int index, float value){
        //
    }
}
