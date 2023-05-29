package JAVARuntime;

public class SoundData {
    private NativeFloatBuffer leftChannel;
    private NativeFloatBuffer rightChannel;
    private int sampleRate;

    @UnimplementedDoc
    public SoundData() {}
    @UnimplementedDoc
    public SoundData(NativeFloatBuffer leftChannel, NativeFloatBuffer rightChannel, int sampleRate) {
        this.leftChannel = leftChannel;
        this.rightChannel = rightChannel;
        this.sampleRate = sampleRate;
    }

    @UnimplementedDoc
    @HideGetSet
    public NativeFloatBuffer getLeftChannel() {
        return leftChannel;
    }
    @UnimplementedDoc
    @HideGetSet
    public void setLeftChannel(NativeFloatBuffer leftChannel) {
        this.leftChannel = leftChannel;
    }

    @UnimplementedDoc
    @HideGetSet
    public NativeFloatBuffer getRightChannel() {
        return rightChannel;
    }
    @UnimplementedDoc
    @HideGetSet
    public void setRightChannel(NativeFloatBuffer rightChannel) {
        this.rightChannel = rightChannel;
    }

    @UnimplementedDoc
    @HideGetSet
    public int getSampleRate() {
        return sampleRate;
    }
    @UnimplementedDoc
    @HideGetSet
    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }
}
