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
public final class StandUp extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.StandUp instance;
    @IgnoreAutoComplete
    public StandUp(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.StandUp instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public StandUp(Engine engine){}
    //>REMOVE-BRIDGE<

        public StandUp() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.StandUp());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRotationY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRotationY();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void lookTo(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.lookTo( value.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void rotate(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.rotate( value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void rotateInSeconds(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.rotateInSeconds( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotationY(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRotationY( value);
        //>REMOVE-BRIDGE<
    }


}