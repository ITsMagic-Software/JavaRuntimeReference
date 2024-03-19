package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Terrain","Components"})
public final class STerrain extends Component{
    //

    public STerrain() {
        //
        super();
        //

        //
    }

    public float getWidth(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setWidth(float v){
        //
    }
    public float getMaxHeight(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setMaxHeight(float v){
        //
    }

    @MethodArgs(args ={"worldCoord"})
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
    @MethodArgs(args ={"value"})
    public void setResolution(int v){
        //
    }
    @MethodArgs(args ={"point"})
    public float getHeight(Point2 point2){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float getHeight(int x, int z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"point","height"})
    public void setHeight(Point2 point2, float height){
        //
    }
    @MethodArgs(args ={"x","y","height"})
    public void setHeight(int x, int z, float height){
        //
    }
    public void applyHeight(){
        //
    }

    @MethodArgs(args ={"worldCoordinates", "intensity", "size", "brush"})
    public void applyRaiseLower(Vector2 worldCoordinates, float intensity, float size, Brush brush){
        //
    }
    @MethodArgs(args ={"worldCoordinates", "intensity", "size", "textureSize", "layerIndex", "brush"})
    public void applyPaint(Vector2 worldCoordinates, float intensity, float size, float textureSize, int layerIndex, Brush brush){
        //
    }

    //
}
