package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Physics"})
public final class ObjectPhysics {

  @HideGetSet
  public <T extends PhysicsEntity> T getEntity() {

    return null;
  }

  @HideGetSet
  public void setEntity(PhysicsEntity physicsEntity) {}

  @HideGetSet
  public <T extends PhysicsEntity> T getPhysicsEntity() {

    return null;
  }

  @HideGetSet
  public void setPhysicsEntity(PhysicsEntity physicsEntity) {}

  @Deprecated
  @HideGetSet
  public VehiclePhysics getVehiclePhysics() {

    return null;
  }

  @Deprecated
  @HideGetSet
  @MethodArgs({"vehiclePhysics"})
  public void setVehiclePhysics(VehiclePhysics vehiclePhysics) {
    setPhysicsEntity(vehiclePhysics);
  }
}
