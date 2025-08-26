package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Input"})
public final class Key {

  @MethodArgs({"name"})
  public Key(String name) {}

  @JRDoc_EN("Checks whether the Key is currently being held down. This returns true on every frame while it remains pressed.")
  @JRDoc_PT("Verifica se a Key está sendo mantida pressionada. Retorna verdadeiro em todos os quadros enquanto ela permanecer pressionada.")
  @HideGetSet
  public boolean isPressed() {

    return false;
  }

  @JRDoc_EN("Checks whether the Key was just pressed. This returns true only on the first frame it was pressed.")
  @JRDoc_PT("Verifica se a Key acabou de ser pressionada. Retorna verdadeiro apenas no primeiro quadro em que ela foi pressionada.")
  @HideGetSet
  public boolean isDown() {

    return false;
  }

  @JRDoc_EN("Checks whether the Key was just released. This returns true only on the first frame after it was released.")
  @JRDoc_PT("Verifica se a Key acabou de ser liberada. Retorna verdadeiro apenas no primeiro quadro após ela ser liberada.")
  @HideGetSet
  public boolean isUp() {

    return false;
  }

  @JRDoc_EN("Registers that the key is being held down by the specified reference.")
  @JRDoc_PT("Registra que a tecla está sendo mantida pressionada pela referência especificada.")
  @MethodArgs({"solidReference"})
  public void requestPress(Object solidReference) {}

  @JRDoc_EN("Unregisters the key press held by the specified reference.")
  @JRDoc_PT("Cancela o registro da tecla pressionada pela referência especificada.")
  @MethodArgs({"solidReference"})
  public void releasePress(Object solidReference) {}

  @JRDoc_EN("Returns the name of the Key.")
  @JRDoc_PT("Retorna o nome da Key.")
  @HideGetSet
  public String getName() {

    return "";
  }
}
