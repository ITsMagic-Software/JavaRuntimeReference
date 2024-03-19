package JAVARuntime;

//
import java.io.File;
import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class Camera extends Component{
    public static final int PROJECTION_3D = 0;
    public static final int PROJECTION_2D = 1;

    public static final int BACKGROUND_SKYBOX = 0;
    public static final int BACKGROUND_ALPHA = 1;

    //

    public Camera() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getRenderDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderDistance(float value){
        //
    }

    @HideGetSet
    public float getMinimalDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinimalDistance(float value){
        //
    }

    @HideGetSet
    public float getFov(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFov(float value){
        //
    }

    @HideGetSet
    public int getRenderPercentage(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderPercentage(int value){
        //
    }

    @HideGetSet
    public int getLayer(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayer(int value){
        //
    }

    @HideGetSet
    public float getOrthoDiameter(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOrthoDiameter(float value){
        //
    }

    @HideGetSet
    public int getProjection(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setProjection(int value){
        //
    }

    @HideGetSet
    public int getBackground(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBackground(int value){
        //
    }

    @HideGetSet
    public CameraObjectFilter getObjectFilter(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"filter"})
    public void setObjectFilter(CameraObjectFilter filter){
        //
    }

    @MethodArgs(args ={"worldPosition"})
    public Point2 worldToScreenCoordinates(Vector3 worldPosition){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"x","y"})
    public RayDirection screenPointRay(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"screenCoords"})
    public RayDirection screenPointRay(Point2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args ={"x","y"})
    public RayDirection screenPointRay(float x, float y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"screenCoords"})
    public RayDirection screenPointRay(Vector2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args ={"x","y"})
    public Vector3 screenPointNormal(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"screenCoords"})
    public Vector3 screenPointNormal(Point2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args ={"x","y"})
    public Vector3 screenPointNormal(float x, float y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"screenCoords"})
    public Vector3 screenPointNormal(Vector2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args ={"folder","outputFile"})
    public void takeScreenShot(String folder, String outputFile){
        outputFile = outputFile + ".png";
        takeScreenShot(folder, outputFile, false);
    }
    @MethodArgs(args ={"folder","outputFile","bypassFileChecking"})
    public void takeScreenShot(String folder, String outputFile, boolean bypassFileChecking){
        //
    }
    @MethodArgs(args ={"folder","outputFile"})
    public void takeScreenShot(File folder, String outputFile){
        //
    }

    @UnimplementedDoc
    @MethodArgs(args ={"modelRenderer"})
    public boolean isVisible(ModelRenderer modelRenderer){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","object"})
    public boolean isVisible(Vertex vertex, SpatialObject object){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","transform"})
    public boolean isVisible(Vertex vertex, Transform transform){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","renderMatrix"})
    public boolean isVisible(Vertex vertex, float[] renderMatrix){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","radius"})
    public boolean isSphereVisible(Vector3 position, float radius) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z","radius"})
    public boolean isSphereVisible(float x, float y, float z, float radius) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"transform","radius"})
    public boolean isSphereVisible(Transform transform, float radius) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","size"})
    public boolean isCubeVisible(Vector3 position, float size) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z","size"})
    public boolean isCubeVisible(float x, float y, float z, float size) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"object"})
    public boolean isPointVisible(SpatialObject object) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"transform"})
    public boolean isPointVisible(Transform transform) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position"})
    public boolean isPointVisible(Vector3 position) {
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z"})
    public boolean isPointVisible(float x, float y, float z) {
        //
        return false;
        //

        //
    }

    public float[] getViewMatrix() {
        //
        return null;
        //

        //
    }
    public float[] getProjectionMatrix() {
        //
        return null;
        //

        //
    }

    public ArrayList getFilters(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"id"})
    public CameraFilter getFilter(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"tittle"})
    public CameraFilter getFilter(String tittle){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"classReference"})
    public CameraFilter getFilter(Class classReference){
        //
        return null;
        //

        //
    }
    public int getFilterCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"filters"})
    public void setFilters(ArrayList filters){
        //
    }
    @MethodArgs(args ={"cameraFilter"})
    public void addFilter(CameraFilter cameraFilter){
        //
    }
    @MethodArgs(args ={"cameraFilter"})
    public void removeFilter(CameraFilter cameraFilter){
        //
    }

    public void recalculateMatrices(){
        //
    }

    public enum FreeAspectResolutionSide {
        Width, Height
    }
    //

    public enum ResolutionMode {
        Percentage, FixedResolution, FreeAspectResolution
    }
    //

    public int determineImageResolutionPercentage(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getExposure(){
        //
        return 0;
        //

        //
    }


    @HideGetSet
    public int getFixedResolutionPixelsHeight(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFixedResolutionPixelsHeight(int value){
        //
    }

    @HideGetSet
    public int getFixedResolutionPixelsWidth(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFixedResolutionPixelsWidth(int value){
        //
    }

    @HideGetSet
    public FreeAspectResolutionSide getFreeAspectResolutionSide(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFreeAspectResolutionSide(FreeAspectResolutionSide value){
        //
    }

    @HideGetSet
    public int getFreeResolutionPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFreeResolutionPixels(int value){
        //
    }

    @HideGetSet
    public float[] getFrustumMatrix(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getGamma(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float[] getHierarchyCameraMatrix(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getImageHeight(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getImageRatio(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getImageWidth(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float[] getInverseFrustumMatrix(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float[] getInverseViewMatrix(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getNearPlane(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public float getFarPlane(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getRectHeight(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public float getScaledRectHeight(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectHeight(float value){
        //
    }

    @HideGetSet
    public float getRectPosX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public float getScaledRectPosX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectPosX(float value){
        //
    }

    @HideGetSet
    public float getRectPosY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public float getScaledRectPosY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectPosY(float value){
        //
    }

    @HideGetSet
    public float getRectWidth(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public float getScaledRectWidth(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectWidth(float value){
        //
    }

    @HideGetSet
    public Vector3 getRenderCameraDirection(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Vector3 getRenderCameraPosition(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ResolutionMode getResolutionMode(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolutionMode(ResolutionMode value){
        //
    }

    @HideGetSet
    public FrameBuffer getFrameBuffer() {
        //
        return null;
        //

        //
    }

    //
}
