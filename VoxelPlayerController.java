package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelPlayerController extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelPlayerController instance;
    @IgnoreAutoComplete
    public VoxelPlayerController(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelPlayerController instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public VoxelPlayerController(Engine engine){}
    //>REMOVE-BRIDGE<

        public VoxelPlayerController() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelPlayerController());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getHorizontalSlideName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        String returnValue = instance.getHorizontalSlideName();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getHorizontalSlideSens(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getHorizontalSlideSens();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getJoystickName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        java.lang.String returnValue = instance.getJoystickName();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRunSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRunSpeed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWalkSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getWalkSpeed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHorizontalSlideName(String value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null || value.isEmpty()) throw new NullPointerException("value can't be empty or null");

        instance.setHorizontalSlideName( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setHorizontalSlideSens(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setHorizontalSlideSens( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setJoystickName(String value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null || value.isEmpty()) throw new NullPointerException("value can't be empty or null");

        instance.setJoystickName( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRunSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRunSpeed( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWalkSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setWalkSpeed( value);
        //>REMOVE-BRIDGE<
    }


}