package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations"})
public final class Animation {
    //

    public Animation() {
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

    public void play(){
        //
    }
    public void playInLoop(){
        //
    }
    public void stop(){
        //
    }
    public void stopLoop(){
        //
    }

    public boolean isPlaying(){
        //
        return false;
        //

        //
    }
    public boolean isLoop(){
        //
        return false;
        //

        //
    }

    @UnimplementedDoc
    @HideGetSet
    public int getFrameCount() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args = {"index"})
    public AnimationFrame getFrameAt(int index) {
        //
        return null;
        //

        //
    }
    @UnimplementedDoc

    @MethodArgs(args = {"frame"})
    public void addFrame(AnimationFrame frame) {
        //
    }
    @UnimplementedDoc
    @MethodArgs(args = {"entry"})
    public void removeFrame(AnimationFrame frame) {
        //
    }

    @UnimplementedDoc
    public void sortFrames(){
        //
    }

    /// ABSTRACT
    @MethodArgs(args ={"file"})
    public static Animation loadFile(AnimationFile file){
        //
        return null;
        //

        //
    }
}


