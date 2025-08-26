package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Sound", "Components"})
public final class SoundPlayer extends Component {

  public SoundPlayer() {

    super();
  }

  @HideGetSet
  public boolean isLoop() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLoop(boolean value) {}

  @UnimplementedDoc
  @MethodArgs({"file"})
  public void setSoundFile(SoundFile pFile) {}

  @UnimplementedDoc
  @MethodArgs({"file"})
  public void setSoundFile(File pFile) {}

  public void play() {}

  public void stop() {}

  public void pause() {}

  public void unPause() {}

  @HideGetSet
  public boolean isPlaying() {

    return false;
  }

  @HideGetSet
  public boolean isPaused() {

    return false;
  }

  @HideGetSet
  public boolean isStopped() {

    return false;
  }

  @HideGetSet
  public float getVolume() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setVolume(float value) {}

  @HideGetSet
  public float getDiameter() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setDiameter(float value) {}

  @HideGetSet
  public float getSpeed() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSpeed(float value) {}

  @HideGetSet
  public float getPitch() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setPitch(float value) {}

  public enum LoadMode {
    Stream,
    Async,
    Immediate
  }

  public enum Mode {
    Play_3D,
    Play_2D
  }

  @HideGetSet
  public LoadMode getLoadMode() {

    return null;
  }

  @HideGetSet
  public Mode getMode() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLoadMode(LoadMode value) {}

  @HideGetSet
  @MethodArgs({"value"})
  public void setMode(Mode value) {}
}
