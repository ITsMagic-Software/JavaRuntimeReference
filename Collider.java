package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Physics", "Components"})
public final class Collider extends Component {
  public static final int SHAPE_BOX = 0;
  public static final int SHAPE_SPHERE = 1;
  public static final int SHAPE_CONVEX = 2;
  public static final int SHAPE_MODEL = 3;

  public Collider() {

    super();
  }

  @MethodArgs({"shape"})
  public Collider(int shape) {

    super();
  }

  @JRDoc_EN("Returns the shape type of the collider.")
  @JRDoc_PT("Retorna o tipo de forma do collider.")
  public int getShape() {

    return 0;
  }

  @JRDoc_EN("Sets the shape type of the collider.")
  @JRDoc_PT("Define o tipo de forma do collider.")
  @MethodArgs({"value"})
  public void setShape(int value) {}

  @JRDoc_EN("Sets the vertex file for the collider (deprecated, use setVertex instead).")
  @JRDoc_PT("Define o arquivo do vertex para o collider (obsoleto, use setVertex).")
  @HideGetSet
  @MethodArgs({"pFile"})
  public void setVertexFile(VertexFile pFile) {}

  @JRDoc_EN("Returns the position offset of the collider.")
  @JRDoc_PT("Retorna o deslocamento/offset de posição do collider.")
  @HideGetSet
  public Vector3 getPosition() {

    return null;
  }

  @JRDoc_EN("Sets the position offset of the collider.")
  @JRDoc_PT("Define o deslocamento/offset de posição do collider.")
  @HideGetSet
  @MethodArgs({"vector3"})
  public void setPosition(Vector3 vector3) {}

  @JRDoc_EN("Returns the scale of the collider.")
  @JRDoc_PT("Retorna a escala do collider.")
  @HideGetSet
  public Vector3 getScale() {

    return null;
  }

  @JRDoc_EN("Sets the scale of the collider.")
  @JRDoc_PT("Define a escala do collider.")
  @HideGetSet
  @MethodArgs({"vector3"})
  public void setScale(Vector3 vector3) {}

  @JRDoc_EN("Returns the collider vertex.")
  @JRDoc_PT("Retorna o vertex do collider.")
  @HideGetSet
  public Vertex getVertex() {

    return null;
  }

  @JRDoc_EN("Sets the vertex of the collider.")
  @JRDoc_PT("Define o vertex do collider.")
  @HideGetSet
  @MethodArgs({"vertex"})
  public void setVertex(Vertex vertex) {}

  @JRDoc_EN("Sets the convex vertex of the collider.")
  @JRDoc_PT("Define o vertex convexo do collider.")
  @HideGetSet
  @MethodArgs({"vertex"})
  public void setConvexVertex(Vertex vertex) {}

  @JRDoc_EN("Returns whether the collider is waiting in queue to load.")
  @JRDoc_PT("Retorna se o collider está aguardando na fila para carregar.")
  @HideGetSet
  public boolean isWaitingQueue() {

    return false;
  }

  @JRDoc_EN("Returns whether the collider is loaded.")
  @JRDoc_PT("Retorna se o collider está carregado.")
  @HideGetSet
  public boolean isLoaded() {

    return false;
  }
}
