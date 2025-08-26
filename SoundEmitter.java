package JAVARuntime;

import java.io.File;

public class SoundEmitter {

  public SoundEmitter(NativeFloatBuffer leftChannel, int sampleRate) {}

  public SoundEmitter(float[] leftChannel, int sampleRate) {}

  public SoundEmitter(SoundData data) {}

  public SoundEmitter(File file) throws Exception {}

  @HideGetSet
  public float getLeftVolume() {

    return 0;
  }

  @HideGetSet
  public void setLeftVolume(float leftVolume) {}

  @HideGetSet
  public float getRightVolume() {

    return 0;
  }

  @HideGetSet
  public void setRightVolume(float rightVolume) {}

  public void setVolumes(float left, float right) {}

  public void setVolumes(float left, float right, float volume) {}

  @HideGetSet
  public float getSpeed() {

    return 0;
  }

  @HideGetSet
  public void setSpeed(float speed) {}

  @HideGetSet
  public float getPitch() {

    return 0;
  }

  @HideGetSet
  public void setPitch(float pitch) {}

  @HideGetSet
  public float getVolume() {

    return 0;
  }

  @HideGetSet
  public void setVolume(float volume) {}

  private int getStepsCount() {

    return 0;
  }

  public float getCurrentSecond() {

    return 0;
  }

  public float getTotalSeconds() {

    return 0;
  }

  public void seekToSecond(float second) {}

  public boolean isLoop() {

    return false;
  }

  public void setLoop(boolean loop) {}

  public void play() {}

  public void pause() {}

  public void stop() {}

  public boolean isPaused() {

    return false;
  }

  public boolean isPlaying() {

    return false;
  }

  public boolean isStopped() {

    return false;
  }
}
