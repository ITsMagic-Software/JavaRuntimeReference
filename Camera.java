package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Filter;
//>REMOVE-BRIDGE<
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

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"component"})
    public Camera(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Camera() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRenderDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.renderDistance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.renderDistance = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMinimalDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMinimalDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinimalDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setMinimalDistance(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFov(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.fov;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFov(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.fov = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getRenderPercentage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.renderPercentage;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderPercentage(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.renderPercentage = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getLayer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.layer;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLayer(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.layer = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getOrthoDiameter(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.ortho_diameter;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setOrthoDiameter(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.ortho_diameter = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getProjection(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.getProjection() == com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.Projection.Orthographic){
            return PROJECTION_2D;
        }
        return PROJECTION_3D;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setProjection(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == PROJECTION_2D) {
            instance.setProjection(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.Projection.Orthographic);
        } else {
            instance.setProjection(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.Projection.Perspective);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getBackground(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.getBackgroundType() == com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.BackgroundType.Alpha){
            return BACKGROUND_ALPHA;
        }
        return BACKGROUND_SKYBOX;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBackground(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == BACKGROUND_ALPHA) {
            instance.setBackgroundType(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.BackgroundType.Alpha);
        } else if(value == BACKGROUND_SKYBOX) {
            instance.setBackgroundType(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.BackgroundType.Skybox);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public CameraObjectFilter getObjectFilter(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.instance.cameraObjectFilter;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"filter"})
    public void setObjectFilter(CameraObjectFilter filter){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.instance.cameraObjectFilter = filter;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldPosition"})
    public Point2 worldToScreenCoordinates(Vector3 worldPosition){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector2 v = instance.worldToScreenCoordinates(worldPosition.instance);
        return new Point2(v);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public RayDirection screenPointRay(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenPointToWorldRay(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"screenCoords"})
    public RayDirection screenPointRay(Point2 screenCoords){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenPointToWorldRay(screenCoords.getX(), screenCoords.getY()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"x","y"})
    public RayDirection screenPointRay(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenPointToWorldRay((int)x, (int)y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"screenCoords"})
    public RayDirection screenPointRay(Vector2 screenCoords){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenPointToWorldRay((int)screenCoords.getX(), (int)screenCoords.getY()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"x","y"})
    public Vector3 screenPointNormal(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenCoordToWorldNormal((int)x, (int)y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"screenCoords"})
    public Vector3 screenPointNormal(Point2 screenCoords){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenCoordToWorldNormal(screenCoords.getX(), screenCoords.getY()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"x","y"})
    public Vector3 screenPointNormal(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenCoordToWorldNormal((int)x, (int)y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"screenCoords"})
    public Vector3 screenPointNormal(Vector2 screenCoords){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.screenCoordToWorldNormal((int)screenCoords.getX(), (int)screenCoords.getY()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"folder","outputFile"})
    public void takeScreenShot(String folder, String outputFile){
        outputFile = outputFile + ".png";
        takeScreenShot(folder, outputFile, false);
    }
    @MethodArgs(args ={"folder","outputFile","bypassFileChecking"})
    public void takeScreenShot(String folder, String outputFile, boolean bypassFileChecking){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        outputFile = outputFile + ".png";
        String fullpath = folder + "/" + outputFile;
        if(!bypassFileChecking) {
            JAVARuntime.File file = new JAVARuntime.File(fullpath);
            file.isAccessible();
        }
        instance.takeScreenShot(folder + "/" + outputFile);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"folder","outputFile"})
    public void takeScreenShot(File folder, String outputFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        outputFile = outputFile + ".png";
        JAVARuntime.File file = new JAVARuntime.File(folder, outputFile);
        file.isAccessible();
        instance.takeScreenShot(folder.getAbsolutePath() + "/" + outputFile);
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"modelRenderer"})
    public boolean isVisible(ModelRenderer modelRenderer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(modelRenderer.myObject == null) throw new RuntimeException("ModelRenderer should be active on a object");
        if(modelRenderer.component.getVertex() == null) return false;
        return instance.isVisible(modelRenderer.component.getVertex(), modelRenderer.myObject.getTransform().transform);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","object"})
    public boolean isVisible(Vertex vertex, SpatialObject object){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isVisible(vertex.vertex, object.getTransform().transform);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","transform"})
    public boolean isVisible(Vertex vertex, Transform transform){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isVisible(vertex.vertex, transform.transform);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"vertex","renderMatrix"})
    public boolean isVisible(Vertex vertex, float[] renderMatrix){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isVisible(vertex.vertex, renderMatrix);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","radius"})
    public boolean isSphereVisible(Vector3 position, float radius) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isSphereVisible(position.instance, radius);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z","radius"})
    public boolean isSphereVisible(float x, float y, float z, float radius) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isSphereVisible(x, y, z, radius);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"transform","radius"})
    public boolean isSphereVisible(Transform transform, float radius) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isSphereVisible(transform.transform, radius);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","size"})
    public boolean isCubeVisible(Vector3 position, float size) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isCubeVisible(position.instance, size);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z","size"})
    public boolean isCubeVisible(float x, float y, float z, float size) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isCubeVisible(x, y, z, size);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"object"})
    public boolean isPointVisible(SpatialObject object) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPointVisible(object.getGlobalPosition().instance);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"transform"})
    public boolean isPointVisible(Transform transform) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPointVisible(transform.getGlobalPosition().instance);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position"})
    public boolean isPointVisible(Vector3 position) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPointVisible(position.instance);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"x","y","z"})
    public boolean isPointVisible(float x, float y, float z) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isPointVisible(x, y, z);
        //>REMOVE-BRIDGE<
    }

    public float[] getViewMatrix() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.instance.getViewMatrix();
        //>REMOVE-BRIDGE<
    }
    public float[] getProjectionMatrix() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.instance.getFrustumMatrix();
        //>REMOVE-BRIDGE<
    }

    public ArrayList getFilters(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ArrayList filters = new ArrayList();
        for (Filter filter : instance.filters) {
            filters.add(filter.toJAVARuntime());
        }
        return filters;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public CameraFilter getFilter(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.filters.get(idx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle"})
    public CameraFilter getFilter(String tittle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.filters != null && !instance.filters.isEmpty()){
            for (Filter filter : instance.filters) {
                if(filter.getTittle().equals(tittle)){
                    return filter.toJAVARuntime();
                }
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"classReference"})
    public CameraFilter getFilter(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.filters != null && !instance.filters.isEmpty()){
            for (Filter filter : instance.filters) {
                if(classReference == filter.toJAVARuntime().getClass()){
                    return filter.toJAVARuntime();
                }
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public int getFilterCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.filters.size();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"filters"})
    public void setFilters(ArrayList filters){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.filters.clear();
        for (Object filter : filters) {
            addFilter((CameraFilter) filter);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"cameraFilter"})
    public void addFilter(CameraFilter cameraFilter){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(cameraFilter == null){
            throw new NullPointerException("Camera filter can't be null");
        }
        if( instance.filters == null){
            instance.filters = new ArrayList<>();
        }
        if(cameraFilter.javaFilter != null) {
            if (!instance.filters.contains(cameraFilter.javaFilter)) {
                instance.filters.add(cameraFilter.javaFilter);
            }
        } else {
            if (!instance.filters.contains(cameraFilter.filter)) {
                instance.filters.add(cameraFilter.filter);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"cameraFilter"})
    public void removeFilter(CameraFilter cameraFilter){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(cameraFilter == null){
            throw new NullPointerException("Camera filter can't be null");
        }
        if( instance.filters == null){
            instance.filters = new ArrayList<>();
        }
        if(cameraFilter.javaFilter != null) {
            instance.filters.remove(cameraFilter.javaFilter);
        } else {
            instance.filters.remove(cameraFilter.filter);
        }
        //>REMOVE-BRIDGE<
    }

    public void recalculateMatrices(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.recalculateMatrices();
        //>REMOVE-BRIDGE<
    }

    public enum FreeAspectResolutionSide {
        Width, Height
    }
    //<REMOVE-BRIDGE>
    private static FreeAspectResolutionSide ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.FreeAspectResolutionSide un){
        return FreeAspectResolutionSide.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.FreeAspectResolutionSide ENUMCONVERT(FreeAspectResolutionSide un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.FreeAspectResolutionSide.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum ResolutionMode {
        Percentage, FixedResolution, FreeAspectResolution
    }
    //<REMOVE-BRIDGE>
    private static ResolutionMode ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.ResolutionMode un){
        return ResolutionMode.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.ResolutionMode ENUMCONVERT(ResolutionMode un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.Camera.Camera.ResolutionMode.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public int determineImageResolutionPercentage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.determineImageResolutionPercentage();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getExposure(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getExposure();
        //>REMOVE-BRIDGE<
    }


    @HideGetSet
    public int getFixedResolutionPixelsHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getFixedResolutionPixelsHeight();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFixedResolutionPixelsHeight(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setFixedResolutionPixelsHeight( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getFixedResolutionPixelsWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getFixedResolutionPixelsWidth();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFixedResolutionPixelsWidth(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setFixedResolutionPixelsWidth( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public FreeAspectResolutionSide getFreeAspectResolutionSide(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getFreeAspectResolutionSide());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFreeAspectResolutionSide(FreeAspectResolutionSide value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setFreeAspectResolutionSide( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getFreeResolutionPixels(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getFreeResolutionPixels();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFreeResolutionPixels(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setFreeResolutionPixels( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float[] getFrustumMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        float[] returnValue = instance.getFrustumMatrix();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getGamma(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getGamma();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float[] getHierarchyCameraMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        float[] returnValue = instance.getHierarchyCameraMatrix();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getImageHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getImageHeight();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getImageRatio(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getImageRatio();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getImageWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getImageWidth();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float[] getInverseFrustumMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        float[] returnValue = instance.getInverseFrustumMatrix();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float[] getInverseViewMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        float[] returnValue = instance.getInverseViewMatrix();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getNearPlane(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getNearPlane();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getFarPlane(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getFarPlane();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRectHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRectHeight();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getScaledRectHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScaledRectHeight();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectHeight(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRectHeight( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRectPosX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRectPosX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getScaledRectPosX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScaledRectPosX();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectPosX(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRectPosX( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRectPosY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRectPosY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getScaledRectPosY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScaledRectPosY();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectPosY(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRectPosY( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRectWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRectWidth();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getScaledRectWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScaledRectWidth();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRectWidth(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRectWidth( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getRenderCameraDirection(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getRenderCameraDirection();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector3 getRenderCameraPosition(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getRenderCameraPosition();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ResolutionMode getResolutionMode(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getResolutionMode());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolutionMode(ResolutionMode value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setResolutionMode( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public FrameBuffer getFrameBuffer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(this.instance.imageBuffer != null) {
            return this.instance.imageBuffer.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    @MethodArgs(args ={"componentA","componentB"})
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, Camera.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return instance;
    }
    //>REMOVE-BRIDGE<
}
