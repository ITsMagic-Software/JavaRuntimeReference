package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Components"})
public class Terrain extends Component{
    //

    public Terrain() {
        //
        super();
        //

        //
    }

    //

    public int getWidth(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setWidth(int v){
        //
    }
    public int getMaxHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setMaxHeight(int v){
        //
    }

    @MethodArgs(args={"worldCoord"})
    public Point2 nearestVerticeAt(Vector3 worldCoord){
        //
        return null;
        //

        //
    }

    public int getResolution(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setResolution(int v){
        //
    }
    @MethodArgs(args={"point"})
    public float getHeight(Point2 point2){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y"})
    public float getHeight(int x, int z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"point","height"})
    public void setHeight(Point2 point2, float height){
        //
    }
    @MethodArgs(args={"x","y","height"})
    public void setHeight(int x, int z, float height){
        //
    }
    public void apply(){
        //
    }

    @MethodArgs(args={"worldCoordinates", "intensity", "size", "brush"})
    public void applyRaiseLower(Vector3 worldCoordinates, float intensity, float size, Brush brush){
        //
    }
    @MethodArgs(args={"worldCoordinates", "intensity", "size", "brush"})
    public void applySmoother(Vector3 worldCoordinates, float intensity, float size, Brush brush){
        //
    }
    @MethodArgs(args={"worldCoordinates", "intensity", "size", "brush"})
    public void applyFlatter(Vector3 worldCoordinates, float intensity, float size, Brush brush){
        //
    }
    @MethodArgs(args={"worldCoordinates", "intensity", "size", "textureSize", "diffuse", "normalMap", "ao", "brush"})
    public void applyPaint(Vector3 worldCoordinates, float intensity, float size, float textureSize, Texture diffuse, Texture normalMap, Texture ao, Brush brush){
        //
    }
}
