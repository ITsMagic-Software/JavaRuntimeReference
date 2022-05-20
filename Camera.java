package JAVARuntime;

//
import java.io.File;
import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat={"Components"})
public class Camera extends Component{
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
    public void setOrthoDiameter(float value){
        //
    }

    @HideGetSet
    public boolean isDynamicResolution(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setDynamicResolution(boolean value){
        //
    }

    @HideGetSet
    public int getTargetFPS(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setTargetFPS(int value){
        //
    }

    @HideGetSet
    public int getMinResolution(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMinResolution(int value){
        //
    }

    @HideGetSet
    public int getMaxResolution(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMaxResolution(int value){
        //
    }

    @HideGetSet
    public float getDrUpdateDelay(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setDrUpdateDelay(float value){
        //
    }

    @HideGetSet
    public int getIncrementLimit(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setIncrementLimit(int value){
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"filter"})
    public void setObjectFilter(CameraObjectFilter filter){
        //
    }

    @MethodArgs(args={"x","y"})
    public RayDirection screenPointRay(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"screenCoords"})
    public RayDirection screenPointRay(Point2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"x","y"})
    public RayDirection screenPointRay(float x, float y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"screenCoords"})
    public RayDirection screenPointRay(Vector2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"x","y"})
    public Vector3 screenPointNormal(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"screenCoords"})
    public Vector3 screenPointNormal(Point2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"x","y"})
    public Vector3 screenPointNormal(float x, float y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"screenCoords"})
    public Vector3 screenPointNormal(Vector2 screenCoords){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"folder","outputFile"})
    public void takeScreenShot(String folder, String outputFile){
        takeScreenShot(folder, outputFile, false);
    }
    @MethodArgs(args={"folder","outputFile","bypassFileChecking"})
    public void takeScreenShot(String folder, String outputFile, boolean bypassFileChecking){
        //
    }
    @MethodArgs(args={"folder","outputFile"})
    public void takeScreenShot(File folder, String outputFile){
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
    @MethodArgs(args={"id"})
    public CameraFilter getFilter(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"tittle"})
    public CameraFilter getFilter(String tittle){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"classReference"})
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
    @MethodArgs(args={"filters"})
    public void setFilters(ArrayList filters){
        //
    }
    @MethodArgs(args={"cameraFilter"})
    public void addFilter(CameraFilter cameraFilter){
        //
    }
    @MethodArgs(args={"cameraFilter"})
    public void removeFilter(CameraFilter cameraFilter){
        //
    }

    public void recalculateMatrices(){
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
