package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"HPOP"})
public class HPO {

  public HPO() {}

  public HPO(Vector3 position, Quaternion rotation, Vector3 scale) {}

  @JRDoc_EN("Returns the current position of the HPO.")
  @JRDoc_PT("Retorna a posição atual do HPO.")
  @HideGetSet
  public Vector3 getPosition() {

    return null;
  }

  @JRDoc_EN("Sets the position of the HPO.")
  @JRDoc_PT("Define a posição do HPO.")
  @HideGetSet
  @MethodArgs({"vector3"})
  public void setPosition(Vector3 vector3) {}

  @JRDoc_EN("Returns the current rotation of the HPO.")
  @JRDoc_PT("Retorna a rotação atual do HPO.")
  @HideGetSet
  public Quaternion getRotation() {

    return null;
  }

  @JRDoc_EN("Sets the rotation of the HPO.")
  @JRDoc_PT("Define a rotação do HPO.")
  @HideGetSet
  @MethodArgs({"quaternion"})
  public void setPosition(Quaternion quaternion) {}

  @JRDoc_EN("Returns the current scale of the HPO.")
  @JRDoc_PT("Retorna a escala atual do HPO.")
  @HideGetSet
  public Vector3 getScale() {

    return null;
  }

  @JRDoc_EN("Sets the scale of the HPO.")
  @JRDoc_PT("Define a escala do HPO.")
  @HideGetSet
  @MethodArgs({"vector3"})
  public void setScale(Vector3 vector3) {}

  @JRDoc_EN("Checks if the HPO is static.")
  @JRDoc_PT("Verifica se o HPO é estático.")
  @HideGetSet
  public boolean isStatic() {

    return false;
  }

  @JRDoc_EN("Sets whether the HPO is static.")
  @JRDoc_PT("Define se o HPO é estático.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setStatic(boolean value) {}

  @JRDoc_EN("Returns the transformation matrix of the HPO.")
  @JRDoc_PT("Retorna a matriz de transformação do HPO.")
  public float[] getMatrix() {

    return null;
  }
}
