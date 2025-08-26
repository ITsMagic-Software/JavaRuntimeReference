package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Prototyping", "Components"})
public final class LaserCasting extends Component {

  public LaserCasting() {

    super();
  }

  @JRDoc_EN("Returns the maximum distance of the Laser.")
  @JRDoc_PT("Retorna a distância máxima do Laser.")
  @HideGetSet
  public float getDistance() {

    return 0;
  }

  @JRDoc_EN("Returns the normal vector of the hit face by the Laser.")
  @JRDoc_PT("Retorna o vetor normal da face atingida pelo Laser.")
  @HideGetSet
  public Vector3 getHitFaceNormal() {

    return null;
  }

  @JRDoc_EN("Returns the object hit by the Laser.")
  @JRDoc_PT("Retorna o objeto atingido pelo Laser.")
  @HideGetSet
  public SpatialObject getHitObject() {

    return null;
  }

  @JRDoc_EN("Returns the hit point of the Laser.")
  @JRDoc_PT("Retorna o ponto de impacto do Laser.")
  @HideGetSet
  public Vector3 getHitPoint() {

    return null;
  }

  @JRDoc_EN("Returns the UV coordinates of the hit point of the Laser.")
  @JRDoc_PT("Retorna as coordenadas UV do ponto de impacto do Laser.")
  @HideGetSet
  public Vector2 getHitUVCoord() {

    return null;
  }

  @JRDoc_EN("Returns whether the Laser is infinite.")
  @JRDoc_PT("Retorna se o Laser é infinito.")
  public boolean isInfinity() {

    return false;
  }

  @JRDoc_EN("Sets the maximum distance of the Laser.")
  @JRDoc_PT("Define a distância máxima do Laser.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setDistance(float value) {}

  @JRDoc_EN("Sets whether the Laser is infinite.")
  @JRDoc_PT("Define se o Laser é infinito.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setInfinity(boolean value) {}
}
