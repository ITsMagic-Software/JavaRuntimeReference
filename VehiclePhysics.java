package JAVARuntime;

import java.util.ArrayList;

@ClassCategory(cat = {"Physics"})
public final class VehiclePhysics extends PhysicsEntity {

  public VehiclePhysics() {}

  @MethodArgs({"torque", "wheelID"})
  public void setTorque(float torque, int wheelID) {}

  @MethodArgs({"brake", "wheelID"})
  public void setBrake(float brake, int wheelID) {}

  @MethodArgs({"steer", "wheelID"})
  public void setSteer(float steer, int wheelID) {}

  @MethodArgs({"steer", "wheelID"})
  public void setSteerRelativeVelocity(float steer, int wheelID) {}

  @MethodArgs({"maxSteer"})
  public void setMaxSteerAngle(float maxSteer) {}

  @MethodArgs({"steer"})
  public void setMinSteerAngle(float steer) {}

  @MethodArgs({"speed"})
  public void setSteerMaxSpeed(float speed) {}

  @HideGetSet
  public float getSpeedKMH() {

    return 0;
  }

  @HideGetSet
  public float getSuspensionLength() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSuspensionLength(float value) {}

  @HideGetSet
  public float getSuspensionStiffness() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setSuspensionStiffness(float value) {}

  public ArrayList getWheels() {

    return null;
  }

  @JRDoc_EN("Checks whether gravity is enabled for the Rigidbody.")
  @JRDoc_PT("Verifica se a gravidade está ativada para o Rigidbody.")
  @HideGetSet
  public boolean isGravityEnabled() {

    return false;
  }

