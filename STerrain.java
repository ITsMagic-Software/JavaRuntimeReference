package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Brush.JavaBrush;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Terrain","Components"})
public final class STerrain extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.STerrain component;
    @IgnoreAutoComplete
    public STerrain(com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.STerrain component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public STerrain() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.STerrain());
        //>REMOVE-BRIDGE<
    }

    public float getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.width;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setWidth(float v){
        //<REMOVE-BRIDGE>
        component.width = v;
        //>REMOVE-BRIDGE<
    }
    public float getMaxHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.maxHeight;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setMaxHeight(float v){
        //<REMOVE-BRIDGE>
        component.maxHeight = v;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldCoord"})
    public Point2 nearestVerticeAt(Vector3 worldCoord){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        GameObject object = component.gameObject;
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 gp = object.transform.getGlobalPosition();
        gp.subLocal(worldCoord.instance);
        gp.divLocal(component.width);
        int x = (int) (gp.getX() * component.resolution);
        int z = (int) (gp.getZ() * component.resolution);
        x = Mathf.clamp(0, x, component.resolution);
        z = Mathf.clamp(0, z, component.resolution);
        return new Point2(x, z);
        //>REMOVE-BRIDGE<
    }

    public int getResolution(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.resolution;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setResolution(int v){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.resolution = (int) Mathf.clampMin(4f, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"point"})
    public float getHeight(Point2 point2){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getHeight(point2.getX(), point2.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float getHeight(int x, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return component.getHeight(x, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"point","height"})
    public void setHeight(Point2 point2, float height){
        //<REMOVE-BRIDGE>
        component.setHeight(point2.getX(), point2.getY(), height);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","height"})
    public void setHeight(int x, int z, float height){
        //<REMOVE-BRIDGE>
        component.setHeight(x, z, height);
        //>REMOVE-BRIDGE<
    }
    public void applyHeight(){
        //<REMOVE-BRIDGE>
        component.applyHeight();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"worldCoordinates", "intensity", "size", "brush"})
    public void applyRaiseLower(Vector2 worldCoordinates, float intensity, float size, Brush brush){
        //<REMOVE-BRIDGE>
        if(worldCoordinates == null){
            throw new NullPointerException("worldCoordinates can't be null");
        }
        component.applyRaiseLower(intensity, size, worldCoordinates.instance, new JavaBrush(brush));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"worldCoordinates", "intensity", "size", "textureSize", "layerIndex", "brush"})
    public void applyPaint(Vector2 worldCoordinates, float intensity, float size, float textureSize, int layerIndex, Brush brush){
        //<REMOVE-BRIDGE>
        if(worldCoordinates == null){
            throw new NullPointerException("worldCoordinates can't be null");
        }
        component.applyPaint(Mathf.clamp(0f, intensity, 1f), size, worldCoordinates.instance, new JavaBrush(brush), layerIndex);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, STerrain.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
