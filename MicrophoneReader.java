package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Sound"})
public class MicrophoneReader extends Component {

    //

    public MicrophoneReader() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float[] getFramePCM(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getFrameLength(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getSampleRate(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public boolean isEnableRecord(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setEnableRecord(boolean value){
        //
    }
}