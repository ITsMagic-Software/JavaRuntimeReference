package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Roads","Components"})
public final class Road extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.Road instance;
    @IgnoreAutoComplete
    public Road(com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.Road instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public Road(Engine engine){}
    //>REMOVE-BRIDGE<

        public Road() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.Road());
        //>REMOVE-BRIDGE<
    }

    public enum TextureMode {
        Vertical, Horizontal
    }
    //<REMOVE-BRIDGE>
    private static TextureMode ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadCreator.TextureMode un){
        return TextureMode.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadCreator.TextureMode ENUMCONVERT(TextureMode un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.STerrain.Roads.RoadCreator.TextureMode.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public float getResolution(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getResolution();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRoadBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRoadBorder();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRoadBorderUV(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRoadBorderUV();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRoadBorderVerticalOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRoadBorderVerticalOffset();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getTerrainBorder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getTerrainBorder();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public TextureMode getTextureMode(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getTextureMode());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getTextureWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getTextureWidth();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getVerticalOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getVerticalOffset();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getWidth();
        //>REMOVE-BRIDGE<
    }

    public boolean isGenerateCollision(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isGenerateCollision();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGenerateCollision(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setGenerateCollision( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolution(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setResolution( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRoadBorder(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRoadBorder( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRoadBorderUV(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRoadBorderUV( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRoadBorderVerticalOffset(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRoadBorderVerticalOffset( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTerrainBorder(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setTerrainBorder( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTextureMode(TextureMode value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setTextureMode( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTextureWidth(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setTextureWidth( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVerticalOffset(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setVerticalOffset( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWidth(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setWidth( value);
        //>REMOVE-BRIDGE<
    }


}