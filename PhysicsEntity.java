package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Physics"})
public class PhysicsEntity {

  public PhysicsEntity() {}

  @JRDoc_EN("Checks if this object is colliding with an object with the specified name.")
  @JRDoc_PT("Verifica se este objeto está colidindo com um objeto com o nome especificado.")
  @MethodArgs({"objectName"})
  public boolean colliderWithName(String objectName) {

    return false;
  }

  @JRDoc_EN("Checks if this object is colliding with anything.")
  @JRDoc_PT("Verifica se este objeto está colidindo com algo.")
  public boolean isColliding() {

    return false;
  }

  @JRDoc_EN("Returns a list of all current collisions.")
  @JRDoc_PT("Retorna uma lista de todas as colisões atuais.")
  public List<Collision> getCollisionList() {

    return null;
  }

  @JRDoc_EN("Returns the number of current collisions.")
  @JRDoc_PT("Retorna o número de colisões atuais.")
  public int getCollisionsCount() {

    return 0;
  }

  @JRDoc_EN("Returns the Collision at the specified index.")
  @JRDoc_PT("Retorna a colisão no índice especificado.")
  @MethodArgs({"idx"})
  public Collision getCollisionAt(int idx) {

    return null;
  }

  @JRDoc_EN("Returns the SpatialObject that has this physics instance.")
  @JRDoc_PT("Retorna o SpatialObject que possui esta instância de física.")
  public SpatialObject getObject() {

    return null;
  }

  @JRDoc_EN("Returns the name of the physics (for example: Rigidbody, CharacterBody, etc).")
  @JRDoc_PT("Retorna o nome da física (por exemplo: Rigidbody, CharacterBody, etc).")
  public String getTittle() {

    return "";
  }

  @JRDoc_EN("Returns the current velocity of the object.")
  @JRDoc_PT("Retorna a velocidade atual do objeto.")
  @HideGetSet
  public Vector3 getVelocity() {

    return null;
  }
}
