package JAVARuntime;

import java.io.File;
import java.util.ArrayList;

/** @Author Lucas Leandro (ITsMagic Founder) MethodArgs filled by Carlos at 22-04-2022 */
@ClassCategory(cat = {"Rendering", "Components"})
public final class Camera extends Component {
  public static final int PROJECTION_3D = 0;
  public static final int PROJECTION_2D = 1;

  public static final int BACKGROUND_SKYBOX = 0;
  public static final int BACKGROUND_ALPHA = 1;

  public class InternalFiltering {
    public boolean renderFog() {

      return false;
    }

    public boolean filterLight(Light light) {

      return false;
    }

    public boolean filterRenderer(ModelRenderer renderer) {

      return false;
    }

    public boolean filterRenderer(SkinnedModelRenderer renderer) {

      return false;
    }

    public boolean filterMaterialBake(Material material, Vertex bake) {

      return false;
    }

    public boolean renderParticles() {

      return false;
    }

    public boolean filterParticle(ParticleEmitter renderer) {

      return false;
    }

    public boolean renderGizmos() {

      return false;
    }

    public boolean filterGizmo(GizmoElement gizmoElement) {

      return false;
    }

    public boolean filter3DText(Text3D text3D) {

      return false;
    }

    public boolean renderTerrains() {

      return false;
    }

    public boolean filterTerrain(STerrain terrain) {

      return false;
    }

    public boolean filterHPOP(HPOP hpop) {

      return false;
    }

    public boolean filterShadow() {

      return false;
    }

    public boolean renderReflections() {

      return false;
    }

    public Color overrideAmbientLight() {

      return null;
    }

    public Color overrideIndirectLight() {

      return null;
    }
  }

  private final InternalFiltering internalFiltering = new InternalFiltering();

  public Camera() {

    super();
  }

  public InternalFiltering getInternalFiltering() {
    return internalFiltering;
  }

