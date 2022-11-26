package JAVARuntime;

//

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Sound","Components"})
public class SoundPlayer extends Component{
    //

    public SoundPlayer() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public boolean isLoop(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLoop(boolean value){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete"})
    @HideGetSet
    public PFile getSoundFile(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file"})
    public void setSoundFile(SoundFile pFile){
        //
    }

    public void play(){
        //
    }
    public void stop(){
        //
    }
    public void pause(){
        //
    }
    public void unPause(){
        //
    }

    @HideGetSet
    public float getVolume(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVolume(float value){
        //
    }

    @HideGetSet
    public float getSpeed(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpeed(float value){
        //
    }

    @HideGetSet
    public float getPitch(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPitch(float value){
        //
    }


    //
}
