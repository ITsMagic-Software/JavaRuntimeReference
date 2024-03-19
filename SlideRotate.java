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
public final class SlideRotate extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate instance;
    @IgnoreAutoComplete
    public SlideRotate(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public SlideRotate(Engine engine){}
    //>REMOVE-BRIDGE<

        public SlideRotate() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate());
        //>REMOVE-BRIDGE<
    }

    public enum Direction {
        Vertical, Horizontal
    }
    //<REMOVE-BRIDGE>
    private static Direction ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate.Direction un){
        return Direction.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate.Direction ENUMCONVERT(Direction un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.SlideRotate.Direction.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public String getAxisName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        java.lang.String returnValue = instance.getAxisName();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getCurrentAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getCurrentAngle();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Direction getDirection(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getDirection());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxAngle();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMinAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMinAngle();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSensibility(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getSensibility();
        //>REMOVE-BRIDGE<
    }

    public boolean isLimited(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isLimited();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAxisName(String value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null || value.isEmpty()) throw new NullPointerException("value can't be empty or null");

        instance.setAxisName( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCurrentAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setCurrentAngle( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDirection(Direction value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setDirection( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLimited(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setLimited( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMaxAngle( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMinAngle( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSensibility(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setSensibility( value);
        //>REMOVE-BRIDGE<
    }


}