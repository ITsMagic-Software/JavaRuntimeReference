package JAVARuntime;

//<REMOVE-BRIDGE>
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Sound.Native.NativeSoundEmitter;
//>REMOVE-BRIDGE<

import java.io.File;

public class SoundEmitter {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient NativeSoundEmitter instance;
    @IgnoreAutoComplete
    public SoundEmitter(NativeSoundEmitter instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public SoundEmitter(NativeFloatBuffer leftChannel, NativeFloatBuffer rightChannel, int sampleRate) {
        //<REMOVE-BRIDGE>
        this.instance = new NativeSoundEmitter();
        this.instance.init(leftChannel.buffer, sampleRate);
        //>REMOVE-BRIDGE<
    }
    public SoundEmitter(SoundData data) {
        //<REMOVE-BRIDGE>
        this.instance = new NativeSoundEmitter();
        this.instance.init(data.getDataBuffer().buffer, data.getSampleRate());
        //>REMOVE-BRIDGE<
    }
    public SoundEmitter(File file) throws Exception {
        //<REMOVE-BRIDGE>
        this(SoundDecoder.decodeFile(file));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLeftVolume() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getLeftVolume();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setLeftVolume(float leftVolume) {
        //<REMOVE-BRIDGE>
        instance.setLeftVolume(leftVolume);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRightVolume() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getRightVolume();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setRightVolume(float rightVolume) {
        //<REMOVE-BRIDGE>
        instance.setRightVolume(rightVolume);
        //>REMOVE-BRIDGE<
    }

    public void setVolumes(float left, float right){
        //<REMOVE-BRIDGE>
        instance.setVolumes(left, right);
        //>REMOVE-BRIDGE<
    }
    public void setVolumes(float left, float right, float volume){
        //<REMOVE-BRIDGE>
        instance.setVolumes(left, right, volume);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSpeed() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setSpeed(float speed) {
        //<REMOVE-BRIDGE>
        instance.setSpeed(speed);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getPitch() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getPitch();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setPitch(float pitch) {
        //<REMOVE-BRIDGE>
        instance.setPitch(pitch);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getVolume() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getVolume();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setVolume(float volume) {
        //<REMOVE-BRIDGE>
        instance.setVolume(volume);
        //>REMOVE-BRIDGE<
    }

    private int getStepsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getStepsCount();
        //>REMOVE-BRIDGE<
    }
    public float getCurrentSecond(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getCurrentSecond();
        //>REMOVE-BRIDGE<
    }
    public float getTotalSeconds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getTotalSeconds();
        //>REMOVE-BRIDGE<
    }
    public void seekToSecond(float second){
        //<REMOVE-BRIDGE>
        instance.seekToSecond(second);
        //>REMOVE-BRIDGE<
    }

    public boolean isLoop() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isLoop();
        //>REMOVE-BRIDGE<
    }
    public void setLoop(boolean loop) {
        //<REMOVE-BRIDGE>
        instance.setLoop(loop);
        //>REMOVE-BRIDGE<
    }

    public void play(){
        //<REMOVE-BRIDGE>
        instance.play();
        //>REMOVE-BRIDGE<
    }
    public void pause(){
        //<REMOVE-BRIDGE>
        instance.pause();
        //>REMOVE-BRIDGE<
    }
    public void stop(){
        //<REMOVE-BRIDGE>
        instance.stop();
        //>REMOVE-BRIDGE<
    }

    public boolean isPaused(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPaused();
        //>REMOVE-BRIDGE<
    }
    public boolean isPlaying(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPlaying();
        //>REMOVE-BRIDGE<
    }
    public boolean isStopped(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isStopped();
        //>REMOVE-BRIDGE<
    }
}