  @JRDoc_EN("Sets whether gravity is enabled for the Rigidbody.")
  @JRDoc_PT("Define se a gravidade está ativada para o Rigidbody.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setGravityEnabled(boolean enabled) {}

  @JRDoc_EN("Returns the mass of the Rigidbody.")
  @JRDoc_PT("Retorna a massa do Rigidbody.")
  @HideGetSet
  public float getMass() {

    return 0;
  }

  @JRDoc_EN("Sets the mass of the Rigidbody.")
  @JRDoc_PT("Define a massa do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setMass(float value) {}

  @JRDoc_EN("Returns the friction of the Rigidbody.")
  @JRDoc_PT("Retorna o atrito/fricção do Rigidbody.")
  @HideGetSet
  public float getFriction() {

    return 0;
  }

  @JRDoc_EN("Sets the friction of the Rigidbody.")
  @JRDoc_PT("Define o atrito/fricção do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFriction(float value) {}

  @JRDoc_EN("Returns the linear damping of the Rigidbody.")
  @JRDoc_PT("Retorna o amortecimento linear do Rigidbody.")
  @HideGetSet
  public float getLinearDamping() {

    return 0;
  }

  @JRDoc_EN("Sets the linear damping of the Rigidbody.")
  @JRDoc_PT("Define o amortecimento linear do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setLinearDamping(float value) {}

  @JRDoc_EN("Returns the bounciness of the Rigidbody.")
  @JRDoc_PT("Retorna a elasticidade do Rigidbody.")
  @HideGetSet
  public float getBounciness() {

    return 0;
  }

  @JRDoc_EN("Sets the bounciness of the Rigidbody.")
  @JRDoc_PT("Define a elasticidade do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setBounciness(float value) {}

  @JRDoc_EN("Returns the angular damping of the Rigidbody.")
  @JRDoc_PT("Retorna o amortecimento angular do Rigidbody.")
  @HideGetSet
  public float getAngularDamping() {

    return 0;
  }

  @JRDoc_EN("Sets the angular damping of the Rigidbody.")
  @JRDoc_PT("Define o amortecimento angular do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setAngularDamping(float value) {}

  @JRDoc_EN("Applies a force to the Rigidbody in the specified direction.")
  @JRDoc_PT("Aplica uma força ao Rigidbody na direção especificada.")
  @MethodArgs({"value"})
  public void addForce(Vector3 vector3) {}

  @JRDoc_EN("Applies a force to the Rigidbody with the specified x, y and z values.")
  @JRDoc_PT("Aplica uma força ao Rigidbody com os valores x, y e z especificados.")
  @MethodArgs({"x", "y", "z"})
  public void addForce(float x, float y, float z) {}

  @JRDoc_EN("Applies a force to the Rigidbody at a specific relative position.")
  @JRDoc_PT("Aplica uma força ao Rigidbody em uma posição relativa específica.")
  @MethodArgs({"force", "relativePosition"})
  public void addForce(Vector3 force, Vector3 relativePosition) {}

  @JRDoc_EN("Returns the PhysicsLayer of the Rigidbody.")
  @JRDoc_PT("Retorna a PhysicsLayer do Rigidbody.")
  @HideGetSet
  public JAVARuntime.PhysicsLayer getPhysicsLayer() {

    return null;
  }

  @JRDoc_EN("Sets the PhysicsLayer of the Rigidbody to the specified layer.")
  @JRDoc_PT("Define a PhysicsLayer do Rigidbody para o layer especificado.")
  @HideGetSet
  @MethodArgs({"layer"})
  public void setPhysicsLayer(PhysicsLayer layer) {}

  @JRDoc_EN("Adds velocity to the Rigidbody in the specified direction.")
  @JRDoc_PT("Adiciona velocidade ao Rigidbody na direção especificada.")
  @MethodArgs({"value"})
  public void addVelocity(Vector3 vector3) {}

  @JRDoc_EN("Adds velocity to the Rigidbody with the specified x, y and z values.")
  @JRDoc_PT("Adiciona velocidade ao Rigidbody com os valores x, y e z especificados.")
  @MethodArgs({"x", "y", "z"})
  public void addVelocity(float x, float y, float z) {}

  @JRDoc_EN("Adds velocity per second to the Rigidbody in the specified direction.")
  @JRDoc_PT("Adiciona velocidade por segundo ao Rigidbody na direção especificada.")
  @MethodArgs({"value"})
  public void addVelocityBySecond(Vector3 vector3) {}

  @JRDoc_EN("Adds velocity per second to the Rigidbody with the specified x, y and z values.")
  @JRDoc_PT("Adiciona velocidade por segundo ao Rigidbody com os valores x, y e z especificados.")
  @MethodArgs({"x", "y", "z"})
  public void addVelocityBySecond(float x, float y, float z) {}

  @JRDoc_EN("Returns the gravity multiplier of the Rigidbody.")
  @JRDoc_PT("Retorna o multiplicador de gravidade do Rigidbody.")
  @HideGetSet
  public Vector3 getGravityMultiplier() {

    return null;
  }

  @JRDoc_EN("Sets the gravity multiplier of the Rigidbody.")
  @JRDoc_PT("Define o multiplicador de gravidade do Rigidbody.")
  @HideGetSet
  @MethodArgs({"vector"})
  public void setGravityMultiplier(Vector3 vector) {}

  @JRDoc_EN("Returns the current velocity of the Rigidbody.")
  @JRDoc_PT("Retorna a velocidade atual do Rigidbody.")
  @HideGetSet
  public Vector3 getVelocity() {

    return null;
  }

  @JRDoc_EN("Sets the current velocity of the Rigidbody.")
  @JRDoc_PT("Define a velocidade atual do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setVelocity(Vector3 vector) {}

  @JRDoc_EN("Returns the current angular velocity of the Rigidbody.")
  @JRDoc_PT("Retorna a velocidade angular atual do Rigidbody.")
  @HideGetSet
  public Vector3 getAngularVelocity() {

    return null;
  }

  @JRDoc_EN("Sets the current angular velocity of the Rigidbody.")
  @JRDoc_PT("Define a velocidade angular atual do Rigidbody.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setAngularVelocity(Vector3 vector) {}

  @JRDoc_EN("Returns whether movement on the X axis is frozen.")
  @JRDoc_PT("Retorna se o movimento no eixo X está travado.")
  @HideGetSet
  public boolean isFreezePX() {

    return false;
  }

  @JRDoc_EN("Sets whether movement on the X axis is frozen.")
  @JRDoc_PT("Define se o movimento no eixo X está travado.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezePX(boolean enabled) {}

  @JRDoc_EN("Returns whether movement on the Y axis is frozen.")
  @JRDoc_PT("Retorna se o movimento no eixo Y está travado.")
  @HideGetSet
  public boolean isFreezePY() {

    return false;
  }

  @JRDoc_EN("Sets whether movement on the Y axis is frozen.")
  @JRDoc_PT("Define se o movimento no eixo Y está travado.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezePY(boolean enabled) {}

  @JRDoc_EN("Returns whether movement on the Z axis is frozen.")
  @JRDoc_PT("Retorna se o movimento no eixo Z está travado.")
  @HideGetSet
  public boolean isFreezePZ() {

    return false;
  }

  @JRDoc_EN("Sets whether movement on the Z axis is frozen.")
  @JRDoc_PT("Define se o movimento no eixo Z está travado.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezePZ(boolean enabled) {}

  @JRDoc_EN("Returns whether rotation on the X axis is frozen.")
  @JRDoc_PT("Retorna se a rotação no eixo X está travada.")
  @HideGetSet
  public boolean isFreezeRX() {

    return false;
  }

  @JRDoc_EN("Sets whether rotation on the X axis is frozen.")
  @JRDoc_PT("Define se a rotação no eixo X está travada.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezeRX(boolean enabled) {}

  @JRDoc_EN("Returns whether rotation on the Y axis is frozen.")
  @JRDoc_PT("Retorna se a rotação no eixo Y está travada.")
  @HideGetSet
  public boolean isFreezeRY() {

    return false;
  }

  @JRDoc_EN("Sets whether rotation on the Y axis is frozen.")
  @JRDoc_PT("Define se a rotação no eixo Y está travada.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezeRY(boolean enabled) {}

  @JRDoc_EN("Returns whether rotation on the Z axis is frozen.")
  @JRDoc_PT("Retorna se a rotação no eixo Z está travada.")
  @HideGetSet
  public boolean isFreezeRZ() {

    return false;
  }

  @JRDoc_EN("Sets whether rotation on the Z axis is frozen.")
  @JRDoc_PT("Define se a rotação no eixo Z está travada.")
  @HideGetSet
  @MethodArgs({"enabled"})
  public void setFreezeRZ(boolean enabled) {}
}
