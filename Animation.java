package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat={"Animations"})
public class Animation {
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
    @MethodArgs(args={"value"})
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
}
