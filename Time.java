package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Time"})
public final class Time {

  private Time() {}

  /// Abstracts

  @Deprecated
  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one.")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual.")
  public static float deltaTime() {

    return 0;
  }

  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one.")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual.")
  @HideGetSet
  public static float getDeltaTime() {

    return 0;
  }

  @Deprecated
  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one.")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual.")
  public static float frameTime() {

    return 0;
  }

  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one.")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual.")
  @HideGetSet
  public static float getFrameTime() {

    return 0;
  }

  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one without time scale (real time).")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual sem escala de tempo (tempo real).")
  public static float unscaledDeltaTime() {

    return 0;
  }

  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one without time scale (real time).")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual sem escala de tempo (tempo real).")
  @HideGetSet
  public static float getUnscaledDeltaTime() {

    return 0;
  }

  @JRDoc_EN("Returns the time (in seconds) between the last frame and the current one without time scale (real time).")
  @JRDoc_PT("Retorna o tempo (em segundos) que passou entre o último frame e o atual sem escala de tempo (tempo real).")
  @HideGetSet
  public static float getUnscaledFrameTime() {

    return 0;
  }

  @JRDoc_EN("Returns the current time speed.")
  @JRDoc_PT("Retorna a velocidade atual da escala de tempo.")
  @HideGetSet
  public static float getTimeSpeed() {

    return 0;
  }

  @JRDoc_EN("Sets the current time speed.")
  @JRDoc_PT("Define a velocidade atual da escala de tempo.")
  @HideGetSet
  @MethodArgs({"value"})
  public static void setTimeSpeed(float value) {}

  @JRDoc_EN("Returns the current time scale.")
  @JRDoc_PT("Retorna a escala de tempo atual.")
  @HideGetSet
  public static float getTimeScale() {

    return 0;
  }

  @JRDoc_EN("Sets the current time scale.")
  @JRDoc_PT("Define a escala de tempo atual.")
  @HideGetSet
  @MethodArgs({"value"})
  public static void setTimeScale(float value) {}
}
