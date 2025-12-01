package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Terrain","Components"})
public final class Terrain extends Component{

    public static class Layer{
        //

        public Layer() {
            //
        }

        @HideGetSet
        public Texture getAlbedo() {
            //
            return null;
            //

            //
        }
        @HideGetSet
        public Texture getNormal() {
            //
            return null;
            //

            //
        }

        @HideGetSet
        public float getSize() {
            //
            return 0;
            //

            //
        }
        @HideGetSet
        public void setSize(float size) {
            //
        }

        @HideGetSet
        public float getRoughness() {
            //
            return 0;
            //

            //
        }
        @HideGetSet
        public void setRoughness(float specular) {
            //
        }
    }

    //

    public Terrain() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getWidth(){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"value"})
    @HideGetSet
    public void setWidth(float v){
        //
    }

    @HideGetSet
    public float getMaxHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"value"})
    @HideGetSet
    public void setMaxHeight(float v){
        //
    }

    @MethodArgs({"x","z"})
    public boolean isInsideTerrain(float x, float z) {
        //
        return false;
        //

        //
    }
    public boolean isInsideTerrain(Vector3 worldCoord){
        //
        return false;
        //

        //
    }

    @MethodArgs({"worldCoord"})
    public Point2 nearestVerticeAt(Vector3 worldCoord){
        //
        return null;
        //

        //
    }

    @MethodArgs({"worldCoord"})
    public Point2 nearestLayerVerticeAt(Vector3 worldCoord){
        //
        return null;
        //

        //
    }

    @MethodArgs({"x","z"})
    public float getWorldY(float x, float z){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"worldCoord"})
    public float getWorldY(Vector3 worldCoord){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getResolution(){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"value"})
    @HideGetSet
    public void setResolution(int v){
        //
    }

    @MethodArgs({"point"})
    public float getHeight(Point2 point2){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"x","y"})
    public float getHeight(int x, int z){
        //
        return 0;
        //

        //
    }

    @MethodArgs({"point","height"})
    public void setHeight(Point2 point2, float height){
        //
    }
    @MethodArgs({"x","y","height"})
    public void setHeight(int x, int z, float height){
        //
    }

    @MethodArgs({"x","y","layerIndex"})
    public float getLayerIntensity(int x, int z, int layerIndex){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"x","y","layerIndex","intensity"})
    public void setLayerIntensity(int x, int z, int layerIndex, float intensity){
        //
    }

    public int getLayersCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs({"index"})
    public Layer getLayerAt(int i){
        //
        return null;
        //

        //
    }
    public void addLayer(Layer layer){
        //
    }

    @MethodArgs({"origin","direction"})
    public LaserHit traceRay(Vector3 origin, Vector3 direction){
        return traceRay(origin, direction, 0);
    }
    @MethodArgs({"origin","direction","distance"})
    public LaserHit traceRay(Vector3 origin, Vector3 direction, float distance){
        //
        return null;
        //

        //
    }

    @MethodArgs({"worldCoordinates", "intensity", "size", "brush"})
    public void applyRaiseLower(Vector2 worldCoordinates, float intensity, float size, Brush brush){
        //
    }
    @MethodArgs({"worldCoordinates", "intensity", "size", "textureSize", "layerIndex", "brush"})
    public void applyPaint(Vector2 worldCoordinates, float intensity, float size, float textureSize, int layerIndex, Brush brush){
        //
    }

    //
}
