package JAVARuntime;

public final class AnimationFrame {

  @UnimplementedDoc
  public AnimationFrame() {}

  @UnimplementedDoc
  public AnimationFrame(int frameTime) {}

  @JRDoc_EN("Returns the current frame time.")
  @JRDoc_PT("Retorna o tempo do frame atual.")
  @UnimplementedDoc
  @HideGetSet
  public int getFrameTime() {

    return 0;
  }

  @JRDoc_EN("Sets the current frame time.")
  @JRDoc_PT("Define o tempo do frame atual.")
  @UnimplementedDoc
  @HideGetSet
  @MethodArgs({"value"})
  public void setFrameTime(int value) {}

  @JRDoc_EN("Returns the count of animation entries (modified objects) in the current frame.")
  @JRDoc_PT("Retorna a quantidade de entradas de animação (objetos modificados) no frame atual.")
  @UnimplementedDoc
  @HideGetSet
  public int getEntryCount() {

    return 0;
  }

  @JRDoc_EN("Returns the AnimationEntry at the specified index.")
  @JRDoc_PT("Retorna a entrada de animação (AnimationEntry) do índice especificado.")
  @UnimplementedDoc
  @MethodArgs({"index"})
  public AnimationEntry getEntryAt(int index) {

    return null;
  }

  @JRDoc_EN("Adds an AnimationEntry to the current frame.")
  @JRDoc_PT("Adiciona uma entrada de animação (AnimationEntry) no frame atual.")
  @UnimplementedDoc
  @MethodArgs({"entry"})
  public void addEntry(AnimationEntry entry) {}

  @JRDoc_EN("Removes the AnimationEntry from the current frame.")
  @JRDoc_PT("Remove a entrada de animação (AnimationEntry) do frame atual.")
  @UnimplementedDoc
  @MethodArgs({"entry"})
  public void removeEntry(AnimationEntry entry) {}
}
