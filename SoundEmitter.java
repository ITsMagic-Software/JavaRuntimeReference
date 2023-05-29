package JAVARuntime;

//

import java.io.File;

public class SoundEmitter {

    //

    @UnimplementedDoc
    public SoundEmitter(NativeFloatBuffer leftChannel, NativeFloatBuffer rightChannel, int sampleRate) {
        //
    }
    @UnimplementedDoc
    public SoundEmitter(SoundData data) {
        //
    }
    @UnimplementedDoc
    public SoundEmitter(File file) throws Exception {
        //
    }


    @UnimplementedDoc
    @HideGetSet
    public float getLeftVolume() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setLeftVolume(float leftVolume) {
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public float getRightVolume() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setRightVolume(float rightVolume) {
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public void setVolumes(float left, float right){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setVolumes(float left, float right, float volume){
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public float getSpeed() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setSpeed(float speed) {
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public float getPitch() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setPitch(float pitch) {
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public float getVolume() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public void setVolume(float volume) {
        //
    }

    @UnimplementedDoc
    private int getStepsCount(){
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    public float getCurrentSecond(){
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    public float getTotalSeconds(){
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    public void seekToSecond(float second){
        //
    }

    @UnimplementedDoc
    public boolean isLoop() {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    public void setLoop(boolean loop) {
        //
    }

    @UnimplementedDoc
    public void play(){
        //
    }
    @UnimplementedDoc
    public void pause(){
        //
    }
    @UnimplementedDoc
    public void stop(){
        //
    }

    @UnimplementedDoc
    public boolean isPaused(){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    public boolean isPlaying(){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    public boolean isStopped(){
        //
        return false;
        //

        //
    }
}
