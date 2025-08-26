package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Particles"})
public final class ParticleEmitter extends Component {

  public ParticleEmitter() {

    super();
  }

  public enum AlphaBased {
    None,
    AlphaOverLifetime,
    BySpeed
  }

  public enum ColorBased {
    Constant,
    ColorOverLifetime,
    BySpeed
  }

  public enum ColorMode {
    Normal,
    Additive
  }

  public enum EmissionShape {
    Sphere,
    Cone
  }

  public enum SizeBased {
    SizeOverLifetime,
    Constant,
    BySpeed
  }

  public enum TransparencyBased {
    Disabled,
    Alpha,
    GreyScale
  }

  @MethodArgs({"position", "movement"})
  public Particle emit(Vector3 position, Vector3 movement) {

    return null;
  }

  @HideGetSet
  @UnimplementedDoc
  public boolean isAllowEmission() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  @UnimplementedDoc
  public void setAllowEmission(boolean value) {}

  @HideGetSet
  public AlphaBased getAlphaBased() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setAlphaBased(AlphaBased value) {}

  @HideGetSet
  public Curve getAlphaOverLifeTimeCurve() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setAlphaOverLifeTimeCurve(Curve value) {}

  @HideGetSet
  public Color getColor() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setColor(Color value) {}

  @HideGetSet
  public ColorBased getColorBased() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setColorBased(ColorBased value) {}

  @HideGetSet
  public ColorMode getColorMode() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setColorMode(ColorMode value) {}

  @HideGetSet
  public ParticleConeShapeOptions getConeShapeOptions() {

    return null;
  }

  @HideGetSet
  public ParticleSphereShapeOptions getSphereShapeOptions() {

    return null;
  }

  @HideGetSet
  public EmissionShape getEmissionShape() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setEmissionShape(EmissionShape value) {}

  @HideGetSet
  public float getEmitDelaySeconds() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setEmitDelaySeconds(float value) {}

  @HideGetSet
  public float getGravityMultiplier() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setGravityMultiplier(float value) {}

  @HideGetSet
  public int getLayer() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setLayer(int value) {}

  @HideGetSet
  public float getMaxLifeSeconds() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxLifeSeconds(float value) {}

  @HideGetSet
  public int getMaxParticles() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxParticles(int value) {}

  @HideGetSet
  public SizeBased getSizeBased() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSizeBased(SizeBased value) {}

  @HideGetSet
  public Curve getSizeOverLifeTimeCurve() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSizeOverLifeTimeCurve(Curve value) {}

  @HideGetSet
  public float getStartSize() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStartSize(float value) {}

  @HideGetSet
  public float getStartSpeed() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStartSpeed(float value) {}

  @HideGetSet
  public Texture getTextureInstance() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTextureInstance(Texture value) {}

  @HideGetSet
  public TransparencyBased getTransparencyBased() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setTransparencyBased(TransparencyBased value) {}
}
