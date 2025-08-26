package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"HPOP", "Components"})
public final class HPOP extends Component {

  public static class SearchResult {

    @JRDoc_EN("Returns the index of the HPOP search result.")
    @JRDoc_PT("Retorna o índice do resultado da busca do HPOP.")
    @HideGetSet
    public int getIndex() {

      return 0;
    }

    @JRDoc_EN("Sets the index of the HPOP search result.")
    @JRDoc_PT("Define o índice do resultado da busca do HPOP.")
    @HideGetSet
    public void setIndex(int index) {}

    @JRDoc_EN("Returns the squared distance of the HPOP search result.")
    @JRDoc_PT("Retorna a distância ao quadrado do resultado da busca do HPOP.")
    @HideGetSet
    public float getSquaredDistance() {

      return 0;
    }

    @JRDoc_EN("Sets the squared distance of the HPOP search result.")
    @JRDoc_PT("Define a distância ao quadrado do resultado da busca do HPOP.")
    @HideGetSet
    public void setSquaredDistance(float squaredDistance) {}

    @JRDoc_EN("Returns the distance of the HPOP search result.")
    @JRDoc_PT("Retorna a distância do resultado da busca do HPOP.")
    @HideGetSet
    public float getDistance() {

      return 0;
    }

    @JRDoc_EN("Sets the distance of the HPOP search result.")
    @JRDoc_PT("Define a distância do resultado da busca do HPOP.")
    @HideGetSet
    public void setDistance(float distance) {}
  }

  public HPOP() {

    super();
  }

  @JRDoc_EN("Checks if the maximum render distance is enabled.")
  @JRDoc_PT("Verifica se a distância máxima de renderização está habilitada.")
  @HideGetSet
  public boolean isMaxRenderDistanceEnabled() {

    return false;
  }

  @JRDoc_EN("Sets whether the maximum render distance is enabled.")
  @JRDoc_PT("Define se a distância máxima de renderização está habilitada.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxRenderDistanceEnabled(boolean value) {}

  @JRDoc_EN("Returns the maximum render distance.")
  @JRDoc_PT("Retorna a distância máxima de renderização.")
  @HideGetSet
  public float getMaxRenderDistance() {

    return 0;
  }

  @JRDoc_EN("Sets the maximum render distance.")
  @JRDoc_PT("Define a distância máxima de renderização.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setMaxRenderDistance(float value) {}

  @JRDoc_EN("Adds an HPO at the specified position and returns its index.")
  @JRDoc_PT("Adiciona um HPO na posição especificada e retorna seu índice.")
  @MethodArgs({"position"})
  public int addHPO(Vector3 position) {

    return 0;
  }

  @JRDoc_EN("Returns the count of HPOs in the current HPOP.")
  @JRDoc_PT("Retorna a quantidade de HPOs no HPOP atual.")
  public int getHPOCount() {

    return 0;
  }

  @JRDoc_EN("Returns the position of the HPO at the specified index.")
  @JRDoc_PT("Retorna a posição do HPO no índice especificado.")
  @MethodArgs({"index"})
  public Vector3 getPositionOf(int index) {

    return null;
  }

  @JRDoc_EN("Changes the position of the HPO at the specified index.")
  @JRDoc_PT("Altera a posição do HPO no índice especificado.")
  @MethodArgs({"index", "position"})
  public void changePosition(int index, Vector3 position) {}

  @JRDoc_EN("Returns the rotation of the HPO at the specified index.")
  @JRDoc_PT("Retorna a rotação do HPO no índice especificado.")
  @MethodArgs({"index"})
  public Quaternion getRotationOf(int index) {

    return null;
  }

  @JRDoc_EN("Changes the rotation of the HPO at the specified index.")
  @JRDoc_PT("Altera a rotação do HPO no índice especificado.")
  @MethodArgs({"index", "rotation"})
  public void changeRotation(int index, Quaternion rotation) {}

  @JRDoc_EN("Returns the scale of the HPO at the specified index.")
  @JRDoc_PT("Retorna a escala do HPO no índice especificado.")
  @MethodArgs({"index"})
  public Vector3 getScaleOf(int index) {

    return null;
  }

  @JRDoc_EN("Changes the scale of the HPO at the specified index.")
  @JRDoc_PT("Altera a escala do HPO no índice especificado.")
  @MethodArgs({"index", "scale"})
  public void changeScale(int index, Vector3 scale) {}

  @JRDoc_EN("Deletes multiple HPOs based on the provided search results.")
  @JRDoc_PT("Exclui vários HPOs com base nos resultados de busca fornecidos.")
  @MethodArgs({"searchResultList"})
  public void deleteHPOs(List<SearchResult> searchResultList) {}

  @JRDoc_EN("Deletes the HPO at the specified index.")
  @JRDoc_PT("Exclui o HPO no índice especificado.")
  @MethodArgs({"index"})
  public void deleteHPO(int index) {}

  @JRDoc_EN("Finds and returns all HPOs within a specified circle defined by center and radius.")
  @JRDoc_PT("Encontra e retorna todos os HPOs dentro de um círculo especificado pelo centro e raio.")
  @MethodArgs({"center", "radius"})
  public List<SearchResult> findInCircle(Vector3 center, float radius) {

    return null;
  }

  @JRDoc_EN("Finds and returns all HPOs within a specified sphere defined by center and radius.")
  @JRDoc_PT("Encontra e retorna todos os HPOs dentro de uma esfera especificada pelo centro e raio.")
  @MethodArgs({"center", "radius"})
  public List<SearchResult> findInSphere(Vector3 center, float radius) {

    return null;
  }

  @JRDoc_EN("Finds and returns all HPOs within a rectangular area defined by two corners: min and max.")
  @JRDoc_PT("Encontra e retorna todos os HPOs dentro de uma área retangular definida por dois cantos: min e max.")
  @MethodArgs({"min", "max"})
  public List<SearchResult> findInSquare(Vector2 min, Vector2 max) {

    return null;
  }
}
