package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class SmoothCameraFollow extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SmoothCameraFollow instance;
    @IgnoreAutoComplete
    public SmoothCameraFollow(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SmoothCameraFollow instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public SmoothCameraFollow(Engine engine){}
    //>REMOVE-BRIDGE<

        public SmoothCameraFollow() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SmoothCameraFollow());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getDistance();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getHeight();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getHeightDamping(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getHeightDamping();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxHeightDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxHeightDistance();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRotationDamping(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRotationDamping();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getTarget(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject returnValue = instance.getTarget();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHeight(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setHeight( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHeightDamping(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setHeightDamping( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxHeightDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMaxHeightDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotationDamping(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRotationDamping( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTarget(SpatialObject value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.setTarget(value.instance.get());
        } else {
            instance.setTarget(null);
        }
        //>REMOVE-BRIDGE<
    }


}