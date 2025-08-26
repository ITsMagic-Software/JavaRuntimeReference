package JAVARuntime;

public class PhysicsLayer {

  @MethodArgs({"name"})
  public PhysicsLayer(String name) {}

  @JRDoc_EN("Adds the specified PhysicsLayer to the ignore list of this layer.")
  @JRDoc_PT("Adiciona a PhysicsLayer especificada à lista de ignorados desta layer.")
  @MethodArgs({"layer"})
  public void addIgnoreLayer(PhysicsLayer layer) {}

  @JRDoc_EN("Removes the specified PhysicsLayer from the ignore list of this layer.")
  @JRDoc_PT("Remove a PhysicsLayer especificada da lista de ignorados desta layer.")
  @MethodArgs({"layer"})
  public void removeIgnoreLayer(PhysicsLayer layer) {}

  @JRDoc_EN("Returns the PhysicsLayer at the specified index in the ignore list.")
  @JRDoc_PT("Retorna a PhysicsLayer no índice especificado da lista de ignorados.")
  @MethodArgs({"index"})
  public PhysicsLayer getIgnoreAt(int idx) {

    return null;
  }

  @JRDoc_EN("Returns the number of PhysicsLayers in the ignore list.")
  @JRDoc_PT("Retorna o número de PhysicsLayers na lista de ignorados.")
  public int ignoreCount() {

    return 0;
  }
}
