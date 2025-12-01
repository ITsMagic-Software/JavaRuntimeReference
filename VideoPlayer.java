package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Sound","Components"})
public final class VideoPlayer extends Component{
    //

    public VideoPlayer() {
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
    @MethodArgs({"value"})
    public void setLoop(boolean value){
        //
    }

    @UnimplementedDoc
    @MethodArgs({"file"})
    public void setVideoFile(VideoFile pFile){
        //
    }

    @UnimplementedDoc
    @MethodArgs({"file"})
    public void setVideoFile(File pFile){
        //
    }

    @UnimplementedDoc
    @MethodArgs({"file"})
    public void setOutputVideoFile(OutputVideoFile pFile){
        //
    }

    @UnimplementedDoc
    @MethodArgs({"file"})
    public void setOutputVideoFile(File pFile){
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
    public boolean isPlaying(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    public boolean isPaused(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    public boolean isStopped(){
        //
        return false;
        //

        //
    }

    @MethodArgs({"miliSeconds"})
    public void seekTo(int miliSeconds){
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
    @MethodArgs({"value"})
    public void setVolume(float value){
        //
    }

    //
}