  @JRDoc_EN("Returns the camera's render distance.")
  @JRDoc_PT("Retorna a distância de renderização da câmera.")
  @HideGetSet
  public float getRenderDistance() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's render distance.")
  @JRDoc_PT("Define a distância de renderização da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRenderDistance(float value) {}

  @JRDoc_EN("Returns the minimal render distance.")
  @JRDoc_PT("Retorna a distância mínima de renderização.")
  @HideGetSet
  public float getMinimalDistance() {

    return 0;
  }

  @JRDoc_EN("Sets the minimal render distance.")
  @JRDoc_PT("Define a distância mínima de renderização.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setMinimalDistance(float value) {}

  @JRDoc_EN("Returns the camera's field of view (FOV).")
  @JRDoc_PT("Retorna o campo de visão (FOV) da câmera.")
  @HideGetSet
  public float getFov() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's field of view (FOV).")
  @JRDoc_PT("Define o campo de visão (FOV) da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFov(float value) {}

  @JRDoc_EN("Returns the camera's render resolution percentage.")
  @JRDoc_PT("Retorna a porcentagem de resolução da renderização da câmera.")
  @HideGetSet
  public int getRenderPercentage() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's render resolution percentage.")
  @JRDoc_PT("Define a porcentagem de resolução da renderização da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRenderPercentage(int value) {}

  @JRDoc_EN("Returns the camera's rendering layer.")
  @JRDoc_PT("Retorna a camada de renderização da câmera.")
  @HideGetSet
  public int getLayer() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's rendering layer.")
  @JRDoc_PT("Define a camada de renderização da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setLayer(int value) {}

  @JRDoc_EN("Returns the diameter of the orthographic projection (2D).")
  @JRDoc_PT("Retorna o diâmetro da projeção ortográfica (2D).")
  @HideGetSet
  public float getOrthoDiameter() {

    return 0;
  }

  @JRDoc_EN("Sets the diameter of the orthographic projection (2D).")
  @JRDoc_PT("Define o diâmetro da projeção ortográfica (2D).")
  @HideGetSet
  @MethodArgs({"value"})
  public void setOrthoDiameter(float value) {}

  @JRDoc_EN("Returns the camera's projection mode (2D or 3D).")
  @JRDoc_PT("Retorna o modo de projeção da câmera (2D ou 3D).")
  @HideGetSet
  public int getProjection() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's projection mode (2D or 3D).")
  @JRDoc_PT("Define o modo de projeção da câmera (2D ou 3D).")
  @HideGetSet
  @MethodArgs({"value"})
  public void setProjection(int value) {}

  @JRDoc_EN("Returns the camera's background mode (Skybox or Alpha).")
  @JRDoc_PT("Retorna o modo de fundo da câmera (Skybox ou Alpha).")
  @HideGetSet
  public int getBackground() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's background mode (Skybox or Alpha).")
  @JRDoc_PT("Define o modo de fundo da câmera (Skybox ou Alpha).")
  @HideGetSet
  @MethodArgs({"value"})
  public void setBackground(int value) {}

  @JRDoc_EN("Returns the object filter applied to the camera.")
  @JRDoc_PT("Retorna o filtro de objetos aplicado à câmera.")
  @HideGetSet
  public CameraObjectFilter getObjectFilter() {

    return null;
  }

  @JRDoc_EN("Sets an object filter for the camera.")
  @JRDoc_PT("Define um filtro de objetos para a câmera.")
  @HideGetSet
  @MethodArgs({"filter"})
  public void setObjectFilter(CameraObjectFilter filter) {}

  @JRDoc_EN("Converts a world position to screen coordinates.")
  @JRDoc_PT("Converte uma posição no mundo para coordenadas de tela.")
  @MethodArgs({"worldPosition"})
  public Point2 worldToScreenCoordinates(Vector3 worldPosition) {

    return null;
  }

  @JRDoc_EN("Returns a ray that originates from the camera and points toward the specified coordinates.")
  @JRDoc_PT("Retorna um raio que sai da câmera e aponta na direção das coordenadas especificadas.")
  @MethodArgs({"x", "y"})
  public RayDirection screenPointRay(int x, int y) {

    return null;
  }

  @JRDoc_EN("Returns a ray that originates from the camera and points toward the specified Point2.")
  @JRDoc_PT("Retorna um raio que sai da câmera e aponta na direção do Point2 especificado.")
  @MethodArgs({"screenCoords"})
  public RayDirection screenPointRay(Point2 screenCoords) {

    return null;
  }

  @JRDoc_EN("Returns a ray that originates from the camera and points toward the specified coordinates.")
  @JRDoc_PT("Retorna um raio que sai da câmera e aponta na direção das coordenadas especificadas.")
  @MethodArgs({"x", "y"})
  public RayDirection screenPointRay(float x, float y) {

    return null;
  }

  @JRDoc_EN("Returns a ray that originates from the camera and points toward the specified Vector2.")
  @JRDoc_PT("Retorna um raio que sai da câmera e aponta na direção do Vector2 especificado.")
  @MethodArgs({"screenCoords"})
  public RayDirection screenPointRay(Vector2 screenCoords) {

    return null;
  }

  @JRDoc_EN("Returns the camera's normal vector at the position of the specified coordinates.")
  @JRDoc_PT("Retorna o vetor normal da câmera na posição das coordenadas especificadas.")
  @MethodArgs({"x", "y"})
  public Vector3 screenPointNormal(int x, int y) {

    return null;
  }

  @JRDoc_EN("Returns the camera's normal vector at the position of the specified Point2.")
  @JRDoc_PT("Retorna o vetor normal da câmera na posição do Point2 especificado.")
  @MethodArgs({"screenCoords"})
  public Vector3 screenPointNormal(Point2 screenCoords) {

    return null;
  }

  @JRDoc_EN("Returns the camera's normal vector at the position of the specified coordinates.")
  @JRDoc_PT("Retorna o vetor normal da câmera na posição das coordenadas especificadas.")
  @MethodArgs({"x", "y"})
  public Vector3 screenPointNormal(float x, float y) {

    return null;
  }

  @JRDoc_EN("Returns the camera's normal vector at the position of the specified Vector2.")
  @JRDoc_PT("Retorna o vetor normal da câmera na posição do Vector2 especificado.")
  @MethodArgs({"screenCoords"})
  public Vector3 screenPointNormal(Vector2 screenCoords) {

    return null;
  }

  @JRDoc_EN("Takes a screenshot and saves it to the specified folder and filename.")
  @JRDoc_PT("Tira uma captura de tela e salva na pasta e nome de arquivo especificados.")
  @MethodArgs({"folder", "outputFile"})
  public void takeScreenShot(String folder, String outputFile) {
    outputFile = outputFile + ".png";
    takeScreenShot(folder, outputFile, false);
  }

  @JRDoc_EN("Takes a screenshot and saves it to the specified folder and filename. If 'bypassFileChecking' is false, verifies if the location exists and is accessible before saving.")
  @JRDoc_PT("Tira uma captura de tela e salva na pasta e nome de arquivo especificados. Se 'bypassFileChecking' for falso, verifica se o local existe e é acessível antes de salvar.")
  @MethodArgs({"folder", "outputFile", "bypassFileChecking"})
  public void takeScreenShot(String folder, String outputFile, boolean bypassFileChecking) {}

  @JRDoc_EN("Takes a screenshot and saves it to the specified folder and filename.")
  @JRDoc_PT("Tira uma captura de tela e salva na pasta e nome de arquivo especificados.")
  @MethodArgs({"folder", "outputFile"})
  public void takeScreenShot(File folder, String outputFile) {}

  @JRDoc_EN("Checks if a model is visible in the camera's view.")
  @JRDoc_PT("Verifica se um modelo está visível na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"modelRenderer"})
  public boolean isVisible(ModelRenderer modelRenderer) {

    return false;
  }

  @JRDoc_EN("Checks if a vertex is visible in a specified SpatialObject within the camera's view.")
  @JRDoc_PT("Verifica se um vertex está visível em um SpatialObject especificado na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"vertex", "object"})
  public boolean isVisible(Vertex vertex, SpatialObject object) {

    return false;
  }

  @JRDoc_EN("Checks if a vertex is visible at the position of a specified Transform in the camera's view.")
  @JRDoc_PT("Verifica se um vertex está visível na posição de um Transform especificado na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"vertex", "transform"})
  public boolean isVisible(Vertex vertex, Transform transform) {

    return false;
  }

  @JRDoc_EN("Checks if a vertex is visible in the specified render matrix within the camera's view.")
  @JRDoc_PT("Verifica se um vertex está visível na matriz de renderização especificada na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"vertex", "renderMatrix"})
  public boolean isVisible(Vertex vertex, float[] renderMatrix) {

    return false;
  }

  @JRDoc_EN("Checks if the position with the specified sphere radius is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição com o raio da esfera especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"position", "radius"})
  public boolean isSphereVisible(Vector3 position, float radius) {

    return false;
  }

  @JRDoc_EN("Checks if the position with the specified sphere radius is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição com o raio da esfera especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"x", "y", "z", "radius"})
  public boolean isSphereVisible(float x, float y, float z, float radius) {

    return false;
  }

  @JRDoc_EN("Checks if the position of the Transform with the specified sphere radius is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição do Transform com o raio da esfera especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"transform", "radius"})
  public boolean isSphereVisible(Transform transform, float radius) {

    return false;
  }

  @JRDoc_EN("Checks if the position with the specified cube size is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição com o tamanho do cubo especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"position", "size"})
  public boolean isCubeVisible(Vector3 position, float size) {

    return false;
  }

  @JRDoc_EN("Checks if the position with the specified cube size is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição com o tamanho do cubo especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"x", "y", "z", "size"})
  public boolean isCubeVisible(float x, float y, float z, float size) {

    return false;
  }

  @JRDoc_EN("Checks if the center of the specified object is visible in the camera's view.")
  @JRDoc_PT("Verifica se o centro do objeto especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"object"})
  public boolean isPointVisible(SpatialObject object) {

    return false;
  }

  @JRDoc_EN("Checks if the specified transform is visible in the camera's view.")
  @JRDoc_PT("Verifica se o transform especificado está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"transform"})
  public boolean isPointVisible(Transform transform) {

    return false;
  }

  @JRDoc_EN("Checks if the specified position is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição especificada está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"position"})
  public boolean isPointVisible(Vector3 position) {

    return false;
  }

  @JRDoc_EN("Checks if the specified position is visible in the camera's view.")
  @JRDoc_PT("Verifica se a posição especificada está visíveis na visão da câmera.")
  @UnimplementedDoc
  @MethodArgs({"x", "y", "z"})
  public boolean isPointVisible(float x, float y, float z) {

    return false;
  }

  @JRDoc_EN("Returns the camera's view matrix.")
  @JRDoc_PT("Retorna a matriz de visão da câmera.")
  public float[] getViewMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the camera's projection matrix.")
  @JRDoc_PT("Retorna a matriz de projeção da câmera.")
  public float[] getProjectionMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the list of filters applied to the camera.")
  @JRDoc_PT("Retorna a lista de filtros aplicados à câmera.")
  public ArrayList getFilters() {

    return null;
  }

  @JRDoc_EN("Returns the camera filter at the specified index.")
  @JRDoc_PT("Retorna o filtro da câmera no índice especificado.")
  @MethodArgs({"id"})
  public CameraFilter getFilter(int idx) {

    return null;
  }

  @JRDoc_EN("Returns the camera filter with the specified name/title.")
  @JRDoc_PT("Retorna o filtro da câmera com o nome/título especificado.")
  @MethodArgs({"tittle"})
  public CameraFilter getFilter(String tittle) {

    return null;
  }

  @JRDoc_EN("Returns the camera filter that matches the specified class reference.")
  @JRDoc_PT("Retorna o filtro da câmera que corresponde à referência de classe especificada.")
  @MethodArgs({"classReference"})
  public CameraFilter getFilter(Class classReference) {

    return null;
  }

  @JRDoc_EN("Returns the number of filters applied to the camera.")
  @JRDoc_PT("Retorna o número de filtros aplicados à câmera.")
  public int getFilterCount() {

    return 0;
  }

  @JRDoc_EN("Sets the camera's filters to the specified list.")
  @JRDoc_PT("Define os filtros que tem na câmera para a lista especificada.")
  @MethodArgs({"filters"})
  public void setFilters(ArrayList filters) {}

  @JRDoc_EN("Adds the specified filter to the camera.")
  @JRDoc_PT("Adiciona o filtro especificado à câmera.")
  @MethodArgs({"cameraFilter"})
  public void addFilter(CameraFilter cameraFilter) {}

  @JRDoc_EN("Removes the specified filter from the camera.")
  @JRDoc_PT("Remove o filtro especificado da câmera.")
  @MethodArgs({"cameraFilter"})
  public void removeFilter(CameraFilter cameraFilter) {}

  @JRDoc_EN("Recalculates the camera matrices.")
  @JRDoc_PT("Recalcula as matrizes da câmera.")
  public void recalculateMatrices() {}

  public enum FreeAspectResolutionSide {
    Width,
    Height
  }

  public enum ResolutionMode {
    Percentage,
    FixedResolution,
    FreeAspectResolution
  }

  @JRDoc_EN("Define the percentage of the camera image resolution.")
  @JRDoc_PT("Define a porcentagem da resolução da imagem da câmera.")
  public int determineImageResolutionPercentage() {

    return 0;
  }

  @JRDoc_EN("Returns the camera's exposure level.")
  @JRDoc_PT("Retorna o nível de exposição da câmera.")
  @HideGetSet
  public float getExposure() {

    return 0;
  }

  @JRDoc_EN("Returns the fixed resolution height in pixels.")
  @JRDoc_PT("Retorna a altura da resolução fixa em pixels.")
  @HideGetSet
  public int getFixedResolutionPixelsHeight() {

    return 0;
  }

  @JRDoc_EN("Sets the fixed resolution height in pixels.")
  @JRDoc_PT("Define a altura da resolução fixa em pixels.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFixedResolutionPixelsHeight(int value) {}

  @JRDoc_EN("Returns the fixed resolution width in pixels.")
  @JRDoc_PT("Retorna a largura da resolução fixa em pixels.")
  @HideGetSet
  public int getFixedResolutionPixelsWidth() {

    return 0;
  }

  @JRDoc_EN("Sets the fixed resolution width in pixels.")
  @JRDoc_PT("Define a largura da resolução fixa em pixels.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFixedResolutionPixelsWidth(int value) {}

  @JRDoc_EN("Returns which side is used to determine the resolution in free aspect mode.")
  @JRDoc_PT("Retorna qual lado é utilizado para determinar a resolução no modo de aspecto livre.")
  @HideGetSet
  public FreeAspectResolutionSide getFreeAspectResolutionSide() {

    return null;
  }

  @JRDoc_EN("Sets which side should be used to determine the resolution in free aspect mode.")
  @JRDoc_PT("Define qual lado deve ser utilizado para determinar a resolução no modo de aspecto livre.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFreeAspectResolutionSide(FreeAspectResolutionSide value) {}

  @JRDoc_EN("Returns the pixel resolution used when in free resolution mode.")
  @JRDoc_PT("Retorna a resolução em pixels utilizada no modo de resolução livre.")
  @HideGetSet
  public int getFreeResolutionPixels() {

    return 0;
  }

  @JRDoc_EN("Sets the pixel resolution to be used in free resolution mode.")
  @JRDoc_PT("Define a resolução em pixels a ser utilizada no modo de resolução livre.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setFreeResolutionPixels(int value) {}

  @JRDoc_EN("Returns the view frustum matrix.")
  @JRDoc_PT("Retorna a matriz de frustum de visão.")
  @HideGetSet
  public float[] getFrustumMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the gamma correction level.")
  @JRDoc_PT("Retorna o nível de correção de gama.")
  @HideGetSet
  public float getGamma() {

    return 0;
  }

  @JRDoc_EN("Returns the hierarchical camera matrix.")
  @JRDoc_PT("Retorna a matriz hierárquica da câmera.")
  @HideGetSet
  public float[] getHierarchyCameraMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the image height in pixels.")
  @JRDoc_PT("Retorna a altura da imagem em pixels.")
  @HideGetSet
  public int getImageHeight() {

    return 0;
  }

  @JRDoc_EN("Returns the aspect ratio of the image.")
  @JRDoc_PT("Retorna a proporção da imagem.")
  @HideGetSet
  public float getImageRatio() {

    return 0;
  }

  @JRDoc_EN("Returns the image width in pixels.")
  @JRDoc_PT("Retorna a largura da imagem em pixels.")
  @HideGetSet
  public int getImageWidth() {

    return 0;
  }

  @JRDoc_EN("Returns the inverse view frustum matrix.")
  @JRDoc_PT("Retorna a matriz de frustum de visão invertida.")
  @HideGetSet
  public float[] getInverseFrustumMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the inverse view matrix.")
  @JRDoc_PT("Retorna a matriz de visão invertida.")
  @HideGetSet
  public float[] getInverseViewMatrix() {

    return null;
  }

  @JRDoc_EN("Returns the camera's near plane.")
  @JRDoc_PT("Retorna o near plane da câmera.")
  @HideGetSet
  public float getNearPlane() {

    return 0;
  }

  @JRDoc_EN("Returns the camera's far plane.")
  @JRDoc_PT("Retorna o far plane da câmera.")
  @HideGetSet
  public float getFarPlane() {

    return 0;
  }

  @JRDoc_EN("Returns the height of the camera's Rect.")
  @JRDoc_PT("Retorna a altura do Rect da câmera.")
  @HideGetSet
  public float getRectHeight() {

    return 0;
  }

  @JRDoc_EN("Returns the height scale of the camera's Rect.")
  @JRDoc_PT("Retorna a escala da altura do Rect da câmera.")
  @HideGetSet
  public float getScaledRectHeight() {

    return 0;
  }

  @JRDoc_EN("Sets the height of the camera's Rect.")
  @JRDoc_PT("Define a altura do Rect da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRectHeight(float value) {}

  @JRDoc_EN("Returns the X position of the camera's Rect.")
  @JRDoc_PT("Retorna a posição X do Rect da câmera.")
  @HideGetSet
  public float getRectPosX() {

    return 0;
  }

  @JRDoc_EN("Returns the X position scale of the camera's Rect.")
  @JRDoc_PT("Retorna a escala da posição X do Rect da câmera.")
  @HideGetSet
  public float getScaledRectPosX() {

    return 0;
  }

  @JRDoc_EN("Sets the X position of the camera's Rect.")
  @JRDoc_PT("Define a posição X do Rect da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRectPosX(float value) {}

  @JRDoc_EN("Returns the Y position of the camera's Rect.")
  @JRDoc_PT("Retorna a posição Y do Rect da câmera.")
  @HideGetSet
  public float getRectPosY() {

    return 0;
  }

  @JRDoc_EN("Returns the Y position scale of the camera's Rect.")
  @JRDoc_PT("Retorna a escala da posição Y do Rect da câmera.")
  @HideGetSet
  public float getScaledRectPosY() {

    return 0;
  }

  @JRDoc_EN("Sets the Y position of the camera's Rect.")
  @JRDoc_PT("Define a posição Y do Rect da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRectPosY(float value) {}

  @JRDoc_EN("Returns the width of the camera's Rect.")
  @JRDoc_PT("Retorna a largura do Rect da câmera.")
  @HideGetSet
  public float getRectWidth() {

    return 0;
  }

  @JRDoc_EN("Returns the width scale of the camera's Rect.")
  @JRDoc_PT("Retorna a escala da largura do Rect da câmera.")
  @HideGetSet
  public float getScaledRectWidth() {

    return 0;
  }

  @JRDoc_EN("Sets the width of the camera's Rect.")
  @JRDoc_PT("Define a largura do Rect da câmera.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setRectWidth(float value) {}

  @JRDoc_EN("Returns the camera's render direction.")
  @JRDoc_PT("Retorna a direção de renderização da camera.")
  @HideGetSet
  public Vector3 getRenderCameraDirection() {

    return null;
  }

  @JRDoc_EN("Returns the camera's render position.")
  @JRDoc_PT("Retorna a posição de renderização.")
  @HideGetSet
  public Vector3 getRenderCameraPosition() {

    return null;
  }

  @JRDoc_EN("Returns the camera's resolution mode.")
  @JRDoc_PT("Retorna o modo de resolução.")
  @HideGetSet
  public ResolutionMode getResolutionMode() {

    return null;
  }

  @JRDoc_EN("Sets the camera's resolution mode.")
  @JRDoc_PT("Define o modo de resolução.")
  @HideGetSet
  @MethodArgs({"value"})
  public void setResolutionMode(ResolutionMode value) {}

  @JRDoc_EN("Returns the current framebuffer of the camera.")
  @JRDoc_PT("Retorna o framebuffer atual da câmera.")
  @HideGetSet
  public FrameBuffer getFrameBuffer() {

    return null;
  }
}
