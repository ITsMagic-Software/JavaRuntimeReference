package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

@ClassCategory(cat = {"Physics"})
public final class AreaTrigger extends PhysicsEntity {

  public AreaTrigger() {

    super();
  }

  @JRDoc_EN("Returns whether an object with the specified name has entered the area trigger.")
  @JRDoc_PT("Retorna se um objeto com o nome especificado entrou no gatilho de área.")
  @MethodArgs({"objectName"})
  public boolean triggerWithName(String objectName) {

    return false;
  }

  @JRDoc_EN("Returns whether any object has entered the area trigger.")
  @JRDoc_PT("Retorna se algum objeto entrou no gatilho de área.")
  public boolean isTriggering() {

    return false;
  }

  @JRDoc_EN("Returns a list of Collisions that have occurred in the area trigger.")
  @JRDoc_PT("Retorna uma lista de Colisões que ocorreram no gatilho de área.")
  public List<Collision> getTriggerList() {

    return null;
  }

  @JRDoc_EN("Returns the Collision that occurred in the area trigger at the specified index.")
  @JRDoc_PT("Retorna a Colisão que ocorreu no gatilho de área no índice especificado.")
  @MethodArgs({"id"})
  public JAVARuntime.Collision getTrigger(int idx) {

    return null;
  }

  @JRDoc_EN("Returns the PhysicsLayer of the AreaTrigger.")
  @JRDoc_PT("Retorna a PhysicsLayer do AreaTrigger.")
  @HideGetSet
  public JAVARuntime.PhysicsLayer getPhysicsLayer() {

    return null;
  }

  @JRDoc_EN("Sets the PhysicsLayer of the AreaTrigger to the specified layer.")
  @JRDoc_PT("Define a PhysicsLayer do AreaTrigger para o layer especificado.")
  @HideGetSet
  @MethodArgs({"layer"})
  public void setPhysicsLayer(PhysicsLayer layer) {}
}
