package JAVARuntime;

public class SoundData {
  private transient NativeFloatBuffer dataBuffer;
  private transient int sampleRate;

  @UnimplementedDoc
  public SoundData() {}

  @UnimplementedDoc
  @MethodArgs({"dataBuffer", "sampleRate"})
  public SoundData(NativeFloatBuffer dataBuffer, int sampleRate) {
    this.dataBuffer = dataBuffer;
    this.sampleRate = sampleRate;
  }

  @UnimplementedDoc
  @MethodArgs({"dataBuffer", "sampleRate"})
  public SoundData(float[] dataBuffer, int sampleRate) {}

  @UnimplementedDoc
  @HideGetSet
  public NativeFloatBuffer getDataBuffer() {
    return dataBuffer;
  }

  @UnimplementedDoc
  @HideGetSet
  @MethodArgs({"dataBuffer"})
  public void setDataBuffer(NativeFloatBuffer dataBuffer) {
    this.dataBuffer = dataBuffer;
  }

  @UnimplementedDoc
  @HideGetSet
  public int getSampleRate() {
    return sampleRate;
  }

  @UnimplementedDoc
  @HideGetSet
  @MethodArgs({"sampleRate"})
  public void setSampleRate(int sampleRate) {
    this.sampleRate = sampleRate;
  }
}
