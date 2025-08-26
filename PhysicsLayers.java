package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

public class PhysicsLayers {

  private PhysicsLayers() {}

  @JRDoc_EN("Finds the PhysicsLayer with the specified name.")
  @JRDoc_PT("Busca a PhysicsLayer com o nome especificado.")
  @MethodArgs({"name"})
  public static PhysicsLayer findByName(String name) {

    return null;
  }

  @JRDoc_EN("Adds the specified PhysicsLayer.")
  @JRDoc_PT("Adiciona a PhysicsLayer especificada.")
  @MethodArgs({"layer"})
  public static void add(PhysicsLayer layer) {}

  @JRDoc_EN("Removes the specified PhysicsLayer.")
  @JRDoc_PT("Remove a PhysicsLayer especificada.")
  @MethodArgs({"layer"})
  public static void remove(PhysicsLayer layer) {}

  @JRDoc_EN("Applies the changes. Call after adding or removing Layers.")
  @JRDoc_PT("Aplica as alterações. Chame após adicionar ou remover Layers.")
  public static void apply() {}

  @JRDoc_EN("Returns a list of all PhysicsLayers.")
  @JRDoc_PT("Retorna uma lista de todas as PhysicsLayers.")
  public static List<PhysicsLayer> getLayersList() {

    return null;
  }

  @JRDoc_EN("Returns the number of PhysicsLayers.")
  @JRDoc_PT("Retorna o número de PhysicsLayers.")
  public static int layersCount() {

    return 0;
  }

  @JRDoc_EN("Returns the PhysicsLayer at the specified index.")
  @JRDoc_PT("Retorna a PhysicsLayer no índice especificado.")
  @MethodArgs({"index"})
  public static PhysicsLayer layerAt(int i) {

    return null;
  }
}
